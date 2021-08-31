package com.kostsa.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kostsa.dto.MemberDTO;

@Controller
@RequestMapping("/hello") // http://localhost:8080/myapp/hello
public class HelloController3 {
		
	// value를 쓰던 안쓰던 차이는 없지만, 뒤에 옵션이 더 붙는다면 value를 작성해주어야 한다.
	@RequestMapping(value = "/form2", method=RequestMethod.GET) // http://localhost:8080/myapp/hello/form2
	@GetMapping("form2")
	public String f() {
		return "form2";
	}
	
//	@RequestMapping("/result") // http://localhost:8080/myapp/hello/result
//	public String result(){
//		
//	}
	
//	@RequestMapping(value="/result2", method=RequestMethod.POST)
//	public String result(@RequestParam String id, @RequestParam String pwd
//						,@RequestParam(name="irum") String name //irum을 가져와서 name으로 저장
//						,@RequestParam(name="age", defaultValue = "0", required = false) int age //기본값 설멍 ( 데이터를 입력하지 않았을 때 )
//						,@RequestParam String gender , @RequestParam(required = false) String[] food // 
//						,@RequestParam(defaultValue = "hi") String text , Model model){
//					//디폴트 값이나 required 옵션을 붙여주지 않으면 무조건 넘겨야 하는 값!!
//			
//		model.addAttribute("id",id);
//		model.addAttribute("pwd",pwd);
//		model.addAttribute("irum",name); //name을 irum으로 저장
//		model.addAttribute("age",age);
//		model.addAttribute("gender",gender);
//		model.addAttribute("food",food);
//		model.addAttribute("text",text);
//		
//		return "result2";
//	}
	
	
	
	/*
	 * 커멘드 객체(command object)
	 * request를 통해 들어온 요청 파라미터들을 setter 메소드를 이용해 
	 * 객체에 저장되어 있는 속성에 바인딩한 객체 => DTO
	 * 
	 * @ModelAttribute
	 * 하나 이상의 값을 가진 object 형태로 만들 수 있는 구조적 정보
	 * Map형태의 컬렉션을 이용해 여러개의 모델 객체를 담아서 전달
	 * 
	 */
	               //value보다 name 이 더 좋음
//	@RequestMapping(value="/result3",method=RequestMethod.POST)  //아래처럼 더 잘 씀
//	@PostMapping("/result3")  // (value="result3")
//	public String result2(MemberDTO dto) {
//		return "result3";
//	}

//	@PostMapping("result4")
//	public String result3(@ModelAttribute("member") MemberDTO dto) {
//		return "result4";
//	}
	
						  // 주소 / 값 / 값 / ...
	@RequestMapping(value="/result5/{id}/{password}/{irum}/{gender}/{age}")
	public String result4(@PathVariable String id
						, @PathVariable(value="password") String pwd
						, @PathVariable String irum
						, @PathVariable String gender
						, @PathVariable int age
						, Model model		) {
		
		model.addAttribute("id",id);
		model.addAttribute("pwd",pwd);
		model.addAttribute("name",irum); //name을 irum으로 저장
		model.addAttribute("gen",gender);
		model.addAttribute("age",age);
		
		return "result5";
	}
	
}
