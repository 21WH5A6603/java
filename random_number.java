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
	 output 1:
random number generated is:34
square of34=1156
random number generated is:70
square of70=4900
random number generated is:94
square of94=8836
random number generated is:36
square of36=1296
random number generated is:96
square of96=9216
random number generated is:40
square of40=1600
random number generated is:76
square of76=5776
random number generated is:44
square of44=1936
random number generated is:89
cube of89=704969
random number generated is:34
square of34=1156
	
	output 2:
random number generated is:62
square of62=3844
random number generated is:6
square of6=36
random number generated is:29
cube of29=24389
random number generated is:65
cube of65=274625
random number generated is:91
cube of91=753571
random number generated is:2
square of2=4
random number generated is:79
cube of79=493039
random number generated is:66
square of66=4356
random number generated is:44

	output 3:
random number generated is:45
cube of45=91125
random number generated is:29
cube of29=24389
random number generated is:54
square of54=2916
random number generated is:43
cube of43=79507
random number generated is:97
cube of97=912673
random number generated is:91
cube of91=753571
random number generated is:86
square of86=7396
random number generated is:56
square of56=3136
random number generated is:5
cube of5=125
random number generated is:27
cube of27=19683

