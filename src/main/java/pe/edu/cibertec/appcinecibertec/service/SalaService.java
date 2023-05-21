package pe.edu.cibertec.appcinecibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.appcinecibertec.model.bd.Sala;
import pe.edu.cibertec.appcinecibertec.repository.SalaRepository;

@Service
public class SalaService {

	@Autowired
	private SalaRepository salaRepository;
	
	//listar
	public List<Sala> listarSala(){
		return salaRepository.findAll();
	}
	
	//registrar
	public void registrarSala(Sala sala){
		salaRepository.save(sala);
	}
	
	//eliminar
	public void eliminarSala(Integer idsala) {
		salaRepository.deleteById(idsala);
	}

}
