/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icamain;

public class ControlPanel {
    private int minEngagementrange;
    private int maxEngagementrange;
    private int minEngagementAltitude;
    private int maxEngagementAltitude;
    private int minEngagemenSpeed;
    private int maxEngagemenSpeed;
    public static enum MASTER_MODE {
        STANDBY(0), ACTIVE(1);
        private final int masterMode;

        MASTER_MODE(int masterMode) {
            this.masterMode = masterMode;
        }

        public int value() {
            return this.masterMode;
        }
    }
    public static enum WEAPON_MODE {
        HOLD(0), AUTOMATIC(1);
        private final int weaponMode;

        WEAPON_MODE (int weaponMode) {
            this.weaponMode = weaponMode;
        }

        public int value() {
            return this.weaponMode;
        }
    }

    private int indicator;
    private int indicatorPositioned;
    private int indicatorLamp;

    private int targetingActual;
    private int targetingDesired;
    public static enum FIRING_SOLUTION{
        ON(0), OFF(1);
        private final int firing;

        FIRING_SOLUTION (int firing) {
            this.firing = firing;
        }

        public int value() {
            return this.firing;
        }
    }

    public static enum FIRE_INDICATOR{
        NOT_FIRING(0), FIRING(1);
        private final int fireIndicator;

        FIRE_INDICATOR (int fireIndicator) {
            this.fireIndicator = fireIndicator;
        }

        public int value() {
            return this.fireIndicator;
        }
    }
    public static enum LOW_INDICATOR{
        OK(0), LOW(1);
        private int lowIndicator;

        LOW_INDICATOR (int lowIndicator) {
            this.lowIndicator = lowIndicator;
        }

        public int value() {
            return this.lowIndicator;
        }
    }

    public static enum EMPTY{
        OK(0), EMPTY(1);
        private final int empty;

        EMPTY (int empty) {
            this.empty = empty;
        }

        public int value() {
            return this.empty;
        }
    }
}

