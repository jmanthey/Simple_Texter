package com.example.android.simpletexter;
//Jeremy Manthey
//Simple texter assignment
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
        String[] smsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String message = intent.getStringExtra("edu.css.MESSAGE");
        TextView messageTextView = (TextView) findViewById(R.id.message);
        messageTextView.setText(message);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.text_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        Resources resources = getResources();
        smsList = resources.getStringArray(R.array.text_array);
    }

    public void onClickB1(View view) {
        Intent intent = getIntent();
        String message2 = intent.getStringExtra("edu.css.MESSAGE2");
        final Spinner spin = (Spinner) findViewById((R.id.spinner));
        final String spinVal = String.valueOf(spin.getSelectedItem());


        if (message2.equalsIgnoreCase("2182131225")){
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:2182131225"));
            sendIntent.putExtra("sms_body", spinVal);
            startActivity(sendIntent);
        }

        if (message2.equals("2185551234")){
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:2185551234"));
            sendIntent.putExtra("sms_body", spinVal);
            startActivity(sendIntent);
        }

        if (message2.equals("2185554321")){
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:2185554321"));
            sendIntent.putExtra("sms_body", spinVal);
            startActivity(sendIntent);
        }
    }

}
