package week_two_InheritanceDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TeacherLoanManager teacherLoanManager = new TeacherLoanManager();
		teacherLoanManager.Calculate();*/
		CreditUI creditUI= new CreditUI();
		creditUI.CreditCalculate(new TeacherLoanManager());
	}

}
