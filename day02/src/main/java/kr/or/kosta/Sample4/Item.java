package kr.or.kosta.Sample4;

import java.util.Iterator;
import java.util.Map;

public class Item {
	private Map<String, Product> items;
	
	public void setItems(Map<String,Product> items)
	{
		this.items=items;
	}
	
	//items 출력
	public void prt() {
		Iterator<String> ita = items.keySet().iterator(); 
		
		while(ita.hasNext()) {
			String key = ita.next();
			Product value = items.get(key);
			
			System.out.println("key : "+key);
			System.out.println("value : "+value);
		}
	}
	
}
