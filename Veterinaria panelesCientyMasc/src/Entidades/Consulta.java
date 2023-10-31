
package Entidades;

import java.util.Date;

public class Consulta {

  private double costoTotal;
  private Date FechaVisita;
  private String Tipo;
  private String Descripcion;
  private int idMascota;
  private int idtratmiento;
  private int idVisita;

    public Consulta() {
    }

    public Consulta(double costoTotal, Date FechaVisita, String Tipo, String Descripcion, int idMascota, int idtratmiento, int idVisita) {
        this.costoTotal = costoTotal;
        this.FechaVisita = FechaVisita;
        this.Tipo = Tipo;
        this.Descripcion = Descripcion;
        this.idMascota = idMascota;
        this.idtratmiento = idtratmiento;
        this.idVisita = idVisita;
    }

    public Consulta(double costoTotal, Date FechaVisita, String Tipo, String Descripcion) {
        this.costoTotal = costoTotal;
        this.FechaVisita = FechaVisita;
        this.Tipo = Tipo;
        this.Descripcion = Descripcion;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public int getIdtratmiento() {
        return idtratmiento;
    }

    public void setIdtratmiento(int idtratmiento) {
        this.idtratmiento = idtratmiento;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Date getFechaVisita() {
        return FechaVisita;
    }

    public void setFechaVisita(Date FechaVisita) {
        this.FechaVisita = FechaVisita;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "Consulta{" + "costoTotal=" + costoTotal + ", FechaVisita=" + FechaVisita + ", Tipo=" + Tipo + ", Descripcion=" + Descripcion + '}';
    }



}
