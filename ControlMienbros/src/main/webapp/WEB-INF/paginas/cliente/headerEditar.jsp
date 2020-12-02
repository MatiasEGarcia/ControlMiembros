<div class="header">
    <h1 class="titulo">Control de Miembros</h1>
    <div class="barra">
        <ul>
            <li id="volver">
                <img src="styles/img/flechaIzquieda.svg" class="flechaIzquieda">
                <a href="miembros.jsp" class="volverLink">Volver</a>  
            </li>
            <li id="eliminar-Miembro">
                <a href="${pageContext.request.contextPath}/ServletControlador?accion=eliminar&idMiembro=${miembroEditar.idMiembro}"
                   class="eliminarLink">
                    <img src="styles/img/borrar.svg" class="imagenTacho">
                    Eliminar</a>
            </li>
        </ul>
    </div>
</div>
<img class="imgGrupito" src="styles/img/Grupito.png">