package inf332springway.comidaboteco.repository;

import inf332springway.comidaboteco.model.Restaraunt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RepositoryRestResource
@EnableSwagger2
public interface RestaurantRepository extends JpaRepository<Restaraunt, Long>{
}
