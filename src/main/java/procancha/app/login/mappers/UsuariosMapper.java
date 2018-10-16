package procancha.app.login.mappers;

import org.apache.ibatis.annotations.Param;

import procancha.app.login.entity.Usuario;

public interface UsuariosMapper {

    Usuario findByRut(@Param("rut") String rut);
}