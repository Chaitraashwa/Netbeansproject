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

public class GunnaryCalculator {

    private int range;
    private int altitude;
    private int elevation_1;
    private float calculate;
    private float timeToTarget_1;
    private float elevation_2;
    private float timeToTarget_2;

}
public static enum FIRE{
        IDLE(0), FIRE(1);
        private final int fire;

        FIRE (int fire) {
            this.fire = fire;
        }

        public int value() {
            return this.fire;
        }
    }

    public int roundsFired;
}
