package clickSystem.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class InstantClick implements InstantService{

     @Override
    public String checkInstant(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        return dateFormat.format(new Date());
    }

    /*@Override
    public Date checkInstant(){
        calendar.add(Calendar.SECOND, 15);
        return calendar.getTime();
    }

    @Override
    public Date convertStringToDate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Date date = calendar.getTime();
        return date;
    }*/




    /*public int day(){
        return Integer.parseInt(instant.substring(0, 2));
    }

    public int month(){
        return Integer.parseInt(instant.substring(3, 5));
    }

    public int year(){
        return Integer.parseInt(instant.substring(6, 10));
    }

    public int hour() {
        return Integer.parseInt(instant.substring(11, 13));
    }

    public int minutes() {
        return Integer.parseInt(instant.substring(14, 16));
    }

    public int seconds() {
        return Integer.parseInt(instant.substring(17, 19));
    }

    public int date() {
        return Integer.parseInt(instant.substring(0, 10));
    }

    public String time() {
        return hour() + ":" + minutes() + ":" + seconds();
    }

    *//*public int diferenceOfFiveteen(){
        if ( seconds() + 15 >= 60 ){

        }
    }*/


}
