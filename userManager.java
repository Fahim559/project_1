import java.util.ArrayList;

public class userManager {
    private ArrayList<User> users = new ArrayList<>();

    public boolean usernameExists(String username){
        for (User user : users) {

            if (user.getUsername().equals(username)) {
                return true;
            }
        }

        return false;
    }

    public void addUser(User user) {
        users.add(user);
    }

}
