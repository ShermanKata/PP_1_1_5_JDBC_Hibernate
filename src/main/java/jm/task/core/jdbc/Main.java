package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Vasya", "Petrov", (byte) 25);
        userService.saveUser("Petya", "Petrov", (byte) 30);
        userService.saveUser("Kolya", "Petrov", (byte) 35);
        userService.saveUser("Misha", "Petrov", (byte) 40);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
