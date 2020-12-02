<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="contenido">
    <h2 class="titulo-editar">Editar</h2>
    <form id="form-modificar-miembro" action="${pageContext.request.contextPath}/ServletControlador?accion=modificar&idMiembro=${miembroEditar.idMiembro}"
          method="POST">
        <div class="form-group">
            <label for="nombre">Nombre:</label>
            <input type="text" name="nombre" required value="${miembroEditar.nombre}">
        </div>
        <div class="form-group">
            <label for="apellido">Apellido:</label>
            <input type="text" name="apellido" required value="${miembroEditar.apellido}">
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" name="email" required value="${miembroEditar.email}">
        </div>
        <div class="form-group">
            <label for="telefono">Telefono:</label>
            <input type="tel" name="telefono" required value="${miembroEditar.telefono}">
        </div>
        <div class="form-group">
            <label for="membresia">Membresia:</label>
            <select name="membresia" >
                <option id="Oro">Oro</option>
                <option id="Plata">Plata</option>
                <option id="Bronce">Bronce</option>
            </select>
        </div>
        <div class="div-button  block">
            <button type="submit">Guardar</button>
        </div>
    </form>
    <img src="styles/img/detallePerfil.png" class="detallePerfil">

</div>