package slash.code.interfacesegregationprinciple;


interface Worker{
    public void work();

}
interface Sleep{
    public void sleep();
}

class Human implements Worker,Sleep{
    @Override
    public void work() {

    }

    @Override
    public void sleep() {

    }
}
class Robot implements Worker{
    @Override
    public void work() {

    }


}

public class InterfaceSegregation {
    /*
    Interface segregation principle prescribes a Client should not be forced to implement an interface
    that it doesn't use.
     */


}
