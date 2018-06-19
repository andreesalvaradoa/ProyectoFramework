package grupo.qq.model;
// Generated 06-19-2018 05:50:15 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * RequerimientoExpress generated by hbm2java
 */
public class RequerimientoExpress  implements java.io.Serializable {


     private Integer id;
     private Automovil automovil;
     private Mecanico mecanico;
     private String descripcion;
     private Date fechaIni;
     private Date fechaFin;
     private Double totalExpress;
     private Integer idMecanico;
     private Integer idAutomovil;
     private Set<Bitacora> bitacoras = new HashSet<Bitacora>(0);
     private Set<Solucion> solucions = new HashSet<Solucion>(0);
     private Set<Piezas> piezases = new HashSet<Piezas>(0);
     private Set<Filtro> filtros = new HashSet<Filtro>(0);
     private Set<Aceites> aceiteses = new HashSet<Aceites>(0);

    public RequerimientoExpress() {
    }

	
    public RequerimientoExpress(Automovil automovil, Mecanico mecanico) {
        this.automovil = automovil;
        this.mecanico = mecanico;
    }
    public RequerimientoExpress(Automovil automovil, Mecanico mecanico, String descripcion, Date fechaIni, Date fechaFin, Double totalExpress, Integer idMecanico, Integer idAutomovil, Set<Bitacora> bitacoras, Set<Solucion> solucions, Set<Piezas> piezases, Set<Filtro> filtros, Set<Aceites> aceiteses) {
       this.automovil = automovil;
       this.mecanico = mecanico;
       this.descripcion = descripcion;
       this.fechaIni = fechaIni;
       this.fechaFin = fechaFin;
       this.totalExpress = totalExpress;
       this.idMecanico = idMecanico;
       this.idAutomovil = idAutomovil;
       this.bitacoras = bitacoras;
       this.solucions = solucions;
       this.piezases = piezases;
       this.filtros = filtros;
       this.aceiteses = aceiteses;
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
    public Double getTotalExpress() {
        return this.totalExpress;
    }
    
    public void setTotalExpress(Double totalExpress) {
        this.totalExpress = totalExpress;
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
    public Set<Bitacora> getBitacoras() {
        return this.bitacoras;
    }
    
    public void setBitacoras(Set<Bitacora> bitacoras) {
        this.bitacoras = bitacoras;
    }
    public Set<Solucion> getSolucions() {
        return this.solucions;
    }
    
    public void setSolucions(Set<Solucion> solucions) {
        this.solucions = solucions;
    }
    public Set<Piezas> getPiezases() {
        return this.piezases;
    }
    
    public void setPiezases(Set<Piezas> piezases) {
        this.piezases = piezases;
    }
    public Set<Filtro> getFiltros() {
        return this.filtros;
    }
    
    public void setFiltros(Set<Filtro> filtros) {
        this.filtros = filtros;
    }
    public Set<Aceites> getAceiteses() {
        return this.aceiteses;
    }
    
    public void setAceiteses(Set<Aceites> aceiteses) {
        this.aceiteses = aceiteses;
    }




}

