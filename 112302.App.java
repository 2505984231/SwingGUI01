package pac;
import java.util.Random;
public class App {
	public static void main(String[] args) throws InterruptedException {
		Random r = new Random();
		while (true) {
			Thread.sleep(1000);
			int x=r.nextInt(100);
			int y=r.nextInt(100);
			System.out.println("(y:"+y+",x:"+x+")");
		}
	}
}
