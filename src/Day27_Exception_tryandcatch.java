
public class Day27_Exception_tryandcatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   int a = 6 / 2;
       System.out.println(a);
        String b = "hello";
        System.out.println(b);
        int [] c = new int [2];
        c[0]= 1;
        c[1]=200;
      
        System.out.println(c[1]);
       }
        
       catch (ArithmeticException e) {
    	   e.printStackTrace();
    	  
       }
       catch (ArrayIndexOutOfBoundsException e) {
    	   e.printStackTrace ();
    	   
       }
       catch (NullPointerException e) {
    	   e.printStackTrace();
    	   
       }
       }
	}


