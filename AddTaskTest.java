package scrum.Application;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTaskTest {

	@Test
	public void addTask() throws Exception {
		daoLayerImpl daoconnection = new daoLayerImpl();
		GetConnection conn=new GetConnection();
		try {
			conn.getConnection();
			Task task = new Task("task1", "testTask","0");
			daoconnection.addTaskToStory(task);
			assertNotNull(task);			
			assertEquals(conn.findtask("task1"), task.getId());		
		} catch(Exception e){
			System.out.println(e);
	}

	}

}
