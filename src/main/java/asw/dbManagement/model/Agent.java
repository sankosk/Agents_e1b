package asw.dbManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Agent")
public class Agent {

	// Id generado automáticamente para diferenciar cada uno (para mapear)
	@Id
	@GeneratedValue
	private Long id;

	// Atributos del participante
	private String name;
	private String password;
	@Column(unique = true)
	private String email;
	@Column(unique = true)
	private String DNI;
	private String location;
	private String kind;
	private int kindCode;

	/**
	 * Constructor vacío (ya que es para mapear)
	 */
	Agent() {
	}

	public Agent(String name, String password, String email, String location, String kind, int kindCode) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.location = location;
		this.kind = kind;
		this.kindCode = kindCode;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	protected void setKindCode(int kindCode) {
		this.kindCode = kindCode;
	}

	public int getKindCode() {
		return kindCode;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		this.DNI = dNI;
	}

	public String getKind() {
		// Implementar aqui la llamada al lector del CSV para que lea el tipo de agente
		return "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agent other = (Agent) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Participant [name=" + name + ", location=" + location + ", email=" + email + ", id=" + id + ", kind="
				+ kind + ", kindCode=" + kindCode + "]";
	}

}
