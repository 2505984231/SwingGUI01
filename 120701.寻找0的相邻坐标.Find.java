package pac;

public class Find {
 void findZero(int array2d[][]) {
	 for(int y=0;y<array2d.length;y++) {
		 for(int x=0;x<array2d[0].length;x++) {
			 if(array2d[y][x]==0) {
				 System.out.println("坐标是：R_zero("+x+","+y+")");
			 }
		 }
	 }
 }
 void findLeft(int array2d[][]) {
	 for(int y=3;y<array2d.length;y++) {
		 for(int x=0;x<array2d[1].length;x++) {
			 if(array2d[y][x]==10) {
				 System.out.println("坐标是：R_left("+x+","+y+")");
			 }
		 }
	 }
 }
 void findRight(int array2d[][]) {
	 for(int y=0;y<array2d.length;y++) {
		 for(int x=0;x<array2d[0].length;x++) {
			 if(array2d[y][x]==12) {
				 System.out.println("坐标是：R_right("+x+","+y+")");
			 }
		 }
	 }
 }
 void findUp(int array2d[][]) {
	 for(int y=0;y<array2d.length;y++) {
		 for(int x=0;x<array2d[0].length;x++) {
			 if(array2d[y][x]==5) {
				 System.out.println("坐标是：R_up("+x+","+y+")");
			 }
		 }
	 }
 }
 void findDown(int array2d[][]) {
	 for(int y=0;y<array2d.length;y++) {
		 for(int x=0;x<array2d[0].length;x++) {
			 if(array2d[y][x]==11) {
				 System.out.println("坐标是：R_down("+x+","+y+")");
			 }
		 }
	 }
 }
}
