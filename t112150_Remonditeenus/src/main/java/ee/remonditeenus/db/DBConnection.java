package main.java.ee.remonditeenus.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class DBConnection {
	// static Logger logger = Logger.getLogger(DBConnection.class);
	public static Connection getConnection() {
		Connection localConnection = null;
		String str1 = "";
		String str2 = "";
		String str3 = "";
		try {
			ResourceBundle localResourceBundle = ResourceBundle
					.getBundle("DBConnection");
			Class.forName(localResourceBundle.getString("Driver"));
			str3 = localResourceBundle.getString("url");
			str2 = localResourceBundle.getString("usr");
			str1 = localResourceBundle.getString("pwd");
			localConnection = DriverManager.getConnection(str3, str2, str1);
		} catch (Exception exception) {
			// logger.error("dbconnection.getConnection():" +
			// exception.getMessage());
		}
		return localConnection;
	}

	public static void close(Connection paramConnection) {
		if (paramConnection != null) {
			try {
				paramConnection.close();
			} catch (SQLException e) {
				// logger.error("CLOSING CONNECTION:" + e.getMessage());
			}
		}
	}

	public static void closeStatement(Statement paramStatement) {
		if (paramStatement != null) {
			try {
				paramStatement.close();
			} catch (SQLException e) {
				// logger.error("CLOSING STATEMENT:" + e.getMessage());
			}
		}
	}

	public static void closeResultSet(ResultSet paramResultSet) {
		if (paramResultSet != null) {
			try {
				paramResultSet.close();
			} catch (SQLException e) {
				// logger.error("CLOSING RESULT:" + e.getMessage());
			}
		}
	}
}