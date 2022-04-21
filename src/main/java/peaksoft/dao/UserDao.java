package peaksoft.dao;

import peaksoft.model.User;

import java.util.List;

public interface UserDao {
//create tables
    void createUsersTable();
//drop tables
    void dropUsersTable();
//хранение userov
    void saveUser(String name, String lastName, byte age);
//udalit
    void removeUserById(long id);
//vzyat vseh
    List<User> getAllUsers();
//tazaloo
    void cleanUsersTable();
// existing
    boolean existsByFirstName(String firstName);
}
