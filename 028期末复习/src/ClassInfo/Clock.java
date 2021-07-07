package ClassInfo;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock() {
        hour = 0;
        minute = 0;
        second = 0;
    }
    //输入时分秒
    public void setClock(int hour, int minute, int second) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public void inSecond(){
        this.second += 1;
        clockCheck(this.second);
    }

    public String showClock(){
        String msg = this.hour + "时:" + this.minute + "分:" + this.second + "秒";
        return msg;
    }

    private void clockCheck(int second){
        if(second == 60){
            this.second = 0;
            this.minute += 1;
            if(this.minute==60){
                this.minute = 0;
                this.hour += 1;
            }
        }
    }
}
