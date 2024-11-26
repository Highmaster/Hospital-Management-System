package view;

import model.Cashier;
import model.Database;
import model.Option;
import model.User;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AddNewEmployee implements Option {

    @Override
    public void operation(Scanner s, Database database, User u) {
        System.out.println("Enter first name;");
        String firstName =s.next();
        System.out.println("Enter last name:");
        String lastName = s.next();
        System.out.println("Enter email:");
        String email =s.next();
        System.out.println("Enter phone number: ");
        String phoneNumber = s.next();
        System.out.println("Enter Password: ");
        String password = s.next();
        System.out.println("Confirm password: ");
        String confirmPassword = s.next();
        System.out.println("Enter salary (double): ");
        double Salary = s.nextDouble();
        int job;
        do {
            System.out.println("Enter job title:\n1. Cashier\n2. Receptionist");
            job = s.nextInt();
        } while (job<0 || job>2);

        switch (job){
        case 1:
            Cashier cashier = new Cashier();
            cashier.setFirstName(firstName);
            cashier.setLastName(lastName);
            cashier.setEmail(email);
            cashier.setPhoneNumber(phoneNumber);
            cashier.setPassword(password);
            cashier.setSalary(salary);
            break;
        case 2:
            break;

        }

    }

    public String getName() {
        return "Add New Employee";
    }
}
