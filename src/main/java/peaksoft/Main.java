package peaksoft;

import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws Exception {
        // реализуйте алгоритм здесь
        UserDaoHibernateImpl hibernate = new UserDaoHibernateImpl();
//        hibernate.createUsersTable();
//        hibernate.saveUser("Dinara", "Rakhatbek kyzy", (byte) 18);
//        hibernate.saveUser("Nurzhan","Abdyraeva",(byte) 24);
//        hibernate.saveUser("Tologon","Tekebaev",(byte) 25);
//        hibernate.saveUser("Almaz","Zhanybekov",(byte) 20);
//        hibernate.saveUser("Kanat","Baike",(byte) 23);
//         System.out.println(hibernate.existsByFirstName("Almaz"));
//         System.out.println(hibernate.getAllUsers());
//        hibernate.removeUserById(5L);
//        hibernate.cleanUsersTable();
        hibernate.close();
    }
}
