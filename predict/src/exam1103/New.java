package exam1103;

public class New {
	public static void main(String[] args) {
		String str = "string";
		String str2 = "string";
		
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str2));
	}

}
