package javaexample;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//실수값 저장
		double var1 = 3.14; //접미사 없을경우 실수는 더블이 기본형 
		//float var2 = 3.14; //컴파일 에러
		float var3 = 3.14F;
		
		//정밀도 테스트
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		
		System.out.println("var1: " + var1);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);//17자리에서 반올림하여 16자리에 적용
		System.out.println("var5: " + var5);//9자리에서 반올림 8자리에 적용
		

	}

}
