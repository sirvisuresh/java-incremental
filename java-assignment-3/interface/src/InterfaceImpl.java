public class InterfaceImpl extends BaseClass implements Interface {

    @Override
    public void listen() {
        System.out.println("Someone is listening");
    }

    @Override
    public void run() {
        System.out.println("Someone is running");
    }

    @Override
    public void jump() {
        System.out.println("Someone is jumping");
    }

    @Override
    public void play() {
        System.out.println("Someone is playing");
    }

    @Override
    public void manage() {
        System.out.println("Someone is managing");
    }

    @Override
    public void remove() {
        System.out.println("Someone is removing");
    }

    @Override
    public void add() {
        System.out.println("Someone is adding");
    }

    public void interface1Method(Interface1 interface1)
    {
        interface1.jump();
    }

    public void interface2Method(Interface2 interface2)
    {
        interface2.play();
    }

    public void interface3Method(Interface3 interface3)
    {
        interface3.add();
    }

    public void interfaceMethod(Interface interfaac)
    {
        interfaac.listen();
    }

}
