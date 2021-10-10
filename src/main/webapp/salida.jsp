<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="curso" scope="request" class="com.emergentes.Curso" />
        <h1>Datos de la Inscripcion del curso</h1>
        <p>Nombre : <jsp:getProperty name="curso" property="nombre" /></p>
        <p>Apellido : <jsp:getProperty name="curso" property="apellido" /></p>
        <p>Curso : <jsp:getProperty name="curso" property="curo" /></p>
        <a href="index.jsp">Volver</a>
    </body>
</html>
