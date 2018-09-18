<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Header.jsp?titleName=MovieList"></jsp:include>

<div class="container">

 <table class="table table-striped">
    <thead>
      <tr>
        <th>Movie ID</th>
        <th>Movie Name</th>
        <th>Branch</th>
        <th>Date and Time</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="m" items="${MoviesList}">
      <tr>
        <td>${m.movieid}</td>
        <td>${m.moviename}</td>
        <td>${m.branch}</td>
        <td>${m.showtime}</td>
      
      </tr>
      </c:forEach>
      
     
    </tbody>
  </table>
    
</div>
</body>
</html>