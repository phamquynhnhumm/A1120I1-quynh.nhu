package newCaseStudy.Models.entity;


public class House extends Services{
    private String standardRoom;
    private String anotherConvenient;
    private int floorHouse;

    public House(String id, String name, double areaUsed, int rentCost, int maxPeople, String typeRent) {
        super(id, name, areaUsed, rentCost, maxPeople, typeRent);
    }

    public House(String id, String name, double areaUsed, int rentCost, int maxPeople, String typeRent, String standardRoom, String anotherConvenient, int floorHouse) {
        super(id, name, areaUsed, rentCost, maxPeople, typeRent);
        this.standardRoom = standardRoom;
        this.anotherConvenient = anotherConvenient;
        this.floorHouse = floorHouse;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getAnotherConvenient() {
        return anotherConvenient;
    }

    public void setAnotherConvenient(String anotherConvenient) {
        this.anotherConvenient = anotherConvenient;
    }

    public int getFloorHouse() {
        return floorHouse;
    }

    public void setFloorHouse(int floorHouse) {
        this.floorHouse = floorHouse;
    }

    @Override
    public String showInfo() {
            return "Id: "+this.getId()+"Name: "+this.getName()+"Area: "+this.getAreaUsed()+" Cost: "
                    +this.getRentCost()+" Max People: "+this.getMaxPeople()+"Type Rent"+this.getAreaUsed()+"Standard Room: "+this.getStandardRoom()
                    +"Another Convenient: "+this.getAnotherConvenient()+"Floor Quantity: "+this.getFloorHouse();
    }
    @Override
    public String toString(){
        return this.getId()+","+this.getName()+","+this.getAreaUsed()+","+this.getRentCost()+","+this.getMaxPeople()+","+this.getTypeRent()+","+this.standardRoom+","+this.anotherConvenient+","+this.floorHouse;
    }
    public String toStringNotId(){
        return this.getName()+","+this.getAreaUsed()+","+this.getRentCost()+","+this.getMaxPeople()+","+this.getTypeRent()+","+this.standardRoom+","+this.anotherConvenient+","+this.floorHouse;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(obj ==null || !(obj instanceof House)){
//            return false;
//        }
//        else{
//
//        }
//    }
}
