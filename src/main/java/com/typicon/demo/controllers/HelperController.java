package com.typicon.demo.controllers;


import java.io.Console;
import java.util.Date;

import static java.lang.System.out;

abstract class HelperController {

    private String queryDate;
    //093 = April 3 is the Spring Equinox according to the Orthodox calendar
    private static final Date springEquinox = new Date(0,4,3);

    //First full moon after April 3rd
    //Calculation found at https://minkukel.com/en/various/calculating-moon-phase/
    private static final Date firstFullMoon = new Date();
    private double lunarDays = 29.53058770576;
    private double lunarSecs = lunarDays * (24 * 60 *60);
    private String firstNewMoon2000 = "2000-01-06 18:14";
    private double dateDifference; //calculate the difference between queryDate and firstNewMoon200
    private double currentSecs = dateDifference % lunarSecs;

    // If negative number (date before new moon 2000) add $lunarsecs
    //if(currentSecs < 0){
    //    currentSecs += lunarSecs;
    //}

    private double cycleFraction = currentSecs / lunarSecs;
    private double currentDays = cycleFraction * lunarDays;

    //Need to loop through the 30 days following April 3rd to find full moon.

    //The Sunday following firstFullMoon is Pascha;
    public static String dayOfPascha(){
        return "";
    }
}
