import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	private static ArrayList<Integer> content = new ArrayList<Integer>();
	
	public static void readFile() {
		try {
			FileInputStream inputStream = new FileInputStream("song1.txt");
			
			int read;
			while((read=inputStream.read()) !=-1)
				content.add(read);
			
		}
		catch (FileNotFoundException e) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);
		}
		catch (IOException e) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);
		}
	}
	
	public static void copyIt(String file) {
		try {
			FileOutputStream out = new FileOutputStream(file);
			for (int val:content) 
				out.write(val);
			
		} catch (FileNotFoundException e) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);
		}
		catch (IOException e) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HELLO\n");
		
		readFile();
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				copyIt("song2.txt");
			}
		});
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				copyIt("song3.txt");
			}
		});
		Thread thread4 = new Thread(new Runnable() {
			@Override
			public void run() {
				copyIt("song4.txt");
			}
		});
		Thread thread5 = new Thread(new Runnable() {
			@Override
			public void run() {
				copyIt("song5.txt");
			}
		});
		/*
		copyIt("song2.txt");
		copyIt("song3.txt");
		copyIt("song4.txt");
		copyIt("song5.txt"); //0.013
		*/
		double startTime =System.currentTimeMillis();
		
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		try {
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();//0.008
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		double finishTime =System.currentTimeMillis();
		System.out.println("How many time it was ? +"+((finishTime-startTime)/1000));
		System.out.println("\nBYE");
		
	}

}
