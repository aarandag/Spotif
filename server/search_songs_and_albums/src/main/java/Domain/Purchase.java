package Domain;

public class Purchase {

	private User user;
	private Song[] songsToBuy;
	private Album[] albumsToBuy;
	private boolean payed;

	/**
	 * 
	 * @param user
	 * @param songsBuyed
	 * @param albumsBuyed
	 */
	public Purchase(User user, Song[] songsBuyed, Album[] albumsBuyed) {
		// TODO - implement Purchase.Purchase
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param songToBuy
	 */
	public void addSong(Song songToBuy) {
		// TODO - implement Purchase.addSong
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param albumToBuy
	 */
	public void addAlbum(Album albumToBuy) {
		// TODO - implement Purchase.addAlbum
		throw new UnsupportedOperationException();
	}

	public boolean getPayed() {
		return this.payed;
	}

	/**
	 * 
	 * @param payed
	 */
	public void setPayed(boolean payed) {
		this.payed = payed;
	}

}