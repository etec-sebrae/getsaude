package br.gov.sp.etec.getsaude.service;

import org.springframework.http.ResponseEntity;

import br.gov.sp.etec.getsaude.model.Usuario;

public interface UsuarioService {

	public ResponseEntity<?> cadastroUsuario(Usuario usuario);
	
	public Usuario getByEmail(String email);
	
	public ResponseEntity<?> atualizarUsuario(Usuario usuario);

	ResponseEntity<?> atualizarUsuario(Long id);

	Usuario getById(Long id);
	

}
