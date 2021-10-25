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
public class TrackingRadar {

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
    public int desiredAzimuth;
    public int desiredElevation;
    public int currentAzimuth;
    public int currentElevation;
    public int minRange;
    public int maxRange;

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

}
