
public class Q61 {

	public static void main(String[] args) {
         ThreadDemo th=new ThreadDemo();
         th.start();
	}

}


class ThreadDemo extends Thread{
	
	@Override
	public void run() {
			for(int i=0;i<3;i++)
			{try {

				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			if(i==0) {
				System.out.println("*");
			}
			if(i==1)
			{
				System.out.println("****");
			}
			if(i==2) {
				System.out.println("**********");
			}
			}
		}

}