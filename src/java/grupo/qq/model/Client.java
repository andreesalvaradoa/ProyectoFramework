package grupo.qq.model;
// Generated 06-19-2018 05:50:15 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Client generated by hbm2java
 */
public class Client  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String phoneNumber;
     private String direction;
     private int creditcard;
     private String email;
     private Set<Autorizacion> autorizacions = new HashSet<Autorizacion>(0);
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);
     private Set<Automovil> automovils = new HashSet<Automovil>(0);

    public Client() {
    }

	
    public Client(String name, String phoneNumber, String direction, int creditcard, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.direction = direction;
        this.creditcard = creditcard;
        this.email = email;
    }
    public Client(String name, String phoneNumber, String direction, int creditcard, String email, Set<Autorizacion> autorizacions, Set<Usuario> usuarios, Set<Automovil> automovils) {
       this.name = name;
       this.phoneNumber = phoneNumber;
       this.direction = direction;
       this.creditcard = creditcard;
       this.email = email;
       this.autorizacions = autorizacions;
       this.usuarios = usuarios;
       this.automovils = automovils;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getDirection() {
        return this.direction;
    }
    
    public void setDirection(String direction) {
        this.direction = direction;
    }
    public int getCreditcard() {
        return this.creditcard;
    }
    
    public void setCreditcard(int creditcard) {
        this.creditcard = creditcard;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set<Autorizacion> getAutorizacions() {
        return this.autorizacions;
    }
    
    public void setAutorizacions(Set<Autorizacion> autorizacions) {
        this.autorizacions = autorizacions;
    }
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public Set<Automovil> getAutomovils() {
        return this.automovils;
    }
    
    public void setAutomovils(Set<Automovil> automovils) {
        this.automovils = automovils;
    }




}


