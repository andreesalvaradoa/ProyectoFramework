package grupo.qq.model;
// Generated 06-19-2018 05:50:15 PM by Hibernate Tools 4.3.1



/**
 * Solucion generated by hbm2java
 */
public class Solucion  implements java.io.Serializable {


     private Integer id;
     private RequerimientoExpress requerimientoExpress;
     private String typeSolucion;
     private String descripcion;
     private Double montoLiquido;
     private Integer idTallerExpress;

    public Solucion() {
    }

	
    public Solucion(RequerimientoExpress requerimientoExpress, String typeSolucion) {
        this.requerimientoExpress = requerimientoExpress;
        this.typeSolucion = typeSolucion;
    }
    public Solucion(RequerimientoExpress requerimientoExpress, String typeSolucion, String descripcion, Double montoLiquido, Integer idTallerExpress) {
       this.requerimientoExpress = requerimientoExpress;
       this.typeSolucion = typeSolucion;
       this.descripcion = descripcion;
       this.montoLiquido = montoLiquido;
       this.idTallerExpress = idTallerExpress;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public RequerimientoExpress getRequerimientoExpress() {
        return this.requerimientoExpress;
    }
    
    public void setRequerimientoExpress(RequerimientoExpress requerimientoExpress) {
        this.requerimientoExpress = requerimientoExpress;
    }
    public String getTypeSolucion() {
        return this.typeSolucion;
    }
    
    public void setTypeSolucion(String typeSolucion) {
        this.typeSolucion = typeSolucion;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Double getMontoLiquido() {
        return this.montoLiquido;
    }
    
    public void setMontoLiquido(Double montoLiquido) {
        this.montoLiquido = montoLiquido;
    }
    public Integer getIdTallerExpress() {
        return this.idTallerExpress;
    }
    
    public void setIdTallerExpress(Integer idTallerExpress) {
        this.idTallerExpress = idTallerExpress;
    }




}


