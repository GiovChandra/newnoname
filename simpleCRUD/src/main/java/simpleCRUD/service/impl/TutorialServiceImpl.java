package simpleCRUD.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simpleCRUD.model.Car;
import simpleCRUD.repository.TutorialRepository;
import simpleCRUD.service.TutorialService;

@Service
public class TutorialServiceImpl implements TutorialService{
	
	@Autowired
	TutorialRepository tutorialRepository;
	
	public Car save(Car car){
		return tutorialRepository.save(car);
	}
	
	public Car getByBrand(String brand){
		return tutorialRepository.findByBrand(brand);
	}
	
	public Car getByAllAtt(String brand, String type, int cc){
		return tutorialRepository.findByBrandAndTypeAndCc(brand, type, cc);
	}
	
	public List<Car> getAll(){
		return tutorialRepository.findAll();
	}
}
