package ca.nbcc.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import ca.nbcc.shoppinglist.models.ShoppingListItem;

public class Main2Activity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "ca.nbcc.shoppinglist.extra.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void addItem(View view){
        String groceryItem = (String)((Button)view).getText();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, groceryItem);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void close(View view) {
        setResult(RESULT_OK);
        finish();
    }
}
