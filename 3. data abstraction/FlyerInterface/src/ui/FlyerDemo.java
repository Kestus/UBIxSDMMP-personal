package ui;

import model.Airplane;
import model.Bird;
import model.Cafe;
import model.Flyer;

public class FlyerDemo {
    public static void main(String[] args) {
        Bird birdie = new Bird();
        Airplane planie = new Airplane();
        Cafe cafePlane = new Airplane();
        Flyer flyerPlane = new Airplane();


        birdie.takeOff();
        cafePlane.serveDrinks();

        FlyerDemo fd = new FlyerDemo();

    }

    public void lunchService(Cafe c){
        c.serveDrinks();
        c.serveSnacks();
    }

    public void firstPartOfFlight(Airplane a){
        a.takeOff();
        a.serveDrinks();
    }
}
