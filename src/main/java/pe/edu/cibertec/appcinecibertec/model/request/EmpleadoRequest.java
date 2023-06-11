package pe.edu.cibertec.appcinecibertec.model.request;

import lombok.Data;

@Data
public class EmpleadoRequest {

	private Integer idempleado;
	private String nombre;
	private String apellido;
	private String fechacontract;
	private Integer idestado;
}
