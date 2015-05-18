package scrum.Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
class GetConnection{
private Connection conn;
private ResultSet rs;
public Connection getConnection()
{
	try


{
	
	String Db = "test";// Database name
	String connectionHost = "jdbc:mysql://127.0.0.1/" + Db;// Host name with db
															// name
	String userName = "root";// database username
	String Password = "";// database password
	Class.forName("com.mysql.jdbc.Driver");
	 conn = DriverManager.getConnection(connectionHost,
			userName, Password);
}catch(Exception e)
	{
	System.out.println(e);
}
	return conn;
}

public String findid(String findid) {
	String id = null;
	try {
		String selectquery = "SELECT * FROM story WHERE id= '"

		+ findid + "'";

		final PreparedStatement psselect = conn
				.prepareStatement(selectquery);
		rs = psselect.executeQuery();

		while (rs.next()) {
			id = rs.getString("id");

		}

	} catch (Exception e) {
		System.out.println(e);

	}
	return id;

}

public String finddescription(String findid) {
	String description = null;
	try {
		String selectquery = "SELECT * FROM story WHERE id= '"

		+ findid + "'";

		final PreparedStatement psselect = conn
				.prepareStatement(selectquery);
		rs = psselect.executeQuery();
		while (rs.next()) {

			description = rs.getString("description");
		}

	} catch (Exception e) {
		System.out.println(e);

	}
	return description;

}

public String findStoryStatus(String findid) {
	String description = null;
	try {
		String selectquery = "SELECT * FROM story WHERE id= '"

		+ findid + "'";

		final PreparedStatement psselect = conn
				.prepareStatement(selectquery);
		rs = psselect.executeQuery();
		while (rs.next()) {

			description = rs.getString("status");
		}

	} catch (Exception e) {
		System.out.println(e);

	}
	return description;

}

public int deleteStory(String sid) {
	int count = 0;
	try {
		getConnection();
		final String selectquery = "SELECT count(*) from story WHERE id = ?";
		final PreparedStatement psselect = conn
				.prepareStatement(selectquery);
		psselect.setString(1, sid);
		final ResultSet resultSet = psselect.executeQuery();
		if (resultSet.next()) {
			count = resultSet.getInt(1);
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	return count;
}

public String findtask(String findid) {
	String id = null;
	try {
		String selectquery = "SELECT * FROM task WHERE taskid= '"

		+ findid + "'";

		final PreparedStatement psselect = conn
				.prepareStatement(selectquery);
		rs = psselect.executeQuery();

		while (rs.next()) {
			id = rs.getString("taskid");

		}

	} catch (Exception e) {
		System.out.println(e);

	}
	return id;

}

public int deleteTask(String tid) {
	int count = 0;
	try {
		getConnection();
		final String selectquery = "SELECT count(*) from Task WHERE taskid = ?";
		final PreparedStatement psselect = conn
				.prepareStatement(selectquery);
		psselect.setString(1, tid);
		final ResultSet resultSet = psselect.executeQuery();
		if (resultSet.next()) {
			count = resultSet.getInt(1);
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	return count;
}

public String findTaskaskDescription(String findid) {
	String desc = null;
	try {
		String selectquery = "SELECT * FROM task WHERE taskid= '"

		+ findid + "'";

		final PreparedStatement psselect = conn
				.prepareStatement(selectquery);
		rs = psselect.executeQuery();

		while (rs.next()) {
			desc = rs.getString("taskdesc");

		}

	} catch (Exception e) {
		System.out.println(e);

	}
	return desc;

}

public String findTaskStatus(String findid) {
	String desc = null;
	try {
		String selectquery = "SELECT * FROM task WHERE taskid= '"

		+ findid + "'";

		final PreparedStatement psselect = conn
				.prepareStatement(selectquery);
		rs = psselect.executeQuery();

		while (rs.next()) {
			desc = rs.getString("taskstatus");

		}

	} catch (Exception e) {
		System.out.println(e);

	}
	return desc;

}
}