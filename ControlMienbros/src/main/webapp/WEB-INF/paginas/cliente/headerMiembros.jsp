<div class="header">
    <h1 class="titulo">Control de Miembros</h1>
    <div class="barra">
        <ul>
            <li id="agregarMiembro" class="agregar-Miembro">
                <img src="styles/img/add-user.svg" class="icono">
                Agregar Miembro</li>
        </ul>
    </div>
</div>
<img class="imgGrupito" src="styles/img/Grupito.png">

<div id="miModal" class="modal">
    <div id="miFlex" class="flex">
        <div class="contenido-Modal">
            <div class="fondo-imagen">
                <div class="header-modal">
                    <h2>Agregar Miembro</h2>
                    <span id="cerrar" class="close">&times;</span>
                </div>
                <div class="body-modal">
                    <form action="${pageContext.request.contextPath}/ServletControlador?accion=agregar"
                          method="POST" class="form-agregar-miembro">
                        <div class="form-group">
                            <label for="nombre">Nombre:</label>
                            <input type="text" name="nombre" required>
                        </div>
                        <div class="form-group">
                            <label for="apellido">Apellido:</label>
                            <input type="text" name="apellido" required>
                        </div>
                        <div class="form-group">
                            <label for="email">Email:</label>
                            <input type="email" name="email" required>
                        </div>
                        <div class="form-group">
                            <label for="telefono">Telefono:</label>
                            <input type="tel" name="telefono" required>
                        </div>
                        <div class="form-group">
                            <label for="membresia">Membresia:</label>
                            <select name="membresia" required>
                                <option id="1">Oro</option>
                                <option id="2">Plata</option>
                                <option id="3">Bronce</option>
                            </select>
                        </div>
                        <div class="div-button">
                            <button type="submit">Guardar</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

