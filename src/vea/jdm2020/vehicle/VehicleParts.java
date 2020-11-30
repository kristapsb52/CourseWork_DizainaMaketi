package vea.jdm2020.vehicle;

import vea.jdm2020.player.Player;

import java.util.ArrayList;
import java.util.List;

public class VehicleParts {
    private String name;
    private int cost;
    private boolean canBeBought = true;
    private List<VehicleParts> parts;
    private Player player;
    private boolean isBought = false;

    public VehicleParts(String name, int cost, Player player) {
        this.name = name;
        this.cost = cost;
        this.parts = new ArrayList<>();
        this.player = player;
    }

    public boolean isCanBeBought() {
        return canBeBought;
    }

    public void addPart(VehicleParts vehicleParts) {
        parts.add(vehicleParts);
        canBeBought = false;
    }

    public void removePart(VehicleParts vehicleParts) {
        parts.remove(vehicleParts);
        if (parts.isEmpty()) {
            canBeBought = true;
        }
    }

    public List<VehicleParts> getParts() {
        return parts;
    }

    public boolean buying(int money) {
        if (canBeBought) {
            if (money - cost > 0) {
                player.subtractGold(cost);
                isBought = true;
            } else {
                isBought = false;
            }
        } else {
            isBought = false;
        }
        return isBought;
    }

    public String toString() {
        return "----- Part info -----\n" +
                "Name: " + name + "\n" +
                "Cost: " + cost + "\n" +
                "Can be bought: " + canBeBought + "\n" +
                "Is bought: " + isBought + "\n";
    }
}
