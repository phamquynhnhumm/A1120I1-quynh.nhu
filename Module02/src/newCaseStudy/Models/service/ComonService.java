package newCaseStudy.Models.service;

import newCaseStudy.Commons.Regex;
import newCaseStudy.Models.entity.*;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class ComonService {
    private static Regex regex;

    static{
        regex = new Regex();
    }
    public void addCinemaService(){
        Queue<String> employeeQueue = new PriorityQueue<>();
        employeeQueue.add("1, Tân order");
        employeeQueue.add("2, Lại là Tân nhưng Tân này đẹp trai hơn");
        employeeQueue.add("3, Lần này cũng là Tân, đẹp trai hơn 2 thằng trước");
        employeeQueue.forEach(System.out::println);
    }

    /**
     * Program perform add new service
     * - User will input info about service
     * @param typeServices (1-> Villa, 2-> House, 3-> Room)
     * @return Villa or House or Room
     */
    public Services inputService(int typeServices){
        String id;
        String name;
        String areaUsed;
        String rentCost;
        String maxPeople;
        String typeRent;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ID Service");
        id = sc.nextLine();
        while(!regex.validateId(id)){
            System.out.println("Please, Try again! ");
            id =sc.nextLine();
        };

        System.out.println("Input Name Service: ");
        name = sc.nextLine();
        while(!regex.validateName(name)){
            System.out.println("Please, Try again! ");

            name =sc.nextLine();
        };

        System.out.println("Input Area Used: ");
        areaUsed = (sc.nextLine());
        while(!regex.validateAreaPool(areaUsed)){
            System.out.println("Please, Try again! ");

            areaUsed = (sc.nextLine());
        };

        System.out.println("Input Rent Cost:  ");
        rentCost = (sc.nextLine());
        while(!regex.validateRentCost(rentCost)){
            System.out.println("Please, Try again! ");
            rentCost = (sc.nextLine());
        };

        System.out.println("Input Maximun Number of People: ");
        maxPeople=sc.nextLine();


        while(!regex.validateMaxPeople(maxPeople)){
            System.out.println("Please, Try again! ");
            maxPeople =  (sc.nextLine());
        };

        System.out.println("Input Type Rent ");
        typeRent = sc.nextLine();
        switch (typeServices){
            case 1:
                return new Villa(id,name,Double.parseDouble(areaUsed),Integer.parseInt(rentCost),Integer.parseInt(maxPeople),typeRent);

            case 2:
                return new House(id,name,Double.parseDouble(areaUsed),Integer.parseInt(rentCost),Integer.parseInt(maxPeople),typeRent);

            case 3:
                return new Room(id,name,Double.parseDouble(areaUsed),Integer.parseInt(rentCost),Integer.parseInt(maxPeople),typeRent);

        }
        return null;
    }
}
