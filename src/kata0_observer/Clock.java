
package kata0_observer;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2020/11/30 11:41 GMT
 *
 */

public class Clock extends Subject {
    
    private Integer hour, minute, second;

    public Clock(Integer hour, Integer minute, Integer second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public void updateStatusSubject() {
        tickTack();
        this.notifyObservers();
    }

    @Override
    public Object getStatusSubject() {
        return getTimeStam();
    }

    private void tickTack() {
        hour = minute == 59 && second == 59? (hour + 1) % 24: hour;
        minute = second ==59? (minute + 1) % 60: minute;
        second = (second + 1) % 60;
    }
    
    private TimeStam getTimeStam() {
        return new TimeStam(hour, minute, second);
    }

}
