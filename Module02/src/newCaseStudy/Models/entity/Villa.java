package newCaseStudy.Models.entity;

public class Villa extends Services {
    private String standardRoom;
    private String anotherConvenient;
    private Double areaPool;
    private int floorVilla;

    public Villa(String id, String name, double areaUsed, int rentCost, int maxPeople, String typeRent) {
        super(id, name, areaUsed, rentCost, maxPeople, typeRent);
    }
    public Villa(String id){
        super(id);
    }
    public Villa(String id, String name, double areaUsed, int rentCost, int maxPeople, String typeRent, String standardRoom, String anotherConvenient, Double areaPool, int floorQuantity) {
        super(id, name, areaUsed, rentCost, maxPeople, typeRent);
        this.standardRoom = standardRoom;
        this.anotherConvenient = anotherConvenient;
        this.areaPool = areaPool;
        this.floorVilla = floorQuantity;
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

    public Double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(Double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloorVilla() {
        return floorVilla;
    }

    public void setFloorVilla(int floorVilla) {
        this.floorVilla = floorVilla;
    }

    @Override
    public String showInfo() {
        return "Id: "+this.getId()+"Name: "+this.getName()+"Area: "+this.getAreaUsed()+" Cost: "
                +this.getRentCost()+" Max People: "+this.getMaxPeople()+"Type Rent"+this.getAreaUsed()+"Standard Room: "+this.getStandardRoom()
                +"Another Convenient: "+this.getAnotherConvenient()+"Area Pool: "+this.getAreaPool()+"Floor Quantity: "+this.getFloorVilla();
    }
    @Override
    public String toString(){
        return this.getId()+","+this.getName()+","+this.getAreaUsed()+","+this.getRentCost()+","+this.getMaxPeople()+","+this.getTypeRent()+","+this.standardRoom+","+this.anotherConvenient+","+this.areaPool+","+this.floorVilla;
    }
    public String toStringNotId(){
        return this.getName()+","+this.getAreaUsed()+","+this.getRentCost()+","+this.getMaxPeople()+","+this.getTypeRent()+","+this.standardRoom+","+this.anotherConvenient+","+this.areaPool+","+this.floorVilla;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Villa)){
            return false;
        }
        Villa villa = (Villa)obj;
        if(this.getId().equals(villa.getId())){
            return true;
        }
        else return false;
    }
}
