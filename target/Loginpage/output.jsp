<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="components/header.jsp"%>

<div>


    <div class="main">
        <input type="checkbox" id="chk">

        <div class="signup">
            <form action="./login" method="POST">
                <label for="chk" class="sig">Welcome</label>

                <p class="db-name"><c:out value="${first_name}"/></p>
                <p class="db-name"><c:out value="${last_name}"/></p>
                <a href="${pageContext.request.contextPath}/logout" class="logout-btn" >Log Out</a>
            </form>
        </div>
    </div>
</div>

<%@include file="components/footer.jsp"%>