<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="components/header.jsp"%>
<div>


    <div class="main">
        <input type="checkbox" id="chk">

        <div class="signup">
            <form action="./login" method="POST">
                <label for="chk" class="sig">Log in</label>

                <div class="user-box">
                    <input type="text" title="Enter Username" name="username">
                    <label>Username</label>
                </div>
                <div class="user-box">
                    <input type="password" title="Enter password" name="password">
                    <label>Password</label>
                </div>

                <button type="submit">Log in</button>
            </form>
            <span class="<%=request.getAttribute("error-message") !=null ? "error-msg" : ""%>">
                    <%=request.getAttribute("error-message") != null ? request.getAttribute("error-message") : ""%>
                </span>
        </div>
    </div>
</div>

<%@include file="components/footer.jsp"%>
