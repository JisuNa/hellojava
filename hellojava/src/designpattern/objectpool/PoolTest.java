package designpattern.objectpool;

import java.sql.Connection;

public class PoolTest extends Thread {
	public PoolTest(String name) {
		super(name);
	}
	
	public void run() {
		ObjectPoolManager o = ObjectPoolManager.getInstance();
		
		while(true) {
			Connection con = o.getConnection();
			System.out.println(getName() + " : " + con);
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			o.releaseConnection(con);
		}
	}
	
	public static void main(String arg[]) {
		PoolTest t[] = new PoolTest[11];
		
		t[0] = new PoolTest("client 1 th");
		t[1] = new PoolTest("client 2 th");
		t[2] = new PoolTest("client 3 th");
		t[3] = new PoolTest("client 4 th");
		t[4] = new PoolTest("client 5 th");
		t[5] = new PoolTest("client 6 th");
		t[6] = new PoolTest("client 7 th");
		t[7] = new PoolTest("client 8 th");
		t[8] = new PoolTest("client 9 th");
		t[9] = new PoolTest("client 10 th");
		t[10] = new PoolTest("client 11 th");
		
		for (int i = 0; i < t.length; i++) {
			t[i].start();
		}
	}
}
