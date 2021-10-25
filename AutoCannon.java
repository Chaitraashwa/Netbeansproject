/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icamain;

public class AutoCannon {
    public int desiredAzimuth;
    public int desiredElevation;
    public int currentAzimuth;
    public int currentElevation;

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

