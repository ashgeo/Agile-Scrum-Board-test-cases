package scrum.Application;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.junit.Test;

public class createAndAddStorytest {
	

	@Test
	public void testcreateAndAddStory() throws Exception {

		daoLayerImpl daoconnection = new daoLayerImpl();
		
		GetConnection conn=new GetConnection();
		try {
			conn.getConnection();
			Story story = new Story("1", "test2");
			daoconnection.createStory(story);

			assertNotNull(story);
			assertEquals(conn.findid("1"), story.getId());			
			assertEquals(conn.finddescription("1"), story.getDescription());
		} catch(Exception e){
			System.out.println(e);
	}

	}

}
