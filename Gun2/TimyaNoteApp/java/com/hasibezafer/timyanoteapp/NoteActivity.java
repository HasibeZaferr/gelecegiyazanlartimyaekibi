package com.hasibezafer.timyanoteapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NoteActivity extends AppCompatActivity implements View.OnClickListener {






    TextView tvUserName;
    EditText etNote;
    Button btnAddNote;
    ListView lvNote;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        tvUserName = (TextView) findViewById(R.id.tvUserName);

        String userName = getIntent().getStringExtra("USERNAME");
        tvUserName.setText(userName + "'nin Notları");

        etNote = (EditText) findViewById(R.id.etNewNote);
        btnAddNote = (Button) findViewById(R.id.btnAddNote);
        btnAddNote.setOnClickListener(this);

        lvNote = (ListView) findViewById(R.id.lvNote);

        arrayList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(NoteActivity.this, android.R.layout.simple_list_item_1,arrayList);
        lvNote.setAdapter(adapter);



    }

    @Override
    public void onClick(View view) {

        if(view == btnAddNote)
        {
            String rvNote = etNote.getText().toString();
            arrayList.add(rvNote);

            adapter.notifyDataSetChanged();
            etNote.setText(" ");

        }



    }
}
