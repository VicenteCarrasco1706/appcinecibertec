package pe.edu.cibertec.appcinecibertec.model.bd;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "estado")
public class Estado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idestado;
	
	@Column(name= "descestado")
	private String descestado;
	
	//opcional
	
	/*@OneToMany(mappedBy = "estado", cascade =  CascadeType.ALL, orphanRemoval = true)
	private List<Sala> salaList;*/
	
}
