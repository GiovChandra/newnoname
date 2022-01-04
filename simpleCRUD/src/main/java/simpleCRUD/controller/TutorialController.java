package simpleCRUD.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import simpleCRUD.model.Car;
import simpleCRUD.model.Request;
import simpleCRUD.service.TutorialService;

@Controller
public class TutorialController {
	
	@Autowired
	TutorialService tutorialService;
	
	@GetMapping("/list")
	public ResponseEntity<Request> list(@RequestBody Request req){
		
		for(Car car : req.getCars()){
			tutorialService.save(car);
		}
		
		return new ResponseEntity<Request>(req, HttpStatus.OK);
	}
	
	@GetMapping("/getCar/{brand}")
	public ResponseEntity<Car> getCar(@PathVariable(name="brand") String brand){
		
		Car car = new Car();
		
		car = tutorialService.getByBrand(brand);
		
		return new ResponseEntity<Car>(car, HttpStatus.OK);

	}
	
	@GetMapping("/getCar/{brand}/{type}/{cc}")
	public ResponseEntity<Car> getCar(@PathVariable(name="brand") String brand,
			@PathVariable(name="type") String type,
			@PathVariable(name="cc") int cc){
		
		Car car = new Car();
		
		car = tutorialService.getByAllAtt(brand, type, cc);
		
		return new ResponseEntity<Car>(car, HttpStatus.OK);

	}
	@GetMapping("/getAll")
	public ResponseEntity<List<Car>> getAll(){
		
		List<Car> car = new ArrayList<Car>();
		
		car = tutorialService.getAll();
		
		return new ResponseEntity<List<Car>>(car, HttpStatus.OK);

	}
	
}
