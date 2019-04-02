public abstract class Wizard {

    public String attack() {
       return wizardType() + " attacks with: " + spellType() + "!";
    }

    protected abstract String wizardType();

    protected abstract String spellType();
}
