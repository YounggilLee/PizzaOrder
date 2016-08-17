package younggilLeeAssignment4;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

// TODO: Auto-generated Javadoc
/**
 * The Class PizzaSize.
 */
public class PizzaSize extends VBox {

	/** The large price. */
	private double smallPrice, mediumPrice, largePrice;
	
	/** The lbl num pizza. */
	private Label lblSize, lblNumPizza;
	
	/** The rbt large. */
	private RadioButton rbtSmall, rbtMedium, rbtLarge;
	
	/** The group0. */
	private ToggleGroup group0;
	
	/** The txt pizza. */
	private TextField txtPizzaNum, txtPizza;

	/**
	 * Instantiates a new pizza size.
	 */
	public PizzaSize() {
		super(10);
		this.smallPrice = 5.25;
		this.mediumPrice = 7.50;
		this.largePrice = 9.95;
		getComponents();
	}

	/**
	 * Gets the components.
	 *
	 * @return the components
	 */
	public void getComponents() {

		lblSize = new Label("Pizza");
		getChildren().add(lblSize);
		rbtSmall = new RadioButton("Small");
		rbtMedium = new RadioButton("Medium");
		rbtLarge = new RadioButton("Large");

		group0 = new ToggleGroup();
		rbtSmall.setToggleGroup(group0);
		rbtMedium.setToggleGroup(group0);
		rbtLarge.setToggleGroup(group0);
		getChildren().addAll(rbtSmall, rbtMedium, rbtLarge);

		lblNumPizza = new Label("Numer of Pizzas:  ");
		setTxtPizzaNum(new TextField());
		getChildren().addAll(lblNumPizza, getTxtPizzaNum());
		


	}

	/**
	 * Gets the rbt small.
	 *
	 * @return the rbt small
	 */
	public RadioButton getRbtSmall() {
		return rbtSmall;
	}

	/**
	 * Sets the rbt small.
	 *
	 * @param rbtSmall the new rbt small
	 */
	public void setRbtSmall(RadioButton rbtSmall) {
		this.rbtSmall = rbtSmall;
	}

	/**
	 * Gets the rbt medium.
	 *
	 * @return the rbt medium
	 */
	public RadioButton getRbtMedium() {
		return rbtMedium;
	}

	/**
	 * Sets the rbt medium.
	 *
	 * @param rbtMedium the new rbt medium
	 */
	public void setRbtMedium(RadioButton rbtMedium) {
		this.rbtMedium = rbtMedium;
	}

	/**
	 * Gets the rbt large.
	 *
	 * @return the rbt large
	 */
	public RadioButton getRbtLarge() {
		return rbtLarge;
	}

	/**
	 * Sets the rbt large.
	 *
	 * @param rbtLarge the new rbt large
	 */
	public void setRbtLarge(RadioButton rbtLarge) {
		this.rbtLarge = rbtLarge;
	}

	/**
	 * Gets the small price.
	 *
	 * @return the small price
	 */
	public double getSmallPrice() {
		return smallPrice;
	}

	/**
	 * Sets the small price.
	 *
	 * @param smallPrice the new small price
	 */
	public void setSmallPrice(double smallPrice) {
		this.smallPrice = smallPrice;
	}

	/**
	 * Gets the medium price.
	 *
	 * @return the medium price
	 */
	public double getMediumPrice() {
		return mediumPrice;
	}

	/**
	 * Sets the medium price.
	 *
	 * @param mediumPrice the new medium price
	 */
	public void setMediumPrice(double mediumPrice) {
		this.mediumPrice = mediumPrice;
	}

	/**
	 * Gets the large price.
	 *
	 * @return the large price
	 */
	public double getLargePrice() {
		return largePrice;
	}

	/**
	 * Sets the large price.
	 *
	 * @param largePrice the new large price
	 */
	public void setLargePrice(double largePrice) {
		this.largePrice = largePrice;
	}

	/**
	 * Gets the txt pizza num.
	 *
	 * @return the txt pizza num
	 */
	public TextField getTxtPizzaNum() {

		return txtPizzaNum;
	}

	/**
	 * Sets the txt pizza num.
	 *
	 * @param txtPizzaNum the new txt pizza num
	 */
	public void setTxtPizzaNum(TextField txtPizzaNum) {
		this.txtPizzaNum = txtPizzaNum;
	}

}
