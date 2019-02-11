package ca.nbcc.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

import ca.nbcc.shoppinglist.models.ShoppingListItem;

public class MainActivity extends AppCompatActivity {

    public static final int TEXT_REQUEST = 1 ;
    private ArrayList<ShoppingListItem> items = new ArrayList<>();
    private TextView item1;
    private TextView item2;
    private TextView item3;
    private TextView item4;
    private TextView item5;
    private TextView item6;
    private TextView item7;
    private TextView item8;
    private TextView item9;
    private TextView item10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        item1 = findViewById(R.id.itemOne);
        item2 = findViewById(R.id.itemTwo);
        item3 = findViewById(R.id.itemThree);
        item4 = findViewById(R.id.itemFour);
        item5 = findViewById(R.id.itemFive);
        item6 = findViewById(R.id.itemSix);
        item7 = findViewById(R.id.itemSeven);
        item8 = findViewById(R.id.itemEight);
        item9 = findViewById(R.id.itemNine);
        item10 = findViewById(R.id.itemTen);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putSerializable("myList", items);
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        items = (ArrayList<ShoppingListItem>) savedInstanceState.getSerializable("myList");
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == TEXT_REQUEST){
            if(resultCode == RESULT_OK){
                String reply = data.getStringExtra(Main2Activity.EXTRA_REPLY);

                item1.setText(reply);

                bindToView(reply);
            }
        }
    }

    private void bindToView(String item){



        if(items.size() > 0){
            for(ShoppingListItem i : items){
                if(i.itemName.equals(item)){
                    i.itemCount ++;
                }
                else{
                    items.add(new ShoppingListItem(item, 1));
                }
            }
        }

        if(items.size() == 0){
            items.add(new ShoppingListItem(item, 1));
        }


        if(items.size() == 1){
            String msg = items.get(0).itemCount + " " + items.get(0).itemName;
            item1.setText(msg);
        }
        else if(items.size() == 2){
            String msg = items.get(0).itemCount + " " + items.get(0).itemName;
            item1.setText(msg);
            msg = items.get(1).itemCount + " " + items.get(1).itemName;
            item2.setText(msg);
        }
        else if(items.size() == 3){
            String msg = items.get(0).itemCount + " " + items.get(0).itemName;
            item1.setText(msg);
            msg = items.get(1).itemCount + " " + items.get(1).itemName;
            item2.setText(msg);
            msg = items.get(2).itemCount + " " + items.get(2).itemName;
            item3.setText(msg);
        }
        else if(items.size() == 4){
            String msg = items.get(0).itemCount + " " + items.get(0).itemName;
            item1.setText(msg);
            msg = items.get(1).itemCount + " " + items.get(1).itemName;
            item2.setText(msg);
            msg = items.get(2).itemCount + " " + items.get(2).itemName;
            item3.setText(msg);
            msg = items.get(3).itemCount + " " + items.get(3).itemName;
            item4.setText(msg);
        }
        else if(items.size() == 5){
            String msg = items.get(0).itemCount + " " + items.get(0).itemName;
            item1.setText(msg);
            msg = items.get(1).itemCount + " " + items.get(1).itemName;
            item2.setText(msg);
            msg = items.get(2).itemCount + " " + items.get(2).itemName;
            item3.setText(msg);
            msg = items.get(3).itemCount + " " + items.get(3).itemName;
            item4.setText(msg);
            msg = items.get(4).itemCount + " " + items.get(4).itemName;
            item5.setText(msg);
        }
        else if(items.size() == 6){
            String msg = items.get(0).itemCount + " " + items.get(0).itemName;
            item1.setText(msg);
            msg = items.get(1).itemCount + " " + items.get(1).itemName;
            item2.setText(msg);
            msg = items.get(2).itemCount + " " + items.get(2).itemName;
            item3.setText(msg);
            msg = items.get(3).itemCount + " " + items.get(3).itemName;
            item4.setText(msg);
            msg = items.get(4).itemCount + " " + items.get(4).itemName;
            item5.setText(msg);
            msg = items.get(5).itemCount + " " + items.get(5).itemName;
            item6.setText(msg);
        }
        else if(items.size() == 7){
            String msg = items.get(0).itemCount + " " + items.get(0).itemName;
            item1.setText(msg);
            msg = items.get(1).itemCount + " " + items.get(1).itemName;
            item2.setText(msg);
            msg = items.get(2).itemCount + " " + items.get(2).itemName;
            item3.setText(msg);
            msg = items.get(3).itemCount + " " + items.get(3).itemName;
            item4.setText(msg);
            msg = items.get(4).itemCount + " " + items.get(4).itemName;
            item5.setText(msg);
            msg = items.get(5).itemCount + " " + items.get(5).itemName;
            item6.setText(msg);
            msg = items.get(6).itemCount + " " + items.get(6).itemName;
            item7.setText(msg);
        }
        else if(items.size() == 8){
            String msg = items.get(0).itemCount + " " + items.get(0).itemName;
            item1.setText(msg);
            msg = items.get(1).itemCount + " " + items.get(1).itemName;
            item2.setText(msg);
            msg = items.get(2).itemCount + " " + items.get(2).itemName;
            item3.setText(msg);
            msg = items.get(3).itemCount + " " + items.get(3).itemName;
            item4.setText(msg);
            msg = items.get(4).itemCount + " " + items.get(4).itemName;
            item5.setText(msg);
            msg = items.get(5).itemCount + " " + items.get(5).itemName;
            item6.setText(msg);
            msg = items.get(6).itemCount + " " + items.get(6).itemName;
            item7.setText(msg);
            msg = items.get(7).itemCount + " " + items.get(7).itemName;
            item8.setText(msg);
        }
        else if(items.size() == 9){
            String msg = items.get(0).itemCount + " " + items.get(0).itemName;
            item1.setText(msg);
            msg = items.get(1).itemCount + " " + items.get(1).itemName;
            item2.setText(msg);
            msg = items.get(2).itemCount + " " + items.get(2).itemName;
            item3.setText(msg);
            msg = items.get(3).itemCount + " " + items.get(3).itemName;
            item4.setText(msg);
            msg = items.get(4).itemCount + " " + items.get(4).itemName;
            item5.setText(msg);
            msg = items.get(5).itemCount + " " + items.get(5).itemName;
            item6.setText(msg);
            msg = items.get(6).itemCount + " " + items.get(6).itemName;
            item7.setText(msg);
            msg = items.get(7).itemCount + " " + items.get(7).itemName;
            item8.setText(msg);
            msg = items.get(8).itemCount + " " + items.get(8).itemName;
            item9.setText(msg);
        }
        else if(items.size() == 10){
            String msg = items.get(0).itemCount + " " + items.get(0).itemName;
            item1.setText(msg);
            msg = items.get(1).itemCount + " " + items.get(1).itemName;
            item2.setText(msg);
            msg = items.get(2).itemCount + " " + items.get(2).itemName;
            item3.setText(msg);
            msg = items.get(3).itemCount + " " + items.get(3).itemName;
            item4.setText(msg);
            msg = items.get(4).itemCount + " " + items.get(4).itemName;
            item5.setText(msg);
            msg = items.get(5).itemCount + " " + items.get(5).itemName;
            item6.setText(msg);
            msg = items.get(6).itemCount + " " + items.get(6).itemName;
            item7.setText(msg);
            msg = items.get(7).itemCount + " " + items.get(7).itemName;
            item8.setText(msg);
            msg = items.get(8).itemCount + " " + items.get(8).itemName;
            item9.setText(msg);
            msg = items.get(9).itemCount + " " + items.get(9).itemName;
            item10.setText(msg);
        }


    }


}
