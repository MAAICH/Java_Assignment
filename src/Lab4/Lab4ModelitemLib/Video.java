package Lab4ModelitemLib;

public class Video extends WrittenItem {
	private String director;
	private String genre;
	private int releasedYear;
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getReleasedYear() {
		return releasedYear;
	}
	public void setReleasedYear(int releasedYear) {
		this.releasedYear = releasedYear;
	}
	
	void mediaItem() {
		System.out.println();
		System.out.println("movie details");
		System.out.println("The director of Movie: "+getDirector());
		System.out.println("The genre of Movie: "+getGenre());
		System.out.println("The director of Movie: "+getReleasedYear());
		
	}
	
}
