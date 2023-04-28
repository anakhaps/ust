package thread;

 class Even extends Thread
{
 public void run()
{

	for(int i=0;i<=50;i+=2)
	{
		
		
			System.out.println("Odd");
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		
	}
}
}
 class Odd extends Thread
{

	@Override
	public void run()
	{
		
	for(int i=0;i<=50;i+=2)
	{
		System.out.println("Even");
		try {
			Thread.sleep(200);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	}
}	
public class thread2
{
	public static void main(String[] args)
	{
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		Thread t3=new Thread(new Runnable() {
		
		Odd odd=new Odd();
		Thread t2=new Thread(odd);
		
		t1.start();
		t2.start();
		
		
	}
}



