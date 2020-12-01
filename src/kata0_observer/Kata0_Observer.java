package kata0_observer;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2020/11/30 11:28 GMT
 *
 */

public class Kata0_Observer {

    public static void main(String[] args) throws InterruptedException {
        Clock clockMadrid = new Clock(0, 0, 0);
        Clock clockBerlin = new Clock(1, 0, 0);
        
        ClockDisplay analogClockDisplayMadrid = new AnalogClockDisplay("ANALOG CLOCK MADRID");
        ClockDisplay digitalClockDisplayMadrid = new DigitalClockDisplay("DIGITAL CLOCK MADRID");
        
        ClockDisplay analogClockDisplayBerlin = new AnalogClockDisplay("ANALOG CLOCK BERLIN");
        ClockDisplay digitalClockDisplayBerlin = new DigitalClockDisplay("DIGITAL CLOCK BERLIN");
        
        clockMadrid.addObserver(analogClockDisplayMadrid);
        clockMadrid.addObserver(digitalClockDisplayMadrid);
        
        clockBerlin.addObserver(analogClockDisplayBerlin);
        clockBerlin.addObserver(digitalClockDisplayBerlin);
        
        while (true) {
            clockMadrid.updateStatusSubject();
            clockBerlin.updateStatusSubject();
            Thread.sleep(100);
        }
    }

}
