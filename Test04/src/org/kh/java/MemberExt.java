package org.kh.java;

public class MemberExt {

	public static void main(String[] args) {
		// has to be from the same package(접근제어자), if not, then variable needs to public on the original class
		//public>protected>default>private
		MemberInfo mem = new MemberInfo();
		mem.setBirth( "20010102");
		mem.setID("randomID"); //mem.id = "randomID";
		mem.setPW("1q2w3e");//mem.pw = "1q2w3e";
		mem.setEmail("randomEmail@email.com");//mem.email = "randomEmail@email.com";
		mem.setPhone("01012345678"); //mem.phone = "01012345678";
		System.out.println(mem.toString());
		System.out.println(mem.getPw());
		
	}

}
