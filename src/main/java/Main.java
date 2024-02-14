import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        List<User> users = userService.getUsers();
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}