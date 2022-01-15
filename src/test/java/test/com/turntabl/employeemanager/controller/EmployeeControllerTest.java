package test.com.turntabl.employeemanager.controller;

import com.turntabl.employeemanager.controller.EmployeeController;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * EmployeeController Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jan 15, 2022</pre>
 */

@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private EmployeeController employeeController;

    @Before
    public void before() throws Exception {
        mockMvc  = MockMvcBuilders.standaloneSetup(employeeController).build();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getAllEmployee()
     */
    @Test
    public void testGetAllEmployee() throws Exception {
        //TODO: Test goes here...
    }

    /**
     * Method: getEmployeeById(@PathVariable("id") Long id)
     */
    @Test
    public void testGetEmployeeById() throws Exception {
        //TODO: Test goes here...
    }

    /**
     * Method: addEmployee(@RequestBody Employee employee)
     */
    @Test
    public void testAddEmployee() throws Exception {
        //TODO: Test goes here...
    }

    /**
     * Method: updateEmployee(@RequestBody Employee employee)
     */
    @Test
    public void testUpdateEmployeeEmployee() throws Exception {
        //TODO: Test goes here...
    }

    /**
     * Method: updateEmployee(@PathVariable("id") Long id)
     */
    @Test
    public void testUpdateEmployeeId() throws Exception {
        //TODO: Test goes here...
    }


} 
