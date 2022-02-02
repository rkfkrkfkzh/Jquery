<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>  
 <script type="text/javascript">
 // $()�� 臾몄���� �쇰�瑜� �������� �� �ъ�� ,$('body')HTML���쇰�댁�� 紐⑤�� 臾몃�� ��由щ㉫�몃�� ��洹� 
 // $('div')HTML���쇰�댁�� 紐⑤�� div ��由щ㉫�몃�� ��洹�, $('#A')id=A�� 紐⑤�� HTML��由щ㉫�몄�� ��洹�   
//  $('.b)class=b �� 紐⑤�� HTML��由щ㉫�몄�� ��洹�
// $(document).ready(function()以�鍮��� �����쇰�� 寃��� ���ㅼ＜�� �ъ��   
//$.ajax()硫������� HTTP ��泥��쇰� ��寃⑹��� ���댁�瑜� 遺��ъ�ㅺ� XMLHttpRequest媛�泥대�� ���깊���� 諛�����怨� �몄��濡��� ��泥��� 珥�湲고�� ��怨� 
//泥�由ы������ �ъ�⑺���� ��/媛� ���쇰� �대（�댁� 媛�泥대�� 諛�����. 
//type ��泥��� �ъ�⑺�� HTTP硫�����瑜� �������� 臾몄����, 利� GET���� POST ���댄�� ������ GET 硫����� 
//url ��泥��� 蹂대�� ���댁��� url�� �대�� 臾몄���� 
//data ��泥�怨� �④� 蹂대�� 留� ���� 臾몄���� 
//success ��踰��� 蹂대�댁� ��泥��� �깃났��硫� ���� �� 肄�諛깊�⑥�� (��踰�����) 諛����� �곗�댄�곕�� 肄�諛깊�⑥���� ���쇰�명�� 媛��� ����. 
//append���� �몃���� 遺��닿� 		
		
		$(document).ready(function() {   
	 
	  $('#b1').click(function () {
		  var name = $('.uname').val();
		  var data = 'uname=' + name;  
		  alert(data);
		  
		    $.ajax({
		        
		    	type:"POST",
		    	url:"/1.JqueryAjax/WelcomeServlet",
		       		        
		        data: data,        
		        success: function (data) {                 
		         $('body').append(data);
		        }
		    });
	  });
 });
 
 
 
 </script>




</head>
<body>
<form>
<label>Enter your Name</label>  
    <input type="text" name="uname" class="uname"/>  <br/>
    <input type="button" id="b1" value="click"/>  
  </form>  
  
</body>
</html>