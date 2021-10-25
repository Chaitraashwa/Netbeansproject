/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icamain;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class ICAMain {

    static MappedByteBuffer byteBuffer;

    private static void flipOne (int addr) {
        byte v;
        byteBuffer.position(addr);
        v = byteBuffer.get();
        byteBuffer.position(addr);
        byteBuffer.put((byte) (1 - v));
    }

    private static void setZero (int addr) {
        byte v;
        byteBuffer.position(addr);
        v = byteBuffer.get();
        byteBuffer.position(addr);
        byteBuffer.put((byte) 0);
    }

    public static void main( String[] args ) throws Throwable {
        FileChannel fc = new RandomAccessFile(new File("ciwsmem.dat"), "rw").getChannel();
        byteBuffer = fc.map( FileChannel.MapMode.READ_WRITE, 0, 1024 );
        //Get Instance of serch radar
        SearchRadar searchRadar = new SearchRadar();

        //Get Instance of autocanon
        AutoCannon autoCannon = new AutoCannon();

        //Get Instance of  ControlPanel
        ControlPanel controlPanel = new ControlPanel();

        //Get Instance of GunnaryCalculator
        GunnaryCalculator gunnaryCalculator = new GunnaryCalculator();

        // Get instance of TrackingRadar
        TrackingRadar trackingRadar = new TrackingRadar();


        int c = 10;

        //Set the Initial position of search Radar
        setZero(80);
        while (true) {
            byteBuffer.position(80); byteBuffer.put((byte) 5);
            //Change the tracking radar position by 1 byte
            byteBuffer.position(81); byteBuffer.put((byte) 10);
            System.out.print("Master mode = ");
            int masterMode = byteBuffer.get();
            System.out.println(masterMode);
            System.out.print("Weapon mode = ");
            int weaponMode = byteBuffer.get();
            System.out.println(weaponMode);
            // If Both Master mode and weapon mode are true fire .. since the target is in visibality
            if(masterMode == 1 && weaponMode ==1){
                System.out.println("FIRE");
            }else{System.out.println("NOFIRE");}
            System.out.println("");
            try {
                Thread.sleep(300);
            } catch (InterruptedException ie) {
            }
            byteBuffer.position(85);
            byteBuffer.put((byte) 10);
            //Change the offset to required position
            byteBuffer.position(86);
            byteBuffer.put((byte) 16);
            //Flip the search radar by 16 byte
            flipOne(82);
            flipOne(92);
            try {
                Thread.sleep(300);
            } catch (InterruptedException ie) {
            }
        }
    }
}
