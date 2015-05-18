package scrum.Application;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompleteStoryTest {

	@Test
	public void testCompleteStory() throws Exception {

		daoLayerImpl daoconnection = new daoLayerImpl();
		GetConnection conn=new GetConnection();
		try {
			conn.getConnection();
			Story story = new Story();
			
			story.SetId("12");
			story.setStatus("Completed");
			
			daoconnection.compelteStory(story);
			assertNotNull(story);	
				
			assertEquals(conn.findStoryStatus("12"), story.getStatus());			
		} catch(Exception e){
			System.out.println(e);
			
	}
	}
}
