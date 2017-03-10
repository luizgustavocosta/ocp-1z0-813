package chapter6.questions;

import java.sql.SQLException;

public class Q19 {

	public void read() throws SQLException {
		try {
			readFromDataBase();
		} catch (SQLException | RuntimeException e) {
			throw e;
		}
	}

	private void readFromDataBase() throws SQLException {}

	public static void main(String[] args) {}

}
