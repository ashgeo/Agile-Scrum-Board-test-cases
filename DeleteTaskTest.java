package scrum.Application;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeleteTaskTest {

	@Test
	public void testDeleteStory() throws Exception {

		daoLayerImpl daoconnection = new daoLayerImpl();
		GetConnection conn=new GetConnection();
		try {
			conn.getConnection();
			Task task = new Task();			
			task.setId("5");
			task.setStoryId("4");
			daoconnection.deleteTask(task);	
			
			assertEquals(0,conn.deleteTask("4"));			
		}   catch(Exception e){
			System.out.println(e);
			
	}
	}

}
