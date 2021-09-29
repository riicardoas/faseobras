package repositories;

import com.faseobras.inicio.model.FaseDeObras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FaseDeObrasRepository extends JpaRepository<FaseDeObras, Integer> {


}
