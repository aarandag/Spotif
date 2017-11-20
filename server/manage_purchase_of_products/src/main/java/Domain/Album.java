package Domain;

public class Album {

	private string title;
	private string author;
	private double price;
	private string description;
	private Song[] songs;

	/**
	 * 
	 * @param title
	 * @param author
	 * @param price
	 * @param songs
	 */
	public Album(string title, string author, double price, Song[] songs) {
		// TODO - implement Album.Album
		throw new UnsupportedOperationException();
	}

	public string getTitle() {
		return this.title;
	}

	/**
	 * 
	 * @param title
	 */
	public void setTitle(string title) {
		this.title = title;
	}

	public string getAuthor() {
		return this.author;
	}

	/**
	 * 
	 * @param author
	 */
	public void setAuthor(string author) {
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
	public void setDescription(string description) {
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