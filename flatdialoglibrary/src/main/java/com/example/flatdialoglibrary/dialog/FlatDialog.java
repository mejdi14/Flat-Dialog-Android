package com.example.flatdialoglibrary.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

    EditText large_edit_text;

    ImageView icon;

    LinearLayout main_frame;

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
        large_edit_text=findViewById(R.id.large_edit_text);
        icon=findViewById(R.id.icon);
        main_frame=findViewById(R.id.main_frame);
        this.getWindow().setBackgroundDrawableResource(android.R.color.white);
        this.setCancelable(false);


    }

    public FlatDialog isCancelable(boolean cancelable){
        this.setCancelable(cancelable);
        return this;
    }

    public FlatDialog setIcon(int image){
        icon.setVisibility(View.VISIBLE);
        icon.setImageResource(image);
        return this;
    }

    public FlatDialog setTitle(String titleText) {
        title.setVisibility(View.VISIBLE);
        title.setText(titleText);
        return this;
    }

   /* public FlatDialog isHasTitle(boolean hasTitle){
        if (hasTitle) {
            title.setVisibility(View.VISIBLE);
        } else {
            title.setVisibility(View.GONE);
        }
        return this;
    }*/

    public FlatDialog setSubtitle(String subtitleText) {
        subtitle.setVisibility(View.VISIBLE);
        subtitle.setText(subtitleText);
        return this;
    }

  /*  public FlatDialog isHasSubtitle(boolean hasSubtitle){
        if (hasSubtitle) {
            subtitle.setVisibility(View.VISIBLE);
        } else {
            subtitle.setVisibility(View.GONE);
        }
        return this;
    }*/

    public String getFirstTextField() {
        return first_edit_text.getText().toString();
    }

    public FlatDialog withFirstTextField(boolean hasEditText){
        if (hasEditText) {
            first_edit_text.setVisibility(View.VISIBLE);
        } else {
            first_edit_text.setVisibility(View.GONE);
        }
        return this;
    }

    public String getLargeTextField() {
        return large_edit_text.getText().toString();
    }

    public FlatDialog withLargeText(boolean hasEditText){
        if (hasEditText) {
            large_edit_text.setVisibility(View.VISIBLE);
        } else {
            large_edit_text.setVisibility(View.GONE);
        }
        return this;
    }

    public String getSecondTextField() {
        return second_edit_text.getText().toString();
    }

    public FlatDialog withSecondTextField(boolean hasEditText){
        if (hasEditText) {
            second_edit_text.setVisibility(View.VISIBLE);
        } else {
            second_edit_text.setVisibility(View.GONE);
        }
        return this;
    }

    public FlatDialog setFirstTextField(String firstText) {
        first_edit_text.setText(firstText);
        return this;
    }

    public FlatDialog setSecondTextField(String secondText) {
        second_edit_text.setText(secondText);
        return this;
    }

    public FlatDialog setLargeTextField(String secondText) {
        large_edit_text.setText(secondText);
        return this;
    }

    public FlatDialog setFirstTextFieldHint(String firstText) {
        first_edit_text.setHint(firstText);
        return this;
    }

    public FlatDialog setSecondTextFieldHint(String secondText) {
        second_edit_text.setHint(secondText);
        return this;
    }

    public FlatDialog setLargeTextFieldHint(String secondText) {
        large_edit_text.setHint(secondText);
        return this;
    }


    public FlatDialog setFirstTextFieldTextColor(int color) {
        first_edit_text.setTextColor(color);
        return this;
    }

    public FlatDialog setSecondTextFieldTextColor(int color) {
        second_edit_text.setTextColor(color);
        return this;
    }

    public FlatDialog setLargeTextFieldTextColor(int color) {
        large_edit_text.setTextColor(color);
        return this;
    }

    public FlatDialog setFirstTextFieldHintColor(int color) {
        first_edit_text.setHintTextColor(color);
        return this;
    }

    public FlatDialog setSecondTextFieldHintColor(int color) {
        second_edit_text.setHintTextColor(color);
        return this;
    }

    public FlatDialog setLargeTextFieldHintColor(int color) {
        large_edit_text.setHintTextColor(color);
        return this;
    }


    public FlatDialog setFirstTextFieldInputType(int type) {
        first_edit_text.setInputType(type);
        return this;
    }
    public FlatDialog setSecondTextFieldInputType(int type) {
        second_edit_text.setInputType(type);
        return this;
    }

    public FlatDialog setLargeTextFieldInputType(int type) {
        second_edit_text.setInputType(type);
        return this;
    }

    public FlatDialog setFirstButtonColor(int color) {
        Drawable background = first_button.getBackground();
        changingBackgroundColor(background, color);
        return this;
    }


    public FlatDialog setSecondButtonColor(int color) {
        Drawable background = second_button.getBackground();
        changingBackgroundColor(background, color);
        return this;
    }
    public FlatDialog setThirdButtonColor(int color) {
        Drawable background = third_button.getBackground();
        changingBackgroundColor(background,color);
        return this;
    }

    public FlatDialog setFirstButtonTextColor(int color) {
        first_button.setTextColor(color);
        return this;
    }


    public FlatDialog setSecondButtonTextColor(int color) {
        second_button.setTextColor(color);
        return this;
    }
    public FlatDialog setThirdButtonTextColor(int color) {
        third_button.setTextColor(color);
        return this;
    }

    public FlatDialog setFirstButtonText(String text) {
        first_button.setText(text);
        return this;
    }


    public FlatDialog setSecondButtonText(String text) {
        second_button.setText(text);
        return this;
    }
    public FlatDialog setThirdButtonText(String text) {
        third_button.setText(text);
        return this;
    }

    public FlatDialog setBackgroundColor(int color) {
        Drawable background = main_frame.getBackground();
        changingBackgroundColor(background,color);
        return this;
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

    private void changingBackgroundColor(Drawable background, int color) {
        if (background instanceof ShapeDrawable) {
            // cast to 'ShapeDrawable'
            ShapeDrawable shapeDrawable = (ShapeDrawable) background;
            shapeDrawable.getPaint().setColor(color);
        } else if (background instanceof GradientDrawable) {
            // cast to 'GradientDrawable'
            GradientDrawable gradientDrawable = (GradientDrawable) background;
            gradientDrawable.setColor(color);
        } else if (background instanceof ColorDrawable) {
            // alpha value may need to be set again after this call
            ColorDrawable colorDrawable = (ColorDrawable) background;
            colorDrawable.setColor(color);
        }
    }

}
