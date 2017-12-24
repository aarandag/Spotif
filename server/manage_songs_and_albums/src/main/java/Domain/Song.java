package Domain;

public class Song {

	private String title;
	private String author;
	private Album album;
	private String description;
	private double price;
	private String genre;

	public Song(String title, String author, Album album, double price) {
	        this.title = title;
		this.author = author;
		this.album = album;
		this.price = price;
	}
        public Song(String title, String author, double price) {
	    this.title = title;
	    this.author = author;
	    this.price = price;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return this.author;
	}


	public void setAuthor(String author) {
		this.author = author;
 	}

	public Album getAlbum() {
		return this.album;
	}


	public void setAlbum(Album album) {
		this.album = album;
	}

	public String getDescription() {
		return this.description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return this.price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	public String getGenre() {
		return this.genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}

}
