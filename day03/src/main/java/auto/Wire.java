package auto;

/*
  [autowire] (자동설정)
  byName : 프로퍼티 이름과 같은 이름을 가진 빈 객체를 설정 (연결 된 '빈 이름'과 동일한 이름을 가진 set 호출)
  byType : 프로퍼티 타입과 같은 타입을 가진 빈 객체를 설정 (연결 된 '빈 타입'과 동일한 매개변수를 가진 set 호출)
  constructor : 생성자 파라미터 타입과 같은 타입을 갖는 빈 객체를 생성자에게 전달

 
  
 */

public class Wire {
	private Info info;
	private Info info2;
	
	public Wire() {
		System.out.println("call : Wire-no argument constructor");
	}
	
	public Wire(Info info) {
		System.out.println("call : Wire - info argument constructor");
	}
	
	public void setInfo(Info info) {
		System.out.println("call : Wire = setInfo method (Info info) ");
	}

	public void setInfo2(Info info2) {
		System.out.println("call : Wire = setInfo2 method (Info info2) ");
	}

}
