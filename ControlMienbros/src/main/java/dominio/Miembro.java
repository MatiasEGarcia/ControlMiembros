
package dominio;

public class Miembro {
    
    private int idMiembro;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String membresia;
    
    public Miembro(){
    }
    
    public Miembro(int idMiembro){
        this.idMiembro=idMiembro;
    }
    
    public Miembro(String nombre, String apellido, String telefono, String email, String membresia){
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.email=email;
        this.membresia=membresia;
    }
    
    public Miembro(int idMiembro, String nombre, String apellido, String telefono, String email, String membresia){
        this.idMiembro=idMiembro;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.email=email;
        this.membresia=membresia;
    }
    
    public int getIdMiembro(){
        return idMiembro;
    }
    public void setIdmiembro(String idMiento){
        this.idMiembro=idMiembro;
    }
    
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    
    public String getTelefono(){
        return telefono;
    }   
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    
    
    public String getMembresia(){
        return membresia;
    }
    public void setMembresia(String membresia){
        this.membresia= membresia;
    }

    @Override
    public String toString() {
        return "miembro{" + "idMiembro=" + idMiembro + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", email=" + email + ", membresia=" + membresia + '}';
    }
    
    
}
