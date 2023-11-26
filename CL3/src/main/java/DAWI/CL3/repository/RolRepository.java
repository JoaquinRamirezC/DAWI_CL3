package DAWI.CL3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import DAWI.CL3.model.bd.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol,
        Integer> {

    Rol findByNomrol(String nomrol);

}

