package upeu.edu.pe.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.Dao.Todo;
import upeu.edu.pe.Daoimpl.ExamenCarloDaoimpl;

@Service

public class ExamenCarloService implements Todo{
	
	@Autowired
	private ExamenCarloDaoimpl examencarlodaoimpl;

	@Override
	public List<Map<String, Object>> readEmployeesByRegion() {
		// TODO Auto-generated method stub
		return examencarlodaoimpl.readEmployeesByRegion();
	}

	@Override
	public List<Map<String, Object>> readCustomersByTerritory() {
		// TODO Auto-generated method stub
		return examencarlodaoimpl.readCustomersByTerritory();
	}

	@Override
	public List<Map<String, Object>> readOrdersByCity() {
		// TODO Auto-generated method stub
		return examencarlodaoimpl.readOrdersByCity();
	}
	
		
	

}
