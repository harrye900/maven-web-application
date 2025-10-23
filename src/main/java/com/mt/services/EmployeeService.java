package com.mt.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/employee")
public class EmployeeService {

	
	@GetMapping("/getEmployeeDetails")
	String uploadImage(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession)
			throws JSONException {

		JSONObject js = new JSONObject();
		js.put("Name", "Landmark Technologies");
		js.put("Calling Name", "Landmark");
		js.put("DOB", "08-Nov-2011");
		js.put("Hobbies", "Reading Technical Blogs,Teaching, Changing lives..");
		js.put("Places he like", "Africa, Church, His native place");

		return js.toString();
}
}
