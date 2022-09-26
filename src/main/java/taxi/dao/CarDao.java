package taxi.dao;

import taxi.model.Car;

import java.util.List;

public interface CarDao extends GenericDao<Car> {
    List<Car> getAllByDriver(Long driverId);
}
