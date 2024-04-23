package vn.tvn.practice.bt_4;

public class Score {
    private byte writing;
    private byte reading;
    private byte listening;

    public Score(byte writing, byte reading, byte listening) {
        this.writing = writing;
        this.reading = reading;
        this.listening = listening;
    }

    public byte getAverage(){
        return (byte) ((writing + reading + listening) / 3);
    }
}
