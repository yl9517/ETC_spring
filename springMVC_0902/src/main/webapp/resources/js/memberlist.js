$('#append').click(function() {
	location.href="memberinsert"
})

$('.btndel').click(function() {
	//let no = $(this).parent().parent(); // tr
	let no = $(this).parents('tr').find('td:eq(0)').text();
	
	location.href="memberdelete/"+no;
})


$('tbody>tr').click(function() {
	$('tbody>tr').css('background-color','white')
	$(this).css('background-color','skyblue');
});

$('.btnmodify').click(function() {
	let no = $(this).parents('tr').find('td:eq(0)').text();
	location.href="membermodify/"+no;
})
