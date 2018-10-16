package procancha.app.login.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import procancha.app.login.entity.Usuario;
import procancha.app.login.mappers.UsuariosMapper;
import procancha.app.login.util.ResponseMessage;

@Component
public class ImplementacionService {
	
//	@Autowired
//	UsuarioRepository usuarioRepository;
	@Autowired
	UsuariosMapper usuariosMapper;
	
	/*************** busco usuario por rut ****************/
	
	public Usuario findByRut(String rut) {
		ResponseMessage responseMessage = new ResponseMessage();
		try {	
			Usuario usuario= usuariosMapper.findByRut(rut);
//			String mensaje = "";
//			if (usuario == null)  {
//				mensaje = "Usuario no pertenece al sistema";
//			} else  {
////				mensaje = "Bienvenido "+ usuario.getRol().getDescripcion();
//			}
//	        responseMessage.setcode(1);
//	        responseMessage.addMessage(mensaje);
	        
//	        return ResponseEntity.status(HttpStatus.OK).body(responseMessage);
			
			return usuario;
			
		}catch(Exception e) {
			e.printStackTrace();
			String mensajeError = "Error: " + e.getMessage() + e.getLocalizedMessage();
	        responseMessage.addMessage(mensajeError);
	        responseMessage.setcode(3);
			return null;
		}
	}

}
