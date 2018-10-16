package procancha.app.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import procancha.app.login.entity.Usuario;
import procancha.app.login.helper.ImplementacionService;
import procancha.app.login.mappers.UsuariosMapper;
import procancha.app.login.util.ResponseMessage;



@Controller
@RequestMapping(path = "/usuarios")
public class UsuarioController {

	@Autowired
	ImplementacionService implementacionService;
	@Autowired
	UsuariosMapper usuariosMapper;
//	@Autowired
//	UsuarioRepository usuarioRepository;
	
	@CrossOrigin
	@PostMapping(path = "/findByRut")
	public @ResponseBody Usuario findByRut(@RequestBody String rut) { 
		return implementacionService.findByRut(rut);
	}	
	
//	@CrossOrigin
//	@PostMapping(path = "/findByRut")
//	public @ResponseBody Usuario findByRut(@RequestBody String rut) { 
//		return usuariosMapper.findByRut(rut);
//	}	
	
	//Requerimiento extra para ver todos los usuarios de la BD
//	@CrossOrigin
//	@GetMapping(path = "/findAll")
//	public @ResponseBody List<Usuario> findAll() {
//		return usuarioRepository.findAll();
//	}
//	
}
