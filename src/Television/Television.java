package Television;

public class Television {
    private boolean isOn;
    private int channel;
    private int volume;
    private boolean isMuted;
    private int tempVolume;
    public void turnOn() {
        isOn = true;
    }
    public boolean isOn() {
        return isOn;
    }
    public void turnOff() {
        isOn = false;
    }

    public void increaseTelevisionStation() {
        if(isOn) {
            if(channel < 100)channel++;
        }
    }
    public void increaseTelevisionStation(int channel) {
        if(isOn) {
            if(channel >= 1 && channel <=100)this.channel = channel;
        }
    }

    public int getChannel() {
        return channel;
    }

    public void decreaseTelevisionStation() {
        if(isOn) {
            if(channel >= 1)channel--;
        }
    }

    public void increaseVolume() {
        if(isOn) {
            if(volume >= 0 && volume < 50) volume++;
        }
    }
    public void decreaseVolume() {
        if(isOn) {
            if(volume > 0 && volume < 50) volume--;
        }
    }
    public int getVolume() {
        return volume;
    }

    public void muteVolume() {
        tempVolume = volume;
        if(isOn && volume > 0) {
            isMuted = false;
            volume = 0;
        }
    }

    public void unMuteVolume() {
        if(isOn) isMuted = true;
        volume = tempVolume;
    }
}
