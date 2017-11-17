package Domain2;

public class User {

	private string name;
	private int id;
	private string password;
	private Song[] listsOfSongs;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public string getPassword() {
		return this.password;
	}

	public void setPassword(string password) {
		this.password = password;
	}

	/**
	 * 
	 * @param id
	 * @param password
	 */
	public User(int id, string password) {
		// TODO - implement User.User
		throw new UnsupportedOperationException();
	}

	public string getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(string name) {
		this.name = name;
	}

	/**
	 * 
	 * @param destUser
	 * @param message
	 */
	public void sendMessage(User destUser, string message) {
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