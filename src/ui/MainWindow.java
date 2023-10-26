package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame {

    public static final int DEFAULT_WIDTH = 500;

    public static final int DEFAULT_HEIGHT = 600;

    public static final int DEFAULT_WIDTH_BUTTON = 100;

    public static final int DEFAULT_HEIGHT_BUTTON = 50;

    public static final String DEFAULT_TITLE = "Java Checkers";

    public MainWindow() {

        // Setup the window
        super(DEFAULT_TITLE);
        super.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        super.setLocationByPlatform(true);
        super.setLayout(null);

        JButton startBtn = new JButton("Start game");
        // Setup button start to center of frame
        startBtn.setBounds(DEFAULT_WIDTH / 2 - DEFAULT_WIDTH_BUTTON / 2, DEFAULT_HEIGHT / 2 - DEFAULT_HEIGHT_BUTTON / 2, DEFAULT_WIDTH_BUTTON, DEFAULT_HEIGHT_BUTTON);

        // Add listener for button
        startBtn.addActionListener(e -> {

            // Create and open a window to display the checkers game
            CheckersWindow window = new CheckersWindow();
            window.setDefaultCloseOperation(CheckersWindow.EXIT_ON_CLOSE);
            window.setVisible(true);

            // Close current frame
            this.dispose();
        });
        // Add button to frame
        this.add(startBtn);
    }
}
