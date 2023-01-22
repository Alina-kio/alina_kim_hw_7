public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic("HEALING", 30);
        System.out.println("Heal Points: " + medic.getHealPoints());
        Magic magic= new Magic("MAGICAL DAMAGE");
        Warrior warrior = new Warrior("CRITICAL DAMAGE");


        HavingSuperAbility[] havingSuperAbilities = {medic, magic, warrior};
        for (int i = 0; i < havingSuperAbilities.length; i++) {
            superAbility(havingSuperAbilities[i]);
        }
    }

    public static void superAbility(HavingSuperAbility havingSuperAbility) {
        havingSuperAbility.applySuperAbility();
        System.out.println(havingSuperAbility.applySuperAbility());
    }
}