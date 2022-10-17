package usa.mintic.retos.repository.crud;

import org.springframework.data.repository.CrudRepository;
import usa.mintic.retos.model.Message;

public interface MessageCrudRepository extends CrudRepository<Message,Integer> {
}
