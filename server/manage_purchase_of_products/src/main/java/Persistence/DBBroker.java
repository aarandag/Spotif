package Persistence;
import java.sql.ResultSet;
import java.sql.Connection;

public class DBBroker {

	private String connectionString;
	private DBBroker instance;
	private Connection connection;
	private String dbPath;

	public DBBroker getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param query
	 */
	public ResultSet read(String query) {
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
	public int insert(String query) {
		// TODO - implement DBBroker.insert
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param query
	 */
	public int delete(String query) {
		// TODO - implement DBBroker.delete
		throw new UnsupportedOperationException();
	}

}
