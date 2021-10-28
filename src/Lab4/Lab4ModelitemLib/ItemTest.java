package Lab4ModelitemLib;

public class ItemTest {
	public static void main(String[] args) {
		WrittenItem writtenItem = new Book();
		writtenItem.setBookAuthor("chetan");
		writtenItem.setUniqueNum(1234);
		writtenItem.setTitle("ABCD");
		writtenItem.setNumOfCopies(10);
		writtenItem.BookDetails();
		
		WrittenItem writtenItem1 = new JournalPaper();
		JournalPaper jp= (JournalPaper) writtenItem1 ;
		jp.setPublishedYear("2020 Dec");
		jp.journalPaper();
		
		WrittenItem writtenItem2=new Video();
		Video v=(Video) writtenItem2;
		v.setDirector("sk");
		v.setGenre(null);
		v.setReleasedYear(2021);
		v.mediaItem();
	}
}
