package kr.or.kosta.HW;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@AllArgsConstructor
@ToString
public class BeanSet {
	private Set<String> items;
}
// bean => xml => test