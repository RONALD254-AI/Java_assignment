public class Car {

    private String licensePlate;
    private boolean isRented;

    public Car(String licensePlate){
        this.licensePlate= licensePlate;
        this.isRented= false;// Initially the car is not rented.
    }
    public boolean rentCar(){
        if(!isRented){
            isRented= true;
            return true;// means it`s successfully rented.
        }
        else{
            return false;// means is already rented.
        }
    }
    public void returnCar(){
        isRented= false;
    }
    public boolean isRented(){
        return isRented;
    }
    public static void main(String[]args) {
        Car myCar = new Car("KDK 238H");
        System.out.println("myCar is rented: " + myCar.isRented());

        myCar.rentCar();
        System.out.println("myCar is rented: " + myCar.isRented());

        myCar.returnCar();
        System.out.println("myCar is rented: " + myCar.isRented());
        System.out.println("Rental attempt successful: " + myCar.rentCar());
        System.out.println("Rental attempt successful: " + myCar.rentCar());
    }
}