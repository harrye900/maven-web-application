package com.mt.services;

import junit.framework.TestCase;
import org.json.JSONObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.mockito.Mockito;

public class EmployeeServiceTest extends TestCase {
    
    public void testUploadImage() throws Exception {
        // Create instance of service
        EmployeeService service = new EmployeeService();
        
        // Mock the servlet objects
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
        HttpSession session = Mockito.mock(HttpSession.class);
        
        // Call the method
        String result = service.uploadImage(request, response, session);
        
        // Verify result is not null and contains expected data
        assertNotNull("Result should not be null", result);
        assertTrue("Result should contain Name", result.contains("Landmark Technologies"));
        assertTrue("Result should contain DOB", result.contains("08-Nov-2011"));
        
        // Parse as JSON to verify it's valid JSON
        JSONObject json = new JSONObject(result);
        assertEquals("Landmark Technologies", json.getString("Name"));
        assertEquals("Landmark", json.getString("Calling Name"));
    }
}