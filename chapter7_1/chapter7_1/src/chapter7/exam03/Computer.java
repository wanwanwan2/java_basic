package chapter7.exam03;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCirecl() 실행");
		return Math.PI * r * r;
	}
}
