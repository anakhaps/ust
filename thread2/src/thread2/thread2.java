package thread2;
class threada extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("ONE");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class threadb extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("\tTwo");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class thread2{

	public static void main(String[] args) throws InterruptedException {
		threada t1=new threada();
		threadb t2=new threadb();
		Thread t3=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10;i++)
				{
					System.out.println("Three.........");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		Thread t4=new Thread(()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Four");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();
		//	t2.join(); 			//what will join do? whichever threads started already, will run. Until these running threads complete, any other thread shall not start. They wait
		t3.start();
		t3.join();
		t4.start();
		//		System.out.println(t1.getPriority());
	}
}
