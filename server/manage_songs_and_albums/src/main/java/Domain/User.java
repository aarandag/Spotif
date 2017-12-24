package Domain;
import java.util.*;

public class User {

	private String name;
	private int id;
	private String password;
	private ArrayList<Song> listOfSongs;

	
	public User(int id, String password) {
		this.id=id;
		this.password=password;
	}
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void sendMessage(User destUser, String message) {
	}

	public ArrayList<Song> getListsOfSongs() {
		return this.listOfSongs;
	}

	public void setListsOfSongs(ArrayList<Song> listOfSongs) {
		this.listOfSongs = listOfSongs;
	}

}
