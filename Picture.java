/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * This is a scene of a skydiver soon after beginning his decent out of the
 * of the plane
 * 
 * @author Ryan Rutishasuer
 * @version 2022-01-26
 */
public class Picture
{
    private Square wall;
    private Square plane;
    private Square window;
    private Square door;
    private Triangle hood;
    private Triangle hood2;
    private Circle parachute;
    private Triangle parachute2;
    private Person diver;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        plane = new Square();
        window = new Square();
        door = new Square();
        hood = new Triangle();
        hood2 = new Triangle();
        parachute = new Circle();
        parachute2 = new Triangle();
        diver = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.changeColor("blue");
            wall.moveHorizontal(-1400);
            wall.moveVertical(-200);
            wall.changeSize(12000);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-200);
            window.moveVertical(-50);
            window.changeSize(120);
            window.makeVisible();
            
            plane.changeColor("black");
            plane.moveHorizontal(-320);
            plane.moveVertical(-50);
            plane.changeSize(120);
            plane.makeVisible();
            
            parachute.changeColor("yellow");
            parachute.moveHorizontal(-90);
            parachute.moveVertical(110);
            parachute.changeSize(40);
            parachute.makeVisible();
            
            parachute2.changeColor("green");
            parachute2.changeSize(-30, 60);
            parachute2.moveHorizontal(-50);
            parachute2.moveVertical(100);
            parachute2.makeVisible();
            
            diver.changeColor("magenta");
            diver.moveHorizontal(-120);
            diver.moveVertical(40);
            diver.changeSize(-60, 40);
            diver.makeVisible();
    
            hood.changeColor("black");
            hood.changeSize(60, 180);
            hood.moveHorizontal(20);
            hood.moveVertical(-70);
            hood.makeVisible();
            
            hood2.changeColor("black");
            hood2.changeSize(-60, 180);
            hood2.moveHorizontal(20);
            hood2.moveVertical(50);
            hood2.makeVisible();
            
            door.changeColor("blue");
            door.moveHorizontal(-200);
            door.moveVertical(-40);
            door.changeSize(100);
            door.makeVisible();
    
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("white");
        window.changeColor("black");
        plane.changeColor("black");
        hood.changeColor("black");
        hood2.changeColor("black");
        door.changeColor("white");
        parachute.changeColor("black");
        parachute2.changeColor("black");
        diver.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("blue");
        window.changeColor("black");
        plane.changeColor("black");
        hood.changeColor("black");
        hood2.changeColor("black");
        door.changeColor("blue");
        parachute.changeColor("yellow");
        parachute2.changeColor("green");
        diver.changeColor("magenta");
    }
}
