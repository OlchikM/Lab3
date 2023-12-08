
import Creatures.*;
import Interface.PersonFactory;
import Things.*;
import Enums.*;
import  SurroundingWorld.*;

import java.time.DayOfWeek;

public class Main{
    public static void main(String[] args){
        Lyus Lyus = new Lyus();
        Meal meal1 = new Meal("яичница");
        Lyus.eat(meal1);
        Rachael Rachael = new Rachael();
        Gage Gage = new Gage();
        Lyus.kiss(Rachael, Gage);
        LaundryTank laundryTank = new LaundryTank("белый", "квадратный");
        Lyus.watch(1, laundryTank);
        Lyus.goaway();
        World.beOk();
        TimeOfDay.beGreate(TimeOfDay.MORNING);
        Seasons.tryhard(Seasons.SUMMER);
        World.beOk();
        Garage garage = new Garage();
        Lyus.driveaCar(0, garage);
        Path path = new Path();
        Lyus.watch(5, path);
        World.beOk(path);
        Lyus.setStatement( "удивление", 1 );
        Lyus.showStatement(1, 0 );
        World.beOk();
        Home home = new Home();
        Lyus.driveaCar(10, home);
        Road road = new Road();
        road.berough(Lyus);
        Restaraunt restaraunt = new Restaraunt("китайский");
        Hospital hospital = new Hospital("окружная");
        ParkingLot parkingLot = new ParkingLot("пустую", restaraunt, hospital, "Восточного Мэна");
        Lyus.driveway(road, parkingLot);
        Person p1 = PersonFactory.create();
        Person p2 = PersonFactory.create();
        Paskoy VikiPaskoy = new Paskoy();
        Person.PublicDrive(p1, p2, Time.YESTERDAY, VikiPaskoy, hospital);
        Meal meal2 = new Meal("му-гу-гай-пана");
        VikiPaskoy.eat(meal2);
        Lyus.setStatement("страх", 10);
        Lyus.showStatement(0, 1);
        Lyus.showThoughts("сходит с ума");


        }




    }
