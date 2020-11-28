package vea.jdm2020.vehicle;


import java.util.ArrayList;
import java.util.List;

// TODO the total cost of all parts can't be smaller than the cost of all parts sum
// TODO Create pre-made vehicles in a class so they can be read in main
public class Vehicle {
    private String name;
    private int cost;
    private int totalCostOfParts;
    private List<VehicleParts> allParts;

    public Vehicle(String name, int totalCost) {
        this.name = name;
        this.cost = cost;
        allParts = new ArrayList<>();
    }

    // TODO Finish this method
    public boolean canBeBought() {
        return false;
    }

    public void add(VehicleParts vehicleParts) {
        allParts.add(vehicleParts);
    }

    public void remove(VehicleParts vehicleParts) {
        allParts.remove(vehicleParts);
    }

    public List<VehicleParts> getAllParts() {
        return allParts;
    }

    public String toString() {
        return null;
    }
}
