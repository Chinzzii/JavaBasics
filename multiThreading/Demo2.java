package multiThreading;

class Hii implements Runnable{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Hi");
			try { Thread.sleep(500); } catch (InterruptedException e) {}
		}
	}
}

class Helloo implements Runnable{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Hello");
			try { Thread.sleep(500); } catch (InterruptedException e) {}
		}
	}
}

public class Demo2 {
	
	public static void main(String[] args) throws Exception {
		
		Runnable obj1 = new Hii();
		Runnable obj2 = new Helloo();
		
		
//		Runnable obj1 = new Runnable() {
//			@Override
//			public void run() {
//				for(int i=0; i<5; i++) {
//					System.out.println("Hi");
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		};
//		Runnable obj2 = new Runnable() {
//			@Override
//			public void run() {
//				for(int i=0; i<5; i++) {
//					System.out.println("Hello");
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		};
		
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try { Thread.sleep(100); } catch (Exception e) {}
		t2.start();
		
		System.out.println(t1.isAlive());
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());		
		
		System.out.println("Bye");
		
	}
	
}
