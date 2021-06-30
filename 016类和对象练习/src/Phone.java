class Phone {

    private String name;  // 品牌
    private String type;   // 型号
    private String os;      // 操作系统
    private int price;     // 价格
    private int size;   // 内存
    
    public Phone(){
        this.name = "华为";
        this.type = "华为荣耀magic";
        this.os = "Android 7";
        this.price = 3888;
        this.size = 8;
    }
    
    // 有参构造
    public Phone(String name, String type, String os, int price, int size) {
        this.name = name;
        this.type = type;
        this.os = os;
        this.price = price;
        this.size = size;
    }
    
    // 关于本机
    public void about() {
        System.out.println("品牌："+name+"\n"+"型号："+type+"\n"+
                            "操作系统："+os+"\n"+"价格："+price+"\n"+"内存："+size+"\n");
    }
    
    // 打电话
    public void call(int num) {
        System.out.println("使用自动拨号功能：");
        String phoneNo = "";
        switch (num) {
        case 1: phoneNo = "爷爷的号。";break;
        case 2: phoneNo = "奶奶的号。";break;
        case 3: phoneNo = "妈妈的号。";break;
        case 4: phoneNo = "姐姐的号。";break;
        case 5: phoneNo = "妹妹的号。";break;
        case 6: phoneNo = "哥哥的号。";break;
        case 7: phoneNo = "弟弟的号。";break;
        }
        System.out.println(phoneNo);
    }
    // 打游戏
    public void playGame() {
        System.out.println("玩猜字游戏。");
    }

    // 播放音
    public void playMusic(String song) {
        System.out.println(song+" begin play");
    }
}