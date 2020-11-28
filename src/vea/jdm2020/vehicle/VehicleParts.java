package vea.jdm2020.vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleParts {
    private String name;
    private int cost;
    private List<VehicleParts> parts;

    public VehicleParts(String name, int cost) {
        this.name = name;
        this.cost = cost;
        this.parts = new ArrayList<>();
    }

    public void addPart(VehicleParts vehicleParts) {
        parts.add(vehicleParts);
    }

    public void removePart(VehicleParts vehicleParts) {
        parts.remove(vehicleParts);
    }

    public List<VehicleParts> getParts() {
        return parts;
    }

    public boolean bought(int money) {
        return false;
    }

    public String toString() {
        return null;
    }
}
