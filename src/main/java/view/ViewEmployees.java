package view;

import model.Database;
import model.Option;
import model.User;

import java.util.Scanner;

public class ViewEmployees implements Option {

    @Override
    public void operation(Scanner s, Database database, User u){

    }

    @Override
    public String getName() {
        return "View All Employees"
    }
}
