package com.example.flatdialoglibrary.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

import com.example.flatdialoglibrary.R;


public class FlatDialog extends Dialog {
    Context context;
    TextView title;

    TextView subtitle;

    TextView first_button;

    TextView second_button;

    TextView third_button;

    EditText first_edit_text;

    EditText second_edit_text;

    TextView confirm;

    public FlatDialog(Context context) {
        super(context);
        this.context = context;
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);
        title=findViewById(R.id.title);
        subtitle=findViewById(R.id.subtitle);
        first_button=findViewById(R.id.first_button);
        second_button=findViewById(R.id.second_button);
        third_button=findViewById(R.id.third_button);
        first_edit_text=findViewById(R.id.first_edit_text);
        second_edit_text=findViewById(R.id.second_edit_text);
        this.getWindow().setBackgroundDrawableResource(android.R.color.white);
        this.setCancelable(false);


    }

    public FlatDialog isCancelable(boolean cancelable){
        this.setCancelable(cancelable);
        return this;
    }

    public FlatDialog setTitle(String firstText) {
        title.setText(firstText);
        return this;
    }

    public FlatDialog isHasTitle(boolean hasTitle){
        if (hasTitle) {
            title.setVisibility(View.VISIBLE);
        } else {
            title.setVisibility(View.GONE);
        }
        return this;
    }

    public FlatDialog setSubtitle(String secondText) {
        subtitle.setText(secondText);
        return this;
    }

    public void isHasSubtitle(boolean hasSubtitle){
        if (hasSubtitle) {
            subtitle.setVisibility(View.VISIBLE);
        } else {
            subtitle.setVisibility(View.GONE);
        }
    }

    public String getFirstEditText() {
        return first_edit_text.getText().toString();
    }

    public void withFirstEditText(boolean hasEditText){
        if (hasEditText) {
            first_edit_text.setVisibility(View.VISIBLE);
        } else {
            first_edit_text.setVisibility(View.GONE);
        }
    }

    public String getSecondEditText() {
        return second_edit_text.getText().toString();
    }

    public void withSecondEditText(boolean hasEditText){
        if (hasEditText) {
            second_edit_text.setVisibility(View.VISIBLE);
        } else {
            second_edit_text.setVisibility(View.GONE);
        }
    }

    public void setFirstEditText(String firstText) {
        first_edit_text.setText(firstText);
    }

    public void setSecondEditText(String secondText) {
        second_edit_text.setText(secondText);
    }



    public FlatDialog withFirstButtonListner(View.OnClickListener confirmListner){
        first_button.setOnClickListener(confirmListner);
        return this;
    }

    public FlatDialog withSecondButtonListner(View.OnClickListener cancelListner){
        second_button.setOnClickListener(cancelListner);
        return this;
    }

    public FlatDialog withThirdButtonListner(View.OnClickListener cancelListner){
        third_button.setOnClickListener(cancelListner);
        return this;
    }

}
