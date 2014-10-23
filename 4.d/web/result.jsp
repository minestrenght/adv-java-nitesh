<jsp:useBean id="test" scope="page" class="pkg.EvenOddTester"/>
<jsp:setProperty name="test" property="num" param="num"/>
Number : <jsp:getProperty name="test" property="num"/> is even: ${test.isEven()}