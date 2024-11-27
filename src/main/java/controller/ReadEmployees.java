package controller;

import model.Database;
import model.Employee;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ReadEmployees {

    private ArrayList<Employee> employees;


    public ReadEmployees(Database database){
        String select = "SELECT * FROM 'employees';";
        employees = new ArrayList<>();
        try {
            ResultSet = database.getStatement().e
        }

    }


}
