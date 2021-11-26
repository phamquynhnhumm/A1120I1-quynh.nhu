package newCaseStudy.Models.service;

import newCaseStudy.Commons.ReadWriteFile;
import newCaseStudy.Commons.Regex;
import newCaseStudy.Models.entity.House;
import newCaseStudy.Models.entity.Villa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class HouseService {
    private  ComonService comonService;
    private  Regex regex;
    private  Scanner sc;
    private  ReadWriteFile readWriteFile;
    private  String HOUSE_PATH ="./src/newCaseStudy/data/House.csv";
    private  List<House> houseList;
    public HouseService()  {
        comonService = new ComonService();
        regex = new Regex();
        sc = new Scanner(System.in);
        readWriteFile = new ReadWriteFile();
        houseList = new ArrayList<>();
        getAllHouse();
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public void showAllHouse(){
        houseList.forEach(x-> System.out.println(x.showInfo()));
    }

    /**
     * chương trình đọc file House.csv  và trả về list house
     * @return list house
     */
    public List<House> getAllHouse()  {
        String[] houseListLine = new String[0];
            houseListLine = readWriteFile.readFile(HOUSE_PATH).split("\n");
        for(int i =0;i<houseListLine.length;i++){
            String[] propertiesHouse = houseListLine[i].split(",");
            houseList.add(new House((propertiesHouse[0]),propertiesHouse[1],Double.parseDouble(propertiesHouse[2]),Integer.parseInt(propertiesHouse[3]),Integer.parseInt(propertiesHouse[4]),propertiesHouse[5],propertiesHouse[6],propertiesHouse[7],Integer.parseInt(propertiesHouse[8])));
        }
        return houseList;
    };

    /**
     * chương trình trả về một house từ listHouse
     * @param index
     * @return
     */
    public House getHouseById(int index)  {
        List<House> houseList = getHouseList();
        return houseList.get(index);
    }

    /**
     * Chương trình cho người dùng nhập vào 1 Villa mới sau đó ghi vào file Villa.csv
     */
    public void inputNewHsouse(){
        System.out.println("-------------------------------------------------");
        System.out.println("Input New House  : ");
        House newHouse = (House)comonService.inputService(2);
        String standardRoomHouse;
        String detailConvenientHouse;
        String floorHouse;

        System.out.println("input Standard room house");
        standardRoomHouse = sc.nextLine();
        System.out.println("input Describe convenient room house");
        detailConvenientHouse=sc.nextLine();


        System.out.println("Input number of floor");
        floorHouse =  (sc.nextLine());
        while(!regex.validateFloor(floorHouse)){
            System.out.println("Please! Input number of floor");
            floorHouse =  (sc.nextLine());
        };

        newHouse.setAnotherConvenient(detailConvenientHouse);
        newHouse.setFloorHouse(Integer.parseInt(floorHouse));
        newHouse.setStandardRoom(standardRoomHouse);
        readWriteFile.writeFile(HOUSE_PATH,newHouse.toString(),true);
        houseList.add(newHouse);
    }
    public List<String> getAllHouseName()  {
        List<String> houseListName = new ArrayList<>();
        for (House house : houseList) {
            houseListName.add(house.getName());
        }
        return houseListName;
    }
    
    public void showAllNameHouseNotDuplicate(){
        List<String> houseNameList = getAllHouseName();
        TreeSet<String> houseTreeSet = new TreeSet<>(houseNameList);
        for(String houseName:houseTreeSet){
            System.out.println(houseName);
        }
    }
}
