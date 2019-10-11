package ms3.test.repository;

import ms3.test.entity.Identification;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface IdentificationRepository extends CrudRepository<Identification, Long> {
    List<Identification> findByLastName(String lastName);
    Identification findById(long id);
}