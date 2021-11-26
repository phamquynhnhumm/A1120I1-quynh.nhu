package newCaseStudy.Models.entity;

import newCaseStudy.Commons.Regex;

import java.util.Scanner;

public abstract class Services {
    private String id;
    private String name;
    private double areaUsed;
    private int rentCost;
    private int maxPeople;
    private String typeRent;
    public abstract String showInfo();



    public Services(String id, String name, double areaUsed, int rentCost, int maxPeople, String typeRent) {
        this.id = id;
        this.name = name;
        this.areaUsed = areaUsed;
        this.rentCost = rentCost;
        this.maxPeople = maxPeople;
        this.typeRent = typeRent;
    }
    public Services(String id ){
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public int getRentCost() {
        return rentCost;
    }

    public void setRentCost(int rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

}
