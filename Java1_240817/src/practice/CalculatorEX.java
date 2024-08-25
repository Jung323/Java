package practice;

public class CalculatorEX {
//	public int a;
//	public int b;
	public int plus=0;
	public int minus=0;
	public int multiple=0;
	public int divide=0;
	double Plus(double a,double b){
//		System.out.println(a+"+"+b+"="+(a+b));
		plus++;
		double result = a+b;
		System.out.println(a+"+"+b+"="+result);
		return result;
	}
	double Minus(double a,double b){
		minus++;
		double result = a-b;
		System.out.println(a+"-"+b+"="+result);
		return result;
	}
	double Multiple(double a,double b){
		multiple++;
		double result = a*b;
		System.out.println(a+"*"+b+"="+result);
		return result;
	}
	double Divide(double a,double b){
		divide++;
		double result = a/b;
		System.out.println(a+"/"+b+"="+result);
		return result;
	}
	
	
//	public void Minus(){
//		System.out.println(a+"-"+b+"="+(a-b));
//		minus++;
//	}
//	public void Multiple(){
//		System.out.println(a+"*"+b+"="+a*b);
//		multiple++;
//	}
//	public void Divide(){
//		System.out.println(a+"/"+b+"="+a/b);
//		divide++;
//	}
	public void number() {
		System.out.println("덧셈 횟수: "+plus);
		System.out.println("뺼셈 횟수: "+minus);
		System.out.println("곱셈 횟수: "+multiple);
		System.out.println("나눗셈 횟수: "+divide);
	}
}
