let modal=document.getElementById('miModal');
let flex=document.getElementById("miFlex");
let agregar=document.getElementById("agregarMiembro");
let cerrar=document.getElementById("cerrar");

agregar.addEventListener('click',function(){
    modal.style.display="block";
});

cerrar.addEventListener('click',function(){
    modal.style.display="none";
});

window.addEventListener('click',function(e){
    if(e.target == flex){
        modal.style.display="none";
    }

});

