
package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.BmiModel;

public class BmiController {

    @FXML
    private TextField namaField;

    @FXML
    private TextField beratField;

    @FXML
    private TextField tinggiField;

    @FXML
    private ComboBox<String> genderComboBox;

    @FXML
    private Label bmiLabel;

    @FXML
    private Label kategoriLabel;

    @FXML
    private Label rekomendasiLabel;

    @FXML
    public void initialize() {
        genderComboBox.getItems().addAll(
            "Laki-laki",
            "Perempuan"
        );
    }

    @FXML
    private void handleHitung() {
        try {
            String nama = namaField.getText();

            double berat = Double.parseDouble(
                beratField.getText()
            );

            double tinggi = Double.parseDouble(
                tinggiField.getText()
            );

            if (nama.trim().isEmpty()
                    || genderComboBox.getValue() == null
                    || berat <= 0 || tinggi <= 0) {
                kategoriLabel.setText("Lengkapi data dengan benar!");
                return;
            }

            BmiModel model = new BmiModel(berat, tinggi);
            double bmi = model.hitungBMI();

            bmiLabel.setText(String.format("%.1f", bmi));
            kategoriLabel.setText(model.kategoriBMI());

            rekomendasiLabel.setText(
                "Hasil perhitungan untuk " + nama
            );

        } catch (NumberFormatException e) {
            kategoriLabel.setText("Masukkan angka yang valid!");
        }
    }

    @FXML
    private void handleReset() {
        namaField.clear();
        beratField.clear();
        tinggiField.clear();
        genderComboBox.setValue(null);

        bmiLabel.setText("--");
        kategoriLabel.setText("Belum ada hasil");
        rekomendasiLabel.setText(
            "Hasil BMI akan muncul di sini"
        );
    }
}
