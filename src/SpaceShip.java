public interface SpaceShip {
    boolean launch(); // returns true or false
    boolean land(); // returns true or false
    boolean canCarry(Item item); // returns true if rocket can carry this item or false if not
    void  carry(Item item); // a method that takes Item and updates the current weight of rocket



}
