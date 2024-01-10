import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.AudioSystem;
import org.example.Voiture;

import static org.junit.jupiter.api.Assertions.*;

public class AudioSystemSteps {
    private Voiture voiture;
    private AudioSystem audioSystem;
    private double totalPrice;

    @Given("the audio system has a default price")
    public void givenAudioSystemHasDefaultPrice() {
        // Initialisation du système audio avec un prix par défaut
        audioSystem = new AudioSystem();
    }

    @Given("a car is associated with the audio system")
    public void givenCarIsAssociatedWithAudioSystem() {
        // Initialisation d'une voiture associée au système audio
        voiture = new Voiture();
    }

    @When("I apply a Black Friday discount of {int}%")
    public void whenApplyBlackFridayDiscount(int discount) {
        // Application d'une remise du Black Friday au système audio avec la voiture associée
        totalPrice = audioSystem.PrixBlackFriday(voiture, discount);
    }

    @Then("the total price should be {double}")
    public void thenTotalPriceShouldBe(double expectedPrice) {
        // Vérification que le prix total correspond au prix attendu avec une précision de 0.001
        assertEquals(expectedPrice, totalPrice, 0.001);
    }
}
