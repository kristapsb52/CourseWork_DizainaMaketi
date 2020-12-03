package vea.jdm2020.shop;

import vea.jdm2020.player.Player;
import vea.jdm2020.soldier.Soldier;
import vea.jdm2020.weapon.Weapon;

import java.util.ArrayList;

// Player can buy items like grenades/weapons/etc
public class ShopBuy {
    private ShopMediator mediator;
    private Player player;
    private ArrayList<Weapon> availableWeapons;

    public ShopBuy(Player player) {
        this.player = player;
        mediator = new ShopMediator(this);
        availableWeapons = new ArrayList<>();
    }

    public ShopBuy() {
        availableWeapons = new ArrayList<>();
    }

    public void buyWeapon(int choice) {
        Weapon weapon = availableWeapons.get(choice);
        mediator.buyItem(player, weapon);
    }

    public ArrayList<Weapon> getAvailableWeapons() {
        return availableWeapons;
    }

    public void addWeaponToShop(Weapon weapon) {
        mediator.addWeaponToShop(weapon);
    }
}
