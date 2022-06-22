package br.gov.sp.etec.getsaude.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import br.gov.sp.etec.getsaude.model.Usuario;
import br.gov.sp.etec.getsaude.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;

	@Override
	public ResponseEntity<Usuario> cadastroUsuario(Usuario usuario) {
		Usuario retorno =     repository.save(usuario);
		return ResponseEntity.ok(retorno);
	}

	@Override
	public Usuario getByEmail(String email) {
		return repository.findByEmail(email);
		
	}

	@Override
	public ResponseEntity<?> atualizarUsuario(Usuario usuario) {
		Usuario retorno =     repository.save(usuario);
		return ResponseEntity.ok(retorno);	

}

	@Override
	public ResponseEntity<?> atualizarUsuario(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
