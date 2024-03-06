import ecs100.*; // Import ecs 100 library
import java.awt.Color; // Use different colours
/**
 * Class demo ot draw a lollipop for our first GUI
 *
 * @author Charlotte Parker
 * @version 1
 */
public class Lollipop
{
    // instance variables 
    private static final  double XPOS = 300.0; // Horizontal centre of lollipop
    private static final  double YPOS = 180.0; // Vertical centre of lollipop
    private static final  double STICK = 200.0; // Length of stick
    private static final  double SIZE = 80.0; // Size of stick
    /**
     * Constructor for objects of class Lollipop
     */
    public Lollipop()
    {
        // initialise instance variables
        UI.initialise(); // bring up the GUI 
        UI.addButton("Draw", this::doDrawLollipop); // Call the draw lollipop method 
        UI.addButton("Quit", UI::quit);
        
    }

    /**
     * Draw a lollipop
     */
    public void doDrawLollipop(){
        // Declare variables
        
        // Draw the stick
        UI.setColor(Color.black);
        UI.setLineWidth(10.0);
        UI.drawLine(XPOS, YPOS, XPOS, YPOS+STICK);
        
        // Draw the lollipop
        UI.setLineWidth(1.0);
        UI.setColor(Color.magenta);
        UI.fillOval(XPOS-SIZE*0.5, YPOS-SIZE*0.5, SIZE, SIZE);
    }
}
