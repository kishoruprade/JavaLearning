package applet;

import java.applet.Applet;
import java.awt.Graphics;

public class AppletFirst extends Applet {

	public static void main(String[] args) {
		AppletFirst appl = new AppletFirst();
		

	}
	
	public void paint(Graphics g){
		g.drawString("welcome",150,150);
		
	}

}
