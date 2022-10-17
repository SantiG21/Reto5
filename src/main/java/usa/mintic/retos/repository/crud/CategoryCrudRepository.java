package usa.mintic.retos.repository.crud;

import org.springframework.data.repository.CrudRepository;
import usa.mintic.retos.model.Category;

public interface CategoryCrudRepository extends CrudRepository<Category,Integer> {
}
