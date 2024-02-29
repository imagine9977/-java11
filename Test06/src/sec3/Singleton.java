package sec3;
//pg 193
public class Singleton {
	static Singleton instance; // 정적 객체 static

	private Singleton() {
	} // 외부에서 생성 안되도록 private

	public static synchronized Singleton getInstance() {//syncronized = 동기화 된 
		if (instance == null)
			instance = new Singleton();
		return instance;
	}
	
	
}
