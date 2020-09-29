
package dominio;

public class Miembro {
    
    int idMiembro;
    String nombre;
    String apellido;
    String telefono;
    String email;
    String tMembresia;
    
    public Miembro(){
        
    }
    
    public Miembro(int idMiembro){
        this.idMiembro=idMiembro;
    }
    
    public Miembro(String nombre, String apellido, String telefono, String email, String tMembresia){
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.email=email;
        this.tMembresia=tMembresia;
    }
    
    public Miembro(int idMiembro, String nombre, String apellido, String telefono, String email, String tMembresia){
        this.idMiembro=idMiembro;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.email=email;
        this.tMembresia=tMembresia;
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
    
    
    public String getTMembresia(){
        return tMembresia;
    }
    public void setTMembresia(String tMembresia){
        this.tMembresia= tMembresia;
    }

    @Override
    public String toString() {
        return "miembro{" + "idMiembro=" + idMiembro + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", email=" + email + ", tMembresia=" + tMembresia + '}';
    }
    
    
}
