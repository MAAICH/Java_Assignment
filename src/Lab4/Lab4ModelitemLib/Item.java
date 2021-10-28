package Lab4ModelitemLib;

public class Item {
	private int uniqueNum;
	private String title;
	private int numOfCopies;
	
	void BookDetails() {
	}
	void author() {
	}
	void journalPaper() {
	}
	void mediaItem() {
	}
	
	public int getUniqueNum() {
		return uniqueNum;
	}

	public void setUniqueNum(int uniqueNum) {
		this.uniqueNum = uniqueNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}
	
	@Override
	public String toString() {
		return "Item [uniqueNum=" + uniqueNum + ", title=" + title + ", numOfCopies=" + numOfCopies + "]";
	}

	

	
	
}

