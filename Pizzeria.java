package younggilLeeAssignment4;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

// TODO: Auto-generated Javadoc
/**
 * The Class Pizzeria.
 */
public class Pizzeria extends Application {

	/** The menu bar. */
	private MenuBar menuBar;
	
	/** The file menu. */
	private Menu fileMenu;
	
	/** The exit item. */
	private MenuItem exitItem;
	
	/** The txa display. */
	protected TextArea txaDisplay;
	
	/** The btn cancel. */
	private Button btnOK, btnCancel;
	
	/** The lbl text. */
	private Label lblText;
	
	/** The pizza size. */
	private PizzaSize pizzaSize;
	
	/** The toppings. */
	private Toppings toppings;
	
	/** The drinks. */
	private Drinks drinks;

	/** The num pizza. */
	private int numPizza;
	
	/** The num drinks. */
	private int numDrinks;
	
	/** The size price. */
	private double sizePrice;
	
	/** The topping price. */
	private double toppingPrice;
	
	/** The drink price. */
	private double drinkPrice;
	
	/** The subtotal. */
	private double subtotal;
	
	/** The tax. */
	private double tax;
	
	/** The total. */
	private double total;
	
	/** The price p. */
	private double priceC, priceM, priceO, priceP;
	
	/** The p4. */
	private double p1, p2, p3, p4;
	
	/** The p print. */
	private ArrayList<String> pPrint = new ArrayList<>(3);
	
	/** The tax rate. */
	final double TAX_RATE = 0.13;

	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(10));

		menuBar = new MenuBar();
		fileMenu = new Menu("_File");
		exitItem = new MenuItem("E_xit");
		exitItem.setMnemonicParsing(true);
		exitItem.setAccelerator(new KeyCodeCombination(KeyCode.T,
				KeyCombination.SHORTCUT_DOWN));
		fileMenu.getItems().add(exitItem);
		menuBar.getMenus().add(fileMenu);
		exitItem.setOnAction(e -> getButtonClicked(e));
		root.setTop(menuBar);

		pizzaSize = new PizzaSize();
		toppings = new Toppings();
		drinks = new Drinks();

		root.setLeft(pizzaSize);
		root.setCenter(toppings);
		root.setRight(drinks);

		lblText = new Label("Ordered Items");
		lblText.setFont(Font.font("Amble CN", FontWeight.BOLD, 12));

		VBox pnlDisplay = new VBox(10);
		txaDisplay = new TextArea();
		txaDisplay.setPrefColumnCount(80);
		txaDisplay.setPrefRowCount(15);
		pnlDisplay.setAlignment(Pos.CENTER);
		pnlDisplay.getChildren().addAll(lblText, txaDisplay);

		HBox pnlButtons = new HBox();
		pnlButtons.setPadding(new Insets(10));
		pnlButtons.setAlignment(Pos.CENTER);
		btnOK = new Button("_OK");
		btnCancel = new Button("_Cancel");
		btnOK.setMnemonicParsing(true);
		btnCancel.setMnemonicParsing(true);
		pnlButtons.getChildren().addAll(btnOK, btnCancel);
		pnlDisplay.getChildren().add(pnlButtons);

		btnOK.setOnAction(e -> getButtonClicked(e));
		btnCancel.setOnAction(e -> getButtonClicked(e));

		Scene scene = new Scene(root, 400, 500);
		primaryStage.setTitle("My Pizzeria");
		primaryStage.setScene(scene);
		primaryStage.show();
		root.setBottom(pnlDisplay);

	}

	/**
	 * Gets the button clicked.
	 *
	 * @param e the e
	 * @return the button clicked
	 */
	public void getButtonClicked(ActionEvent e) {

		if (e.getSource() == btnOK) {

			if (getPizzaSize())
				return;

			if (getToppings())
				return;

			if (getDrinks())
				return;

			if (display())
				return;

		}

		if (e.getSource() == exitItem) {
			System.exit(0);
		}

		if (e.getSource() == btnCancel) {
			clearField();

		}
	}

	/**
	 * Gets the pizza size.
	 *
	 * @return the pizza size
	 */
	private boolean getPizzaSize() throws NumberFormatException {
		// TODO Auto-generated method stub
		this.numPizza = Integer.parseInt(pizzaSize.getTxtPizzaNum().getText());
			
		if (pizzaSize.getRbtSmall().isSelected()) {
			sizePrice = (pizzaSize.getSmallPrice() * numPizza);
			txaDisplay.appendText("\t Receipt\n" + numPizza + "\t"
					+ pizzaSize.getRbtSmall().getText() + "@"
					+ pizzaSize.getSmallPrice() + ":\t\t"
					+ (pizzaSize.getSmallPrice() * numPizza) + "\n");

		} else if (pizzaSize.getRbtMedium().isSelected()) {
			sizePrice = (pizzaSize.getMediumPrice() * numPizza);
			txaDisplay.appendText("\t Receipt\n" + numPizza + "\t"
					+ pizzaSize.getRbtMedium().getText() + "@"
					+ pizzaSize.getMediumPrice() + ":\t\t"
					+ (pizzaSize.getMediumPrice() * numPizza) + "\n");

		} else if (pizzaSize.getRbtLarge().isSelected()) {
			sizePrice = (pizzaSize.getLargePrice() * numPizza);
			txaDisplay.appendText("\t Receipt\n" + numPizza + "\t"
					+ pizzaSize.getRbtLarge().getText() + "@"
					+ pizzaSize.getLargePrice() + ":\t\t"
					+ (pizzaSize.getLargePrice() * numPizza) + "\n");

		} else {

			txaDisplay.setText("Please select a Size");
			return true;
		}

		return false;

	}

	/**
	 * Gets the toppings.
	 *
	 * @return the toppings
	 */
	private boolean getToppings() {
		// TODO Auto-generated method stub
		priceC = toppings.getCheesePrice();
		priceM = toppings.getMushroomsPrice();
		priceO = toppings.getOlivesPrice();
		priceP = toppings.getPeperoniPrice();

		if (toppings.getCbCheese().isSelected()) {
			p1 = priceC;
			pPrint.add("\t" + numPizza + "Chseese@" + priceC + "\n");
		}
		if (toppings.getCbMushrooms().isSelected()) {
			p2 = priceM;
			pPrint.add("\t" + numPizza + "Mushrooms@" + priceM + "\n");
		}
		if (toppings.getCbOlives().isSelected()) {
			p3 = priceO;
			pPrint.add("\t" + numPizza + "Olives@" + priceO + "\n");
		}
		if (toppings.getCbPeperoni().isSelected()) {
			p4 = priceP;
			pPrint.add("\t" + numPizza + "Peperoni@" + priceP + "\n");
		}

		toppingPrice = p1 + p2 + p3 + p4;
		txaDisplay.appendText("Topppings:\t\t\t" + (toppingPrice * numPizza)
				+ "\n");

		for (int i = 0; i < pPrint.size(); i++) {

			txaDisplay.appendText(pPrint.get(i));
		}

		this.p1 = 0;this.p2 = 0;this.p3 = 0;this.p4 = 0;toppingPrice = 0;
		pPrint.clear();

		return false;
	}

	/**
	 * Gets the drinks.
	 *
	 * @return the drinks
	 */
	private boolean getDrinks() throws  NumberFormatException{
		// TODO Auto-generated method stub
		this.numDrinks = Integer.parseInt(drinks.getTxtDrinks().getText());
				
		if (drinks.getRbtCoke().isSelected()) {
			drinkPrice = (drinks.getCokePrice() * numDrinks);
			txaDisplay.appendText("\n" + numDrinks + "\t" + "Drinks:\t\t\t "
					+ (drinks.getCokePrice() * numDrinks));

		} else if (drinks.getRbtJuice().isSelected()) {
			drinkPrice = (drinks.getJuicePrice() * numDrinks);
			txaDisplay.appendText("\n" + numDrinks + "\t" + "Drinks:\t\t\t"
					+ (drinks.getJuicePrice() * numDrinks));

		} else if (drinks.getRbtMilk().isSelected()) {
			drinkPrice = (drinks.getMilkPrice() * numDrinks);
			txaDisplay.appendText("\n" + numDrinks + "\t" + "Drinks:\t\t\t"
					+ (drinks.getMilkPrice() * numDrinks));

		} else {

			txaDisplay.setText("Please select a Size");
			return true;
		}
		return false;
	}

	/**
	 * Clear field.
	 */
	private void clearField() {

		pizzaSize.getTxtPizzaNum().clear();
		drinks.getTxtDrinks().clear();
		pizzaSize.getRbtSmall().setSelected(false);
		pizzaSize.getRbtMedium().setSelected(false);
		pizzaSize.getRbtLarge().setSelected(false);

		toppings.getCbCheese().setSelected(false);
		toppings.getCbMushrooms().setSelected(false);
		toppings.getCbOlives().setSelected(false);
		toppings.getCbPeperoni().setSelected(false);

		drinks.getRbtCoke().setSelected(false);
		drinks.getRbtJuice().setSelected(false);
		drinks.getRbtMilk().setSelected(false);

		this.toppingPrice = 0.0;

		txaDisplay.clear();
	}

	/**
	 * Cal sub total.
	 *
	 * @return the double
	 */
	private double calSubTotal() {

		return this.subtotal = sizePrice + toppingPrice + drinkPrice;

	}

	/**
	 * Cal tax.
	 *
	 * @return the double
	 */
	private double calTax() {

		return this.tax = (sizePrice + toppingPrice + drinkPrice) * TAX_RATE;
	}

	/**
	 * Cal total.
	 *
	 * @return the double
	 */
	private double calTotal() {

		return this.total = subtotal + tax;
	}

	/**
	 * Display.
	 *
	 * @return true, if successful
	 */
	private boolean display() {
		int temp = 1;
		if (temp == 1)
			txaDisplay.appendText("\n" + this.toString());

		return false;

	}
	


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {

		return String
				.format("====================\nSubTotal:\t\t\t\t%.2f\nHST:\t\t\t\t\t%.2f\nTotal:\t\t\t\t%.2f",
						calSubTotal(), calTax(), calTotal());
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}*/

}
