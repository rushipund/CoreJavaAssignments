

class OneBhk{
	int RoomArea;
	int HallArea;
	int Price;
	public OneBhk(){
		RoomArea=0;
		HallArea=0;
		Price=0;
	}
	public OneBhk(int RoomArea,int HallArea,int Price){
		this.RoomArea=RoomArea;
		this.HallArea=HallArea;
		this.Price=Price;
	}
	void show() {
		System.out.println(RoomArea);
		System.out.println(HallArea);
		System.out.println(Price);
	}
}

class TwoBhk extends OneBhk{
	int Room2Area;
	public TwoBhk() {
	Room2Area=0;
	RoomArea=0;
	HallArea=0;
	Price=0;
	}
   public TwoBhk(int RoomArea,int HallArea,int Price,int Room2Area)	
   {
	   this.RoomArea=RoomArea;
	   this.HallArea=HallArea;
	   this.Price=Price;
	   this.Room2Area=Room2Area;
	
   }
   void show() {
	   System.out.println(RoomArea);
	   System.out.println(HallArea);
	   System.out.println(Price);
	   System.out.println(Room2Area);
   }
}


public class Q43 {

	public static void main(String[] args) {
   OneBhk o1=new TwoBhk();
     o1.show();
     OneBhk o2=new TwoBhk(20,25,1000,35);
     o2.show();
     OneBhk o3=new TwoBhk(30,35,2000,55);
     o3.show();
    int totAmt=o1.Price+o2.Price+o3.Price;
     System.out.println(totAmt);

	}

}
