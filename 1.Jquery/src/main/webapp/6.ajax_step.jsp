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

		$('#line').change(function() {
			var name = $("#line option:selected").val();
			var data = 'line=' + name;
			//alert(data);

			$.ajax({

				type : "POST",
				url : "/1.JqueryAjax/OneServlet",
				//url:"welcome.jsp",    

				data : data,
				success : function(data) {
					//alert(data);
					$('span').html(data);
				}
			});
		});
	});
</script>

</head>
<body>
<select id="line" >
	<option value="">ȣ��</option>
	<option value="1">1ȣ��</option>
	<option value="2">2ȣ��</option>
	<option value="3">3ȣ��</option>

</select>
	<span></span>
</body>
</html>