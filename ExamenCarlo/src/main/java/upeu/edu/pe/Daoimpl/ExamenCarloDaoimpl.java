package upeu.edu.pe.Daoimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.Dao.Todo;

@Component
public class ExamenCarloDaoimpl implements Todo{
	
	@Autowired
	
	private JdbcTemplate jdbctemplate;

	@Override
	public List<Map<String, Object>> readEmployeesByRegion() {
		String sql = "SELECT RegionDescription AS region , count(*) AS empleados \r\n"
				+ "FROM employeeterritories eter\r\n"
				+ "JOIN employees e ON e.EmployeeID= eter.EmployeeID\r\n"
				+ "JOIN territories t ON t.TerritoryID= eter.TerritoryID\r\n"
				+ "JOIN region r ON r.RegionID=t.RegionID\r\n"
				+ "GROUP BY RegionDescription;";
		return jdbctemplate.queryForList(sql);
	
	}
	
	@Override
	public List<Map<String, Object>> readCustomersByTerritory() {
		String sql = "select te.TerritoryDescription as Territorio, count(*) as Clientes from northwind.orders ordr\r\n"
				+ "inner join northwind.customers cu on cu.CustomerID=ordr.CustomerID\r\n"
				+ "inner join northwind.employees em on em.EmployeeID=ordr.EmployeeID\r\n"
				+ "inner join northwind.employeeterritories terriem on terriem.EmployeeID=em.EmployeeID\r\n"
				+ "inner join northwind.territories te on te.TerritoryID=terriem.TerritoryID\r\n"
				+ "group by te.TerritoryDescription";
		return jdbctemplate.queryForList(sql);
	}

	@Override
	public List<Map<String, Object>> readOrdersByCity() {
		String sql = "SELECT ShipCity AS ciudad,count(*) AS ordenes FROM orders\r\n"
				+ "GROUP BY ShipCity";
		return jdbctemplate.queryForList(sql);
	}
	

}
