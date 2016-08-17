package younggilLeeAssignment4;

import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

// TODO: Auto-generated Javadoc
/**
 * The Class Toppings.
 */
public class Toppings extends VBox {

	/** The peperoni price. */
	private double cheesePrice, mushroomsPrice, olivesPrice, peperoniPrice;
	
	/** The lbl toppings. */
	private Label lblToppings;
	
	/** The cb olives. */
	private CheckBox cbCheese, cbPeperoni, cbMushrooms, cbOlives;

	/**
	 * Instantiates a new toppings.
	 */
	public Toppings() {
		super(10);
		this.cheesePrice = 1.00;
		this.mushroomsPrice = 1.25;
		this.olivesPrice = 1.50;
		this.peperoniPrice = 1.75;
		getComponents();

	}

	/**
	 * Gets the components.
	 *
	 * @return the components
	 */
	public void getComponents() {

		cbCheese = new CheckBox("Cheese");
		cbMushrooms = new CheckBox("Mushrooms");
		cbOlives = new CheckBox("Olives");
		cbPeperoni = new CheckBox("Peperoni");

		lblToppings = new Label("Toppings");
		getChildren().add(lblToppings);
		getChildren().addAll(cbCheese, cbMushrooms, cbOlives, cbPeperoni);

	}

	/**
	 * Gets the cheese price.
	 *
	 * @return the cheese price
	 */
	public double getCheesePrice() {
		return cheesePrice;
	}

	/**
	 * Sets the cheese price.
	 *
	 * @param cheesePrice the new cheese price
	 */
	public void setCheesePrice(double cheesePrice) {
		this.cheesePrice = cheesePrice;
	}

	/**
	 * Gets the mushrooms price.
	 *
	 * @return the mushrooms price
	 */
	public double getMushroomsPrice() {
		return mushroomsPrice;
	}

	/**
	 * Sets the mushrooms price.
	 *
	 * @param mushroomsPrice the new mushrooms price
	 */
	public void setMushroomsPrice(double mushroomsPrice) {
		this.mushroomsPrice = mushroomsPrice;
	}

	/**
	 * Gets the olives price.
	 *
	 * @return the olives price
	 */
	public double getOlivesPrice() {
		return olivesPrice;
	}

	/**
	 * Sets the olives price.
	 *
	 * @param olivesPrice the new olives price
	 */
	public void setOlivesPrice(double olivesPrice) {
		this.olivesPrice = olivesPrice;
	}

	/**
	 * Gets the peperoni price.
	 *
	 * @return the peperoni price
	 */
	public double getPeperoniPrice() {
		return peperoniPrice;
	}

	/**
	 * Sets the peperoni price.
	 *
	 * @param peperoniPrice the new peperoni price
	 */
	public void setPeperoniPrice(double peperoniPrice) {
		this.peperoniPrice = peperoniPrice;
	}

	/**
	 * Gets the cb cheese.
	 *
	 * @return the cb cheese
	 */
	public CheckBox getCbCheese() {
		return cbCheese;
	}

	/**
	 * Sets the cb cheese.
	 *
	 * @param cbCheese the new cb cheese
	 */
	public void setCbCheese(CheckBox cbCheese) {
		this.cbCheese = cbCheese;
	}

	/**
	 * Gets the cb peperoni.
	 *
	 * @return the cb peperoni
	 */
	public CheckBox getCbPeperoni() {
		return cbPeperoni;
	}

	/**
	 * Sets the cb peperoni.
	 *
	 * @param cbPeperoni the new cb peperoni
	 */
	public void setCbPeperoni(CheckBox cbPeperoni) {
		this.cbPeperoni = cbPeperoni;
	}

	/**
	 * Gets the cb mushrooms.
	 *
	 * @return the cb mushrooms
	 */
	public CheckBox getCbMushrooms() {
		return cbMushrooms;
	}

	/**
	 * Sets the cb mushrooms.
	 *
	 * @param cbMushrooms the new cb mushrooms
	 */
	public void setCbMushrooms(CheckBox cbMushrooms) {
		this.cbMushrooms = cbMushrooms;
	}

	/**
	 * Gets the cb olives.
	 *
	 * @return the cb olives
	 */
	public CheckBox getCbOlives() {
		return cbOlives;
	}

	/**
	 * Sets the cb olives.
	 *
	 * @param cbOlives the new cb olives
	 */
	public void setCbOlives(CheckBox cbOlives) {
		this.cbOlives = cbOlives;
	}

}
