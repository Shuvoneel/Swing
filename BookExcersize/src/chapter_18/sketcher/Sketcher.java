package chapter_18.sketcher;

// Sketching application
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.SwingUtilities;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

public class Sketcher implements WindowListener {

    public static void main(String[] args) {
        theApp = new Sketcher();
        SwingUtilities.invokeLater(
                new Runnable() {                          // Anonymous Runnable class object
            public void run() {      // Run method executed in thread
                theApp.creatGUI();     // Call static GUI creator
            }
        });
    }

    // Method to create the application GUI
    private void creatGUI() {
        window = new SketchFrame("Sketcher");        // Create the app window
        Toolkit theKit = window.getToolkit();        // Get the window toolkit
        Dimension wndSize = theKit.getScreenSize();  // Get screen size

        // Set the position to screen center & size to half screen size
        window.setBounds(wndSize.width / 4, wndSize.height / 4, // Position
                wndSize.width / 2, wndSize.height / 2);      // Size

        window.addWindowListener(this);              // theApp as window listener
        window.setVisible(true);
    }

    // Handler for window closing event
    @Override
    public void windowClosing(WindowEvent e) {
        window.dispose();                                                          // Release the window resources
        System.out.println("Window Closed");           // End the application
        System.exit(0);                              
    }

    // Listener interface functions you must implement - but don't need
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened Method");
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified Method");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Disiconified Method");
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated Method");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated Method");
    }

    private SketchFrame window;                   // The application window
    private static Sketcher theApp;               // The application object
}
