/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentcar;

import java.awt.Window;
import javax.swing.JFrame;
import rentcar.auth.Login;
import rentcar.auth.Register;
import rentcar.car.AddCar;
import rentcar.car.Car;
import rentcar.customer.customer;
import rentcar.dashboard.dashboard;
import rentcar.employee.AddEmployee;
import rentcar.employee.Employee;
import rentcar.order.ListOrder;

/**
 *
 * @author User
 */
public class MenuNavigation {

    public void adminDashboard(Window current) {
        dashboard dashboard = new dashboard();
        dashboard.setVisible(true);
        current.setVisible(false);
    }

    public void login(Window current) {
        Login login = new Login();
        login.setVisible(true);
        current.setVisible(false);
    }

    public void register(Window current) {
        Register register = new Register();
        register.setVisible(true);
        current.setVisible(false);
    }

    // dish application
    public void car(Window current) {
        Car car = new Car();
        car.setVisible(true);
        current.setVisible(false);
    }

    public void AddCar(Window current) {
        AddCar AddCar = new AddCar();
        AddCar.setVisible(true);
        current.setVisible(false);
    }

    public void customer(Window current) {
        customer customer = new customer();
        customer.setVisible(true);
        current.setVisible(false);
    }

    // meja application
    public void employee(Window current) {
        Employee employee = new Employee();
        employee.setVisible(true);
        current.setVisible(false);
    }

    public void Addemployee(Window current) {
        AddEmployee AddEmployee = new AddEmployee();
        AddEmployee.setVisible(true);
        current.setVisible(false);
    }

    public void order(Window current) {
        ListOrder order = new ListOrder();
        order.setVisible(true);
        current.setVisible(false);
    }

    // redirect to other jForm with data carier
    public void openMenuWithData(Window current, JFrame nextFrame) {
        nextFrame.setVisible(true);
        current.setVisible(false);
    }

}
