package grupo.qq.model;
// Generated 06-19-2018 05:50:15 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * RequerimientoEnderezadoPintura generated by hbm2java
 */
public class RequerimientoEnderezadoPintura  implements java.io.Serializable {


     private Integer id;
     private Automovil automovil;
     private Mecanico mecanico;
     private String descripcion;
     private Date fechaIni;
     private Date fechaFin;
     private Double totalPinturaEnderezado;
     private Integer idMecanico;
     private Integer idAutomovil;
     private Set<Enderezado> enderezados = new HashSet<Enderezado>(0);
     private Set<Pintura> pinturas = new HashSet<Pintura>(0);
     private Set<Bitacora> bitacoras = new HashSet<Bitacora>(0);

    public RequerimientoEnderezadoPintura() {
    }

	
    public RequerimientoEnderezadoPintura(Automovil automovil, Mecanico mecanico) {
        this.automovil = automovil;
        this.mecanico = mecanico;
    }
    public RequerimientoEnderezadoPintura(Automovil automovil, Mecanico mecanico, String descripcion, Date fechaIni, Date fechaFin, Double totalPinturaEnderezado, Integer idMecanico, Integer idAutomovil, Set<Enderezado> enderezados, Set<Pintura> pinturas, Set<Bitacora> bitacoras) {
       this.automovil = automovil;
       this.mecanico = mecanico;
       this.descripcion = descripcion;
       this.fechaIni = fechaIni;
       this.fechaFin = fechaFin;
       this.totalPinturaEnderezado = totalPinturaEnderezado;
       this.idMecanico = idMecanico;
       this.idAutomovil = idAutomovil;
       this.enderezados = enderezados;
       this.pinturas = pinturas;
       this.bitacoras = bitacoras;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Automovil getAutomovil() {
        return this.automovil;
    }
    
    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }
    public Mecanico getMecanico() {
        return this.mecanico;
    }
    
    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFechaIni() {
        return this.fechaIni;
    }
    
    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    public Double getTotalPinturaEnderezado() {
        return this.totalPinturaEnderezado;
    }
    
    public void setTotalPinturaEnderezado(Double totalPinturaEnderezado) {
        this.totalPinturaEnderezado = totalPinturaEnderezado;
    }
    public Integer getIdMecanico() {
        return this.idMecanico;
    }
    
    public void setIdMecanico(Integer idMecanico) {
        this.idMecanico = idMecanico;
    }
    public Integer getIdAutomovil() {
        return this.idAutomovil;
    }
    
    public void setIdAutomovil(Integer idAutomovil) {
        this.idAutomovil = idAutomovil;
    }
    public Set<Enderezado> getEnderezados() {
        return this.enderezados;
    }
    
    public void setEnderezados(Set<Enderezado> enderezados) {
        this.enderezados = enderezados;
    }
    public Set<Pintura> getPinturas() {
        return this.pinturas;
    }
    
    public void setPinturas(Set<Pintura> pinturas) {
        this.pinturas = pinturas;
    }
    public Set<Bitacora> getBitacoras() {
        return this.bitacoras;
    }
    
    public void setBitacoras(Set<Bitacora> bitacoras) {
        this.bitacoras = bitacoras;
    }




}

