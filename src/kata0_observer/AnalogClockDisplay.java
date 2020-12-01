
package kata0_observer;

import javax.swing.JTextArea;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2020/12/01 12:22 GMT
 *
 */

public class AnalogClockDisplay extends ClockDisplay {

    public AnalogClockDisplay(String title) {
        super(title);
    }
    
    @Override
    public void refreshClockDisplay(JTextArea textArea, String hour, String minute, String second) {
        textArea.setText("ANALOG CLOCK: " + hour + ":" + minute + ":" + second);
    }

}
  