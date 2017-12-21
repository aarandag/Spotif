package Domain;

public class User {

	private String name;
	private int id;
	private String password;
	private Song[] listsOfSongs;

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

	/**
	 * 
	 * @param id
	 * @param password
	 */
	public User(int id, String password) {
		// TODO - implement User.User
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param destUser
	 * @param message
	 */
	public void sendMessage(User destUser, String message) {
		// TODO - implement User.sendMessage
		throw new UnsupportedOperationException();
	}

	public Song[] getListsOfSongs() {
		return this.listsOfSongs;
	}

	/**
	 * 
	 * @param listsOfSongs
	 */
	public void setListsOfSongs(Song[] listsOfSongs) {
		this.listsOfSongs = listsOfSongs;
	}

}
