
package kata0_observer;

import javax.swing.JTextArea;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2020/12/01 12:14 GMT
 *
 */

public class DigitalClockDisplay extends ClockDisplay{

    public DigitalClockDisplay(String title) {
        super(title);
    }
    
    @Override
    public void refreshClockDisplay(JTextArea textArea, String hour, String minute, String second) {
        textArea.setText("DIGITAL CLOCK: " + hour + ":" + minute + ":" + second);
    }
    
}
