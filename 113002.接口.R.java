package pac;

public interface R {
	static void Test() {
		String boy_filePath="img/boy.gif";
		String girl_filePath="img/girl.gif";
		int [][]arr={{1,2,3},{4,5,6}};
		System.out.println("boy_filePath:"+boy_filePath);
		System.out.println("girl_filePath:"+girl_filePath);
		for (int row=0;row<arr.length;row++) {
			for(int column=0;column<arr[0].length;column++) {
				System.out.print(arr[row][column]);
			}
			System.out.println();
		}
	}		
}
