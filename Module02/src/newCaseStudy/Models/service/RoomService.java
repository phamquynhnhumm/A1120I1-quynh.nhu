package newCaseStudy.Models.service;

import newCaseStudy.Commons.ReadWriteFile;
import newCaseStudy.Commons.Regex;
import newCaseStudy.Models.entity.Room;
import newCaseStudy.Models.entity.Villa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class RoomService {
    private  ComonService comonService;
    private  Regex regex;
    private  Scanner sc;
    private  ReadWriteFile readWriteFile;
    private  String ROOM_PATH ="./src/newCaseStudy/data/Room.csv";
    private  List<Room> roomList ;
    public RoomService()  {
        comonService = new ComonService();
        regex = new Regex();
        sc = new Scanner(System.in);
        readWriteFile = new ReadWriteFile();
        roomList = new ArrayList<>();
        getAllRoom();
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public List<Room> getAllRoom()  {
        String[] roomListLine = new String[0];

            roomListLine = readWriteFile.readFile(ROOM_PATH).split("\n");

        for(int i =0;i<roomListLine.length;i++){
            String[] propertiesRoom = roomListLine[i].split(",");
            roomList.add(new Room((propertiesRoom[0]),propertiesRoom[1],Double.parseDouble(propertiesRoom[2]),Integer.parseInt(propertiesRoom[3]),Integer.parseInt(propertiesRoom[4]),propertiesRoom[5],propertiesRoom[6]));
        }
        return roomList;
    };
    public Room getRoomById(int index) throws IOException {
        List<Room> roomList = getAllRoom();
        return roomList.get(index);
    }
    public String getRoomIdByIndex(int index){
        List<Room> roomList = getRoomList();
        return roomList.get(index).getId();
    }
    public void showAllRoom(){
        roomList.forEach(x-> System.out.println(x.showInfo()));
    }
    public Room inputNewRoom(){
        System.out.println("-------------------------------------------------");
        System.out.println("Input New House  : ");
        Room newRoom = (Room)comonService.inputService(3);
        
        String freeServicesRoom;
        System.out.println("Input type free service");
        freeServicesRoom= sc.nextLine();
        newRoom.setFreeService(freeServicesRoom);
        roomList.add(newRoom);
            readWriteFile.writeFile(ROOM_PATH,newRoom.toString(),true);


        return newRoom;
    }
    public void showAllNameRoomNotDuplicate(){
        List<String> roomNameList = getAllRoomName();
        TreeSet<String> roomTreeSet = new TreeSet<>(roomNameList);
        for(String roomName:roomTreeSet){
            System.out.println(roomName);
        }
    }
    public List<String> getAllRoomName()  {
        List<String> roomListName = new ArrayList<>();
        for (Room room : roomList) {
            roomListName.add(room.getName());
        }
        return roomListName;
    }
}
