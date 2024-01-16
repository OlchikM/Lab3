
import creatures.*;
import things.*;
import enums.*;
import surroundingworld.*;

import emotions.Fear;
import emotions.Wonderment;
import exceptions.CarBreakdownException;
import exceptions.NoneEatingException;
import interfaces.PersonFactory;
import properties.Colour;
import properties.Shape;

public class Main{
    public static void main(String[] args){
        Lyus lyus = new Lyus();
        Car car = new Car("Машина", 1);
        Meal meal1 = new Meal("яичница", 8);
        try {
            lyus.eat(meal1);
        } catch (NoneEatingException e){
            System.out.println(e.getMessage());
        }
        Rachael Rachael = new Rachael();
        Gage Gage = new Gage();
        lyus.kiss(Rachael, Gage);
        Colour white = new Colour("белый");
        Shape square = new Shape("квадратный");
        LaundryTank laundryTank = new LaundryTank(white, square);
        lyus.watch(1, laundryTank);
        lyus.goAway();
        World.beOk();
        TimeOfDay.beGreate(TimeOfDay.MORNING);
        Seasons.tryhard(Seasons.SUMMER);
        World.beOk();
        Garage garage = new Garage(car);
        garage.setOccupancy(car);
        try {
            lyus.driveACar(0, garage, car);
        } catch (CarBreakdownException e) {
            System.out.println(e.getMessage());
            int f = lyus.getLevelOfEmotion3();
            lyus.setLevelOfHappiness(f);
            System.out.println("Поломка машины очень расстроила водителя");
        }
        Path path = new Path();
        lyus.watch(5, path);
        World.beOk(path);
        lyus.setStatement(new Wonderment(), 1, "Все ощущалось обычным");
        lyus.showStatement(1, 0 );
        World.beOk();
        Home home = new Home();
        try {
            lyus.driveACar(0, garage, car);
        } catch (CarBreakdownException e) {
            System.out.println(e.getMessage());
            int f = lyus.getLevelOfEmotion3();
            lyus.setLevelOfHappiness(f);
            System.out.println("Поломка машины очень расстроила водителя");
        }
        Road road = new Road();
        road.beRough(lyus);
        Restaraunt restaraunt = new Restaraunt("китайский");
        Hospital hospital = new Hospital("окружная");
        ParkingLot parkingLot = new ParkingLot("пустую", restaraunt, hospital, "Восточного Мэна");
        lyus.driveAway(road, parkingLot, car);
        Person p1 = PersonFactory.create();
        Person p2 = PersonFactory.create();
        Paskoy vikipaskoy = new Paskoy();
        Car bus = new Car("автобус", 3);
        Garage megaGarage = new Garage(bus);
        megaGarage.setOccupancy(bus);
        Person.publicDrive(p1, p2, Time.YESTERDAY, vikipaskoy, hospital, bus, megaGarage);
        Meal meal2 = new Meal("му-гу-гай-пана", 7);
        vikipaskoy.eat(meal2);
        lyus.setStatement(new Fear(), 10, "Осознание, что Вики Паскоу мертва");
        lyus.showStatement(0, 1);
        lyus.showThoughts("сходит с ума");



        }




    }
