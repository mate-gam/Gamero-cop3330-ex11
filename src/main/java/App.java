/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Mateo Gamero
 */
import java.io.Console;
import java.lang.Math;
public class App
{
public static void main (String[] args)
    {
        Console con = System.console();
        String euro = con.readLine("How many euros are you exchanging? ");
        float euros = Float.parseFloat(euro);
        String ex = con.readLine("What is the exchange rate? ");
        float exchange = Float.parseFloat(ex);
        float dollars = euros * exchange;
        float realDollars = (float)Math.round(dollars * 100) / 100;
        String build = String.format("%.2f euros at an exchange rate of %.4f is \n%.2f U.S. dollars.", euros, exchange, realDollars);
        System.out.println(build);
    }
}
