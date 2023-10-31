package Entidades;

import java.time.LocalDate;
import java.util.Date;

public class Visita {

    private Mascota mascota;

   

    private double pesoPromedio;

    private String detalles;

    private Date fechaVisita;

    private double precioVisita;
    private double precioTRatamiento;
    private double precioTotal;

    private String FormaPago;

    private double peso;

    public Visita() {
    }

    public Visita(double pesoPromedio, String detalles, Date fechaVisita, double precioVisita, double precioTRatamiento, double precioTotal, String FormaPago, double peso) {
        this.pesoPromedio = pesoPromedio;
        this.detalles = detalles;
        this.fechaVisita = fechaVisita;
        this.precioVisita = precioVisita;
        this.precioTRatamiento = precioTRatamiento;
        this.precioTotal = precioTotal;
        this.FormaPago = FormaPago;
        this.peso = peso;
    }

    public Visita(Mascota mascota, double pesoPromedio, String detalles, Date fechaVisita, double precioVisita, double precioTRatamiento, double precioTotal, String FormaPago, double peso) {
        this.mascota = mascota;
        this.pesoPromedio = pesoPromedio;
        this.detalles = detalles;
        this.fechaVisita = fechaVisita;
        this.precioVisita = precioVisita;
        this.precioTRatamiento = precioTRatamiento;
        this.precioTotal = precioTotal;
        this.FormaPago = FormaPago;
        this.peso = peso;
    }

    public double getPrecioTRatamiento() {
        return precioTRatamiento;
    }

    public void setPrecioTRatamiento(double precioTRatamiento) {
        this.precioTRatamiento = precioTRatamiento;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }


    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }


 
    

    public double getPesoPromedio() {
        return pesoPromedio;
    }

    public void setPesoPromedio(double pesoPromedio) {
        this.pesoPromedio = pesoPromedio;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Date getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public double getPrecioVisita() {
        return precioVisita;
    }

    public void setPrecioVisita(double precioVisita) {
        this.precioVisita = precioVisita;
    }

    public String getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(String FormaPago) {
        this.FormaPago = FormaPago;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Visita{" + "mascota=" + mascota + ", pesoPromedio=" + pesoPromedio + ", detalles=" + detalles + ", fechaVisita=" + fechaVisita + ", precioVisita=" + precioVisita + ", FormaPago=" + FormaPago + ", peso=" + peso + '}';
    }
    
    
    
}
