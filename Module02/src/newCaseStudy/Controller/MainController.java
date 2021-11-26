package newCaseStudy.Controller;


import newCaseStudy.Models.entity.Villa;
import newCaseStudy.Models.service.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    private static HouseService houseService;
    private static RoomService roomService;
    private static VillaService villaService;
    private static CustomerService customerService;
    private static BookingService bookingService;
    private static EmployeeService employeeService;

    static {

            houseService = new HouseService();
            roomService = new RoomService();
            villaService = new VillaService();
            customerService = new CustomerService();
            bookingService = new BookingService();
            employeeService = new EmployeeService();

    }
    private static void addNewServices(){
        System.out.println(
                "1. Add New Villa\n" +
                "2. Add New House\n" +
                "3. Add New Room\n" +
                "4. Back to menu\n" +
                "5. Exit");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                villaService.inputNewVilla();
                break;
            case 2:
//                houseService.inputNewHouse();
                break;

            case 3:
                roomService.inputNewRoom();
                break;

            case 4:
//                displayMenu();

        }
    }
    private static void showServices(){
        System.out.println(
                "1. Show all Villa\n" +
                        "2. Show all House\n" +
                        "3. Show all Room\n" +
                        "4. Show All Name Villa Not Duplicate\n" +
                        "5. Show All Name House Not Duplicate\n" +
                        "6. Show All Name Name Not Duplicate\n" +
                        "7. Back to menu\n" +
                        "8. Exit");

        Scanner sc = new Scanner(System.in);
        int choice =Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                villaService.showAllVilla();
                break;
            case 2:
                houseService.showAllHouse();
                break;
            case 3:
                roomService.showAllRoom();
                break;
            case 4:
                villaService.showAllNameVillaNotDuplicate();
                break;
            case 5:
                houseService.showAllNameHouseNotDuplicate();
                break;
            case 6:
                roomService.showAllNameRoomNotDuplicate();
                break;
            case 7:
                displayMenu();
        }
    }
    private static void addNewCustomer(){
            customerService.addNewCustomer();

    }
    private static void showInfoCustomer(){
        try {
            customerService.showInfoCustomer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void addNewBooking(){
        try {
            bookingService.addNewBooking();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void showInfoEmployee(){
            employeeService.addNewEmployee();
    }
    private static void updateService(){
            villaService.updateVilla();
    }
    private static void deleteService(){
        villaService.deleteVilla();
    }
    private static void searchService(){
        villaService.searchService();
    }
    private static void displayMenu()  {

        System.out.println(
                "!-----------MENU----------!\n"+
                        "1. Add New Services\n" +
                        "2. Show Services\n" +
                        "3. Add New Customer\n" +
                        "4. Show Information of Customer\n" +
                        "5. Add New Booking\n" +
                        "6. Show Information of Employee\n" +
                        "7. Update Service\n" +
                        "8. Delete Service\n" +
                        "9. Search Service\n" +
                        "10. Exit");
        Scanner sc = new Scanner(System.in);
        int choice =Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                addNewServices();
                displayMenu();
                break;
            case 2:
                showServices();
                displayMenu();
                break;
            case 3:
                addNewCustomer();
                displayMenu();
                break;
            case 4:
                showInfoCustomer();
                displayMenu();
                break;
            case 5:
                addNewBooking();
                displayMenu();
                break;
            case 6:
                showInfoEmployee();
                displayMenu();
                break;
            case 7:
                updateService();
                displayMenu();
                break;
            case 8:
                deleteService();
                displayMenu();

                break;
            case 9:
                searchService();
                displayMenu();
                break;

        }

    }

    public static void main(String[] args) {

        displayMenu();
    }
}
