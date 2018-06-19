package grupo.qq.model;
// Generated 06-19-2018 05:50:15 PM by Hibernate Tools 4.3.1



/**
 * Enderezado generated by hbm2java
 */
public class Enderezado  implements java.io.Serializable {


     private Integer id;
     private RequerimientoEnderezadoPintura requerimientoEnderezadoPintura;
     private String partes;
     private String descripcion;
     private Double montoEnderezado;
     private Integer idPinturaenderezado;

    public Enderezado() {
    }

	
    public Enderezado(RequerimientoEnderezadoPintura requerimientoEnderezadoPintura) {
        this.requerimientoEnderezadoPintura = requerimientoEnderezadoPintura;
    }
    public Enderezado(RequerimientoEnderezadoPintura requerimientoEnderezadoPintura, String partes, String descripcion, Double montoEnderezado, Integer idPinturaenderezado) {
       this.requerimientoEnderezadoPintura = requerimientoEnderezadoPintura;
       this.partes = partes;
       this.descripcion = descripcion;
       this.montoEnderezado = montoEnderezado;
       this.idPinturaenderezado = idPinturaenderezado;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public RequerimientoEnderezadoPintura getRequerimientoEnderezadoPintura() {
        return this.requerimientoEnderezadoPintura;
    }
    
    public void setRequerimientoEnderezadoPintura(RequerimientoEnderezadoPintura requerimientoEnderezadoPintura) {
        this.requerimientoEnderezadoPintura = requerimientoEnderezadoPintura;
    }
    public String getPartes() {
        return this.partes;
    }
    
    public void setPartes(String partes) {
        this.partes = partes;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Double getMontoEnderezado() {
        return this.montoEnderezado;
    }
    
    public void setMontoEnderezado(Double montoEnderezado) {
        this.montoEnderezado = montoEnderezado;
    }
    public Integer getIdPinturaenderezado() {
        return this.idPinturaenderezado;
    }
    
    public void setIdPinturaenderezado(Integer idPinturaenderezado) {
        this.idPinturaenderezado = idPinturaenderezado;
    }




}

