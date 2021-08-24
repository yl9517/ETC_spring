package kr.or.kosta.dto;

// POJO(Plain Old Java Object)클래스
public class MemberDTO {
	private String name;
	private int age;
	
	public MemberDTO() {
		
	}
	public MemberDTO(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", age=" + age + "]";
	}
	
	
}
