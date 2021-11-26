package newCaseStudy.Models.service;


import newCaseStudy.Commons.ReadWriteFile;
import newCaseStudy.Models.entity.Customer;
import newCaseStudy.Models.entity.House;
import newCaseStudy.Models.entity.Room;
import newCaseStudy.Models.entity.Villa;
import newCaseStudy.Models.service.CustomerService;
import newCaseStudy.Models.service.HouseService;
import newCaseStudy.Models.service.RoomService;
import newCaseStudy.Models.service.VillaService;


import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class BookingService {
    private CustomerService customerService;
    private HouseService houseService;
    private VillaService villaService;
    private RoomService roomService;
    private ReadWriteFile readWriteFile;
    private  final String BOOKING_PATH="./src/newCaseStudy/data/Booking.csv";

    public BookingService(){

            customerService = new CustomerService();
            houseService = new HouseService();
            villaService = new VillaService();
            roomService = new RoomService();
            readWriteFile = new ReadWriteFile();
    }

    /**
     * Program perform add new booking
     * - Display list Customer and user will choose 1 Customer
     * - Display list Service and user will choose 1 service (villa or house or room)
     * - Add Service into Selected Customer
     * - Write data booking in file Booking.csv
     * input: không
     * output:
     * @throws IOException
     */
    public void addNewBooking() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------Add New Booking----------");
        AtomicInteger i= new AtomicInteger(0);
        CustomerService.customerList.forEach(x->{
            System.out.println(i.getAndIncrement()+" "+x.toString());;
            ;
        });

        System.out.println("Input index of customer have booking");
        int index = Integer.parseInt(sc.nextLine());
        Customer customerSelected = customerService.getCustomerByID(index);
        if (!customerSelected.getServices().equals("None")){
            System.out.println("This Customer already has Booking, Please, try booking again!");
            return;
        }
        System.out.println(
                        "1.Booking Villa\n" +
                        "2.Booking House\n" +
                        "3.Booking Room\n");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                villaService.showAllVilla();
                System.out.println("Input index of villa have booking");
                int indexVilla = Integer.parseInt(sc.nextLine());
                Villa villaSelected = villaService.getVillaById(indexVilla);
                String villaIdSelected = villaSelected.getId();

                customerSelected.setServices(villaIdSelected);
                System.out.println(customerSelected.showInfo());

                readWriteFile.writeFile(BOOKING_PATH,customerSelected.showInfo()+villaSelected.toStringNotId(), true);

                break;
            case 2:
                houseService.showAllHouse();
                System.out.println("Input index of House have booking");
                int indexHouse = Integer.parseInt(sc.nextLine());
                House houseSelected = houseService.getHouseById(indexHouse);
                String idHouseSelected = houseSelected.getId();
                customerSelected.setServices(idHouseSelected);
                System.out.println(customerSelected.showInfo());
                readWriteFile.writeFile(BOOKING_PATH,customerSelected.showInfo()+houseSelected.toStringNotId(), true);

                break;
            case 3:
                roomService.showAllRoom();
                System.out.println("Input index of Room have booking");
                int indexRoom = Integer.parseInt(sc.nextLine());
                Room roomSelected = roomService.getRoomById(indexRoom);
                String roomIdSelected = roomSelected.getId();
                customerSelected.setServices(roomIdSelected);
                System.out.println(customerSelected.showInfo());
                readWriteFile.writeFile(BOOKING_PATH,customerSelected.showInfo()+roomSelected.toStringNotId(), true);

                break;

        }
        customerService.updateCustomerData();
    }
}
