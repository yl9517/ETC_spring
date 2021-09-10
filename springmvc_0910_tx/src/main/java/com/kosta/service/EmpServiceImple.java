package com.kosta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.kosta.dto.EmpDTO;
import com.kosta.mapper.EmpMapper;
/*
 * isolation : 트랜잭션 처리 수준은 동시에 여러 트랜잭션이 진행될때 트랜잭션의 작업 결과를 다른 트랜잭션에게 어떻게 노출시킬 것인지를 결정
 * 		DEFAULT : DB수준에 따라 다름(READ_COMMITTED)
 * 		READ_UNCOMMITTED : 수정한 데이터는 commit하기 전에 다른 트랜잭션에서 볼 수 있다. (일관성이 떨어지며 oracle에서는 지원하지 않음)
 * 
 * 		READ_COMMITTED : commit되지 않은 데이터를 읽을 수 있다.
 * 						 해당 트랜잭션이 읽은 row는 다른 트랜잭션이 수정할 수 있기 때문에 처음 트랜잭션이 같은 row를 읽는 경우 다른 내용이 발생될 수 있다.
 * 		
 * 		REPEATABLE_READ : 엄격한 격리수준
 * 						  처음 읽어온 데이터와 두번째 읽어온 데이터가 동일한 값을 갖는다.
 * 						  하나의 트랜잭션이 읽은 row를 다른 트랜잭션이 수정하는 것을 막는다.
 * 
 * 		SERIALIZABLE : 가장 엄격한 격리수준
 * 						하나의 트랜잭션이 실행된 후 다른 트랜잭션이 실행
 * 						모든 트랜잭션이 각 라인을 실행할 때마다 기다려야 함
 * 
 *	Propagation : 전파규칙
 * 				-> 트랜잭션이 시작하거나 다른 트랜잭션에 포함시키는 방법에 대해 결정하는 기준
 * 		REQUIRED : 메서드 수행시 트랜잭션이 필요함
					현재 진행중인 트랜잭션이 있으면 해당 트랜잭션에 참여, 트랜잭션이 없으면 새로 트랜잭션을 생성하여 사용

 * 
 */
@Transactional(rollbackFor = {Exception.class}   //exception 발생이 되면 롤백이 일어날거야
				, isolation = Isolation.DEFAULT
				, propagation = Propagation.REQUIRED
		)	
@Service(value = "empservice")
public class EmpServiceImple implements EmpService {

		@Autowired
		private EmpMapper mapper;
	@Override
	public void doing() {
		mapper.deletedata(1111);
		
		EmpDTO dto = new EmpDTO(5555, "hellobaby", 1000);
		
		mapper.insertdata(dto);
		
	}

}
