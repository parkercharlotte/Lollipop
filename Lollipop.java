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
        UI.addButton("Draw", this::drawLollipops); // Call the draw lollipop method 
        UI.addButton("Quit", UI::quit);
        
    }

    /**
     * Draw a lollipop
     */
    public void doDrawLollipop(double x, double y, double size, double stick){
        // Declare variables
        double left = x - size/2; // left most pos of lollipop
        double top = y - size/2; // top most pos of lollipop
        double bottom = y + stick; // bottom most pos of lollipop
        
        // Draw the stick
        UI.setColor(Color.black);
        UI.setLineWidth(size/8.0); /// Stick 1/8th size of lollipop
        UI.drawLine(x, y, x, bottom);
        
        // Draw the lollipop
        UI.setLineWidth(1.0);
        UI.setColor(Color.magenta);
        UI.fillOval(left, top, size, size);
    }
    public void drawLollipops (){
        
        double diameter = UI.askDouble("Diameter: ");
        
        this.doDrawLollipop(300, 180, 80, 200);
        this.doDrawLollipop(100, 50, 200, 20);
        this.doDrawLollipop(400, 60, 90, 500);
        this.doDrawLollipop(10, 60, 90, 300);
    }
    
}
