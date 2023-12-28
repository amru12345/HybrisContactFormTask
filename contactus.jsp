<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product" %>

<spring:htmlEscape defaultHtmlEscape="true" />

  <form:form modelAttribute="registerForm" action="${request.contextPath}/form/saveContactDetails" method="post">
    <div class="container">
        <h1>Register</h1>
        <p>Please fill in this form to create an account.</p>
        <hr>

       <label for="firstname"><b>First Name</b></label>
       <input type="text" placeholder="Enter First Name" name="firstName" id="firstName" required>
       <label for="lastname"><b>Last Name</b></label>
       <input type="lastname" placeholder="Enter LastName" name="lastName" id="lastName" required>
       <input type="submit" value="submit"/>
</div>
  </form:form>


