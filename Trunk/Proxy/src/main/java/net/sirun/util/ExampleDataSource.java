package net.sirun.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jolbox.bonecp.BoneCPDataSource;

public class ExampleDataSource {

	public static void main(String[] args) {

		Connection connection = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}

		BoneCPDataSource dataSource = new BoneCPDataSource();
		dataSource.setUsername("root");
		dataSource.setPassword("sr1vis");
		dataSource.setJdbcUrl("jdbc:mysql://172.32.5.141:3306/demo");
		dataSource.setMaxConnectionsPerPartition(10);
		dataSource.setMinConnectionsPerPartition(5);
		dataSource.setIdleConnectionTestPeriod(60);
		dataSource.setIdleMaxAge(240);
		dataSource.setAcquireIncrement(5);
		dataSource.setReleaseHelperThreads(3);
		try {
			connection = dataSource.getConnection();
			if (connection != null) {
				System.out.println("Connection successful!");
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(" select * from user "); // do
																			// something
																			// with
																			// the
																			// connection.
				while (rs.next()) {
					System.out.println(rs.getString(1)); // should print out
															// "1"'
					System.out.println(rs.getString(2)); // should print out
															// "1"'
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}