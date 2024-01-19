// @author (Yazan)

// Importing necessary tools
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        // Invoking the methods
        SwingUtilities.invokeLater(() -> CompanyPage.createCompanyPageGUI());
        SwingUtilities.invokeLater(() -> createWelcomePageGUI());
    }

    static void createWelcomePageGUI() {
        // Creating the frame (page)
        JFrame frame = new JFrame("Starting Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Setting the size of the page
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);
        // Adding some space between panels
        frame.setLayout(new BorderLayout(10, 10));

        // Creating a JPanel for the title (DICE)
        JPanel titlePanel = new JPanel();
        // Creating a JLabel for the title
        JLabel title = new JLabel();
        // Setting the title to the name our group decided on
        title.setText("DICE: Diversity Index for Corporate Equality");
        // Changing the font and size of the title
        Font titleFont = new Font("Times New Roman", Font.BOLD, 40);
        title.setFont(titleFont);
        // Positioning
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setAlignmentY(Component.CENTER_ALIGNMENT);
        // Adding the title to the panel
        titlePanel.add(title, BorderLayout.NORTH);

        // Creating a JPanel for the search bar
        JPanel searchPanel = new JPanel();
        JTextArea searchBar = new JTextArea();
        searchBar.setAlignmentX(Component.CENTER_ALIGNMENT);
        searchBar.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        // NOTE: SEARCH BAR NOT WORKING
        searchPanel.add(searchBar);
        JButton searchButton = new JButton("Search");
        searchPanel.add(searchButton);


        
        JPanel resultsPanel = new JPanel();
        resultsPanel.add(searchPanel, Component.TOP_ALIGNMENT);
        // @author ChatGPT
        resultsPanel.setLayout(new BoxLayout(resultsPanel, BoxLayout.Y_AXIS));
        // Adding a listener that does something when the user presses on a button
        // In this case: goes to the previous page when button is pressed
        JButton goToCompanyPageButton = new JButton("Go To Company Page");
        // Size
        goToCompanyPageButton.setPreferredSize(new Dimension(90, 20));
        // Alignment
        goToCompanyPageButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        // Adding the button to the panel
        resultsPanel.add(goToCompanyPageButton, Component.RIGHT_ALIGNMENT);
        goToCompanyPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Calling the createWelcomePageGUI method from CompanyPage, which creates the page
                CompanyPage.createCompanyPageGUI();
                // Setting this page (WelcomePage) to not-visible so the user automatically sees the next page
                frame.setVisible(false);
                /*
                 * Disposing of the page: basically gets rid of the components of this page
                 * Frees up memory
                 */
                frame.dispose();
            }
        });
        

        // Create a panel for filters
        JPanel filtersPanel = new JPanel();
        // Creating a button that applies the filters
        JButton filterButton = new JButton("Apply Filter");
        // Adding the button to the panel
        filtersPanel.add(filterButton, BorderLayout.NORTH);

        // adding the panels to the frame
        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(resultsPanel, BorderLayout.CENTER);
        frame.add(filtersPanel, BorderLayout.WEST);

        // Setting the size of the panels
        titlePanel.setPreferredSize(new Dimension(100, 100));
        filtersPanel.setPreferredSize(new Dimension(200, 100));
        searchPanel.setPreferredSize(new Dimension(700, 75));
        resultsPanel.setPreferredSize(new Dimension(100, 300));

        // Changing the colour of the panels
        titlePanel.setBackground(Color.white);
        searchPanel.setBackground(Color.DARK_GRAY);
        filtersPanel.setBackground(Color.gray);
        resultsPanel.setBackground(Color.WHITE);

        // Making the frame visible
        frame.setVisible(true);
    }
}
