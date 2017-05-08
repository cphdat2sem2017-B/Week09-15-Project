package data;

import mapper.UserMapper;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import entity.User;
import exception.UserException;

public class T_E_S_TUserMapper
{
    UserMapper um = new UserMapper();
    
    public T_E_S_TUserMapper()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    @Test
    public void testGetUsers() throws Exception
    {
        List<User> expResult = null;
        List<User> result = um.getUsers();
        assertTrue(result.size()>0);
    }
    
    @Test
    public void testGetUser() throws Exception
    {
        User user = um.getUser(1);
        assertNotNull(user);
    }
    
    @Test(expected = UserException.class)
    public void testUserException() throws UserException
    {
        User user = um.getUser(100000);
    }
}