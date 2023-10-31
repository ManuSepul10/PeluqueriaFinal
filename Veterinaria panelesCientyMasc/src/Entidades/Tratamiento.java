package Entidades;

public class Tratamiento {

    private int codigo;

    private String tipo;

    private String descripcion;

    private double precio;

    private boolean estado;

    private int idTratamiento;

    public Tratamiento() {
    }

    public Tratamiento(String tipo, String descripcion, double precio, boolean estado) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
    }

    public Tratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public Tratamiento(int tratamiento, String tipo, String descripcion, double precio, boolean estado) {
        this.idTratamiento = tratamiento;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    @Override
    public String toString() {
        return tipo + " descripcion: " + descripcion + "id: "+idTratamiento;
    }
    
}
