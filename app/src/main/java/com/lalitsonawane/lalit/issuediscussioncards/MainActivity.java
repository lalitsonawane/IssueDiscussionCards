package com.lalitsonawane.lalit.issuediscussioncards;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private Button submit;
    private EditText mEditText;
    String[] mDataset = new String[50];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        mEditText = (EditText) findViewById(R.id.editText);
        submit = (Button) findViewById(R.id.button);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MyAdapter mMyadapter = new MyAdapter(mDataset);

               final int position = 0;
                mDataset[position] = mEditText.getText().toString();


            }

        });


        mAdapter = new MyAdapter(mDataset);
        mRecyclerView.setAdapter(mAdapter);


    }


}
