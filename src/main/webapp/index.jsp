<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>후참잘</title>
</head>
<body>
   <h1>비회원 로그인 화면</h1>
    <form action="member" method="post">
      <table>
          <tr>
              <th>
                  이름 :
              </th>
              <td>
                  <input type="text" name="name">
              </td>
          </tr>
          <tr>
              <th>
                  비밀번호 :
              </th>
              <td>
                  <input type="password"name="password">
              </td>
          </tr>
          <tr>
              <th>
                  전화번호 :
              </th>
              <td>
                  <input type="text" name="tel">
              </td>
          </tr>
          <tr>
              <th>
                  주소 :
              </th>
              <td>
                  <input type="text" name="addr">
              </td>
          </tr>
          <tr>
              <td colspan="4">
                  <button type="submit" >로그인</button>
              </td>
          </tr>
      </table>

    </form>

</body>
</html>



</div>