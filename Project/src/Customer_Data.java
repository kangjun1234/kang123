/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CYH
 */
public class Customer_Data {

    private String name;
    private String id;
    private String address;
    private String email;

    public Customer_Data(String cus_name, String cus_id, String cus_address, String cus_email) {
        this.name = cus_name;
        this.id = cus_id;
        this.address = cus_address;
        this.email = cus_email;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
