<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"
	type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function() {
		var num=10;
		$("#num").html(num);
		$('#keyTest').keyup(function() {
			var str = $(this).val();			
 			var l = num-str.length;
 			//alert(l);
			if(l<=0){
				alert(num+"���� �ʰ� �Է� �Ұ�");	
				var s = str.substring(0, 10);
				$(this).val(s);
			}
			$("#num").html(l);
		});
	});
</script>

</head>
<body>
10���ڱ����� �Է°���<br>
�׽�Ʈ : <input type="text" id="keyTest" >
<span id="num"></span>���� �Է°���
</body>
</html>