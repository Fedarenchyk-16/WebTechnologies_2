package by.bsuir.webTech2.service;

import java.util.List;

import by.bsuir.webTech2.entity.Appliance;
import by.bsuir.webTech2.entity.criteria.Criteria;

/**
 * Appliance service API
 *
 * @author Nikita Fedarenchyk
 * @version 1.0
 */
public interface ApplianceService {
	/**
	 * Searches for the specified criteria
	 * 
	 * @param criteria search criterias
	 * @return List of appliance
	 */
	List<Appliance> find(Criteria criteria);

	/**
	 * Sorts the list of appliance by price
	 * 
	 * @return List of appliance
	 */
	List<Appliance> sortByPrice();
}
