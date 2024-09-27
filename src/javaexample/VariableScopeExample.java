package javaexample;

public class VariableScopeExample {
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5;
		System.out.println(v3);
	}
	*/
	//v2가 if안에있어 v3계산식에서 v2를 불러올수 없음
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		int v2 = 0;
		if(v1>10) {
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5;
		System.out.println(v3);
	}

}
