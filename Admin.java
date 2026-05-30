package CODE.OnlineOrdersFood;

import java.util.ArrayList;

public class Admin {

    private server server;
    private int id;
    public Admin(server server) {
        this.server = server;
    }

    public void showUser(int id) {
        User user = server.getUser(id);

        if(user != null) {
            System.out.println("ID : " + user.getId());
            System.out.println("Name : " + user.getName());
            this.id = user.getId();
        }
        else {
            System.out.println("User Not Found");
        }
    }
    void displayUserInfo(int id) {
    	showUser(id);
        System.out.println(server.orders.get(this.id));
    }
    
    void displayUsers() {
    	for(User userId : server.users.values()) {
    		System.out.println("User : "+userId.getId()+ " , Name : "+userId.getName());
    	}
    }
    
    void displayTotalRevenue() {
    	int totalPrice = 0 , cnt = 1;
    	for(User userId : server.users.values()) {
    		showUser(userId.getId());
    		for(String order : server.orders.get(this.id)) {
    			System.out.println("S.no : " + cnt++ +" User : "+userId.getName()+" , Ordered : "+ order +" , Price : "+ server.menu.get(order));
    			totalPrice += server.menu.get(order);
    		}
    		System.out.println("Total price : "+totalPrice);
    	}
    }
}
