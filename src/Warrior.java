public class Warrior extends Hero{
    public Warrior(String attackType) {
        super(attackType);
    }

    @Override
    public String applySuperAbility() {
        return "Warrior применил " + "суперспособность " + getAttackType() + "\n";
    }
}
