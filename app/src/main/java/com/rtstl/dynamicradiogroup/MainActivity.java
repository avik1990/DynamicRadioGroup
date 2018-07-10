package com.rtstl.dynamicradiogroup;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatRadioButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ///String name, String id, String classname, String section

    List<Student> list_student = new ArrayList<>();
    LinearLayout ll_container;
    AppCompatRadioButton[] rb;
    RadioGroup radiogroup;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

        ll_container = findViewById(R.id.ll_container);

        radiogroup = findViewById(R.id.radiogroup);
        radiogroup.setOrientation(LinearLayout.VERTICAL);

        list_student.clear();
        list_student.add(new Student("Avik", "122", "class 11", "Section B"));
        list_student.add(new Student("Ranit", "2", "class 12", "Section c"));
        list_student.add(new Student("Rakesh", "33", "class 2", "Section d"));
        list_student.add(new Student("Sourav", "41", "class 3", "Section e"));
        list_student.add(new Student("Arnab", "51", "class 4", "Section f"));
        list_student.add(new Student("Raj", "126", "class 6", "Section g"));
        rb = new AppCompatRadioButton[list_student.size()];


        for (int i = 0; i < list_student.size(); i++) {
            RadioButton rbn = new RadioButton(this);
            rbn.setId(Integer.parseInt(list_student.get(i).getId()));
            rbn.setText(list_student.get(i).getName());
            rbn.setButtonDrawable(R.drawable.radio_selector);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f);
            rbn.setLayoutParams(params);
            radiogroup.addView(rbn);
        }

        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                Toast.makeText(mContext, "" + checkedId, Toast.LENGTH_SHORT).show();
                //Toast.makeText(getApplicationContext(), rb.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
