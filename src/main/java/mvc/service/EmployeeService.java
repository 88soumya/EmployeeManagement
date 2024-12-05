package mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;

import mvc.dao.EmplyeeDao;
import mvc.dto.Employee;

@Service
public class EmployeeService {
        
	@Autowired
	EmplyeeDao emp;
	//@ModelAttribute is used to recive data from frontend
	//Modelmap is used to carry message we want to carry message from add to home page
	public  String add( @ModelAttribute Employee employee,ModelMap map) {
		emp.save(employee);
		map.put("success", "Record Added Success");
		return "Home.jsp";
}
	public String fetch(ModelMap map) {
		List<Employee> list=emp.fetchAll();
		if(list.isEmpty()) {
			map.put("failure", "No Records Found");
			return "home.jsp";
		}else {
			map.put("list", list);
			return "fetch.jsp";
		}
	}
}
