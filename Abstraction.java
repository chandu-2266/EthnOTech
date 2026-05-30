
abstract class FoodOrder{
	String customername;
	String foodtype;
	int Quantity;
	double price;
	FoodOrder(){
		System.out.println("Welcome to our food system!...");
	}
	FoodOrder(String name,String foodtype, int Quantity,double price){
		this.customername = name;
		this.foodtype = foodtype;
		this.Quantity = Quantity;
		this.price = price;
	}
	
	abstract void orderfood();
	void generateBill() {
		System.out.println("Customer name : "+this.customername);
		System.out.println("Customer selected item : "+this.foodtype);
		System.out.println("Customer need Quantity : "+this.Quantity);
		System.out.println("Customer per item price : "+this.price);
		System.out.println("Customer total price : "+(this.Quantity * this.price));
	}
}

class PizzaOrder extends FoodOrder{
	PizzaOrder(String name,String foodtype, int Quantity,double price){
		super(name, foodtype, Quantity, price);
	}
	void orderfood() {
		System.out.println("Pizza ordered!..");
	}
}

class Abstraction {

	public static void main(String[] args) {
		PizzaOrder food = new PizzaOrder("chandu","Biryani" , 3,100);
		food.generateBill();
	}
}