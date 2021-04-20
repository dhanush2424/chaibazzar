package com.chaibaazaar.dataaccessobject;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chaibaazaar.domainobject.CarDO;
import com.chaibaazaar.domainobject.DriverDO;

public interface CarRepository extends CrudRepository<CarDO, Long>{

	List<CarDO> findByrating(float rat);

	List<CarDO> findBytype(String type);

	List<CarDO> findByseat(int count);

}
