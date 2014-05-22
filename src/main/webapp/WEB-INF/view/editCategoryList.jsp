<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html> 
<head>
    <title>Quesada</title>
</head>
<body style="margin: 0px;">
	<table style="width: 100%; background-color: #2E0854; padding: 10px 5px 5px; min-width: 1000px">
		<tbody>
			<tr>
				<td><span style="color:  white; font-size: 25px; font-weight: bold;">QUESADA</span></td>
			</tr>
		</tbody>
	</table>   
	<table style="width: 100%; background-color: #8A2BE2; padding: 0px 5px 5px; min-width: 1000px">
		<tbody>
			<tr>
				<td><span style="color:  white; font-size: 15px; font-weight: bold;">Menu</span></td>
			</tr>
		</tbody>
	</table>
	<div style="background: #D3BECF; padding: 10px; min-width: 980px;">
		<fieldset>
			<legend>Category</legend>
			<form:form method="post" action="add" commandName="category">
				<table>
				    <tr>
				        <td><form:label path="name"><spring:message code="label.name"/></form:label></td>
				        <td><form:input path="name" /></td>
				    </tr>
				    <tr>
				        <td colspan="2">
				            <input type="submit" value="<spring:message code="label.add"/>"/>
				        </td>
				    </tr>
				</table> 
			</form:form>
		 	
		 	<h3>Categories</h3>
			<c:if  test="${!empty categoryList}">
				<table class="data" style="width: 300px;" border="1">
					<tr>
					    <th>Name</th>
					    <th>Action</th>
					</tr>
					<c:forEach items="${categoryList}" var="cat">
					    <tr>
					        <td>${cat.name}</td>
					        <td><a href="delete/${cat.id}">delete</a></td>
					    </tr>
					</c:forEach>
				</table>
			</c:if>
		</fieldset>
	</div>
</body>
</html>