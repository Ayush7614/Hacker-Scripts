/* 
Java Program to take a screenshot of the screen
*/
import java.awt.image.BufferedImage; 
import java.io.File; 
import java.awt.Rectangle; 
import java.awt.Toolkit; 
import java.awt.Robot; 
import javax.imageio.ImageIO; 
import java.util.*;

public class screenshottaker { 
    public static final long serialVersionUID = 1L; 
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) 
    { 
        System.out.println("Kindly enter the name of the file: ");
        String name = sc.next();
        try 
        {
            Thread.sleep(120); //sleeping the main thread for 120 ms
            Robot r = new Robot(); 

            //to save the screen shot to a specific location
            String path = "D:// "+name+".jpg";
            
            //Getting the screen size
            Rectangle capture =  new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); 
            //capturing the image
            BufferedImage Image = r.createScreenCapture(capture); 
            ImageIO.write(Image, "jpg", new File(path)); 
            System.out.println("Screenshot saved"); 
        } 
        catch (Exception exception) 
        { 
            System.out.println("Error: "+exception); 
        } 
    } 
} 

/*
Output:
Kindly enter the name of the file: 
mydear
Screenshot saved
*/

