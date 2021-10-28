package Lab4ModelitemLib;

public class Book extends WrittenItem {

	@Override
	void author() {
		System.out.println("Book Author :"+getBookAuthor());
		
	}
	void BookDetails() {
		System.out.println("Book Details:");
		this.author();
		System.out.println("Book unique code:"+getUniqueNum());
		System.out.println("Book Title:"+getTitle());
		System.out.println("Num of copies:"+getNumOfCopies());
	}

}
