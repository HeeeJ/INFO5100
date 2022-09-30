/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class ButtonNotUsableTillAction {

    private JComponent ui = null;

    ButtonNotUsableTillAction() {
        initUI();
    }

    public void initUI() {
        if (ui!=null) return;

        ui = new JPanel(new GridLayout(1, 0, 4, 4));
        ui.setBorder(new EmptyBorder(4,4,4,4));
        
        // first demo, using card layout
        JPanel cardDemoPanel = new JPanel(new GridLayout(1, 0, 2, 2));
        cardDemoPanel.setBorder(new TitledBorder("Card Layout"));
        ui.add(cardDemoPanel);
        
        JButton actionCardButton = new JButton("Action");
        cardDemoPanel.add(actionCardButton);
        
        CardLayout cardLayout = new CardLayout();
        JPanel cardLayoutPanel = new JPanel(cardLayout);
        cardDemoPanel.add(cardLayoutPanel);
        cardLayoutPanel.add(new JPanel(), "panel");
        cardLayoutPanel.add(new JButton("Effect"), "button");
        cardLayout.show(cardLayoutPanel, "panel");
        
        ActionListener flipCardListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardLayoutPanel, "button");
            }
        };
        actionCardButton.addActionListener(flipCardListener);
        
        // first demo, using disabled / enabled
        JPanel enabledDemoPanel = new JPanel(new GridLayout(1, 0, 2, 2));
        enabledDemoPanel.setBorder(new TitledBorder("Enabled"));
        ui.add(enabledDemoPanel);
        JButton actionEnabledButton = new JButton("Action");
        enabledDemoPanel.add(actionEnabledButton);
        JButton effectButton = new JButton("Effect");
        enabledDemoPanel.add(effectButton);
        effectButton.setEnabled(false);
        ActionListener enableComponentListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                effectButton.setEnabled(true);
            }
        };
        actionEnabledButton.addActionListener(enableComponentListener);
    }

    public JComponent getUI() {
        return ui;
    }

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception useDefault) {
                }
                ButtonNotUsableTillAction o = new ButtonNotUsableTillAction();

                JFrame f = new JFrame(o.getClass().getSimpleName());
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setLocationByPlatform(true);

                f.setContentPane(o.getUI());
                f.pack();
                f.setMinimumSize(f.getSize());

                f.setVisible(true);
            }
        };
        SwingUtilities.invokeLater(r);
    }
}
    
