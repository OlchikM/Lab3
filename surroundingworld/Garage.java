package surroundingworld;
import interfaces.Drivable;
public class Garage extends EnvironmentObject {
    public Garage(Car car) {
        super("гараж");
        this.car = car;
        occupancy = 0;
    }
    private Car car;
    private int occupancy;
    public int getOccupancy() {
        return this.occupancy;
    }
    public void setOccupancy(Car car) { // The method parameter means which type of vehicle is put in the garage: 1- car, 2 - truck, 3 - bus. The garage can accommodate either 1 bus, a truck and a car, or up to 3 cars.
        int rangeOfTransport = car.getType();
        if (rangeOfTransport == 1){
        Drivable car1 = new Drivable() {
            @Override
            public void occupyTheGarage() {
            if (occupancy < 3){
                occupancy+= 1;
            } else System.out.println("Гараж занят! Машину поставить не получится!");
            }
        };
        car1.occupyTheGarage();
        } if (rangeOfTransport == 2) {
            Drivable lorry1 = new Drivable() {
                @Override
                public void occupyTheGarage() {
                    if (occupancy <= 1) {
                        occupancy += 2;
                    } else System.out.println("Гараж занят! Грузовик поставить не получится!");
                }
            };
            lorry1.occupyTheGarage();
        }
            if (rangeOfTransport == 3){
                Drivable bus1 = new Drivable() {
                    @Override
                    public void occupyTheGarage() {
                        if (occupancy == 0){
                            occupancy += 3;
                        } else System.out.println("Гараж занят! Автобус поставить не получится!");
                    }
                };
                bus1.occupyTheGarage();
            }
            }
    public void beFree(Car car){
        this.occupancy -= car.getType();
    }
    }