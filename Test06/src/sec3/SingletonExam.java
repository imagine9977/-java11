package sec3;

public class SingletonExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton ins1 = Singleton.getInstance();
		Singleton ins2 = Singleton.getInstance();

		Singleton ins3 = Singleton.getInstance();
		System.out.println(ins1);       //sec3.Singleton@48140564
		System.out.println(ins2);		//sec3.Singleton@48140564
		System.out.println(ins3);		//sec3.Singleton@48140564
		
		System.out.println((ins1==ins2)+":"+(ins1==ins3)); //true
		
	}

}
