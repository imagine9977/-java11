package sec1;

public class StudentExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("alex",1, 100000);
		Student s2 = new Student("bob",2, 200000);
		Student s3 = new Student("Cait",3, 300000);
		Bus b1 = new Bus(101);
		Subway sub1 = new Subway(2);
		s1.takeBus(b1);
		s1.print();
		b1.show();
		
		s2.takeBus(b1);
		s2.takeBus(b1);
		s2.takeSubway(sub1);
		s2.takeSubway(sub1);
		s2.takeSubway(sub1);
		s2.print();
		b1.show();
		sub1.show();
		
	}

}
