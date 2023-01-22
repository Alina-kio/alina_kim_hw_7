public class Medic extends Hero{
    private int healPoints;

    public Medic(String attackType, int healPoints) {
        super(attackType);
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public String applySuperAbility(){
        return "Medic применил " + "суперспособность " + getAttackType() +
                "\nHeal Points: " + (int) increaseExperience();
    }


    public double increaseExperience(){
        return getHealPoints() + (getHealPoints() * 10 / 100);
    }
}
