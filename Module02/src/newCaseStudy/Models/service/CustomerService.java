package newCaseStudy.Models.service;


import newCaseStudy.Commons.ReadWriteFile;
import newCaseStudy.Commons.UserValid;
import newCaseStudy.Models.entity.Customer;
import newCaseStudy.exception.*;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CustomerService {
    private  ReadWriteFile readWriteFile;
    private  final String CUSTOMER_PATH="./src/newCaseStudy/data/Customer.csv";
    private  UserValid userValid;
    public  static List<Customer> customerList;
    private static int i =2;

    public CustomerService()  {
        readWriteFile = new ReadWriteFile();
        userValid = new UserValid();
        getAllCustomerFromData();
    }

    /**
     * Chương trình đọc file để cập nhật lại listCustomer
     */
    public void getAllCustomerFromData()  {
        customerList = new ArrayList<>();
        String[] customerListLine = new String[0];

            customerListLine = readWriteFile.readFile(CUSTOMER_PATH).split("\n");


        if(customerListLine.length==0){

        }
        else {
            for (int i = 0; i < customerListLine.length; i++) {
                String[] propertiesCustomer = customerListLine[i].split(",");
                customerList.add(new Customer(propertiesCustomer[0], propertiesCustomer[1], propertiesCustomer[2], propertiesCustomer[3], propertiesCustomer[4], propertiesCustomer[5], propertiesCustomer[6], propertiesCustomer[7], propertiesCustomer[8]));
            }
        }
    };

    public List<Customer> getCustomerList() {
        return customerList;
    }
    public Customer getCustomerByID(int i)  {
        List<Customer> customerList = getCustomerList();
        return customerList.get(i);
    }

    /**
     * Chương trình hiển thị listCustomer
     * @throws IOException
     */
    public void showInfoCustomer() throws IOException {
        customerList.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer customer, Customer t1) {
                if(customer.getName().equals(t1.getName())){
                    return Integer.parseInt(customer.getDateOfBirth().substring(6,9)) -Integer.parseInt(t1.getDateOfBirth().substring(6,9));
                }
                else return customer.getName().compareTo(t1.getName());
            }
        });
        // lamda expression
        customerList.forEach(x-> System.out.println(x.showInfo()));
    }
    public void updateCustomerData() throws IOException {
        String data="";
        for(int i =0;i<customerList.size();i++){
            data += customerList.get(i).toString()+"\n";

        }
        readWriteFile.writeFile(CUSTOMER_PATH,data,false);
    }

    /**
     * Chương trình cho người dùng nhập mới một Customer, sau đó ghi vào file Customer.csv

     */
    public void addNewCustomer(){
        String name;
        String birthday;
        String gender;
        int choiceGender;
        String identityCard;
        String phoneNumber;
        String email;
        String typeCustomer;
        String address;
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.println("Input new Customer: ");
        System.out.println("Name: ");

        while(true){
            try {
                name =  sc.nextLine();
                if(userValid.validName(name)){
                    break;
                }
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Date Of Birth : ");
        while(true){
            try {
                birthday =  sc.nextLine();
                if(userValid.validBirthday(birthday)){
                    break;
                }
            } catch (BirthdayException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Gender : ");

        while(true){
            try {
                gender = sc.nextLine();
                choiceGender = userValid.validGender(gender);
                break;
            } catch (GenderException e) {
                System.out.println(e.getMessage());
            }
        }
        switch (choiceGender){
            case 0:
                gender = "Male";
                break;
            case 1:
                gender ="FeMale";
                break;
            case 2:
                gender = "Unknown";
        }

        System.out.println("Identity Card : ");
        while(true){
            try {
                identityCard =  sc.nextLine();
                if(userValid.validIdCard(identityCard)){
                    break;
                }
            } catch ( IdCardException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Phone Number : ");
        while(true){
            try {
                phoneNumber =  sc.nextLine();
                if(userValid.validPhoneNumber(phoneNumber)){
                    break;
                }
            } catch ( PhoneException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Email : ");

        while(true){
            try {
                email =  sc.nextLine();
                if(userValid.validMail(email)){
                    break;
                }
            } catch ( EmailException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Type Customer : ");
        typeCustomer =  sc.nextLine();
        System.out.println("Address : ");
        address =  sc.nextLine();
        Customer customer =  new Customer(name,birthday,gender,identityCard,phoneNumber,email,typeCustomer,address);
        customerList.add(customer);
            readWriteFile.writeFile(CUSTOMER_PATH,customer.toString(),true);
    }
}
