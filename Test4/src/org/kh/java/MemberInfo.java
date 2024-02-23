package org.kh.java;
 
public class MemberInfo {
	private String id;
	private String pw;
	private String email;
	private String birth;
	private String phone;
	
	public void setID(String id) {
		this.id = id;
	}
	public void setPW(String pw) {
		this.pw = pw;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getEmail() {
		return email;
	}
	public String getBirth() {
		return birth;
	}
	public String getPhone() {
		return phone;
	}
	@Override //상속받은 object를 덮어씌우는 것 
	public String toString() {
		return "MemberInfo [id=" + id + ", pw=" + pw + ", email=" + email + ", birth=" + birth + ", phone=" + phone
				+ "]";
	}
	/*
	void printAll() {
		System.out.println("아이디\t비번\t이메일\t생일\t전화번호");
		System.out.printf("%s\t%s\t%s\t%s\t%s\n",
				this.id,this.pw,this.email, this.birth,this.phone);
	}
	*/
}
