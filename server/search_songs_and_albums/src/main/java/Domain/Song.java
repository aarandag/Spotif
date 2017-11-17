package Domain2;

public class Song {

	private string title;
	private string author;
	private Album album;
	private string description;
	private double price;
	private string genre;

	/**
	 * 
	 * @param title
	 * @param author
	 * @param album
	 * @param price
	 */
	public Song(string title, string author, Album album, double price) {
		// TODO - implement Song.Song
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

	public string getGenre() {
		return this.genre;
	}

	/**
	 * 
	 * @param genre
	 */
	public void setGenre(string genre) {
		this.genre = genre;
	}

}