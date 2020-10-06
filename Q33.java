


class A{
	public A() {
		this(5);
System.out.println("calling constructor using this");
	}
	public A(int x){
		
		System.out.println(x);
	}
	void m() {
		System.out.println("called function using this keyword");
	}
	void n() {
		this.m();
	}
	
}

public class Q33 {
	

	public static void main(String[] args) {
          
      A a=new A();
      a.n();

	}

}
