package com.example.clunctia.me_pay;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private PocketPresenter presenter;
    private final String CHECK_FUND = "Check Fund";
    private final String ADD_FUND = "Add Fund";
    private final String PAID = "Paid";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //presenter = new PocketPresenter();

        //initializeSpinner();
        //initializeRadioButton();
    }

    public void createCheckFundDialog() {
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Check Fund");
        String value = String.format("%.2f", presenter.getUser().getMoney());
        alertDialog.setMessage(value);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "DISMISS",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }

    public void initializeSpinner() {
        Spinner spinner = (Spinner) findViewById(R.id.account_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.account_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                if(selectedItem.contains(CHECK_FUND)) {
                    presenter.createDialog(-1);
                } else if(selectedItem.contains(ADD_FUND)) {
                    startAddMoneyActivity();
                } else if(selectedItem.contains(PAID)) {
                   startPaidActivity();
                }
                parent.setSelection(0);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void initializeRadioButton() {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.search_by_radiogroup);
        radioGroup.check(R.id.search_by_days_radiobutton);
    }

    public void startAddMoneyActivity(){
        Intent addMoneyIntent = new Intent(this, AddMoneyActivity.class);
        startActivity(addMoneyIntent);
    }

    public void startPaidActivity(){
        Intent paidIntent = new Intent(this, PaidActivity.class);
        startActivity(paidIntent);
    }


}
