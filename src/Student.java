/**
 * 
 * @author Hady Diab, PD 5 ODD DAYS.
 *
 */
public class Student 
{
private String name;
private int gradeLevel;
private String phoneNumber;
private int gradYear;


public Student()
{
	gradeLevel=9;
	gradYear=2022;
	name="Hady";
}

public String getName()
{
	return name;
}

public int getGradeLevel()
{
	return gradeLevel;
}

public String getPhoneNumber()
{
	return phoneNumber;
}

public int getGradYear()
{
	return gradYear;
}

public void nextGrade()
{
	gradeLevel=gradeLevel+1;
}

public void setPhoneNumber(String phone1)
{
	phoneNumber=phone1;
}




}
