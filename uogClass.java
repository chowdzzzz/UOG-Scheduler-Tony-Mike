public class uogClass {
	 public static boolean isFinished = false; //Whether the class is finished or not
	 public static String name; //Name of the class
	 public static int id; 
	 public static int credits;
	 
	 public static void assignName(String given){
		 name = given;
	 }
	 
	 public static void classDone(){
		 isFinished = true;
	 }
	 
	 public uogClass(String given, int idnum, int numCred){
		 name = given;
		 id = idnum;
		 credits = numCred;
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
* =====================Computer Science Program Requirements=================
* Required Courses:
* CS200
* CS201
* CS202
* CS303
* CS315
* CS360
* CS380
* CS403
* CS425
* CS431
* BA110
* BA240
* 
* Required Support Courses:
* MA151
* MA203
* MA385
* MA165
* 
* Elective Courses
* BA200
* BA201
* BA210
* BA320
* BA441
* LW442
* 
***************************************************************/

