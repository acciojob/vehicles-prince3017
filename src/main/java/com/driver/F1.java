package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {

        //Use arbitrary values for parameters which are not mentioned
        super(name,4,2,6,isManual,"Car ",2);

    }

    public void accelerate(int rate){
        //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        int newSpeed = 0;
        newSpeed = getCurrentSpeed()+rate; // cars current speed

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            super.stop();
            setCurrentGear(1);
        }
        //for all other cases, change the gear accordingly  changeSpeed(newSpeed, getCurrentDirection());

        else if(newSpeed > 0 && newSpeed <=50 ) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(1); // using setter method to fetch the parents class method
        }
        else if(newSpeed >= 51 && newSpeed <= 100){
            setCurrentGear(2);
            setCurrentSpeed(newSpeed);
        }
        else if(newSpeed >=101 && newSpeed<=150) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(3);
        }
        else if(newSpeed >=151 && newSpeed<=200) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(4);
        }
        else if(newSpeed >=201 && newSpeed<=250) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(5);
        }
        else if(newSpeed >250) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(6);
        }
        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}