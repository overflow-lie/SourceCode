//package net.sirun.util;
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import com.jolbox.bonecp.BoneCP;
//import com.jolbox.bonecp.BoneCPConfig;
// 
//public class ExampleJDBC {
//	 
//    public static void main(String[] args) {
//        BoneCP connectionPool = null;
//        Connection connection = null;
// 
//        try {
//            // load the database driver (make sure this is in your classpath!)
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (Exception e) {
//            e.printStackTrace();
//            return;
//        }
//        
//        try {
//            // setup the connection pool
//            BoneCPConfig config = new BoneCPConfig();
//            config.setJdbcUrl("jdbc:mysql://localhost:3306/demo"); // jdbc url specific to your database, eg jdbc:mysql://127.0.0.1/yourdb
//            config.setUsername("root"); 
//            config.setPassword("root");
//            //设置每60秒检查数据库中的空闲连接数
//            config.setIdleConnectionTestPeriod(60);
//            //设置连接空闲时间
//            config.setIdleMaxAge(240);
//            //设置每个分区中的最大连接数 30
//            config.setMaxConnectionsPerPartition(30);
//            //设置每个分区中的最小连接数 10
//            config.setMinConnectionsPerPartition(10);
//            //当连接池中的连接耗尽的时候 BoneCP一次同时获取的连接数
//            config.setAcquireIncrement(5);
//            //连接释放处理
//            config.setReleaseHelperThreads(3);
//            //设置分区  分区数为3
//            config.setPartitionCount(3);
//            //设置配置参数
//            connectionPool = new BoneCP(config); // setup the connection pool
//            
//            connection = connectionPool.getConnection(); // fetch a connection
//            
//            if (connection != null){
//                System.out.println("Connection successful!");
//                Statement stmt = connection.createStatement();
//                ResultSet rs = stmt.executeQuery(" select * from person "); // do something with the connection.
//                while(rs.next()){
//                    System.out.println(rs.getString(1)); // should print out "1"'
//                    System.out.println(rs.getString(2)); // should print out "1"'
//                }
//            }
//            connectionPool.shutdown(); // shutdown connection pool.
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//}