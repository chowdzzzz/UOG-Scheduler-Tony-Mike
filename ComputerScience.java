import java.util.*;

public class ComputerScience {

	//Index each one!!! Arraylist it!
	public static ArrayList <uogClass> classList = new ArrayList <uogClass>();
	
	//Assign All of the names for the classes
	public ComputerScience(){
		classList.add(new uogClass("CS200", 200, 3));
		classList.add(new uogClass("CS201", 201, 4));
		classList.add(new uogClass("CS202", 202, 4));
		classList.add(new uogClass("CS303", 303, 3));
		classList.add(new uogClass("CS305", 305, 3));
		classList.add(new uogClass("CS315", 315, 3));
		classList.add(new uogClass("CS360", 360, 3));
		classList.add(new uogClass("CS365", 365, 3));
		classList.add(new uogClass("CS380", 380, 3));
		classList.add(new uogClass("CS403", 403, 3));
		classList.add(new uogClass("CS425", 425, 3));
		classList.add(new uogClass("CS431", 431, 3));
		classList.add(new uogClass("CS492", 492, 3));
	}
	
	public static void finishClass(int index){
		switch (index){
		case 200:
			break;
		case 201:
			break;
		case 202:
			break;
	}
	}
	
}