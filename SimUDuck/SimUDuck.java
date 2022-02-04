// fly behavior fo a duck
interface FlyBehavior {
    void fly();
}

// quack behavior of a duck
interface QuackBehavior {
    void quack();
}

// quck behavior implementation
class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I am qucking...");
    }
}

class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I am squeaking...");
    }
}

class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can't sorry...");
    }
}

// fly behaviro implementation
class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying...");
    }
}

class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't :(...");
    }
}

class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with rocked powered...");
    }
}

abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBevaior;

    // perform quack
    public void performQuack() {
        quackBevaior.quack();
    }

    // perform fly
    public void performFly() {
        flyBehavior.fly();
    }

    // set quack behavior
    public void setQuackBehavior(QuackBehavior qb) {
        quackBevaior = qb;
    }

    // set fly behavior
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    
    // display the type of duck
    public abstract void display();
}

class MallardDuck extends Duck {
    public void display() {
        System.out.println("Hi, I am Mallard Duck");
    }
    MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBevaior = new Quack();
    }
}


class SimUDuck {
    public static void main(String[] args) {
        Duck md = new MallardDuck();
        md.display();
        md.performQuack();
        md.performFly();

        md.setFlyBehavior(new FlyRocketPowered());
        md.display();
        md.performQuack();
        md.performFly();
    }
}
