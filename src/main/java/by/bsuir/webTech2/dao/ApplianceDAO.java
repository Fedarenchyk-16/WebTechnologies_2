package by.bsuir.webTech2.dao;

import by.bsuir.webTech2.entity.Appliance;
import by.bsuir.webTech2.entity.criteria.Criteria;
import java.util.List;

/**
 * DAO API
 *
 * @author Nikita Fedarenchyk
 * @version 1.0
 */
public interface ApplianceDAO {
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
