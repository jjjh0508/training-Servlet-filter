<%--
  Created by IntelliJ IDEA.
  User: jjjh0
  Date: 2023-06-29
  Time: 오후 5:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>후참잘 주문하기</title>
</head>
<body>
<form action="orderhucamjar" method="get">
  <label>후참잘 주문하기 </label>
  <select name="chicken">
    <option value="후라이드">후라이드</option>
    <option value="양념">양념치킨</option>
    <option value="간장">간장치킨</option>
  </select>

  <label>토핑 선택</label>
  <input type="checkbox" name="topping" id="tteok" value="떡"><label for="tteok">떡</label>
  <input type="checkbox" name="topping" id="kimchi" value="김치"><label for="kimchi">김치</label>
  <input type="checkbox" name="topping" id="potato" value="감자튀김"><label for="potato">감자튀김</label>
  <br/>

  <select name="review">
    <option value="감자튀김">감자튀김</option>
    <option value="치즈볼">치즈볼</option>
    <option value="치즈">치즈</option>
  </select>

<button type="submit">주문하기 </button>

</body>
</html>
