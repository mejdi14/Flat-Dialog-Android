package com.example.flat_dialog;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.flatdialoglibrary.dialog.FlatDialog;

public class ExempleActivity extends AppCompatActivity {

    Button loginDialog;
    Button colorfulDialog;
    Button largeDialog;
    Button iconDialog;
    Button optionDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginDialog = findViewById(R.id.login_dialog);
        colorfulDialog = findViewById(R.id.colorful_dialog);
        largeDialog = findViewById(R.id.large_dialog);
        iconDialog = findViewById(R.id.icon_dialog);
        optionDialog = findViewById(R.id.option_dialog);
//hello aymen


        loginDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showLoginDialog();
            }
        });

        colorfulDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showColorfulDialog();
            }
        });

        largeDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showLargeInputDialog();
            }
        });

        iconDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showIconDialog();
            }
        });

        optionDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showOptionDialog();
            }
        });

    }


    private void showOptionDialog() {
        final FlatDialog flatDialog = new FlatDialog(ExempleActivity.this);
        flatDialog.setTitle("Option dialog")
                .setTitleColor(Color.parseColor("#000000"))
                .setBackgroundColor(Color.parseColor("#f9fce1"))
                .setFirstButtonColor(Color.parseColor("#d3f6f3"))
                .setFirstButtonTextColor(Color.parseColor("#000000"))
                .setFirstButtonText("ADD")
                .setSecondButtonColor(Color.parseColor("#fee9b2"))
                .setSecondButtonTextColor(Color.parseColor("#000000"))
                .setSecondButtonText("UPDATE")
                .setThirdButtonColor(Color.parseColor("#fbd1b7"))
                .setThirdButtonTextColor(Color.parseColor("#000000"))
                .setThirdButtonText("DELETE")
                .withFirstButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flatDialog.dismiss();
                    }
                })
                .withSecondButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flatDialog.dismiss();
                    }
                })
                .withThirdButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flatDialog.dismiss();
                    }
                })
                .show();
    }

    private void showIconDialog() {
        final FlatDialog flatDialog = new FlatDialog(ExempleActivity.this);
        flatDialog.setIcon(R.drawable.crying)
                .setTitle("Somthing went wrong !")
                .setTitleColor(Color.parseColor("#000000"))
                .setSubtitle("choose an action")
                .setSubtitleColor(Color.parseColor("#000000"))
                .setBackgroundColor(Color.parseColor("#a26ea1"))
                .setFirstButtonColor(Color.parseColor("#f18a9b"))
                .setFirstButtonTextColor(Color.parseColor("#000000"))
                .setFirstButtonText("Try again")
                .setSecondButtonColor(Color.parseColor("#ffff9d"))
                .setSecondButtonTextColor(Color.parseColor("#000000"))
                .setSecondButtonText("Send rapport")
                .withFirstButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flatDialog.dismiss();
                    }
                })
                .withSecondButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flatDialog.dismiss();
                    }
                })
                .show();
    }

    private void showLargeInputDialog() {
        final FlatDialog flatDialog = new FlatDialog(ExempleActivity.this);
        flatDialog.setTitle("Send a message")
                .setTitleColor(Color.parseColor("#000000"))
                .setBackgroundColor(Color.parseColor("#f5f0e3"))
                .setLargeTextFieldHint("write your text here ...")
                .setLargeTextFieldHintColor(Color.parseColor("#000000"))
                .setLargeTextFieldBorderColor(Color.parseColor("#000000"))
                .setLargeTextFieldTextColor(Color.parseColor("#000000"))
                .setFirstButtonColor(Color.parseColor("#fda77f"))
                .setFirstButtonTextColor(Color.parseColor("#000000"))
                .setFirstButtonText("Done")
                .withFirstButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flatDialog.dismiss();
                    }
                })
                .show();
    }

    private void showColorfulDialog() {
        final FlatDialog flatDialog = new FlatDialog(ExempleActivity.this);
        flatDialog.setBackgroundColor(Color.parseColor("#1a2849"))
                .setTitle("Profile")
                .setFirstTextFieldHint("write here anything !")
                .setFirstButtonColor(Color.parseColor("#e3c878"))
                .setFirstButtonTextColor(Color.parseColor("#FFFFFF"))
                .setFirstButtonText("ADD")
                .setSecondButtonColor(Color.parseColor("#ed9a73"))
                .setSecondButtonTextColor(Color.parseColor("#FFFFFF"))
                .setSecondButtonText("UPDATE")
                .setThirdButtonColor(Color.parseColor("#e688a1"))
                .setThirdButtonTextColor(Color.parseColor("#FFFFFF"))
                .setThirdButtonText("DELETE")
                .withFirstButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flatDialog.dismiss();
                    }
                })
                .withSecondButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flatDialog.dismiss();
                    }
                })
                .withThirdButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flatDialog.dismiss();
                    }
                })
                .show();
    }

    private void showLoginDialog() {
        final FlatDialog flatDialog = new FlatDialog(ExempleActivity.this);
        flatDialog.setTitle("Login")
                .setSubtitle("write your profile info here")
                .setFirstTextFieldHint("email")
                .setSecondTextFieldHint("password")
                .setFirstButtonText("CONNECT")
                .setSecondButtonText("CANCEL")
                .withFirstButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ExempleActivity.this, flatDialog.getFirstTextField(), Toast.LENGTH_SHORT).show();
                    }
                })
                .withSecondButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flatDialog.dismiss();
                    }
                })
                .show();
    }
}
