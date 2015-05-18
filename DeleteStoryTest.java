package scrum.Application;



import static org.junit.Assert.*;

import org.junit.Test;

public class DeleteStoryTest {
	@Test
	public void testDeleteStory() throws Exception {

		daoLayerImpl daoconnection = new daoLayerImpl();
		GetConnection conn=new GetConnection();
		try {
			conn.getConnection();
			Story story = new Story();			
			story.SetId("1");
			daoconnection.deleteStory(story);				
			assertEquals(0,conn.deleteStory("1"));			
		}   catch(Exception e){
			System.out.println(e);
			
	}
	}

}
