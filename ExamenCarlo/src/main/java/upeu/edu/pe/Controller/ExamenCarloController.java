package upeu.edu.pe.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.Service.ExamenCarloService;

@RestController
@RequestMapping("/api/ExamenCarlo")
@CrossOrigin({"*"})

public class ExamenCarloController {
	@Autowired
	private ExamenCarloService examencarloService;
	
	@GetMapping("/employees_region")
	public List<Map<String, Object>> readEmployeesByRegion(){
		return examencarloService.readEmployeesByRegion();
	};
	
	@GetMapping("/territory")
	public List<Map<String, Object>> readCustomersByTerritory(){
		return examencarloService.readCustomersByTerritory();
	};
	
	@GetMapping("/City")
	public List<Map<String, Object>> readOrdersByCity(){
		return examencarloService.readOrdersByCity();
	};
}
		