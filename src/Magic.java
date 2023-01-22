public class Magic extends Hero{

    public Magic(String attackType) {
        super(attackType);
    }

    @Override
    public String applySuperAbility() {
        return "Magic применил " + "суперспособность " + getAttackType();
    }
}
