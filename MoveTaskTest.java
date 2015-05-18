package scrum.Application;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoveTaskTest {

	@Test
	public void moveTasktest() throws Exception {

		daoLayerImpl daoconnection = new daoLayerImpl();
		GetConnection conn = new GetConnection();

		try {
			conn.getConnection();
			Task task = new Task();
			task.setId("1");
			task.setStoryId("114");
			task.setStatus("Tv");
			daoconnection.moveTask(task);
			assertNotNull(task);

			assertEquals(conn.findTaskStatus("1"), task.getStatus());

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
