package domain;

public class Song {

	private String title;
	private String author;
	private Album album;
	private String description;
	private double price;
	private String genre;

	public Song(final String title, final String author, final Album album, final double price) {
		this.title = title;
		this.author = author;
		this.album = album;
		this.price = price;
	}

	public Song(final String title, final String author, final double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public final String getTitle() {
		return this.title;
	}

	public final void setTitle(final String title) {
		this.title = title;
	}

	public final String getAuthor() {
		return this.author;
	}

	public final void setAuthor(final String author) {
		this.author = author;
	}

	public final Album getAlbum() {
		return this.album;
	}

	public final void setAlbum(final Album album) {
		this.album = album;
	}

	public final String getDescription() {
		return this.description;
	}

	public final void setDescription(final String description) {
		this.description = description;
	}

	public final double getPrice() {
		return this.price;
	}

	public void setPrice(final double price) {
		this.price = price;
	}

	public final String getGenre() {
		return this.genre;
	}

	public final void setGenre(final String genre) {
		this.genre = genre;
	}

}
