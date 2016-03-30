import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

// Runnable allows threaded program
public class UserInterface implements Runnable {
    // JFrame is the basic element of visible user interfaces in Java
    private JFrame frame;

    public UserInterface() {
    }

    public void run() {
        // Set frame title and dimensions
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(200, 100));

        // Set "Red cross button" to close window
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        // Organize frame and make it visible
        frame.pack();
        frame.setVisible(true);
    }

    public void createComponents(Container container) {
    }

    public JFrame getFrame() {
        return frame;
    }
}
