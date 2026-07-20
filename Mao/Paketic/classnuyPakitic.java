package Paketic;

public class classnuyPakitic {
    protected String sayHello(){
        return "Hello, world!";
    }
}

class childPaketic extends  classnuyPakitic{
    @Override
    protected String sayHello(){
        return "Reborn world!";
    }
}
