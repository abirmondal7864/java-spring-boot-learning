package oops.enums;

/**
 * The {@code Laptop} enum defines different types of laptops,
 * each associated with a specific price. It includes predefined laptop models
 * such as {@code MacBook}, {@code XPS}, {@code Surface}, and {@code ThinkPad}.
 * <p>
 * If a price is not explicitly provided, a default price of {@code 500} is assigned.
 */
enum Laptop {
    MacBook(2000),
    XPS(2200),
    Surface,                  // Uses default price from no-argument constructor
    ThinkPad(1800);

    private int price;

    /**
     * Default constructor that sets a default price of {@code 500}
     * for laptops not explicitly assigned a price.
     */
    private Laptop() {
        this.price = 500;
    }

    /**
     * Parameterized constructor to assign a custom price to the laptop model.
     * Also prints the name of the enum constant being initialized.
     *
     * @param price the price of the laptop model
     */
    private Laptop(int price) {
        this.price = price;
        System.out.println("in Laptop : " + this.name());
    }

    /**
     * Returns the price of the laptop model.
     *
     * @return the laptop price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets or updates the price of the laptop model.
     *
     * @param price the new price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
}


/**
 * The {@code EnumClass} class demonstrates the usage of the {@link Laptop} enum.
 * <p>
 * It iterates through all defined laptop models and prints their names along with prices.
 */
public class EnumClass {

    /**
     * The main method prints the name and price of each laptop defined in the {@link Laptop} enum.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
