package exam1020;

public class BookExample {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		books[0] = new Book("ksh","김성현","123-456-789");
		books[1] = new Book("자바","김자바","123-456-789");
		books[2] = new Book("파이","이파이","123-456-789");
		

		
		for (int i=0; i<books.length; i++) {
			System.out.println(books[i].getTitle());
		}
	}
}
