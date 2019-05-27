package app.model;

import app.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModelUsers {
    private static ModelUsers instance = new ModelUsers();

    private List<User> model;

    public static ModelUsers getInstance() {
        return instance;
    }

    private ModelUsers() {
        model = new ArrayList<>();
    }

    public void add (User user) {
        model.add(user);
    }

    public List<String> list (){
        return model.stream().map(User::getName).collect(Collectors.toList());
    }
}
