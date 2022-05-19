package com.typicon.demo.controllers;


import java.io.Console;
import java.util.Date;

import static java.lang.System.out;

abstract class HelperController {

    //093 = April 3 is the Spring Equinox according to the Orthodox calendar
    private static final Date springEquinox = new Date(0,4,3);

    //First full moon after April 3rd
    private static final Date firstFullMoon = new Date();

    //The Sunday following firstFullMoon is Pascha;
    public static String dayOfPascha(){
        return "";
    }
}
