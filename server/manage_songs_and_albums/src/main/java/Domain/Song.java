package Domain;

public class Song {

	private String title;
	private String author;
	private Album album;
	private String description;
	private double price;
	private String genre;

	/**
	 * 
	 * @param title
	 * @param author
	 * @param album
	 * @param price
	 */
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

	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return this.author;
	}

	/**
	 * 
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
 	}

	public Album getAlbum() {
		return this.album;
	}

	/**
	 * 
	 * @param album
	 */
	public void setAlbum(Album album) {
		this.album = album;
	}

	public String getDescription() {
		return this.description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return this.price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	public String getGenre() {
		return this.genre;
	}

	/**
	 * 
	 * @param genre
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

}
