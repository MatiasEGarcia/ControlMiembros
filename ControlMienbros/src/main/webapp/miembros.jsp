<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <script src="https://kit.fontawesome.com/cbb8b5b1f2.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/estilos.css">
</head>
<body>
    <div class="contenedor">
        <header class="header"> 
            <h1>CONTROL DE MIEMBROS</h1>
            <div class="botonesDeNavegacion">
            <button>Agregar Miembro</button>
            <button>Eliminar Miembro</button>
            <button>Encontrar Miembro</button>
            </div>
        </header>
        
        <jsp:include page="/WEB-INF/cliente/listaMiembros.jsp"></jsp:include>
        
        <aside class="sidebar">
            
            <div class="Panel1">
                <h2>Cantidad de Miembros</h2>
                <i class="fas fa-users"></i>

            </div>

        </aside>
        <footer class="footer">
        <h3><i class="far fa-copyright"></i>
            Material Creado por Matias.E.Garcia</h3>
        </footer>
    </div>
</body>
</html>