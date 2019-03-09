package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot robutt = new Robot ();
		//2. Set the speed to 100
        robutt.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Cyan","orange", "pink"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice==0){
	robutt.setPenColor(Color.cyan);
	
		}
		if(colorChoice==1){
			robutt.setPenColor(Color.ORANGE);
			if(colorChoice==2){
				robutt.setPenColor(Color.PINK);
		//4. Ask the use how many polygons they want to be drawn.
		JOptionPane.showInputDialog(null, "How many polygons do you want to draw? :3 XD =3");
		//5. Use the robot to draw the number of polygons the user requested.
		
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	
		
		
		
		
		
		
	}
}

