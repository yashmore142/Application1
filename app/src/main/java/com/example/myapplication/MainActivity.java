package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    private LinearLayout mLinearLayout;
    private TextView TxtOne;
    private TextView TxtTwo;
    private TextView TxtThree;
    private TextView TxtFour;
    private  EditText TxtFive;
    private Button save;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        mLinearLayout = new LinearLayout(this);
        mLinearLayout.setGravity(Gravity.CENTER_HORIZONTAL);
        mLinearLayout.setOrientation(LinearLayout.VERTICAL);
        mLinearLayout.setLayoutParams(
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT
                )
        );
        TextView mTextUserName = new TextView(this);
        mTextUserName.setText("Yash");
        mTextUserName.setTextSize(30);
        mTextUserName.setPadding(20, 20, 20, 20);
        setContentView(mLinearLayout);

         TxtOne = new EditText(this);
        TxtOne.setHint("");
        TxtOne.setBackgroundColor(Color.LTGRAY);
        mLinearLayout.addView(TxtOne);

         TxtTwo = new EditText(this);
        TxtTwo.setHint("");
        TxtTwo.setBackgroundColor(Color.LTGRAY);
        mLinearLayout.addView(TxtTwo);

         TxtThree = new EditText(this);
        TxtThree.setHint("");
        TxtThree.setBackgroundColor(Color.LTGRAY);
        mLinearLayout.addView(TxtThree);

         TxtFour = new EditText(this);
        TxtFour.setHint("");
        TxtFour.setBackgroundColor(Color.LTGRAY);
        mLinearLayout.addView(TxtFour);

         TxtFive = new EditText(this);
        TxtFive.setHint("");
        mLinearLayout.addView(TxtFive);


        save = new Button(this);
        save.setText("Save");
        mLinearLayout.addView(save);
        save.setOnClickListener(new saveClickListner());
    }

        class saveClickListner implements View.OnClickListener{
            public void onClick(View v){
                if(TxtFive.getText().toString().equals("1")){
                    TxtOne.setBackgroundColor(Color.RED);
                }
                else
                if (TxtFive.getText().toString().equals("2")){
                    TxtTwo.setBackgroundColor(Color.RED);
                }
                else
                    if (TxtFive.getText().toString().equals("3")){
                        TxtThree.setBackgroundColor(Color.RED);
                    }
                    else
                        if(TxtFive.getText().toString().equals("4")){
                          TxtFour.setBackgroundColor(Color.RED);
                        }
                        else{
                            TxtOne.setText("Invalid number");
                        }

            }


    }
}