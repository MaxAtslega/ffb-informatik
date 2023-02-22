package de.atslega.rennschnecke;

import javax.swing.*;
import java.awt.event.*;

public class WettbueroForm extends JDialog {
    private JPanel contentPane;
    private JTextField nameTextField;
    private JTextField rasseTextField;
    private JTextField maxGeschwindigkeitTextField;
    private JButton hinzufügenButton;
    private JButton löschenButton;
    private JTextField spielnameTextField;
    private JTextField wetteinsatzTextField;
    private JButton wetteHinzufügenButton;
    private JPanel panel1;
    private JButton rennenStartenButton;
    private JList list1;
    private JList list2;
    private JLabel messageRennschneckeLabel;
    private JLabel messageWetteLabel;
    private JButton buttonOK;
    private JButton buttonCancel;

    private String name = "";
    private String rasse = "";
    private String maxGeschwindigkeit = "";

    private String spieler = "";
    private double wetteinsatz = 0;

    public WettbueroForm() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);


        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        hinzufügenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!nameTextField.getText().equals("") || !rasseTextField.getText().equals("") || !maxGeschwindigkeitTextField.getText().equals("")){
                    name = nameTextField.getText();
                    rasse = rasseTextField.getText();
                    maxGeschwindigkeit = maxGeschwindigkeitTextField.getText();


                }else{
                    messageRennschneckeLabel.setText("Bitte gebe alle Werte ein.");
                }
            }
        });
        wetteHinzufügenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!spielnameTextField.getText().equals("") || !wetteinsatzTextField.getText().equals("")){
                    spieler = spielnameTextField.getText();
                    try {
                        wetteinsatz = Double.parseDouble(wetteinsatzTextField.getText());
                    } catch (NumberFormatException ex){
                        messageWetteLabel.setText("Bitte gebe als Wetteinsatz eine Nummer ein.");
                    }

                }else{
                    messageWetteLabel.setText("Bitte gebe alle Werte ein.");
                }
            }
        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
