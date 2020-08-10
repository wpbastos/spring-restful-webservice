package com.bastoswp.restfulwebservice.user;

import java.util.List;
import java.util.Date;
import java.util.Iterator;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) user.setId(++userCount);
        users.add(user);
        return user;
    }

    public User findById(Integer id) {
        for (User user : users) {
            if (user.getId() == id) return user;
        }
        return null;
    }

    public User deleteById(Integer id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }

    private static List<User> users = new ArrayList<User>();
    private static int userCount = 4;

    static {
        users.add(new User(1, "Wellington", new Date()));
        users.add(new User(2, "Roina", new Date()));
        users.add(new User(3, "Carolina", new Date()));
        users.add(new User(4, "Rafael", new Date()));
    }
}