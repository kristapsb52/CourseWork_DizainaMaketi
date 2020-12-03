package vea.jdm2020.weapon;

import vea.jdm2020.weapon.weaponTypes.AssaultRifle;
import vea.jdm2020.weapon.weaponTypes.Pistol;
import vea.jdm2020.weapon.weaponTypes.Shotgun;
import vea.jdm2020.weapon.weaponTypes.SniperRifle;

public class WeaponIcon extends WeaponDecorator{


    public WeaponIcon(Weapon weapon) {
        super(weapon);
        this.weapon = weapon;
    }

    @Override
    public void addAttachment() {

    }

    @Override
    public String weaponInfo() {
        return icon();
    }

    @Override
    public String weaponType() {
        return null;
    }

    @Override
    public int price() {
        return this.weapon.price();
    }

    public String icon() {
        if (this.weapon.getClass() == AssaultRifle.class) {
            return  "\n" +
                    "                         .-----------------TTTT_-----_______\n" +
                    "                       /''''''''''(______O] ----------____  \\______/]_\n" +
                    "    __...---'\"\"\"\\_ --''   Q                               ___________@\n" +
                    "|'''                   ._   _______________=---------\"\"\"\"\"\"\"\n" +
                    "|                ..--''|   l L |_l   |\n" +
                    "|          ..--''      .  /-___j '   '\n" +
                    "|    ..--''           /  ,       '   '\n" +
                    "|--''                /           `    \\\n" +
                    "                     L__'         \\    -\n" +
                    "                                   -    '-.\n" +
                    "                                    '.    /\n" +
                    "                                      '-./";
        } else if (this.weapon.getClass() == Pistol.class) {
            return "\n" +
                    " ,-.______________,=========,\n" +
                    "[|  )_____________)#######((_\n" +
                    " /===============.-.___,--\" _\\\n" +
                    "\"-._,__,__[JW]____\\########/\n" +
                    "          \\ (  )) )####O##(\n" +
                    "           \\ \\___/,.#######\\\n" +
                    "            `====\"  \\#######\\\n" +
                    "                     \\#######\\\n" +
                    "                      )##O####|\n" +
                    "                      )####__,\"\n" +
                    "                      `--\"\"";
        } else if (this.weapon.getClass() == SniperRifle.class) {
            return "\n" +
                    "                                      ____    _     __     _    ____\n" +
                    "                                     |####`--|#|---|##|---|#|--'##|#|\n" +
                    "   _                                 |____,--|#|---|##|---|#|--.__|_|\n" +
                    " _|#)_____________________________________,--'EEEEEEEEEEEEEE'_=-.\n" +
                    "((_____((_________________________,--------[JW](___(____(____(_==)        _________\n" +
                    "                               .--|##,----o  o  o  o  o  o  o__|/`---,-,-'=========`=+==.\n" +
                    "                               |##|_Y__,__.-._,__,  __,-.___/ J \\ .----.#############|##|\n" +
                    "                               |##|              `-.|#|##|#|`===l##\\   _\\############|##|\n" +
                    "                              =======-===l          |_|__|_|     \\##`-\"__,=======.###|##|\n" +
                    "                                                                  \\__,\"          '======'";
        } else if (this.weapon.getClass() == Shotgun.class) {
            return "\n" +
                    "     ,______________________________________\n" +
                    "    |_________________,----------._ [____]  \"\"-,__  __....-----=====\n" +
                    "                   (_(||||||||||||)___________/   \"\"                |\n" +
                    "                      `----------' Krogg98[ ))\"-,                   |\n" +
                    "                                           \"\"    `,  _,--....___    |\n" +
                    "                                                   `/           \"\"\"\"";
        } else {
            return null;
        }
    }
}
