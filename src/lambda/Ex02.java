package lambda;
interface Lambda02{
	public void lam(Object o);
}
public class Ex02 {
	public static void main(String[] args) {
		Lambda02 lam01 = (aaa)->{	// 객체 생성 시 람다식 실행
			System.out.println(aaa+" 출력");
			System.out.println("여러줄 사용가능");
		};
		lam01.lam("안녕하세요");	
		// 객체로 람다식 매서드 호출
		// 괄호안의 내용("안녕하세요")이 처음 객체 생성시 쓴 람다식의 괄호(aaa)로 들어감
		// 호출된 람다식 안의 코드가 차례로 실행
		// 예제의 경우 프린트 두번이 실행
		
		// 람다식은 인터페이스를 활용하는 식이므로
		// 추상화 매서드를 호출하기 때문에
		// 호출 후에 내가 원하는 코드들을 람다식 안에 넣어준다
	}
}
