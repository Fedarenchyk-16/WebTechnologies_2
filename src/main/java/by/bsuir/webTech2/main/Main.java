package by.bsuir.webTech2.main;

import static by.bsuir.webTech2.entity.criteria.SearchCriteria.*;

import java.util.List;

import by.bsuir.webTech2.entity.Appliance;
import by.bsuir.webTech2.entity.criteria.Criteria;
import by.bsuir.webTech2.service.ApplianceService;
import by.bsuir.webTech2.service.ServiceFactory;

public class Main {

	public static void main(String[] args) {
		List<Appliance> appliances;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		Criteria criteria = new Criteria(Teapot.class.getSimpleName());
		appliances = service.find(criteria);
		PrintApplianceInfo.print(appliances);

		criteria = new Criteria(Laptop.class.getSimpleName());
		criteria.add(Laptop.OS.toString(), "Linux");
		appliances = service.find(criteria);
		PrintApplianceInfo.print(appliances);

		criteria = new Criteria(TabletPC.class.getSimpleName());
		criteria.add(TabletPC.COLOR.toString(), "red");
		criteria.add(TabletPC.DISPLAY_INCHES.toString(), 15.0);
		criteria.add(TabletPC.MEMORY_ROM.toString(), 8000);
		appliances = service.find(criteria);
		PrintApplianceInfo.print(appliances);

		criteria = new Criteria(VacuumCleaner.class.getSimpleName());
		appliances = service.find(criteria);
		PrintApplianceInfo.print(appliances);

		criteria = new Criteria(Refrigerator.class.getSimpleName());
		criteria.add(Refrigerator.FREEZER_CAPACITY.toString(), 40);
		appliances = service.find(criteria);
		PrintApplianceInfo.print(appliances);
	}

}
