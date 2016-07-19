package net.sirun.util;

import hoperun.util.ResourceUtil;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import com.jolbox.bonecp.BoneCPDataSource;

/**
 * 数据库连接池
 * 
 * @author jnad
 * 
 */
public class DataSource {
	private static BoneCPDataSource dataSource;
	/**
	 * 静态初始化
	 */
	static {
		System.out.println("static load");
		initDataSource();
	}

	/**
	 * 初始化数据库连接池
	 */
	public static void initDataSource() {
		if (dataSource != null) {
			return;
		}
		String fileName = "mysql.properties";
		Properties p = loadProperties(fileName);
		String jdbcurl = p.getProperty("jdbc.url");
		String username = p.getProperty("jdbc.username");
		String pwd = p.getProperty("sr1vis");
		String classpath = p.getProperty("jdbc.driverClassName");

		try {
			Class.forName(classpath);
		} catch (Exception e) {
			e.printStackTrace();
		}

		dataSource = new BoneCPDataSource();
		dataSource.setUsername(username);
		dataSource.setPassword(pwd);
		dataSource.setJdbcUrl(jdbcurl);
		dataSource.setMaxConnectionsPerPartition(10);
		dataSource.setMinConnectionsPerPartition(5);
		dataSource.setIdleConnectionTestPeriod(60);
		dataSource.setIdleMaxAge(240);
		dataSource.setAcquireIncrement(5);
		dataSource.setReleaseHelperThreads(3);
	}

	private static Properties loadProperties(String fileName) {
		Properties props = new Properties();
		try {
			props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		return props;
	}

	/**
	 * 获取数据库连接
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}

	/**
	 * 获取数据库连接池
	 * 
	 * @return
	 */
	public static BoneCPDataSource getDataSource() {
		return dataSource;
	}

	public static ResultSet executeQuery(String sql) throws SQLException {
		return DataSource.getConnection().createStatement().executeQuery(sql);

	}

	public static void main(String[] s) {
		try {
			ResultSet rs = executeQuery("select * from user ");
			while (rs.next()) {
				System.out.println(rs.getString(1)); // should print out
														// "1"'
				System.out.println(rs.getString(2)); // should print out
														// "1"'
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
