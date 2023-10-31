package Entidades;

import java.util.Date;

public class Mascota {
    private int idMascota;
    private int idCliente;
    
    private String alias;
    private String sexo;
    private String especie;
    private String raza;
    private String colorPelo;
    private Date fechaNacimiento;
    private double pesoActual;

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    // Constructor

    public Mascota(int idMascota, int idCliente, String alias, String sexo, String especie, String raza, String colorPelo, Date fechaNacimiento, double pesoActual) {
        this.idMascota = idMascota;
        this.idCliente = idCliente;
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fechaNacimiento = fechaNacimiento;
        this.pesoActual = pesoActual;
    }

    public Mascota() {
    }
    

    @Override
    public String toString() {
        return  alias + " " + especie + " raza: " + raza + " " +sexo;
    }
}
