package br.gov.sp.etec.getsaude.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.etec.getsaude.model.Usuario;
import br.gov.sp.etec.getsaude.service.UsuarioService;


@RestController
public class UsuarioController {
	 
	@Autowired
	UsuarioService service;
	
	@PostMapping("cadastro-usuario")
	public HttpStatus cadastrarUsuario (@RequestBody Usuario usuario){
		ResponseEntity<?> retorno = service.cadastroUsuario(usuario);
		return ResponseEntity.ok(retorno).getStatusCode().CREATED;
	}
	
	@PostMapping("login-usuario")
	public ResponseEntity<?> loginUsuario(@RequestBody Usuario usuario){
		Usuario retorno = service.getByEmail(usuario.getEmail());
		if( usuario.getSenha().equals(retorno.getSenha())){
			return ResponseEntity.ok(retorno);
		}
		return ResponseEntity.ok().body(null);
		
		
	}
	
	@PostMapping("atualizar-usuario")
	public ResponseEntity atualizarUsuario (@RequestBody Usuario usuario){
		ResponseEntity<?> retorno = service.atualizarUsuario(usuario);
		return ResponseEntity.ok(retorno);
	}
	
}
