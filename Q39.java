


class Product{
	private int pid;
	 int price;
	private int quantity;
	public Product(int pid,int price,int quantity) {
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;	
	}
	static void showTotAmt(Product arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i].price;
		}
		System.out.println(sum);
	}
}
public class Q39 {

	public static void main(String[] args) {
		  Product p1=new Product(1, 1000, 1);
		  Product p2=new Product(2, 2000, 2);
		  Product p3=new Product(3, 3000, 3);
		  Product p4=new Product(4, 4000, 4);
		  Product p5=new Product(5, 5000, 5);
		  Product arr[]=new Product[]{p1, p2, p3,p4,p5};
          Product.showTotAmt(arr);
          int pidhigh=arr[0].price;
          for(int i=0;i<arr.length;i++)
          {
        	  
        	  if(arr[i].price>pidhigh)
        	  {
        		  pidhigh=arr[i].price;
        		  
        	  }
        	  
          }
          System.out.println(pidhigh);
	}

}
