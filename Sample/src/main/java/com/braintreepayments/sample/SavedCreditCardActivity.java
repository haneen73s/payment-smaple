package com.braintreepayments.sample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SavedCreditCardActivity extends AppCompatActivity {

    private TextView cardNumber;

    private Button payByCreditCard;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saved_credit_card);

        cardNumber=findViewById(R.id.cardNumberTxt);
        cardNumber.setText(MySharedPreference.getString(this,Constants.Keys.CREDIT_CARD_NUMBER,""));
        payByCreditCard=findViewById(R.id.payCreditCard);
        payByCreditCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               setPayByCreditCard();

            }
        });
    }

    private void setPayByCreditCard() {
        MySharedPreference.putString(this,Constants.Keys.PAYMENT_METHOD,"Credit Card");
        //todo add finish();
    }
}
