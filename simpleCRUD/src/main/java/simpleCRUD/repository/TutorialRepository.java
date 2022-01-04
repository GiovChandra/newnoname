package simpleCRUD.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import simpleCRUD.model.Car;

@Repository
public interface TutorialRepository extends JpaRepository<Car, Long>{
	
	//findBy = Select * from Car where brand = ?1
	public Car findByBrand(String brand);
	
	@Query(value="select c from Car c where c.brand = ?1 and c.type = ?2")
	public Car getCarWithBrandAndType(String brand, String type);
	
	@Query(value="select c from Car c where c.brand = :brandss and c.type = :typeeee and c.cc = :ccccc" )
	public Car getCarWithBrandAndTypeAndCc(@Param("brandss") String brand,@Param("typeeee") String type, @Param("ccccc") int cc);
	
	@Query(value="update from car set brand = ?1 where type= ?2 and cc= ?3", nativeQuery = true)
	public Car findByBrandAndTypeAndCc(String brand, String type, int cc);
	
	public List<Car> findByBrandOrderByType(String brand);

	
	

}
