<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script> 
<script type="text/javascript">
 $(document).ready(function() {   
	 
	  $('#b1').click(function () {
		  var name = $('.id').val();
		  var data = 'id=' + name;  
		  alert(data);
		  
 		    $.ajax({
		        
 		    	type:"POST",
 		    	url:"/1.JqueryAjax/WelcomeServlet5",
 		        //url:"welcome.jsp",    
		        
		        data: data,        
		        success: function (data) {                 
		         $('div').append(data);
		        }
		    });
	  });
 });

 </script>


</head>
<body>
�̸� : <input type="text" class="id" >
<input type="button"  id="b1" value="ȸ�������˻�" >
 <!-- span�� �����ϴ� ���� �ุ �ٲ� -->
 <div ></div>
</body>
</html>