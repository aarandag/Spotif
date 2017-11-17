package Persistence2;

public class DBBroker {

	private string connectionString;
	private DBBroker instance;
	private Connection connection;
	private string dbPath;

	public DBBroker getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param query
	 */
	public ResultSet read(string query) {
		// TODO - implement DBBroker.read
		throw new UnsupportedOperationException();
	}

	public DBBroker() {
		// TODO - implement DBBroker.DBBroker
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param query
	 */
	public int insert(string query) {
		// TODO - implement DBBroker.insert
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param query
	 */
	public int delete(string query) {
		// TODO - implement DBBroker.delete
		throw new UnsupportedOperationException();
	}

}