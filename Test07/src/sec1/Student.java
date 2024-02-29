package sec1;
//번호,국어,영어,수학
//getter/serrer, 총점 평균 학점
public class Student {
	private int num;
	private int lang;
	private int eng;
	private int mat;
	
	public Student() {
		
	}
	public Student(int num, int lang, int eng, int mat) {
		this.num = num;
		this.lang = lang;
		this.eng = eng;
		this.mat = mat;
	}
	
	public int total() {
		return lang+eng+mat;
	}
	
	public int average() {
		return (lang+eng+mat)/3;
	}
	
	public String gradeLetter() {
		int grade = (lang+eng+mat)/3;
		String letter;
		if(grade>=90) letter ="A";
		else if(grade >=80) letter ="B";
		else if(grade >=70) letter ="C";
		else if(grade >=60) letter ="D";
		else letter ="E";
		return letter;
	}
	
	public void grade() {
		int grade = (lang+eng+mat)/3;
		String letter;
		if(grade>=90) letter ="A";
		else if(grade >=80) letter ="B";
		else if(grade >=70) letter ="C";
		else if(grade >=60) letter ="D";
		else letter ="E";
		System.out.println("학점: "+letter);
	}
	
	public void print() {
		System.out.println(num+"\t"+lang+"\t"+eng+"\t"+mat+"\t"+total()+"\t"+average()+"\t"+gradeLetter());
	}
	
	@Override
	public String toString() {
		return "Student [num=" + num + ", lang=" + lang + ", eng=" + eng + ", mat=" + mat + "]";
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getLang() {
		return lang;
	}
	public void setLang(int lang) {
		this.lang = lang;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
}
