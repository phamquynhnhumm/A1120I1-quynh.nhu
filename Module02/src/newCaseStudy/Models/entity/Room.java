package newCaseStudy.Models.entity;

public class Room extends Services{
    private String freeService;

    public String getFreeService() {
        return freeService;
    }

    public Room(String id, String name, double areaUsed, int rentCost, int maxPeople, String typeRent) {
        super(id, name, areaUsed, rentCost, maxPeople, typeRent);
    }

    public Room(String id, String name, double areaUsed, int rentCost, int maxPeople, String typeRent, String freeService) {
        super(id, name, areaUsed, rentCost, maxPeople, typeRent);
        this.freeService = freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
    @Override
    public String showInfo() {
        return "Id: "+this.getId()+"Name: "+this.getName()+"Area: "+this.getAreaUsed()+" Cost: "
                +this.getRentCost()+" Max People: "+this.getMaxPeople()+"Type Rent"+this.getTypeRent()+"Free Services: "+this.getFreeService();
    }
    @Override
    public String toString(){
        return this.getId()+","+this.getName()+","+this.getAreaUsed()+","+this.getRentCost()+","+this.getMaxPeople()+","+this.getTypeRent()+","+this.getFreeService();
    }
    public String toStringNotId(){
        return this.getName()+","+this.getAreaUsed()+","+this.getRentCost()+","+this.getMaxPeople()+","+this.getTypeRent()+","+this.getFreeService();
    }
}
