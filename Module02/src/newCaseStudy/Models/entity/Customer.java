package newCaseStudy.Models.entity;
public class Customer {
    private String name;
    private String dateOfBirth;
    private String gender;
    private String identityCard;
    private String phoneNumber;
    private String email;
    private String typeCustomer;
    private String address;
    private String services;

    public Customer(String name, String dateOfBirth, String gender, String identityCard, String phoneNumber, String email, String typeCustomer, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.services = "None";
    }
    public Customer(String name, String dateOfBirth, String gender, String identityCard, String phoneNumber, String email, String typeCustomer, String address,String services) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.services = services;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    //    public void showInfo(){
//        System.out.println("Name: "+this.name+" BirhDate "+this.dateOfBirth+" Gender: "+this.gender+" Identity Card: "+this.identityCard+" Phone Number "+this.phoneNumber+" Email "+this.email+" Customer Type "+this.typeCustomer+" Address "+this.address);
//        if(this.services==null){
//            System.out.println(" none order");
//        }
//        else this.services.showInfo();
//    }
    public String showInfo(){
        String result ="";
        result= ("Name: "+this.name+", BirthDate: "+this.dateOfBirth+", Gender: "+this.gender+", Identity Card: "+this.identityCard+", Phone Number: "+this.phoneNumber+", Email: "+this.email+", Customer Type: "+this.typeCustomer+",Address: "+this.address+",Service: "+this.getServices());
        return result;
//
    }
    public String getInfo(){
       return (this.name+" "+this.dateOfBirth+" "+this.gender+" "+this.identityCard+" "+this.phoneNumber+" "+this.email+" "+this.typeCustomer+" "+this.address);
    }
    @Override
    public String toString(){
       return (this.name+","+this.dateOfBirth+","+this.gender+","+this.identityCard+","+this.phoneNumber+","+this.email+","+this.typeCustomer+","+this.address+","+this.getServices());
    }
}
