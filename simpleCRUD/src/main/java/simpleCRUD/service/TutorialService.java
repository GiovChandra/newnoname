package simpleCRUD.service;

import java.util.List;

import simpleCRUD.model.Car;

public interface TutorialService {

	public Car save(Car car);
	
	public Car getByBrand(String brand);
	
	public Car getByAllAtt(String brand, String type, int cc);
	
	public List<Car> getAll();
}
