
package kata0_observer;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2020/11/30 11:46 GMT
 *
 */

class TimeStam {

    private final Integer hour, minute, second;

    public TimeStam(Integer hour, Integer minute, Integer second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Integer getHour() {
        return hour;
    }

    public Integer getMinute() {
        return minute;
    }

    public Integer getSecond() {
        return second;
    }
    
}
