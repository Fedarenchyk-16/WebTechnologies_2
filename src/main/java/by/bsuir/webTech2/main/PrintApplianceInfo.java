package by.bsuir.webTech2.main;

import by.bsuir.webTech2.entity.Appliance;
import java.util.List;

/**
 * Class which print appliance info
 *
 * @author Nikita Fedarenchyk
 * @version 1.0
 */
public class PrintApplianceInfo {

	/**
	 * Print list of appliances
	 * 
	 * @param appliances list of appliances
	 */
	public static void print(List<Appliance> appliances) {
		if (appliances != null) {
			System.out.println("Devices:");
			for (Appliance appliance : appliances) {
				System.out.println(appliance);
			}
			System.out.println("---------------------------------------------------------------------------------");
		} else {
			System.out.println("There are no devices that meet the requirements");
		}
	}

	/**
	 * Print a single appliance
	 * 
	 * @param appliance appliance
	 */
	public static void print(Appliance appliance) {
		if (appliance != null) {
			System.out.println("Devices:");
			System.out.println(appliance);
			System.out.println("---------------------------------------------------------------------------------");
		} else {
			System.out.println("Nothing found");
		}
	}
}
