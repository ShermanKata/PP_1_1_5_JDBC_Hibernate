package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {

    private static final Statement statement = Util.getStatement();
    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
        try {
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS Users(id bigint, name varchar(50), lastName varchar(50), age tinyint)");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Не удалось создать таблицу");
        }
    }

    public void dropUsersTable() {
        try {
            statement.executeUpdate("DROP TABLE IF EXISTS Users");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Не удалось создать таблицу");
        }
    }

    public void saveUser(String name, String lastName, byte age) {

    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}
