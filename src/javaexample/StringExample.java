package javaexample;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"룰 배웁니다, ";//\뒤에 특수문자를 출력가는하게해줌
		System.out.println(str);
		
		str = "번호\t이름\t직업 "; // \t는 tap
		System.out.println(str); //println은 자동 줄바꿈이지만 print는 붙어서 출력됨
		
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다.");
		
	}

}
