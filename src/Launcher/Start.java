package Launcher;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.KeyStroke;

public class Start {
	
	static int mask = InputEvent.BUTTON1_DOWN_MASK; 
	
	public static void main(String []args) throws AWTException, InterruptedException, FileNotFoundException {
		Thread.sleep(10000);
		
		Scanner Bot = new Scanner(new File("D:\\Backup\\Eclipse\\eclipse-workspace\\DiscordLevelUpBot\\src\\LOTR.txt"));
		int length = 0;
		for (int i = 0; i < 64*2; i = 0) {
		
		
		
		if (Bot.hasNextLine() == true) {
			
				
		Robot r = new Robot();
				
		String str = (String) Bot.nextLine();
		Scanner sc = new Scanner(str);
		
		while (sc.hasNext()) {
			
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		StringSelection strSel = new StringSelection(sc.next());
		clipboard.setContents(strSel, null);

		
		//r.mouseMove(2330, 1032);       
		//r.mousePress(mask);     
		//r.mouseRelease(mask);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
//		r.keyPress(KeyEvent.VK_SPACE);
//		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		
		Thread.sleep(60000);
		length++;
		}
		
		sc.close();	
		
		}
			
				//Bot.nextLine();
			
		
		}
		
		
		Bot.close();
	}

}
