package Creational.Builder;

public class MarioKartBuilder implements Builder {

    String name;
    String type;
    Boolean online;
    Boolean multiplayer;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setType(String type) {
        this.type =type;
    }

    @Override
    public void isOnline(Boolean online) {
        this.online = online;
    }

    @Override
    public void isMultiplayer(Boolean multiplayer) {
        this.multiplayer = multiplayer;
    }

    public MarioKart getResult(){
        return new MarioKart(name, type, online, multiplayer);
    }

}
