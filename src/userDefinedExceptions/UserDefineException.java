// Date :- 10-6-24

package userDefinedExceptions;

public class UserDefineException {

	public static boolean validateMarks(int[] marks) throws InvalidMarksException
	
	{
		for(int value : marks)
		{
			if(value<0 || value>100)
				throw new InvalidMarksException("Marks should be betweeen 0 yo 100");
		}	
	return true;
	}

	public static float calculatePercentage(int[] marks)
	{
		int total=0;
		for(int reuslt : marks)
		{
			int result = 0;
			total+=result;
			float per=total/marks.length*100;
			return per;
		}
		return total;
		

}
}

