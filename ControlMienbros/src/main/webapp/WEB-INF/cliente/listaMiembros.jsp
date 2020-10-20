<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<main class="contenido">
    <table>
        <thead>
            <tr>
                <th colspan="3">Lista de Clientes</th>
            </tr>
            <tr>
                <th>#</th>
                <th>Nombre</th>
                <th>Membresia</th>
                <th></th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="miembro" items="${miembros}" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td>${miembro.nombre} ${miembro.apellido}</td>
                <td>${miembro.membresia}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>    
</main>