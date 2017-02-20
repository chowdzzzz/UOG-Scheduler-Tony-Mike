import java.util.ArrayList;

public class semSchedule {
	public ArrayList <uogClass> sched = new ArrayList <uogClass>();
	public String sname; 
	/**
	 * @Purpose: Print the contents of the Arraylist (Schedule)
	 */
	public void printSched(){
		for (int i = 0; i < sched.size(); i++){
			System.out.println(sched.get(i).name);
		}
	}
	
	public semSchedule(){
		
	}
	
	public void setSemName(String givenName){
		this.sname = givenName;
	}
	
	public void addClass(uogClass addThisClass){
		sched.add(addThisClass);
	}
	
}
