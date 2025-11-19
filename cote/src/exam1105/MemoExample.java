package exam1105;

public class MemoExample {

	public static void main(String[] arg) {
		MemoRepository r;
				
		r=new LocalRepository();
		r.addMemo("1", "hello");
		
		r=new RemoteRepository();
		r.addMemo("1", "hello");
	}
}
