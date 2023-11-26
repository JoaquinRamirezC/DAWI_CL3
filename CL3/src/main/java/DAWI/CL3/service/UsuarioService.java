package DAWI.CL3.service;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import DAWI.CL3.model.bd.Rol;
import DAWI.CL3.model.bd.Usuario;
import DAWI.CL3.repository.UsuarioRepository;
import DAWI.CL3.repository.RolRepository;

import java.util.Arrays;
import java.util.HashSet;

@Service
@AllArgsConstructor
public class UsuarioService {
    private UsuarioRepository usuarioRepository;
    private RolRepository rolRepository;
    private BCryptPasswordEncoder bcryptPasswordEnconder
            = new BCryptPasswordEncoder();

    public Usuario saveUser(Usuario usuario){
        usuario.setPassword(
                bcryptPasswordEnconder.encode(usuario.getPassword()));
        usuario.setActivo(true);
        Rol usuarioRol = rolRepository.findByNomrol("USER");
        usuario.setRoles(new HashSet<>(Arrays.asList(usuarioRol)));
        return usuarioRepository.save(usuario);
    }

}
