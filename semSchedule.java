import java.util.ArrayList;

public class semSchedule {
	public static ArrayList <uogClass> sched = new ArrayList <uogClass>();
	public static String sname; 
	/**
	 * @Purpose: Print the contents of the Arraylist (Schedule)
	 */
	public static void printSched(){
		for (int i = 0; i < sched.size(); i++){
			System.out.println(sched.get(i).name);
		}
	}
	
	public semSchedule(){
		
	}
	
	public void setSemName(String givenName){
		sname = givenName;
	}
	
	public static void addClass(uogClass addThisClass){
		sched.add(addThisClass);
	}
	
}
