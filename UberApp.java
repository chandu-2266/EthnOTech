class Vehicle {
    void bookRide() {
        System.out.println("Ride booked");
    }
}

class Auto extends Vehicle {
    @Override
    void bookRide() {
        System.out.println("Uber Auto booked");
    }
}

class Cab extends Vehicle {
    @Override
    void bookRide() {
        System.out.println("Uber Cab booked");
    }
}

class Bike extends Vehicle {
    @Override
    void bookRide() {
        System.out.println("Uber Bike booked");
    }
}

public class UberApp {
    public static void main(String[] args) {

        Vehicle ride;

        ride = new Auto();
        ride.bookRide();

        ride = new Cab();
        ride.bookRide();

        ride = new Bike();
        ride.bookRide();
    }
}