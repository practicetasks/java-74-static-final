package static_example;

public class Database {
    static User[] users;

    static {
        users = new User[]{
                new User("user1", 26),
                new User("user2", 26),
                new User("user3", 26),
                new User("user4", 26),
                new User("user5", 26),
                null,
                null
        };
    }

    static void showUsers() {
        for (User user : users) {
            if (user == null) {
                continue;
            }
            System.out.println(user.getName());
        }
    }

    static void add(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                break;
            }
        }
    }
}
