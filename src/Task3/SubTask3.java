package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class TouristPlace{
    String name;
    int entryTicketPrice;
    String workingHours;
    int noOfRating;
    float starRating;
    List<String> famousFor;

    TouristPlace(String name, String workingHours, int entryTicketPrice){
        this.name=name;
        this.workingHours=workingHours;
        this.entryTicketPrice=entryTicketPrice;
        famousFor = new ArrayList<>() ;
        noOfRating = 0;
        starRating = 0;
    }

    void rate(int stars){
        starRating = ((starRating * noOfRating)+stars)/++noOfRating;
    }

    TouristPlace addFamousFor(String s){
        famousFor.add(s);
        return this;
    }

    boolean isPlaceOpen(){
        return true;
    }

    class City{
        String name;
        String state;
        List<TouristPlace> touristPlaces;

        City(String name, String state){
            this.name = name;
            this.state = state;
            touristPlaces = new ArrayList<>();

        }
    }
}

public class SubTask3 {
    public static void main(String[] args){
        TouristPlace tp = new TouristPlace("Jal Mahal","10:00AM to 5:00PM", 150);
        tp.addFamousFor("Beautiful Water Palace of Jaipur");
        tp.rate(5);
        tp.rate(4);
        tp.rate(3);
        tp.rate(4);
        tp.rate(5);
        System.out.println(tp.starRating);
    }
}
