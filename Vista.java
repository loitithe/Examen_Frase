package Examen_Frase;

import java.awt.*;
import javax.swing.*;

public class Vista extends JFrame {
    private JPanel panelPrincipal, panelNorte;
    private JLabel label_IntroduceFrase;
    private JTextField jTextField_Frase;
    private JButton button_Procesar;
    private PanelFrase jPanelFrase;
    private GridBagConstraints c;

    Vista() {
        setLayout(new BorderLayout());

        jPanelFrase = new PanelFrase();

        panelNorte = new JPanel(new GridBagLayout());
        label_IntroduceFrase = new JLabel("Introduce una frase");
        panelNorte.add(label_IntroduceFrase, createConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, new Insets(20, 0, 20, 0)));
        this.add(panelNorte, BorderLayout.NORTH);
        jTextField_Frase = new JTextField();
        panelNorte.add(jTextField_Frase, createConstraints(1, 0, 1, 1, 1.0, 0, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, new Insets(20, 10, 20, 50)));

        button_Procesar = new JButton("Procesar frase");
        button_Procesar.setBounds(50, 50, 10, 10);
        this.add(button_Procesar, BorderLayout.WEST);

        this.add(jPanelFrase, BorderLayout.CENTER);

        setSize(600, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private static GridBagConstraints createConstraints(int gridx, int gridy, int gridwidth, int gridheight,
            double weightx, double weighty, int fill, int anchor, Insets insets) {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = gridx;
        constraints.gridy = gridy;
        constraints.gridwidth = gridwidth;
        constraints.gridheight = gridheight;
        constraints.weightx = weightx;
        constraints.weighty = weighty;
        constraints.fill = fill;
        constraints.anchor = anchor;
        constraints.insets = insets;
        return constraints;
    }
}

class PanelFrase extends JPanel {
    private GridBagConstraints c;
    private JLabel label_numLetras, label_numPalabras, label_invertirFrase, label_SepararPalabras,
            label_PrimeraPosicionVocal;
    private JTextField jTextField_numLetras, jTextField_numPalabras, jTextField_invertirFrase,
            jTextField_separarPalabras,
            jTextField_primeraPosicionVocal;

    PanelFrase() {
        this.setBorder(BorderFactory.createTitledBorder("Procesar frase"));
        setLayout(new GridBagLayout());
        label_numLetras = new JLabel("Numero de letras");
        this.add(label_numLetras,
                createConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER,
                        new Insets(0, 30, 0, 50)));

        jTextField_numLetras = new JTextField();
        jTextField_numLetras.setEditable(false);
        this.add(jTextField_numLetras,
                createConstraints(1, 0, 1, 1, 1.0, 0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER,
                        new Insets(10, 0, 10, 50)));

        label_numPalabras = new JLabel("Numero de palabras");
        this.add(label_numPalabras,
                createConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER,
                        new Insets(10, 30, 10, 20)));

        jTextField_numPalabras = new JTextField();
        jTextField_numPalabras.setEditable(false);
        this.add(jTextField_numPalabras,
                createConstraints(1, 1, 1, 1, 1.0, 0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER,
                        new Insets(10, 0, 10, 50)));

        label_invertirFrase = new JLabel("Invertir frase");
        this.add(label_invertirFrase,
                createConstraints(0, 2, 1, 1, 0, 0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER,
                        new Insets(10, 30, 10, 20)));

        jTextField_invertirFrase = new JTextField();
        jTextField_invertirFrase.setEditable(false);
        this.add(jTextField_invertirFrase, createConstraints(1, 2, 1, 1, 1, 0, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, new Insets(10, 0, 10, 50)));

        label_SepararPalabras = new JLabel("Separar palabras");
        this.add(label_SepararPalabras, createConstraints(0, 3, 1, 1, 0, 0, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, new Insets(10, 30, 10, 20)));

        jTextField_separarPalabras = new JTextField();
        jTextField_separarPalabras.setEditable(false);
        this.add(jTextField_separarPalabras, createConstraints(1, 3, 1, 1, 1, 0, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, new Insets(10, 0, 10, 50)));

        label_PrimeraPosicionVocal = new JLabel("Primera posicion vocal");
        this.add(label_PrimeraPosicionVocal, createConstraints(0, 4, 1, 1, 0, 0, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, new Insets(10, 30, 10, 20)));

        jTextField_primeraPosicionVocal = new JTextField();
        jTextField_primeraPosicionVocal.setEditable(false);
        this.add(jTextField_primeraPosicionVocal, createConstraints(1, 4, 1, 1, 1, 0, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, new Insets(10, 0, 10, 50)));
    }

    private static GridBagConstraints createConstraints(int gridx, int gridy, int gridwidth, int gridheight,
            double weightx, double weighty, int fill, int anchor, Insets insets) {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = gridx;
        constraints.gridy = gridy;
        constraints.gridwidth = gridwidth;
        constraints.gridheight = gridheight;
        constraints.weightx = weightx;
        constraints.weighty = weighty;
        constraints.fill = fill;
        constraints.anchor = anchor;
        constraints.insets = insets;
        return constraints;
    }
}