package model;

public class BmiModel {

    private double beratBadan;
    private double tinggiBadan;

    public BmiModel(double beratBadan, double tinggiBadan) {
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    public double hitungBMI() {
        double tinggiMeter = tinggiBadan / 100;
        return beratBadan / (tinggiMeter * tinggiMeter);
    }

    public String kategoriBMI() {
        double bmi = hitungBMI();

        if (bmi < 18.5) {
            return "Berat Badan Kurang";
        } else if (bmi < 25) {
            return "Berat Badan Normal";
        } else if (bmi < 30) {
            return "Berat Badan Berlebih";
        } else {
            return "Obesitas";
        }
    }
}