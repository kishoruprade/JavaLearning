package button;

import java.awt.Button;
import java.awt.Frame;

public class ButtonDevelop extends Frame{  //Frame inheritance
	
	ButtonDevelop(){                      //Button used as constructor
		Button b = new Button("Click Me");   //Create an object with reference b
		b.setBounds(30,100,80,30);           //use setBounds for button position
		add(b);                          //adding button into frame
		setSize(1368,768);                 //framesize 300 width and 300 height
		setLayout(null);                 //no layout manager
		setVisible(true);                //now frame will be visible by default it is not visible
		
	}	

	public static void main(String[] args) {
		ButtonDevelop bd = new ButtonDevelop();

	}

}
