package CRUD;

public class Main {
    public static void main(String[] args) {
        UserService userService= new UserService();

        userService.createUser("Ivan Ivanov", "ivan@example,com");
        userService.createUser("Maria Petrova","maria@example.com");

        System.out.println("All users:" + userService.getAllUsers());

        System.out.println("All users:" + userService.getUserById(1));

        userService.updateUser(1, "Ivan Dimitrov", "ivan.d@example.com");
        System.out.println("Update user1:"+userService.getUserById(1));

        userService.deleteUser(2);
        System.out.println("All users"+ userService.getAllUsers());
    }
}
