package com.example.flat_dialog.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

import com.example.flat_dialog.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class FlatDialog extends Dialog {
    Context context;
    @BindView(R.id.title)
    TextView title;

    @BindView(R.id.subtitle)
    TextView subtitle;

    @BindView(R.id.first_button)
    TextView first_button;

    @BindView(R.id.second_button)
    TextView second_button;

    @BindView(R.id.third_button)
    TextView third_button;

    @BindView(R.id.first_edit_text)
    EditText first_edit_text;

    @BindView(R.id.second_edit_text)
    EditText second_edit_text;

    TextView confirm;
    Unbinder unbinder;
   
    public FlatDialog(Context context) {
        super(context);
        this.context = context;
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);
        unbinder = ButterKnife.bind(this);
        this.getWindow().setBackgroundDrawableResource(android.R.color.white);
        this.setCancelable(false);


    }

    public void setCancelable(boolean cancelable){
        this.setCancelable(cancelable);
    }

    public void setTitle(String firstText) {
        title.setText(firstText);
    }

    public void isHasTitle(boolean hasTitle){
        if (hasTitle) {
            title.setVisibility(View.VISIBLE);
        } else {
            title.setVisibility(View.GONE);
        }
    }

    public void setSubtitle(String secondText) {
        subtitle.setText(secondText);
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
