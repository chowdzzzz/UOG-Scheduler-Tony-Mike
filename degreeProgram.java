import java.util.ArrayList;

public abstract class degreeProgram implements degreeInterface{
	//Blank Classlist Template
	public ArrayList <uogClass> classList = new ArrayList <uogClass>();
	public String degreeName;
	public abstract void finishClass(int x, semSchedule y);
	public boolean outOfClasses = false;
	
}
