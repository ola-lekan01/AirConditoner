package testsClass;

import com.sun.source.tree.WhileLoopTree;

public class AirConditioner {

    private boolean isOn;
    private int temperature;

    public boolean isOn() {
        if (this.isOn == true) {
            return true;
        } else {
            return false;
        }
    }

    public void setOn(boolean startAirConditioner) {
        if (this.isOn = true) ;
    }

    public void increaseTemperature(int temperature) {
        if (temperature <= 30) {
            this.temperature = temperature + 1;
        }
        else {this.temperature = 30;}
    }

    public void decreaseTemperature(int temperature) {
        if (temperature > 16) {
            this.temperature = temperature - 1;
        }
        else {this.temperature = 16;}
    }

    public int getTemperature() {
        return this.temperature = temperature;
    }

}
