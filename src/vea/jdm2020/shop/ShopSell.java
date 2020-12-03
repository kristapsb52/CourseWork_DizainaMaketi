package vea.jdm2020.shop;

import vea.jdm2020.player.Player;
import vea.jdm2020.weapon.Weapon;

// Player sells his own items
public class ShopSell {
    private ShopMediator mediator;
    private Player player;

    public ShopSell(Player player) {
        this.player = player;
        mediator = new ShopMediator(null);
    }

    public ShopSell() {

    }

    public void sellItem(Weapon weapon) {
        mediator.sellItem(this.player, weapon);
    }


}
