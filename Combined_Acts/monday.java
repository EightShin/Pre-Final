import java.time.LocalTime;
import java.util.Scanner;

public class monday {
    public static void main(String[] args) {
        mondaytwo w = new mondaytwo();
        Scanner inp = new Scanner(System.in);

        System.out.print("Example Value: 14:30:00 \n[00:00:00] Uses Military time (24-hr Format) \n");
        System.out.println("Enter Time for Alarm: ");

        String tme = inp.next();

        w.setAlarm(tme);
        w.showAlarm();

        
    }    
}

//=======================================================

interface alarm {
        void setAlarm(String time);
        void showAlarm();
    }

//=======================================================

    abstract class weekday implements alarm {
    }

//=======================================================

    class mondaytwo extends weekday  {
        String time;

        @Override
        public void setAlarm(String time) {

            this.time = time;

        }

        @Override
        public void showAlarm() {

            LocalTime alarm = LocalTime.parse(time);
            LocalTime now = LocalTime.now();

            if(alarm.isAfter(now)) {
                System.out.println("\nI'll wake you up later! ");
            }
            if (alarm.isBefore(now)) {
                System.out.println("\nAlarm is set for tomorrow! ");
            }

            System.out.println("Current time :" + now
            + "\nDeclared time: " + time);
        }
    }

//=======================================================

/*info------------------------------------
update = 001 : 12/10/25 [1:08]
Local time format is  defined as | 00:00:00 |
Clock adjusted to military time (24-hr format)

update = 002 : 12/10/25 [1:23]
Setting adjustments to align objective
Relocated time function [setAlarm >>> showAlarm]

update = 003 : 12/10/25 [1:29]
Inserted comment lines for better visual
Running further tests
Considering further adjusments and options {
Localtime now second decimal (status[--])
Error / Exception handling   (status[--])
}
-------------------------------------------
 */
    

    
