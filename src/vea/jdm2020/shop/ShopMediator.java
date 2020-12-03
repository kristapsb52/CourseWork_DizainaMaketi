package vea.jdm2020.shop;

import vea.jdm2020.player.Player;
import vea.jdm2020.soldier.soldiertypes.Sniper;
import vea.jdm2020.weapon.Weapon;
import vea.jdm2020.weapon.weaponTypes.AssaultRifle;
import vea.jdm2020.weapon.weaponTypes.Pistol;
import vea.jdm2020.weapon.weaponTypes.Shotgun;
import vea.jdm2020.weapon.weaponTypes.SniperRifle;

//This is where everything happens
public class ShopMediator {
    private final ShopBuy shopBuy;

    public ShopMediator(ShopBuy shopBuy) {
        this.shopBuy = shopBuy;
    }

    public void sellItem(Player player, Weapon weapon){
        player.addGold(weapon.price());
        if (weapon.getClass() == AssaultRifle.class) {
            player.getARInv().remove(weapon);
        }
        else if (weapon.getClass() == Pistol.class) {
            player.getPistolInv().remove(weapon);
            System.out.println("Item has been sold");
        }
        else if (weapon.getClass() == Shotgun.class) {
            player.getShotgunInv().remove(weapon);
        }
        else if (weapon.getClass() == SniperRifle.class) {
            player.getSniperInv().remove(weapon);
        }
    }

    public void buyItem(Player player, Weapon weapon) {
        if (player.getGold() >= weapon.price()) {
            player.subtractGold(weapon.price());
            if (weapon.getClass() == AssaultRifle.class) {
                player.addAR(weapon);
            }
            else if (weapon.getClass() == Pistol.class) {
                player.addPistol(weapon);
            }
            else if (weapon.getClass() == Shotgun.class) {
                player.addShotgun(weapon);
            }
            else if (weapon.getClass() == SniperRifle.class) {
                player.addSniper(weapon);
            }
            shopBuy.getAvailableWeapons().remove(weapon);
            System.out.println("Weapon has been bought");
        } else {
            System.out.println("You don't have enough gold");
        }
    }

    public void addWeaponToShop(Weapon weapon) {
        shopBuy.getAvailableWeapons().add(weapon);
        System.out.println(shopBuy.getAvailableWeapons());
    }
}
