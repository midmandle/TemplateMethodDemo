import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardShould {
    @Test
    public void water_wizards_attack_with_water_spells() {
        Wizard waterWizard = new WaterWizard();
        assertEquals("Water Wizard attacks with: Water Blast!", waterWizard.attack());
    }

    @Test
    public void fire_wizards_attacks_with_fire_spells() {
        Wizard fireWizard = new FireWizard();
        assertEquals("Fire Wizard attacks with: Fire Bolt!", fireWizard.attack());
    }
}
