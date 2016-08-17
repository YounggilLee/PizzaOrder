package younggilLeeAssignment4;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

// TODO: Auto-generated Javadoc
/**
 * The Class Drinks.
 */
public class Drinks extends VBox {

	/** The milk price. */
	private double cokePrice, juicePrice, milkPrice;

	/** The lbl num drinks. */
	private Label lblDrinks, lblNumDrinks;
	
	/** The rbt milk. */
	private RadioButton rbtCoke, rbtJuice, rbtMilk;
	
	/** The group1. */
	private ToggleGroup group1;
	
	/** The txt drinks. */
	private TextField txtDrinks;

	/**
	 * Instantiates a new drinks.
	 */
	public Drinks() {
		super(10);
		this.cokePrice = 1.25;
		this.juicePrice = 1.95;
		this.milkPrice = 2.25;
		getComponents();

	}

	/**
	 * Gets the components.
	 *
	 * @return the components
	 */
	public void getComponents() {
		lblDrinks = new Label("Drinks");
		getChildren().add(lblDrinks);
		rbtCoke = new RadioButton("Coke");
		rbtJuice = new RadioButton("Juice");
		rbtMilk = new RadioButton("Milk");

		group1 = new ToggleGroup();
		rbtCoke.setToggleGroup(group1);
		rbtJuice.setToggleGroup(group1);
		rbtMilk.setToggleGroup(group1);
		getChildren().addAll(rbtCoke, rbtJuice, rbtMilk);

		lblNumDrinks = new Label("Numer of Drinks:  ");
		setTxtDrinks(new TextField());
		getChildren().addAll(lblNumDrinks, getTxtDrinks());

	}

	/**
	 * Gets the coke price.
	 *
	 * @return the coke price
	 */
	public double getCokePrice() {
		return cokePrice;
	}

	/**
	 * Sets the coke price.
	 *
	 * @param cokePrice the new coke price
	 */
	public void setCokePrice(double cokePrice) {
		this.cokePrice = cokePrice;
	}

	/**
	 * Gets the juice price.
	 *
	 * @return the juice price
	 */
	public double getJuicePrice() {
		return juicePrice;
	}

	/**
	 * Sets the juice price.
	 *
	 * @param juicePrice the new juice price
	 */
	public void setJuicePrice(double juicePrice) {
		this.juicePrice = juicePrice;
	}

	/**
	 * Gets the milk price.
	 *
	 * @return the milk price
	 */
	public double getMilkPrice() {
		return milkPrice;
	}

	/**
	 * Sets the milk price.
	 *
	 * @param milkPrice the new milk price
	 */
	public void setMilkPrice(double milkPrice) {
		this.milkPrice = milkPrice;
	}

	/**
	 * Gets the txt drinks.
	 *
	 * @return the txt drinks
	 */
	public TextField getTxtDrinks() {
		return txtDrinks;
	}

	/**
	 * Sets the txt drinks.
	 *
	 * @param txtDrinks the new txt drinks
	 */
	public void setTxtDrinks(TextField txtDrinks) {
		this.txtDrinks = txtDrinks;
	}

	/**
	 * Gets the rbt coke.
	 *
	 * @return the rbt coke
	 */
	public RadioButton getRbtCoke() {
		return rbtCoke;
	}

	/**
	 * Sets the rbt coke.
	 *
	 * @param rbtCoke the new rbt coke
	 */
	public void setRbtCoke(RadioButton rbtCoke) {
		this.rbtCoke = rbtCoke;
	}

	/**
	 * Gets the rbt juice.
	 *
	 * @return the rbt juice
	 */
	public RadioButton getRbtJuice() {
		return rbtJuice;
	}

	/**
	 * Sets the rbt juice.
	 *
	 * @param rbtJuice the new rbt juice
	 */
	public void setRbtJuice(RadioButton rbtJuice) {
		this.rbtJuice = rbtJuice;
	}

	/**
	 * Gets the rbt milk.
	 *
	 * @return the rbt milk
	 */
	public RadioButton getRbtMilk() {
		return rbtMilk;
	}

	/**
	 * Sets the rbt milk.
	 *
	 * @param rbtMilk the new rbt milk
	 */
	public void setRbtMilk(RadioButton rbtMilk) {
		this.rbtMilk = rbtMilk;
	}

}
