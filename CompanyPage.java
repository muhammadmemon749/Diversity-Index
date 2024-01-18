// @author (Yazan)

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompanyPage {

    static void createCompanyPageGUI() {
        // Creating the frame (page)
        JFrame frame = new JFrame("Company Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout(10, 10));

        // Creating a JPanel for the company title, overview, and go-back button
        JPanel topPanel = new JPanel(new BorderLayout());
        JTextArea titleOfCompany = new JTextArea();
        titleOfCompany.setEditable(false);
        titleOfCompany.setText("Company Name"); // Selected company name goes here
        Font titleFont = new Font("Times New Roman", Font.BOLD, 40);
        titleOfCompany.setFont(titleFont);
        titleOfCompany.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleOfCompany.setAlignmentY(Component.TOP_ALIGNMENT);
        topPanel.add(titleOfCompany, BorderLayout.NORTH);

        // Creating a text area for the company overview
        JTextArea companyOverview = new JTextArea("Company Info & Rank Go Here"); // Company overview goes here
        companyOverview.setEditable(false);
        Font overviewFont = new Font("Times New Roman", Font.PLAIN, 20);
        companyOverview.setFont(overviewFont);
        companyOverview.setAlignmentX(Component.LEFT_ALIGNMENT);
        companyOverview.setAlignmentY(Component.CENTER_ALIGNMENT);
        topPanel.add(companyOverview, BorderLayout.CENTER);

        // Creating a button to go back to the previous page
        JButton goBackButton = new JButton("Go Back");
        goBackButton.setPreferredSize(new Dimension(90, 20));
        goBackButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        topPanel.add(goBackButton, BorderLayout.EAST);
        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.createWelcomePageGUI();
                frame.setVisible(false);
                frame.dispose();
            }
        });

        // Create a panel for results
        JPanel resultsPanel = new JPanel();

        // adding the panels to the frame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(resultsPanel, BorderLayout.CENTER);

        // Setting the size of the panels
        topPanel.setPreferredSize(new Dimension(100, 100));
        resultsPanel.setPreferredSize(new Dimension(100, 100));

        // Panel colours
        topPanel.setBackground(Color.lightGray);
        resultsPanel.setBackground(Color.WHITE);

        frame.setVisible(true);
    }
}