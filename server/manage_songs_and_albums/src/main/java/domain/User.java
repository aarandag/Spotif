package domain;

import java.util.ArrayList;

public class User {

	private String name;
	private int id;
	private String password;
	private ArrayList<Song> listOfSongs;

	public User(final int id, final String password) {
		this.id = id;
		this.password = password;
	}

	public final int getId() {
		return this.id;
	}

	public final void setId(final int id) {
		this.id = id;
	}

	public final String getPassword() {
		return this.password;
	}

	public final void setPassword(final String password) {
		this.password = password;
	}

	public final String getName() {
		return this.name;
	}

	public final void setName(final String name) {
		this.name = name;
	}

	public final void sendMessage(final User destUser, final String message) {
	}

	public final ArrayList<Song> getListsOfSongs() {
		return this.listOfSongs;
	}

	public final void setListsOfSongs(final ArrayList<Song> listOfSongs) {
		this.listOfSongs = listOfSongs;
	}

}
