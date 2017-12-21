package Domain;

public class Album {

	private String title;
	private String author;
	private double price;
	private String description;
	private Song[] songs;

	/**
	 * 
	 * @param title
	 * @param author
	 * @param price
	 * @param songs
	 */
	public Album(String title, String author, double price, Song[] songs) {
		// TODO - implement Album.Album
		throw new UnsupportedOperationException();
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

	public string getAuthor() {
		return this.author;
	}

	/**
	 * 
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
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

	public string getDescription() {
		return this.description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public Song[] getSongs() {
		return this.songs;
	}

	/**
	 * 
	 * @param songs
	 */
	public void setSongs(Song[] songs) {
		this.songs = songs;
	}

}
