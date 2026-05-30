package CODE.OnlineOrdersFood;

import java.util.*;

public class server {

    public HashMap<Integer, User> users = new HashMap<>();
    public HashMap<Integer , ArrayList<String>> orders = new HashMap<>();

    public void registerUser(User user) {
        users.put(user.getId(), user);
        System.out.println("User Registered : " + user.getName());
    }

    public User getUser(int id) {
        return users.get(id);
    }
    public HashMap<String , Integer> menu = new HashMap<>();
	void menu() {
		menu.put("chickenbiryani",120);
		menu.put("eggbiryani",100);
		menu.put("vegbiryani",90);
		menu.put("muttonbiryani",180);
		menu.put("pizza",250);
		menu.put("chickenmandi",500);
		menu.put("dumbiryani",150);
		menu.put("magii",50);
		menu.put("icecream",60);
		menu.put("snacks",80);
		menu.put("cooldrinks",100);
	}
	
	void displayMenu() {
		menu();
		System.out.println("------ Menu ------");
		int cnt = 1;
		for (Map.Entry<String, Integer> entry : menu.entrySet()) {
		    System.out.println("Item "+ cnt++ + " : " + entry.getKey() + ", Price : " + entry.getValue());
		}
		System.out.println();
	}
	
	void userAddItem(int id,String item) {
		if(orders.containsKey(id)) {
			orders.get(id).add(item);
		}
		else{
			ArrayList<String> list = new ArrayList<>();
			list.add(item);
			orders.put(id, list);
		}
	}
	
	void userRemoveItem(int id, String item) {
		if(orders.containsKey(id)) {
			orders.get(id).remove(item);
		}
		else System.out.println("User didn't add item...");
	}
	
	void GenerateBill(int id) {
		int totalPrice = 0 , cnt = 0;
		for(String order : orders.get(id)) {
			totalPrice += menu.get(order);
		    System.out.println("Item "+ cnt++ + " : " + order + ", Price : " + menu.get(order));
		}
		System.out.println("Total Price : " + totalPrice);
		
	}
}
