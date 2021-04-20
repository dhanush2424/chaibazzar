package com.chaibaazaar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chaibaazaar.domainobject.CarDO;
import com.chaibaazaar.service.driver.CarService;

@RestController
@RequestMapping("v1/cars")
public class CarController {
	
	@Autowired
	private CarService carService;
	
	@PostMapping("/addcar")
	public CarDO addCarDO(@RequestBody CarDO carDO) {
		return carService.saveCardata(carDO);
	}

	@GetMapping("/cars")
	public List<CarDO> getCarsDO() {
		return carService.getCarsdata();
	}

	@GetMapping("/car/{rat}")
	public List<CarDO> getsCarsDOByrating(@PathVariable float rat) {
		return carService.getbyrating(rat);
	}

	@GetMapping("/car/{type}")
	public List<CarDO> getsCarsDOBytype( @PathVariable String type) {
		return carService.getbytype(type);
	}
	
	@GetMapping("/car/{count}")
	public List<CarDO> getsCarsDOByseat(@PathVariable int count) {
		return carService.getbyseat(count);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleted(@PathVariable Long id) {
		return carService.deleteCar(id);
	}
}
