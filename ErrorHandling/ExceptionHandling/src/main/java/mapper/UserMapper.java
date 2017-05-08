package mapper;

import connector.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entity.User;
import exception.UserException;

public class UserMapper
{
    public List<User> getUsers() throws UserException
    {
        List<User> users = new ArrayList();

        try
        {
            Connection conn = DBConnector.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM user");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next())
            {
                String username = rs.getString("username");
                String password = rs.getString("password");
                users.add(new User(username, password));
            }
        }
        catch (Exception ex)
        {
            throw new UserException("Some problem with getUsers");
        }

        return users;
    }

    public User getUser(int id) throws UserException
    {
        User user = null;
        try
        {
            PreparedStatement pstmt = DBConnector.getConnection().prepareStatement("SELECT * FROM user WHERE id = ?");
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next())
            {
                String username = rs.getString("username");
                String password = rs.getString("password");
                user = new User(username, password);
            }
            else
            {
                throw new UserException("No user found with id: " + id);
            }
        }
        catch (SQLException ex)
        {
            throw new UserException("Problem in getUser method: " + ex.getMessage());
        }
        
        return user;
    }
}