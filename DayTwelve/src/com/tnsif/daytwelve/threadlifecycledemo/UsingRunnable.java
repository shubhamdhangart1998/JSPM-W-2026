package com.tnsif.daytwelve.threadlifecycledemo;

public class UsingRunnable implements Runnable {

	Thread t;
	int end, start;
	String msg;
	
	
	public UsingRunnable(int end, int start, String msg)
	{
		super();
		
		this.end=end;
		this.start=start;
		this.msg=msg;
		
		t=new Thread(this, "Child Thread");
		t.start();			
	}

	@Override
	public void run() {
		
		for(int i=end; i>start; i--)
		{
			try {
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{
				System.err.println(e.getMessage());
			}
			System.out.println(i + msg );
		}
		
	}

}
