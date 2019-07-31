
public class ThreadExample {
	
	public static void main(String[] args) {
		System.out.println("Main starts!!!");
		NumberThread t1 = new NumberThread(1, 400);
		NumberThread t2 = new NumberThread(800, 1400);
        t1.start();
        t2.start();
		doTask();
		System.out.println("Main Dies!!!");
	}
	
	public static void doTask() {
		Thread t = Thread.currentThread();
		System.out.println("Name: " + t.getName());
		System.out.println("Group: " + t.getThreadGroup().getName());
		System.out.println("Priority: " + t.getPriority());

		System.out.println("Daemon: " + t.isDaemon());

	}

}
