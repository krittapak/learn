<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>aas</title>
    </head>
<div class="container">

 <table class="table table-striped" border="1">
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
                <td>${m.date}</td>
            </tr>
    </c:forEach>
      
     
    </tbody>
  </table>
    
</div>
</body>
</html>