package DAWI.CL3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import DAWI.CL3.model.bd.Usuario;

import java.util.List;

@Repository
public interface UsuarioRepository extends
        JpaRepository<Usuario, Integer>
{
    Usuario findByNomusuario(String nomusuario);
}
