/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icamain;

/**
 *
 * @author chaitra
 */
public class SearchRadar {

    public static enum POWER {
        OFF(0), POWERED(1);
        private final int power;

        POWER(int power) {
            this.power = power;
        }

        public int value() {
            return this.power;
        }
    }

    public static enum VALID {
        NOTVALID(0), VALIDFORREAD(1);
        private final int valid;

        VALID(int valid) {
            this.valid = valid;
        }

        public int value() {
            return this.valid;
        }
    }
    private int objectNumber;
    private int bearing;
    private int climbRate;
    private int altitude;
    private int range;
    private float closingSpeed;

    public int getObjectNumber() {
        return objectNumber;
    }

    public void setObjectNumber(int objectNumber) {
        this.objectNumber = objectNumber;
    }

    public int getBearing() {
        return bearing;
    }

    public void setBearing(int bearing) {
        this.bearing = bearing;
    }

    public int getClimbRate() {
        return climbRate;
    }

    public void setClimbRate(int climbRate) {
        this.climbRate = climbRate;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public float getClosingSpeed() {
        return closingSpeed;
    }

    public void setClosingSpeed(float closingSpeed) {
        this.closingSpeed = closingSpeed;
    }
}
