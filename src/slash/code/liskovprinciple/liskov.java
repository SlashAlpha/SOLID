package slash.code.liskovprinciple;

class Bird{
    public void info(){
        System.out.println("Im a birb");
    }



    }
    class FlyingBird extends Bird{
        public void  fly () {
            System.out.println(" i'm flyin'");
        }
    }
    class Sparrow extends FlyingBird{

    }
    class Ostrich extends Bird{

    }

class liskov {

    // Liskov substitution principle prescribes substitutability of a class by its subclass
    // To put it simple, a class can be replaced by its subclass in all pratical usage scenarios.

    public static void main(String[] args) {
        Ostrich o_Oster= new Ostrich();
        o_Oster.info();
        Sparrow spA_R_O=new Sparrow();
        spA_R_O.fly();


    }

}