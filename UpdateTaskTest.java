package scrum.Application;

import static org.junit.Assert.*;

import org.junit.Test;

public class UpdateTaskTest {

	@Test
	public void testUpdateTask() throws Exception {

		daoLayerImpl daoconnection = new daoLayerImpl();
		GetConnection conn = new GetConnection();
		try {
			conn.getConnection();
			Task task = new Task("1", "descriptio", "114");			
			daoconnection.updateTask(task);
			assertNotNull(task);				
			assertEquals(conn.findTaskaskDescription("1"), task.getDescription());			
		} catch(Exception e){
			System.out.println(e);
			
	}
	}

}



