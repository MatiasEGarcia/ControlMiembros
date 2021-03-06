<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Control de Miembros</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
    <link rel="stylesheet" href="styles/estilos.css">
</head>

<body>
    <div class="contenedor">
        
        <!--header-->
        <jsp:include page="WEB-INF/paginas/cliente/headerMiembros.jsp"></jsp:include>
        
        <!--contenido-->
        <jsp:include page="WEB-INF/paginas/cliente/contenidoMiembros.jsp"></jsp:include>
        
        <!--columna-->
        <jsp:include page="WEB-INF/paginas/cliente/columnaMiembros.jsp"></jsp:include>
        
        <!--pie-->
        <jsp:include page="WEB-INF/paginas/comunes/footer.jsp"></jsp:include>
            
    </div>
        <script src="script/main.js"></script>
</body>
</html>