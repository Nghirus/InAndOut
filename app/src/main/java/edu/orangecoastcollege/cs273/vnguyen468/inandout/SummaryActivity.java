package edu.orangecoastcollege.cs273.vnguyen468.inandout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SummaryActivity extends AppCompatActivity {

    private TextView mTotalTextView;
    private TextView mItemsOrderedTextView;
    private TextView mSubtotalTextView;
    private TextView mTaxTextView;

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

    public void startNewOrder(View v)
    {
        finish();
    }
}
