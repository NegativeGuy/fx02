package lambda;

interface Lambda01{
	public void lam();	// 추상화 매소드 (실체화(객체)를 해줘야 됨)
}

class Test01 implements Lambda01{	// 인터페이스를 상속하는 클래스 생성

	@Override	// 인터페이스를 상속받으면 무조건 오버라이드를 해야함
	public void lam() {
		System.out.println("lambda 01 실행");		
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		t.lam();
		
		Lambda01 lam01 = new Lambda01() {	// 인터페이스로 객체 만듬
			
			@Override	// 인터페이스로 객체 생성하면 자동으로 오버라이드 됨
			public void lam() {
				System.out.println("인터페이스 객체 생성");
				
			}
		};
		lam01.lam(); // 인터페이스 객체로 매서드 실행
		
		// 위의 식을 람다식으로 바꾸면 아래처럼 간단해진다
		Lambda01 lam02 = ()-> System.out.println("람다식 객체 생성");
		lam02.lam();
		// 그러나 인터페이스에는 하나의 매서드만 있어야 한다.
	}
}
