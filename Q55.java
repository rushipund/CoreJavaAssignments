
public class Q55 {

	public static void main(String[] args) {
	  String s="India is My country";
	  int count=0;
     for(int i=0;i<s.length();i++)
     {
    	 if(s.charAt(i)==' ')
    	 {
    		 count++;
    	 }
     }
     count=count+1;
     System.out.println("number of words are"+" "+count);
	}

}
/*
 * public static void main(String[] args) {
 *  String s1="india is my country";
 * String s2[]=s1.split(" "); 
 * int i=s2.length; 
 * System.out.println(i);
 * 
 */