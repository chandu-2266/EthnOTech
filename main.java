package CODE.OnlineOrdersFood;

public class main {

    public static void main(String[] args) {

        server server = new server();
        
        server.displayMenu();
        User u1 = new User(1, "Brami");
        User u2 = new User(2, "Brami 2.0");

        server.registerUser(u1);
        server.registerUser(u2);
        
        server.userAddItem(1, "chickenbiryani");
        server.userAddItem(1, "snacks");
        server.userAddItem(1, "chickenbiryani");
        server.userAddItem(2, "chickenbiryani");
        server.userAddItem(1, "chickenbiryani");
        server.userAddItem(2, "chickenbiryani");
        server.userAddItem(2, "chickenbiryani");
        
        Admin admin = new Admin(server);

        admin.displayUserInfo(1);
        server.userRemoveItem(1, "chickenbiryani");
        admin.displayUserInfo(1);
        server.GenerateBill(1);
        
        admin.displayUsers();
        
        admin.displayTotalRevenue();
    }
}
