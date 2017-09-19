package codekamp;


// ABSTRACT CLASSES
// 1. Objects (Instances) of abstract classes can not be created


// 2. Abstract classes can have both unimplemented methods, just like interfaces
//   and implemented methods just like normal (concrete) classes

// 3. As abstract classes can have unimplemented methods, it can declare to implement
//    an interface but not actually implment it or implement partially.


// ABSTRACT METHODS
// methods which have no body, only signature.


abstract public class Animal {
    public void moveLeft() {
        // xVel = -5;
        System.out.println("Set x vel to -5");
    }

    public void moveRight() {
        // xVel = 5;
        System.out.println("Set x vel to 5");
    }

    abstract public void talk();
}
