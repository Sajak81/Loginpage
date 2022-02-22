package org.personal.loginPage.dao.impl;

import org.personal.loginPage.connectionFactory.ConnectionFactory;
import org.personal.loginPage.dao.LoginDao;
import org.personal.loginPage.modal.Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoImpl implements LoginDao {
    private static Connection connection;

    private static PreparedStatement preparedStatement;

    private static ResultSet resultSet;

    public Login findOne(Login login){
        final String QUERY = "SELECT * FROM users WHERE username = ? AND password=?";
        try{
            connection = ConnectionFactory.getConnection();
            preparedStatement=connection.prepareStatement(QUERY);
            preparedStatement.setString(1, login.getUserName());
            preparedStatement.setString(2, login.getPassword());
            resultSet = preparedStatement.executeQuery();

            Login user = new Login();
            while(resultSet.next()){
                user.setFirstName(resultSet.getString("first_name"));
                user.setLastName(resultSet.getString("last_name"));
                return user;
            }

        }catch(SQLException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
