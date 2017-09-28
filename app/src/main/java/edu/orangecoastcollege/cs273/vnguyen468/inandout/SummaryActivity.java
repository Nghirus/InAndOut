package edu.orangecoastcollege.cs273.vnguyen468.inandout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


/**
 * This is displayed after the user has entered their order. The total, items ordered, subtotal,
 * and tax will be displayed for the user. Users can then go back and place another order.
 */
public class SummaryActivity extends AppCompatActivity {

    private TextView mTotalTextView;
    private TextView mItemsOrderedTextView;
    private TextView mSubtotalTextView;
    private TextView mTaxTextView;

    /**
     * TThis will be called after the user clicks the button Place Order.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        mTotalTextView = (TextView) findViewById(R.id.orderTotalTextView);
        mItemsOrderedTextView = (TextView) findViewById(R.id.itemsOrderedTextView);
        mSubtotalTextView = (TextView) findViewById(R.id.subTotalTextView);
        mTaxTextView = (TextView) findViewById(R.id.taxTextView);

        Intent intentFromOrder = getIntent();

        mTotalTextView.setText(intentFromOrder.getStringExtra("total"));
        mItemsOrderedTextView.setText(intentFromOrder.getStringExtra("items"));
        mSubtotalTextView.setText(intentFromOrder.getStringExtra("subtotal"));
        mTaxTextView.setText(intentFromOrder.getStringExtra("tax"));
    }

    /**
     * This closes the current screen and returns the user to the OrderActivity page.
     * @param v the current view.
     */
    public void startNewOrder(View v)
    {
        finish();
    }
}
