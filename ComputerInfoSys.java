import java.util.ArrayList;

public class ComputerInfoSys extends degreeProgram { 

	//Index each one!!! Arraylist it!
	//public static ArrayList <uogClass> this.classList = new ArrayList <uogClass>();
	
	//Assign All of the names for the classes
	public ComputerInfoSys(){
		this.degreeName = "Computer Information Systems";
		this.classList.add(new uogClass("BA110", 110, 3));
		this.classList.add(new uogClass("MA151", 151, 3));
		this.classList.add(new uogClass("MA165", 165, 5));
		this.classList.add(new uogClass("CS200", 200, 3));
		this.classList.add(new uogClass("BA200", 200, 3));
		this.classList.add(new uogClass("BA201", 201, 3));
		this.classList.add(new uogClass("BA210", 210, 3));
		this.classList.add(new uogClass("CS201", 201, 4));
		this.classList.add(new uogClass("CS202", 202, 4));
		this.classList.add(new uogClass("MA203", 203, 5));
		this.classList.add(new uogClass("CS303", 303, 3));
		this.classList.add(new uogClass("CS305", 305, 3));
		this.classList.add(new uogClass("CS315", 315, 3));
		this.classList.add(new uogClass("BA320", 320, 3));
		this.classList.add(new uogClass("CS360", 360, 3));
		this.classList.add(new uogClass("CS380", 380, 3));
		this.classList.add(new uogClass("MA385", 385, 3));
		this.classList.add(new uogClass("CS403", 403, 3));
		this.classList.add(new uogClass("CS425", 425, 3));
		this.classList.add(new uogClass("CS431", 431, 3));
		this.classList.add(new uogClass("BA441", 441, 3));
		this.classList.add(new uogClass("LW442", 442, 3));
		this.classList.add(new uogClass("CS492", 492, 3));
	}
	
	/**
	 * @Purpose: This method tries to add a class from this
	 * degree's list of classes required.
	 * @param index: Index of this.classList that the scheduler is
	 * trying to add.
	 */
	public void finishClass(int index, semSchedule currentSched){
				switch (index){
		case 0: //BA110
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 1:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 2:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 3:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 4:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 5:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 6:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 7:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 8:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 9:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 10:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 11:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 12:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 13:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 14:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 15:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 16:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 17:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 18:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 19:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 20:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 21:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				}
			break;
		case 22:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				outOfClasses = true;
			}
			break;
		case 23:
			if (classList.get(index).isFinished == false){
				this.classList.get(index).classDone();
				currentSched.addClass(this.classList.get(index));
				outOfClasses = true;
			}
			break;
	}
}	
}

