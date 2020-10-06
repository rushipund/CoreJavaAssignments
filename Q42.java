import java.util.Scanner;

class Tile{
	int edgelength;
	public Tile(int edgelength) {
		this.edgelength=edgelength;
	}
	
}
class Floor{
	int length;
	int width;
	public Floor(int length,int width) {
		this.length=length;
		this.width=width;
	}
 void totaltiles(Tile t) {
		int tilearea=t.edgelength*t.edgelength;
		int totalarea=length*width;
		int total=totalarea/tilearea;
		System.out.println(total);
		
	}
}

public class Q42 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	Tile t=new Tile(20);
	
	int length=sc.nextInt();
	int width=sc.nextInt();
	Floor f=new Floor(length,width);

	f.totaltiles(t);
	
	}

}
