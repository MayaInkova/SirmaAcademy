package CRUD;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {
    private List<User> users =new ArrayList<>();
    private int nextId = 1;


    //Create

    public  User createUser(String name,String email) {
        User user = new User (nextId++, name,email);
        users.add(user);
        return user;
    }
    //Read (извличане на всички потребители)
    public  List<User> getAllUsers () {
        return users;
    }
    //Read(Извличане на един потребител по ID)
    public  User getUserById(int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);



    }

    //Update (актолизиране на потребител)

    public boolean updateUser(int id,String newName,String newEmail) {
        Optional<User> optionalUser = users.stream()
                .filter(user -> user.getId() == id)
                .findFirst();

        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setName(newName);
            user.setEmail(newEmail);
            return true;

    }
        return  false;

}
    // Delete (Изтриване на потребител)
    public boolean deleteUser(int id) {
        return users.removeIf(user -> user.getId() == id);
    }
}

