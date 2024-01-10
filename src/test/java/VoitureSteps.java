import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.Voiture;

import static org.junit.jupiter.api.Assertions.*;

public class VoitureSteps {
    private Voiture voiture;
    private double discountedPrice;

    @Given("a car has a default price")
    public void givenCarHasDefaultPrice() {
        voiture = new Voiture();
    }

    @When("I apply a promotional discount of {int}%")
    public void whenApplyPromotionalDiscount(int discountPercentage) {
        discountedPrice = voiture.promoVoiture(discountPercentage / 100.0);
    }

    @Then("the discounted price should be {double}")
    public void thenDiscountedPriceShouldBe(double expectedPrice) {
        assertEquals(expectedPrice, discountedPrice, 0.001);
    }
}
