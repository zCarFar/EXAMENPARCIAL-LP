package upeu.edu.pe.Dao;

import java.util.List;
import java.util.Map;

public interface Todo {
	
	List<Map<String, Object>> readEmployeesByRegion();
	List<Map<String, Object>> readCustomersByTerritory();
	List<Map<String, Object>> readOrdersByCity();

}
