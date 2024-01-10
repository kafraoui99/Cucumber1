package org.example;

public class Voiture {
    // instance variables
    private double prixVoiture;
    private String marqueVoiture;

    /**
     * Constructor for objects of class voiture
     */
    public Voiture() {
        // initialise instance variables
        prixVoiture = 10000;
        marqueVoiture = "Tesla";
    }

    public double getPrixVoiture() {
        return prixVoiture;
    }

    public void setPrixVoiture(double prixVoiture) {
        this.prixVoiture = prixVoiture;
    }

    public String getMarqueVoiture() {
        return marqueVoiture;
    }

    public void setMarqueVoiture(String marqueVoiture) {
        this.marqueVoiture = marqueVoiture;
    }

    /**
     * Applique une réduction promotionnelle à la voiture.
     *
     * @param discount Le pourcentage de réduction à appliquer (par exemple, 0.1 pour 10% de réduction)
     * @return Le prix de la voiture après réduction promotionnelle, avec un minimum de 1000.0
     */
    public double promoVoiture(double discount) {
        // Calculer le prix après réduction promotionnelle
        double discountedPrice = prixVoiture - (prixVoiture * discount);

        // Assurer que le prix minimum est de 1000.0
        if (discountedPrice < 1000.0) {
            discountedPrice = 1000.0;
        }

        return discountedPrice;
    }
}
