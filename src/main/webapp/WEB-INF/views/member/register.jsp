<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %> <%@ include file="../include/header.jsp" %>
<script>
  $(document).ready(function () {
    // 아이디 중복 체크
    $("#checkId").click(function () {
      var id = $("#id").val();
      console.log("클릭됨" + id);
      
      $.ajax({
        type: "post",
        url: "/regist/checkId",
        dataType: "json",
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify({id: id}),
        success: function (result) {
        	if (result["status"] == "0") {
        		alert(result["announce"]);
        	}
        	else if (result["status"] == "1") {
        		alert(result["annouce"]);
        	}
        },
      });
    });
  });
</script>
<body>
  <form id="register" action="/regist/insert" method="post">
    <label>아이디: </label>
    <input type="text" id="id" name="id" class="registerForm" />
    <span id="checkId">중복 확인</span>
    <label>비밀번호: </label>
    <input type="password" id="password" name="password" class="registerForm" />
    <label>비밀번호 확인: </label>
    <input type="password" id="pwdCheck" class="registerForm" />
    <label>이름: </label>
    <input type="text" id="name" name="name" class="registerForm" />
    <label>이메일: </label>
    <input type="text" id="email" name="email" class="registerForm" />
    <input type="submit" />
  </form>
</body>
<%@ include file="../include/footer.jsp" %>
