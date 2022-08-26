package Method_Overridding_Overloading;
public class Day18_MethodOverridding_child extends Day18_MethodOverridding_Parent  {

	public static void main(String[] args) {
		
		Day18_MethodOverridding_child aa = new Day18_MethodOverridding_child ();
		OpenBrowser();
		aa.Aimal(); 
	}
public void Aimal () {
	
	System.out.println("Open safari browser");
	System.out.println("visit the website");
	System.out.println("enter username");
	System.out.println("enter passwor");
	
}
}
