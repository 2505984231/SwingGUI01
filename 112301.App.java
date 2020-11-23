package pac;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner in=new Scanner(System.in);
		System.out.println("--请输入数字1输出随机坐标--");
		while (true) {
			int i=in.nextInt();
			if(i==1){
			int x=r.nextInt(100);
			int y=r.nextInt(100);
			System.out.println("(y:"+y+",x:"+x+")");
			}else {
				System.out.println("无法输出随机坐标");
			}
		}
	}
}
