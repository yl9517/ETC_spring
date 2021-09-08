$('#btn').click(function() {
	$.ajax({
		url : "/jsonview"
		, dataType : "json"
		, method: "GET"
		, success : function(data) {
			//console.log(data);
			$.each(data, function(index,item){
				let e = "<div> <span>"+item.employee_id+"</span>";
					e +="<span>"+item.first_name+"</span>";
					e +="<span>"+item.hire_date+"</span>";
					e +="<span>"+item.salary+"</span>";
					e +="</div>"
				$(e).appendTo('#result');
			})
		}
		, error:function(data){
			console.log('error'+data);	
		}
			
			
		
	});
});