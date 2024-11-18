<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<c:set var="contextPath" value="${pageContext.request.contextPath}"  /> 
<html>
<head>
<meta charset="utf-8">
<title>회원가입</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js" integrity="sha512-v2CJ7UaYy4JwqLDIrZUI/4hqeoQieOmAZNXBeQyjo21dadnwR+8ZaIJVT8EE2iyI61OV8e6M8PP2/4hpQINQ/g==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script type="text/javascript">
$(function(){
    // 버튼 클릭 이벤트 핸들러
    $("#checkJson").click(function() {
        var userData = {
            id: $("#id").val(),
            pw: $("#pw").val(),
            name: $("#name").val(),
            age: $("#age").val()
        };
        
        // AJAX 요청 보내기
        $.ajax({
            type: "POST", // 요청 방식은 POST
            url: "${contextPath}/json3", // 서버의 서블릿 URL
            contentType: "application/json", // 전송할 데이터의 타입은 JSON
            data: JSON.stringify(userData), // 데이터를 JSON 형태로 변환하여 전송
            success: function(data, textStatus) {
                // 성공 시 처리
                console.log("서버 응답:", data);
                $("#message").text(data.message); // 응답 메시지를 화면에 표시
            },
            error: function(xhr, textStatus, errorThrown) {
                // 에러 발생 시 처리
                alert("에러가 발생했습니다.");
            }
        });
    });
});
</script>
</head>
<body>
    <div>
        <li>id<input type="text" id="id"></li>
        <li>pw<input type="password" id="pw"></li>
        <li>name<input type="text" id="name"></li>
        <li>age<input type="text" id="age"></li>
        <li><input type="button" id="checkJson" value="회원가입"/></li>
    </div>    
    
    <div id="message"></div>
</body>
</html>
