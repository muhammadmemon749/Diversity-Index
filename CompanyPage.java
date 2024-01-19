// @author (Yazan)

// Importing necessary tools
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;


public class CompanyPage {

    static void createCompanyPageGUI() {
        // Creating the frame (page)
        JFrame frame = new JFrame("Company Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Setting the size of the page
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);
        // Adding some space between panels
        frame.setLayout(new BorderLayout(10, 10));

        // Creating a JPanel for the company title, overview, and go-back button
        JPanel topPanel = new JPanel(new BorderLayout());
        JLabel titleOfCompany = new JLabel();
        titleOfCompany.setText("Company Name"); // Selected company name goes here
        titleOfCompany.setBackground(Color.lightGray);
        // Changing title font and size
        Font titleFont = new Font("Times New Roman", Font.BOLD, 40);
        titleOfCompany.setFont(titleFont);
        // Changing title position
        titleOfCompany.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleOfCompany.setAlignmentY(Component.TOP_ALIGNMENT);
        // Adding the title to the panel
        topPanel.add(titleOfCompany, BorderLayout.NORTH);

        // Creating a text area for the company overview
        JLabel companyOverview = new JLabel("Company Info & Rank Go Here"); // Company overview goes here
        // Setting font and size
        Font overviewFont = new Font("Times New Roman", Font.PLAIN, 14);
        companyOverview.setFont(overviewFont);
        // Aligning
        companyOverview.setAlignmentX(Component.LEFT_ALIGNMENT);
        companyOverview.setAlignmentY(Component.CENTER_ALIGNMENT);
        // Adding the JTextArea to the JPanel
        topPanel.add(companyOverview, BorderLayout.CENTER);

        // Creating a button to go back to the previous page
        JButton goBackButton = new JButton("Go Back");
        // Size
        goBackButton.setPreferredSize(new Dimension(90, 20));
        // Alignment
        goBackButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        // Adding the button to the panel
        topPanel.add(goBackButton, BorderLayout.EAST);
        // Adding a listener that does something when the user presses on a button
        // In this case: goes to the previous page when button is pressed
        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Calling the createWelcomePageGUI method from main, which creates the page again
                Main.createWelcomePageGUI();
                // Setting this page (companyPage) to not-visible so the user automatically sees the previous page
                frame.setVisible(false);
                /*
                 * Disposing of the page: basically gets rid of the components of this page
                 * Frees up memory
                 */
                frame.dispose();
            }
        });


        // Creating graphics - not done, gonna research the best method to add images
        


        // Creating a panel for results
        JPanel resultsPanel = new JPanel();
        // @author ChatGPT - changed the layout of the panel to fix an issue
        resultsPanel.setLayout(new BoxLayout(resultsPanel, BoxLayout.Y_AXIS));
        // Creating labels that provide the user with company data
        // @author Yazan
        JLabel wageDisparity = new JLabel("data on wage disparity goes here");
        JLabel employeeMaleToFemaleRatio = new JLabel("data on male to female employees ratio goes here");
        JLabel reportedIncidents = new JLabel("data on reported incidents goes here");
        JLabel employeeDiversity = new JLabel("data on employee diversity by demographic goes here");
        JLabel companyScore = new JLabel("data on the company's score goes here");
        resultsPanel.add(wageDisparity);
        resultsPanel.add(employeeMaleToFemaleRatio);
        resultsPanel.add(reportedIncidents);
        resultsPanel.add(employeeDiversity);
        resultsPanel.add(companyScore);

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
