package org.example;

public class AudioSystem {
    // instance variables
    private double prixAudio;
    private String marqueAudio;
    private Voiture voiture;

    /**
     * Constructor for objects of class AudioSystem
     */
    public AudioSystem() {
        // Initialise instance variables
        prixAudio = 5000;
        marqueAudio = "Bose";
    }

    /**
     * Gets the price of the audio system.
     *
     * @return The price of the audio system.
     */
    public double getPrixAudio() {
        return prixAudio;
    }

    /**
     * Sets the price of the audio system.
     *
     * @param prix The new price of the audio system.
     */
    public void setPrixAudio(double prix) {
        this.prixAudio = prix;
    }

    /**
     * Applies a promotional discount to the audio system.
     *
     * @param promo The percentage of discount to apply.
     * @return The discounted price of the audio system.
     */
    public double promoAudio(double promo) {
        return prixAudio * promo;
    }

    /**
     * Calculates the total price by summing the price of the audio system and the price of the associated car.
     *
     * @param voiture The associated car.
     * @return The total price.
     */
    public double sumPrix(Voiture voiture) {
        return prixAudio + voiture.getPrixVoiture();
    }

    /**
     * Calculates the price during Black Friday, considering promotional discounts for both the audio system and the associated car.
     *
     * @param voiture The associated car.
     * @param promo The Black Friday promotional discount.
     * @return The total price during Black Friday.
     */
    public double PrixBlackFriday(Voiture voiture, double promo) {
        return prixAudio * promo + voiture.promoVoiture(promo);
    }
}
