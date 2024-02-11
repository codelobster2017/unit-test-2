package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    void carInstanceOfCar(){
        Car Car = new Car("Toyota", "Supra", 1998);
        assertInstanceOf(Car.class, Car);
    }

    @Test
    void carHaveFourWheels(){
        Car Car = new Car("Toyota", "Supra", 1998);
        assertEquals(Car.getNumWheels(), 4);
    }

    @Test
    void motorcycleHaveTwoWheels(){
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2005);
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    void carTestDriveSpeed(){
        Car car = new Car("Toyota", "Supra", 1998);
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    @Test
    void motorcycleTestDriveSpeed(){
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2005);
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    @Test
    void carSpeedPark(){
        Car car = new Car("Toyota", "Supra", 1998);
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }
    @Test
    void motorcycleSpeedPark(){
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2005);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }
}