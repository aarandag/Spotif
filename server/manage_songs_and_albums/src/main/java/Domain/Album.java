package Domain;
import java.util.*;

public class Album {

	private String title;
	private String author;
	private double price;
	private String description;
	private ArrayList<Song> songs;

	/**
	 * 
	 * @param title
	 * @param author
	 * @param price
	 * @param songs
	 */
	public Album(String title, String author, double price, ArrayList<Song> songs) {
	    this.title = title;
	    this.author = author;
	    this.price = price;
	    this.description = description;
	    this.songs = songs;
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

	public ArrayList<Song> getSongs() {
		return this.songs;
	}

	/**
	 * 
	 * @param songs
	 */
	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}

        public void updateSongs() {
	    for(int i = 0; i < songs.size(); i++) {
		    songs.get(i).setAuthor(author);
		    songs.get(i).setAlbum(this);
		}
       }

       public void addSong(Song song) {
	       songs.add(song);
       }

       public void deleteSong(Song song) {
	      songs.remove(song);
       }
}
