/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentcar;

import java.awt.Window;
import javax.swing.JFrame;
import rentcar.auth.Login;
import rentcar.auth.LoginCust;
import rentcar.auth.Register;
import rentcar.car.AddCar;
import rentcar.car.CarMaster;
import rentcar.role.Role;
import rentcar.role.AddRole;
import rentcar.car.AddCarType;
import rentcar.customer.customer;
import rentcar.dashboard.dashboard;
import rentcar.dashboard.dasboardCust;
import rentcar.employee.AddEmployee;
import rentcar.customer.AddCustomer;
import rentcar.employee.Employee;
import rentcar.order.ListOrder;
import rentcar.history.DetailHistory;
import rentcar.history.ListHistory;
import rentcar.history.PaymentPage;
import rentcar.history.ThankYouPage;
import rentcar.order.OrderCust;

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

    public void dashboardCust(Window current) {
        dasboardCust dashboardCust = new dasboardCust();
        dashboardCust.setVisible(true);
        current.setVisible(false);
    }

    public void login(Window current) {
        Login login = new Login();
        login.setVisible(true);
        current.setVisible(false);
    }

    public void loginCust(Window current) {
        LoginCust loginCust = new LoginCust();
        loginCust.setVisible(true);
        current.setVisible(false);
    }

    public void register(Window current) {
        Register register = new Register();
        register.setVisible(true);
        current.setVisible(false);
    }

    // dish application
    public void car(Window current) {
        CarMaster car = new CarMaster();
        car.setVisible(true);
        current.setVisible(false);
    }

    public void AddRole(Window current) {
        AddRole AddRole = new AddRole();
        AddRole.setVisible(true);
        current.setVisible(false);
    }

    public void Role(Window current) {
        Role Role = new Role();
        Role.setVisible(true);
        current.setVisible(false);
    }

    public void AddCar(Window current) {
        AddCar AddCar = new AddCar();
        AddCar.setVisible(true);
        current.setVisible(false);
    }

    public void AddCarType(Window current) {
        AddCarType AddCarType = new AddCarType();
        AddCarType.setVisible(true);
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

    public void AddCustomer(Window current) {
        AddCustomer AddCustomer = new AddCustomer();
        AddCustomer.setVisible(true);
        current.setVisible(false);
    }

    public void order(Window current) {
        ListOrder order = new ListOrder();
        order.setVisible(true);
        current.setVisible(false);
    }

    public void DetailHistory(Window current) {
        DetailHistory DetailHistory = new DetailHistory();
        DetailHistory.setVisible(true);
        current.setVisible(false);
    }

    public void ListHistory(Window current) {
        ListHistory ListHistory = new ListHistory();
        ListHistory.setVisible(true);
        current.setVisible(false);
    }

    public void PaymentPage(Window current) {
        PaymentPage PaymentPage = new PaymentPage();
        PaymentPage.setVisible(true);
        current.setVisible(false);
    }

    public void ThankYouPage(Window current) {
        ThankYouPage ThankYouPage = new ThankYouPage();
        ThankYouPage.setVisible(true);
        current.setVisible(false);
    }

    public void OrderCust(Window current) {
        OrderCust OrderCust = new OrderCust();
        OrderCust.setVisible(true);
        current.setVisible(false);
    }

    public void ListOrder(Window current) {
        ListOrder ListOrder = new ListOrder();
        ListOrder.setVisible(true);
        current.setVisible(false);
    }

    // redirect to other jForm with data carier
    public void openMenuWithData(Window current, JFrame nextFrame) {
        nextFrame.setVisible(true);
        current.setVisible(false);
    }

}
