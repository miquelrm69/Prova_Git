package Act_2_18;

import java.util.*;

public class Hora {
    int hour_12, minute_12, second_12, hour_24, minute_24, second_24;
    boolean time12 = true;
    Calendar newTime = Calendar.getInstance();
    
    public void checkFormat(int formatTime) {
        if (formatTime == 24) {
            time12 = false;
        } else if (formatTime == 12) {
            time12 = true;
        } else {
            System.out.println("ERROR FORMAT!");
        }
    }
    
    public void setAmPm (int am_pm) {
        if (am_pm == 1) {
            newTime.set(Calendar.AM_PM, Calendar.AM);
        } else if (am_pm == 2) {
            newTime.set(Calendar.AM_PM, Calendar.PM);
        } else {
            System.out.println("Valor erroni! On Am_PM value!");
        }
    }
    
    public void setTimeToZero () {
        hour_12 = 00;
        minute_12 = 00;
        second_12 = 00;
        hour_24 = 00;
        minute_24 = 00;
        second_24 = 00;
    }
    
    public void showTime_12 () {
        String am_pm = null;
        if (newTime.get(Calendar.AM_PM) == 0) {
            am_pm = "AM";
        } else if (newTime.get(Calendar.AM_PM) == 1) {
            am_pm = "PM";
        }
        System.out.println(newTime.get(Calendar.HOUR) + ":" + newTime.get(Calendar.MINUTE) + ":" + newTime.get(Calendar.SECOND) + " " + am_pm);
    }
    
    public void showTime_24 () {
        System.out.println(newTime.get(Calendar.HOUR_OF_DAY) + ":" + newTime.get(Calendar.MINUTE) + ":" + newTime.get(Calendar.SECOND));
    }
    
    public void setTime (int hour, int minute, int formatTime){
        checkFormat(formatTime);
        if (time12) {
            newTime.set(Calendar.HOUR, hour);
            newTime.set(Calendar.MINUTE, minute);
            newTime.set(Calendar.SECOND, 0);
            showTime_12();
        } else if (!time12) {
            newTime.set(Calendar.HOUR_OF_DAY, hour);
            newTime.set(Calendar.MINUTE, minute);
            newTime.set(Calendar.SECOND, 0);
            showTime_24();
        } else {
            System.out.println("VALUE ERROR!");
        }
    }
    
    public void setTime_withSeconds (int hour, int minute, int second, int formatTime) {
        checkFormat(formatTime);
        if (time12) {
            newTime.set(Calendar.HOUR, hour);
            newTime.set(Calendar.MINUTE, minute);
            newTime.set(Calendar.SECOND, second);
            showTime_12();
        } else if (!time12) {
            newTime.set(Calendar.HOUR_OF_DAY, hour);
            newTime.set(Calendar.MINUTE, minute);
            newTime.set(Calendar.SECOND, second);
            showTime_24();
        }
    }
}
