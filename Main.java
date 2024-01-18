// @author (Yazan)

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> CompanyPage.createCompanyPageGUI());
        SwingUtilities.invokeLater(() -> createWelcomePageGUI());
    }

    static void createWelcomePageGUI() {
        // Creating the frame (page)
        JFrame frame = new JFrame("Starting Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout(10, 10));

        // Create a JPanel for the title (DICE)
        JPanel titlePanel = new JPanel();
        JTextArea title = new JTextArea();
        title.setEditable(false);
        title.setText("DICE: Diversity Index for Corporate Equality");
        Font titleFont = new Font("Times New Roman", Font.BOLD, 40);
        title.setFont(titleFont);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setAlignmentY(Component.CENTER_ALIGNMENT);
        titlePanel.add(title, BorderLayout.NORTH);

        // Create a JPanel for search bar
        JPanel searchPanel = new JPanel();
        JTextArea searchBar = new JTextArea();
        searchBar.setAlignmentX(Component.CENTER_ALIGNMENT);
        searchBar.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        // SEARCH BAR NOT WORKING
        searchPanel.add(searchBar);
        JButton searchButton = new JButton("Search");
        searchPanel.add(searchButton);

        // Create a panel for filters
        JPanel filtersPanel = new JPanel();
        JButton filterButton = new JButton("Apply Filter");
        filtersPanel.add(filterButton, BorderLayout.NORTH);

        // Create a panel for results
        JPanel resultsPanel = new JPanel();
        resultsPanel.add(searchPanel, Component.TOP_ALIGNMENT);

        // adding the panels to the frame
        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(resultsPanel, BorderLayout.CENTER);
        frame.add(filtersPanel, BorderLayout.WEST);

        // Setting the size of the panels
        titlePanel.setPreferredSize(new Dimension(100, 100));
        filtersPanel.setPreferredSize(new Dimension(200, 100));
        searchPanel.setPreferredSize(new Dimension(700, 75));
        resultsPanel.setPreferredSize(new Dimension(100, 100));

        // Panel colours
        titlePanel.setBackground(Color.white);
        searchPanel.setBackground(Color.DARK_GRAY);
        filtersPanel.setBackground(Color.gray);
        resultsPanel.setBackground(Color.WHITE);

        frame.setVisible(true);
    }
}