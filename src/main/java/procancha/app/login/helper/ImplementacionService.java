package procancha.app.login.helper;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import procancha.app.login.entity.Usuario;
import procancha.app.login.repository.UsuarioRepository;
import procancha.app.login.util.ResponseMessage;

@Component
public class ImplementacionService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	/*************** busco usuario por rut ****************/
	
	public ResponseEntity<ResponseMessage> findByRut(String rut) {
		ResponseMessage responseMessage = new ResponseMessage();
		try {	
			List<Usuario> usuario= usuarioRepository.findByRut(rut);
			String mensaje = "";
			if (usuario.isEmpty())  {
				mensaje = "Usuario no pertenece al sistema";
			} else  {
				mensaje = "Bienvenido "+ usuario.get(0).getRol().getDescripcion();
			}
	        responseMessage.setcode(1);
	        responseMessage.addMessage(mensaje);
	        
	        return ResponseEntity.status(HttpStatus.OK).body(responseMessage);
			
		}catch(Exception e) {
			e.printStackTrace();
			String mensajeError = "Error: " + e.getMessage() + e.getLocalizedMessage();
	        responseMessage.addMessage(mensajeError);
	        responseMessage.setcode(3);
			return ResponseEntity.status(200).body(responseMessage);
		}
	}

}
