
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.microservice.Entity.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
