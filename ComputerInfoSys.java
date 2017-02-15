import java.util.ArrayList;

public class ComputerInfoSys extends degreeProgram { 

	//Index each one!!! Arraylist it!
	//public static ArrayList <uogClass> classList = new ArrayList <uogClass>();
	
	//Assign All of the names for the classes
	public ComputerInfoSys(){
		this.degreeName = "Computer Information Systems";
		classList.add(new uogClass("BA110", 110, 3));
		classList.add(new uogClass("MA151", 151, 3));
		classList.add(new uogClass("MA165", 165, 5));
		classList.add(new uogClass("CS200", 200, 3));
		classList.add(new uogClass("BA200", 200, 3));
		classList.add(new uogClass("BA201", 201, 3));
		classList.add(new uogClass("BA210", 210, 3));
		classList.add(new uogClass("CS201", 201, 4));
		classList.add(new uogClass("CS202", 202, 4));
		classList.add(new uogClass("MA203", 203, 5));
		classList.add(new uogClass("CS303", 303, 3));
		classList.add(new uogClass("CS305", 305, 3));
		classList.add(new uogClass("CS315", 315, 3));
		classList.add(new uogClass("BA320", 320, 3));
		classList.add(new uogClass("CS360", 360, 3));
		classList.add(new uogClass("CS380", 380, 3));
		classList.add(new uogClass("MA385", 385, 3));
		classList.add(new uogClass("CS403", 403, 3));
		classList.add(new uogClass("CS425", 425, 3));
		classList.add(new uogClass("CS431", 431, 3));
		classList.add(new uogClass("BA441", 441, 3));
		classList.add(new uogClass("LW442", 442, 3));
		classList.add(new uogClass("CS492", 492, 3));
	}
	
	/**
	 * @Purpose: This method tries to add a class from this
	 * degree's list of classes required.
	 * @param index: Index of classList that the scheduler is
	 * trying to add.
	 */
	public void finishClass(int index, semSchedule currentSched){
		classList.get(index).classDone();
		currentSched.addClass(classList.get(index));
		/*		switch (index){
		case 0:
			classList.get(index).isFinished = true;
			currentSched.addClass(classList.get(index));
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
		case 13:
			break;
		case 14:
			break;
		case 15:
			break;
		case 16:
			break;
		case 17:
			break;
		case 18:
			break;
		case 19:
			break;
		case 20:
			break;
		case 21:
			break;
		case 22:
			break;*/
	}
}	
//}
