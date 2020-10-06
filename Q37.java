
class Person{
	private int age;
	private String name;
	Person(){
		age=18;
	}
	Person(int age,String name){
		this.age=age;
		this.name=name;	
	}
	void show() {
		System.out.println(age+"   and  "+name);
	}
}

public class Q37 {

	public static void main(String[] args) {
        Person p=new Person();
        Person p2=new Person(95,"Rushi");
        p2.show();
        
	}

}
