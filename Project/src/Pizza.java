/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CYH
 */
public class Pizza {

    private String customer_name;
    private String customer_id;
    private String topping;
    private char size;
    private double price;

    public Pizza(String cus_name, String cus_id, String t, char s) {
        customer_name = cus_name;
        customer_id = cus_id;
        topping = t;
        size = s;
        setPrice(size);
    }

    public void setPrice(char size) {
        if (size == 'S') {
            price = 15.90;
        } else if (size == 'M') {
            price = 26.90;
        } else if (size == 'L') {
            price = 32.90;
        }
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public double getPrice() {
        return price;
    }

    public String getTopping() {
        return topping;
    }

    public char getSize() {
        return size;
    }
}
