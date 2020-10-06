
public class Q52 {

	public static void main(String[] args) {
    String s1=new String("Rushi");
    char arr[]={'a','e','i','o','u'};
    String s2=s1.toLowerCase();
    int count=0;
        for(int i=0;i<s2.length();i++)
        {
        	
        	char c1=s2.charAt(i);
             for(int j=0;j<arr.length;j++){	
             {
            	 if(c1==arr[j]) {
            	 count++; 
            	 }
             }
                }	
            
        } System.out.println(count);
 

	}

}
