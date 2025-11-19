package exam1117;

public class ParamExample {

	public static void main(String[] args) {
		//int[] arr = {1,2,3};
		int[]arr = new int[] {1,2,3};
		test(arr);
		System.out.println(arr[2]);
		ParamExample pe = new ParamExample();
	}
	
	public static void test(int[] arr) {
		arr[2] = 10;
	}

}