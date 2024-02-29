package sec1;

public class BirthdayExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birthday birth1= new Birthday();
		birth1.setName("DB_Park");
		birth1.setMonth(12);
		birth1.setYear(1998);
		birth1.setDay(25);
		birth1.birth();
		birth1.birthAddr();
		
		Birthday birth2 = new Birthday();
		birth2.setDay(5);
		birth2.setMonth(3);
		birth2.setYear(2014);
		birth2.setName("Lincoln");
		birth2.birth();
		birth2.birthAddr();
	}

}
