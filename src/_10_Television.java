class Television {
    String maker;
    String modelCode;
    String madeIn;
    int dateOfManufacture;
    int size;
    boolean power;
    int channel;
    int volume;

    void powerOn() {
        power = true;
    }
    void powerOff() {
        power = false;
    }


    void channelUp() {
        if (channel < 255) {
            channel++;
        } else {
            channel = 0;
        }
        channelCheak();
    }
    void channelDown() {
        if (channel > 0) {
            channel--;
        } else {
            channel = 255;
        }
        channelCheak();
    }
    void channelSelect(int num) {
        if (num >= 0 && num <= 255) {
            channel = num;
            channelCheak();
        }
    }
    void channelCheak() {
        System.out.printf("채널 %d번\n", channel);
    }


    void volumeUp() {
        if (volume < 100) {
            volume++;
        }
        volumeCheak();
    }
    void volumeDown() {
        if (volume > 0) {
            volume--;
        }
        volumeCheak();
    }
    void volumeMute() {
        if (volume != 0) {
            volume = 0;
        } else {
            volume++;
        }
        volumeCheak();
    }
    void volumeCheak() {
        if (volume == 0) {
            System.out.println("음소거 입니다.");
        } else if (volume == 100) {
            System.out.println("최대볼륨 입니다.");
        } else {
            System.out.printf("볼륨 %d\n", volume);
        }
    }

    public String toString() {
        String str = maker;
        str += " " + modelCode;
        str += " " + dateOfManufacture;
        str += " " + size + "인치";
        str += " made in " + madeIn + "\n";
        str += power? "켜짐 ":"꺼짐 ";
        str += "채널 " + channel + "번 ";
        str += "음량 " + volume;
        return str;
    }
}

class UseTelevision {
    public static void main(String[] args) {
        Television t = new Television();
        t.maker = "삼성";
        t.modelCode = "KQ82QB70AFXKR";
        t.madeIn = "KOREA";
        t.dateOfManufacture = 2307;
        t.size = 60;
        t.powerOn();
        t.channel = 5;
        t.volume = 5;
        System.out.println(t);

        t.volumeMute();
        t.volumeDown();
        t.volumeUp();
        t.volumeUp();
        t.volumeUp();
        t.volumeUp();
        t.volumeDown();
        t.volumeDown();
        t.volumeDown();
        t.volumeDown();
        t.volumeDown();
        t.volumeDown();
        t.volume = 99;
        t.volumeDown();
        t.volumeDown();
        t.volumeUp();
        t.volumeUp();
        t.volumeUp();
        t.volumeUp();
        t.volumeDown();
        t.volumeUp();
        t.volumeDown();
        t.volumeDown();
        t.volumeDown();

        t.channelDown();
        t.channelDown();
        t.channelDown();
        t.channelDown();
        t.channelDown();
        t.channelDown();
        t.channelDown();
        t.channelDown();
        t.channelUp();
        t.channelUp();
        t.channelUp();
        t.channelUp();
        t.channelUp();
        t.channelUp();
        t.channelSelect(200);
        t.channelSelect(300);
        t.channelSelect(100);
        t.channelSelect(-100);
        t.channelSelect(150);
        System.out.println(t);
    }
}
