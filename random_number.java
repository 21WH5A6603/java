package AIML;
import java.util.Random;
public class random_number extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
			Random random = new Random();
			int randomInteger = random.nextInt(100);
			System.out.println("random number generated is:"+randomInteger);
			if((randomInteger%2)==0) {
				Square_Thread s = new Square_Thread(randomInteger); 
				s.start();
			}
			else {
				Cube_Thread c = new Cube_Thread(randomInteger);
				c.start();
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex);
			}
		}
	}

	public static void main(String[] args) {
		random_number n = new random_number();
		n.start();
}
}
		
class Square_Thread extends Thread{
	int number;
	Square_Thread(int random_number_n){
	number = random_number_n;
	}
	public void run() {
	   System.out.println("square of"+number+"="+(number*number));
		}
		}
	class 	Cube_Thread extends Thread{
		int number;
		Cube_Thread(int randomnumber){
			number = randomnumber;
		}
		public void run() {
			System.out.println("cube of"+number+"="+(number*number*number));
		}
	}
	
