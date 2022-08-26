package Encapsulati_0n;

public class Day22_Encapsulation {
private String Name;
private int ssn;

Day22_Encapsulation ( String Name, int ssn){
	this.Name = Name;
	this.ssn =ssn;
}
// using constructor
//public void setName (String Name) {
//this.Name = Name;	
//}
public String getName () {
	return Name;
}
//public void setssn (int ssn) {
	//this.ssn = ssn;
//}
public int getssn () {
	return ssn;
}
}
