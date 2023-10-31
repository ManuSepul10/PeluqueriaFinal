package Entidades;

public class Cliente {

    private int documento;

    private String nombre;

    private String apellido;

    private String direccion;

    private String telefono;

    private String personaAlternativa;

    private int idCliente;


    
    public Cliente() {
    }

    public Cliente(int documento, String nombre, String apellido, String direccion, String telefono, String personaAlternativa, int idCliente) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.personaAlternativa = personaAlternativa;
        this.idCliente = idCliente;
  
    }



    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPersonaAlternativa() {
        return personaAlternativa;
    }

    public void setPersonaAlternativa(String personaAlternativa) {
        this.personaAlternativa = personaAlternativa;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }


    @Override
    public String toString() {
        return "Cliente{" + "documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", personaAlternativa=" + personaAlternativa + '}';
    }
    
    
    
    
}
