package repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Shopper;



@Repository
public interface ShopperRepository extends CrudRepository<Shopper, Long> {

}
