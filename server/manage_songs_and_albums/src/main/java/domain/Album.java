package domain;

import java.util.ArrayList;

public class Album {

	private String title;
	private String author;
	private double price;
	private String description;
	private ArrayList<Song> songs;

	public Album(final String title, final String author, final double price, final ArrayList<Song> songs) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.songs = songs;
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

	public final double getPrice() {
		return this.price;
	}

	public final void setPrice(final double price) {
		this.price = price;
	}

	public final String getDescription() {
		return this.description;
	}

	public final void setDescription(final String description) {
		this.description = description;
	}

	public final ArrayList<Song> getSongs() {
		return this.songs;
	}

	public final void setSongs(final ArrayList<Song> songs) {
		this.songs = songs;
	}

	public final void updateSongs() {
		for (int i = 0; i < songs.size(); i++) {
			songs.get(i).setAuthor(author);
			songs.get(i).setAlbum(this);
		}
	}

	public final void addSong(final Song song) {
		songs.add(song);
	}

	public final void deleteSong(final Song song) {
		songs.remove(song);
	}

}


