public interface SpaceShip {
    void launch(); // returns true or false
    void land(); // returns true or false
    void canCarry(Object Item); // returns true if rocket can carry this item or false if not
    void  carry(Object Item); // a method that takes Item and updates the current weight of rocket



}
