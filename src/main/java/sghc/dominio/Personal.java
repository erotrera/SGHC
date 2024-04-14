
package sghc.dominio;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author darioc
 */
@Entity
@NamedQueries({
    @NamedQuery(name="Personal.buscarTodo",query="SELECT p FROM Personal p ORDER BY p.codPersonal")
})
@Table(name="personal")
public class Personal implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="cod_personal")
    private int codPersonal;
    
    private int dni;
    private String nombres;
    private String apellidos;    
    @Column(name="fecha_nacimiento")
    private Date fechaNacimiento;
    
    private int genero;
    private String domicilio;    
    @Column(name="cod_localidad", nullable=true)
    private Integer codLocalidad;    
    @Column(name="codigo_postal", nullable=true)
    private String codPostal;    
    private String nacionalidad;    
    @Column(name="estado_civil")
    private int estadoCivil;
    @Column(name="numero_telefono", nullable=true)
    private String numTelefono;
    @Column(name="correo_electronico", nullable=true)
    private String correoElectronico;
    private long cuil;
    private int estado;
    
    public Personal(){}

    public Personal(int dni, String nombres, String apellidos, Date fechaNacimiento, int genero, String domicilio, String codPostal, String nacionalidad, int estadoCivil, String numTelefono, String correoElectronico, long cuil) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.domicilio = domicilio;
        //this.codLocalidad = codLocalidad;
        this.codLocalidad=null;
        this.codPostal = codPostal;
        this.nacionalidad = nacionalidad;
        this.estadoCivil = estadoCivil;
        this.numTelefono = numTelefono;
        this.correoElectronico = correoElectronico;
        this.cuil = cuil;        
    }

    public int getCodPersonal() {
        return codPersonal;
    }

    
    public int getDni() {
        return dni;
    }

    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getCodLocalidad() {
        return codLocalidad;
    }

    public void setCodLocalidad(int codLocalidad) {
        this.codLocalidad = codLocalidad;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNumTelefonico() {
        return numTelefono;
    }

    public void setNumTelefonico(String numTelefonico) {
        this.numTelefono = numTelefonico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public long getCuil() {
        return cuil;
    }

    public void setCuil(long cuil) {
        this.cuil = cuil;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Personal{" + "codPersonal=" + codPersonal + ", dni=" + dni + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + ", domicilio=" + domicilio + ", codLocalidad=" + codLocalidad + ", codPostal=" + codPostal + ", nacionalidad=" + nacionalidad + ", estadoCivil=" + estadoCivil + ", numTelefono=" + numTelefono + ", correoElectronico=" + correoElectronico + ", cuil=" + cuil + ", estado=" + estado + '}';
    }
    
    
    
    
    
}
