package edu.orangecoastcollege.cs273.vnguyen468.inandout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.text.NumberFormat;

/**
 * Order Activity is displayed when the User is entering their In N Out order.
 * The program will take the user's input and calculate the total price for the order.
 */
public class OrderActivity extends AppCompatActivity {

    private static final NumberFormat currency = NumberFormat.getCurrencyInstance();

    private EditText mDoubleDoubleEditText;
    private EditText mCheeseBurgerEditText;
    private EditText mFrenchFriesEditText;
    private EditText mShakesEditText;
    private EditText mSmallDrinkEditText;
    private EditText mMediumDrinkEditText;
    private EditText mLargeDrinkEditText;

    private Order mOrder = new Order();

    /**
     * This is called when the app is loaded, and open the views to the user.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        mDoubleDoubleEditText = (EditText) findViewById(R.id.doubleDoubleEditText);
        mCheeseBurgerEditText = (EditText) findViewById(R.id.cheeseburgerEditText);
        mFrenchFriesEditText = (EditText) findViewById(R.id.frenchFriesEditText);
        mShakesEditText = (EditText) findViewById(R.id.shakesEditText);
        mSmallDrinkEditText = (EditText) findViewById(R.id.smallDrinkEditText);
        mMediumDrinkEditText = (EditText) findViewById(R.id.mediumDrinkEditText);
        mLargeDrinkEditText = (EditText) findViewById(R.id.largeDrinkEditText);
    }

    /**
     * Gets all the information from the EditText, and sets all the needed information to calculate
     * the price. The button will then open the next screen with the needed information.
     * @param v The current view.
     */
    public void goToTotal(View v)
    {
        try {
            mOrder.setDoubleDoubles(Integer.parseInt(mDoubleDoubleEditText.getText().toString()));
        }
        catch(NumberFormatException e) {
            mOrder.setDoubleDoubles(0);
        }

        try {
            mOrder.setCheeseburgers(Integer.parseInt(mCheeseBurgerEditText.getText().toString()));
        }
        catch(NumberFormatException e) {
            mOrder.setCheeseburgers(0);
        }

        try {
            mOrder.setFrenchFries(Integer.parseInt(mFrenchFriesEditText.getText().toString()));
        }
        catch (NumberFormatException e)
        {
            mOrder.setFrenchFries(0);
        }

        try {
            mOrder.setShakes(Integer.parseInt(mShakesEditText.getText().toString()));
        }
        catch (NumberFormatException e) {
            mOrder.setShakes(0);
        }

        try {
            mOrder.setSmallDrinks(Integer.parseInt(mSmallDrinkEditText.getText().toString()));
        }
        catch (NumberFormatException e)
        {
            mOrder.setSmallDrinks(0);
        }

        try {
            mOrder.setMediumDrinks(Integer.parseInt(mMediumDrinkEditText.getText().toString()));
        }
        catch (NumberFormatException e)
        {
            mOrder.setMediumDrinks(0);
        }

        try {
            mOrder.setLargeDrinks(Integer.parseInt(mLargeDrinkEditText.getText().toString()));
        }
        catch (NumberFormatException e)
        {
            mOrder.setLargeDrinks(0);
        }
        String total = "Order Total " + currency.format(mOrder.calculateTotal());
        String items = "Items Ordered: " + mOrder.getItemsOrdered();
        String subtotal = "Subtotal: " + currency.format(mOrder.calculateSubtotal());
        String tax = "Tax (8%): " + currency.format(mOrder.calculateTax());

        Intent summaryIntent = new Intent(this,SummaryActivity.class);
        summaryIntent.putExtra("total", total);
        summaryIntent.putExtra("items", items);
        summaryIntent.putExtra("subtotal", subtotal);
        summaryIntent.putExtra("tax", tax);


        startActivity(summaryIntent);
    }
}
