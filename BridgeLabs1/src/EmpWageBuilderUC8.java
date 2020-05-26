//Use of Switch 

public class EmpWageBuilderUC8 {

	 
public static final int  IS_PART_TIME=1;
public static final int  IS_FULL_TIME=2;

public static int computeEmpWage(String company,int empRatePerHour,int numOfWorkingdays,int maxHoursPerMonth) {
	int empHrs=0;
	int totalEmpHrs=0;
	int totalWorkingDays=0;
	
	while(totalEmpHrs <=maxHoursPerMonth && totalWorkingDays < numOfWorkingdays)
	{
	totalWorkingDays++;
	int empCheck=(int)Math.floor(Math.random()* 10)%3;
	switch (empCheck)
	{
	case IS_FULL_TIME:
		empHrs=8;
		break;
	case IS_PART_TIME:
		empHrs=4;
		break;
		default:
		empHrs=0;
	}
	totalEmpHrs +=empHrs;
	System.out.println("Day:" + totalWorkingDays + "Emp Hr: " +empHrs);
	}
	int totalEmpWage= totalEmpHrs * empRatePerHour;
	System.out.println("Total Emp Wage : " + totalEmpWage);
	return totalEmpWage;
}
	public static void main1(String[] args) {
		computeEmpWage("DMart",20,2,10);
		computeEmpWage("Reliance",10,4,20);
		
	}

}