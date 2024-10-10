package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_empleado database table.
 * 
 */
@Entity
@Table(name="tbl_empleado")
@NamedQuery(name="TblEmpleado.findAll", query="SELECT t FROM TblEmpleado t")
public class TblEmpleado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idempleado;

	private String apeempleado;

	private String dniempleado;

	private String emailempleado;

	private String nomempleado;

	private String telfempleado;

	public TblEmpleado() {
	}

	public int getIdempleado() {
		return this.idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public String getApeempleado() {
		return this.apeempleado;
	}

	public void setApeempleado(String apeempleado) {
		this.apeempleado = apeempleado;
	}

	public String getDniempleado() {
		return this.dniempleado;
	}

	public void setDniempleado(String dniempleado) {
		this.dniempleado = dniempleado;
	}

	public String getEmailempleado() {
		return this.emailempleado;
	}

	public void setEmailempleado(String emailempleado) {
		this.emailempleado = emailempleado;
	}

	public String getNomempleado() {
		return this.nomempleado;
	}

	public void setNomempleado(String nomempleado) {
		this.nomempleado = nomempleado;
	}

	public String getTelfempleado() {
		return this.telfempleado;
	}

	public void setTelfempleado(String telfempleado) {
		this.telfempleado = telfempleado;
	}

}