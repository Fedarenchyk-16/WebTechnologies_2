package by.bsuir.webTech2.service;

import java.io.File;
import java.util.List;

import by.bsuir.webTech2.entity.Appliance;

/**
 * JAXB service API
 *
 * @author Nikita Fedarenchyk
 * @version 1.0
 */
public interface JAXBService {
    /**
     * Deserializes data from xml file list of appliance
     * 
     * @param file DB file
     * @return List of appliance
     */
    List<Appliance> unmarshalAppliance(File file);
}
