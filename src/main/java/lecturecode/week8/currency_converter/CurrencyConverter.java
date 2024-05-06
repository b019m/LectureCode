package lecturecode.week8.currency_converter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConverter extends JFrame{

    private JTextField dollarsTextField;
    private JButton convertButton;
    private JLabel conversionResultLabel;
    private JPanel mainPanel;
    private JComboBox<String> currencyComboBox;

    private double dollarsToEurosExchangeRate = 0.84; // converts dollar to euros

    private final String EUROS = "Euros";
    private final String POUNDS = "Pounds";
    private Map<String, Double> exchangeRates = Map.of(EUROS, 0.84, POUNDS, 0.75);
    CurrencyConverter() { // constructor
        setContentPane(mainPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        getRootPane().setDefaultButton(convertButton); // to make the convert button work with clicking enter

        currencyComboBox.addItem(EUROS);
        currencyComboBox.addItem(POUNDS);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dollarString = dollarsTextField.getText();
                // what was typed in the JTextField dollarsTextField

                try {
                    // convert to a number
                    double dollars = Double.parseDouble(dollarString);
                    String toCurrency = (String) currencyComboBox.getSelectedItem();

                    double exchangeRate = exchangeRates.get(toCurrency);
                    // convert to target currency
                    double convertedValue = dollars * exchangeRate;
                    // display results in euroResultLabel JLabel
                    String resultString = String.format("%.2f dollars is equivalent to %.2f %s",
                            dollars, convertedValue, toCurrency);
                    conversionResultLabel.setText(resultString);
                } catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(CurrencyConverter.this,
                            "Please enter a number without any $ or other characters.");
                }

            }
        });

    }
}


