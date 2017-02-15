import java.util.ArrayList;

public class generalEducation extends degreeProgram{

	//Index each one!!! Arraylist it!
	//public static ArrayList <uogClass> classList = new ArrayList <uogClass>();
	
	//Assign All of the names for the classes
	public generalEducation(){
		this.degreeName = "General Education";
		classList.add(new uogClass("EN110", 0, 3));
		classList.add(new uogClass("EN111", 0, 3));
		classList.add(new uogClass("CO210", 0, 3));
		classList.add(new uogClass("Mathematics", 0, 3));
		classList.add(new uogClass("Statistics or Computer Skills", 0, 3));
		classList.add(new uogClass("The Arts & Creative Expression 1", 0, 3));
		classList.add(new uogClass("The Arts & Creative Expression 2",0 ,3));
		classList.add(new uogClass("Global Studies", 0, 3));
		classList.add(new uogClass("The Individual and Society", 0, 3));
		classList.add(new uogClass("Foreign Language 1", 0, 4));
		classList.add(new uogClass("Foreign Language 2", 0, 4));
		classList.add(new uogClass("Personal Development", 0, 4));
		classList.add(new uogClass("Regional Studies", 0, 3));
		classList.add(new uogClass("Science & Lab 1", 0, 4));
		classList.add(new uogClass("Science & Lab 2", 0, 4));
		classList.add(new uogClass("The Search for Meaning", 0, 3));
	}
	
	public void finishClass(int index, semSchedule currentSched){ //add Schedule field
		switch (index){
		case 1: //EN 111 Needs EN110 first before scheduling
			if (classList.get(0).isFinished==true){
				classList.get(index).classDone();
			currentSched.addClass(classList.get(index));
			}
			break;
		case 2: //CO210 Needs EN110 first before scheduling as well
			if (classList.get(0).isFinished==true){
			classList.get(index).classDone();
			currentSched.addClass(classList.get(index));
			}
			break;
		default: //Assume the rest of the General Eds don't have Pre Requisites
			classList.get(index).classDone();
			currentSched.addClass(classList.get(index));
			break;
	}
	}
}

/**************************LIST OF CLASSES******************************
*
*==============General Education Requirements========================
*
* -----------Essential Skills (15 Credits)
* EN110 3 Credits
* EN111 3 Credits
* 
* CO210 3 Credits
* 
* MA110/115/161ab/165/203 3 Credits
* 
* CS200/CS201/BA130/BA230/MA151 3 Credits
* 
* ----------The Arts and Creative Expression (6 credits)
* EN210/213/314/323/360 3 Credits
* AR101/AR102/MU101/MU106/TH101 3 Credits
* 
* -------Global Studies (3 Credit Hours)
* SO332/GE201/HI121/HI122/SW201
* 
* -------The Individual and Society
* CO106/BA110/GE101/PS100/PS101 3 Credits
* AN101/AN212/LN101/LN300/PS202/PY101/SO101/SO202/WG201 3 Credits
* 
* -------Modern Languages (8 Credit Hours)
* Foreign Language 1
* Foreign Language 2
* 
* ------Personal Development (3 Credit Hours)
* CF230/CF231/HS200/PY100/PE124/PE125/PE220
* 
* ------Regional Studies (3 Credit Hours)
* AN320/AN421/EN333/BI201/ED265/GE401/HI211/HI243/HI371/HI372
* HI444/PS225/PS412/PY475/SW110/SW410
* 
*------The Sciences (8 Credit Hours)
* Science 1 & Lab (4 Credit Hours)
* Science 2 & Lab (4 Credit Hours)
* 
*------The Search for Meaning (3 Credit Hours)
* PI101/PS326/WG101
* 
*/ 