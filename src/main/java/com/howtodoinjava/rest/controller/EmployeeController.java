package com.howtodoinjava.rest.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.howtodoinjava.rest.dao.EmployeeDAO;
import com.howtodoinjava.rest.model.Employee;
import com.howtodoinjava.rest.model.Employees;

<<<<<<< HEAD
<<<<<<< HEAD
=======
// teste Github - 
=======
// teste Github -  
>>>>>>> 353a39c2b84d88c3e99a7f018067974ecd7e4c1b

>>>>>>> 7ae3d7eab4036859841df47b2aa23df147ae3101
// fist application : https://howtodoinjava.com/spring-boot/spring-boot-tutorial-with-hello-world-example/
// by 	https://howtodoinjava.com/spring-boot2/rest/rest-api-example/
// 		https://howtodoinjava.com/spring-boot2/rest/controller-restcontroller/

@RestController // reduz @Controller and @ResponseBody 
				// @Controller - traditional MVC 
				// @RestController - RESTful web service

	// Rest Controller simplesmente preenche e retorna o próprio objeto de domínio
	// Os dados do objeto são gravados diretamente na resposta HTTP como JSON ou XML para cliente processá-los

// EXECUTAR A APLICAÇÃO - POSTMAN ou CHROME Advanced REST Client
//	GET  --> http://localhost:8080/employees/
//	POST --> http://localhost:8080/employees/ 
//			 > header : Content-Type application/json
//			 > adicionar na body (RAW) (JSON) : {"firstName": "Xxxx", "lastName": "Yyyyy", "email": "zzzz@gmail.com" }
//

// TO DO
//	Aplicar validação : https://howtodoinjava.com/spring-restful/request-body-parameter-validation/


@RequestMapping(path = "/employees")
public class EmployeeController 
{
    @Autowired
    private EmployeeDAO employeeDao;
    
    @GetMapping(path="/", produces = "application/json")
    public Employees getEmployees() {
        return employeeDao.getAllEmployees();
    }
    
    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(
                        @RequestHeader(name = "X-COM-PERSIST", required = false) String headerPersist,
                        @RequestHeader(name = "X-COM-LOCATION", required = false, defaultValue = "ASIA") String headerLocation,
                        @RequestBody Employee employee) 
                 throws Exception {
    	
		        // Generate resource id
		        Integer id = employeeDao.getAllEmployees().getEmployeeList().size() + 1;
		        employee.setId(id);
		        
		        // add resource
		        employeeDao.addEmployee(employee);
		        
		        // Create resource location
		        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
		                                    .path("/{id}")
		                                    .buildAndExpand(employee.getId())
		                                    .toUri();
		        
		        // Send location in response
		        return ResponseEntity.created(location).build();
		    }
}
