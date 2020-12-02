<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="contenido">
    <h2 class="titulo-Tabla-Miembros">Tabla de Miembros</h2>
    <table class="tabla-Miembros">
        <thead>
            <tr>
                <th>#</th>
                <th>Nombre</th>
                <th>Membresia</th>
                <th>Editar</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="miembro" items="${miembros}" varStatus="status">
                <tr>
                    <td>${status.count}</td>
                    <td>${miembro.nombre} ${miembro.apellido}</td>
                    <td>${miembro.membresia}</td>
                    <td><a href="${pageContext.request.contextPath}/ServletControlador?accion=editar&idMiembro=${miembro.idMiembro}" class="accionEditarLink">                        
                            Editar
                            <img src="styles/img/lapiz.svg" class="icono">
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </tbody> 
    </table>
</div>
<img class="imgHombre" src="styles/img/Hombre.png">  

