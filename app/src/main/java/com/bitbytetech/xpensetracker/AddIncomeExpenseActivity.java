package com.bitbytetech.xpensetracker;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AddIncomeExpenseActivity extends AppCompatActivity {

    private boolean incomeSelected;
    private boolean expenseSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_income_expense);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final Button incomeButton = (Button) findViewById(R.id.income_button);
        final Button expenseButton = (Button) findViewById(R.id.expense_button);

        View.OnClickListener topButtonsListener  = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.income_button){
                    incomeButton.setSelected(true);
                    expenseButton.setSelected(false);
                    incomeSelected = true;
                    expenseSelected = false;
                }
                else{
                    incomeButton.setSelected(false);
                    expenseButton.setSelected(true);
                    incomeSelected = false;
                    expenseSelected = true;
                }
            }
        };

        incomeButton.setOnClickListener(topButtonsListener);
        expenseButton.setOnClickListener(topButtonsListener);
        incomeButton.performClick();
    }



}
