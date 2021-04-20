package com.chaibaazaar.service.driver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.chaibaazaar.dataaccessobject.CarRepository;
import com.chaibaazaar.domainobject.CarDO;
import java.util.List;


@Service
public class CarService {
	
	private static final Logger LOG = LoggerFactory.getLogger(CarService.class);
	private CarRepository repo;
	
	public CarDO  saveCardata(CarDO carDO) {
		return repo.save(carDO);
	}
	
	public List<CarDO>  getCarsdata() {
		return (List<CarDO>) repo.findAll();
	}
	
	public List<CarDO>  getbyrating(float rat) {
		return repo.findByrating(rat);
	}
	
	public List<CarDO>  getbytype(String type) {
		return repo.findBytype(type);
	}
	
	public List<CarDO>  getbyseat(int count) {
		return repo.findByseat(count);
	}
	
	public String  deleteCar(Long id) {
		repo.deleteById(id);
		return "Car with id" +id+ "Removed";
	}
}
