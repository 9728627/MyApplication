package com.xterstar.www.placeholder;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class PostActivity extends AppCompatActivity {

    private EditText mPostTitle;
    private EditText mPostDesc;

    private Button mSubmitBtn;

    private StorageReference mStorage;

    private ProgressDialog mProgress;
    private FirebaseDatabase mDatabase;
    private DatabaseReference mRefDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        mStorage = FirebaseStorage.getInstance().getReference();


        mPostTitle = (EditText) findViewById(R.id.titleField);
        mPostDesc = (EditText) findViewById(R.id.descField);
        mDatabase = FirebaseDatabase.getInstance();
        mSubmitBtn = (Button) findViewById(R.id.submitBtn);

        mRefDatabase = mDatabase.getReference("School/ComputerScience/8");

        mProgress = new ProgressDialog(this);

        mSubmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startPosting();
            }
        });
    }

    private void startPosting() {

        mProgress.setMessage("Posting to Blog ...");
        mProgress.show();

        String title_val = mPostTitle.getText().toString().trim();
        String desc_val = mPostDesc.getText().toString().trim();

        DatabaseReference newPost = mRefDatabase.push();

        newPost.child("title").setValue(title_val);
        newPost.child("desc").setValue(desc_val);
        //newPost.child("UID").setValue(FirebaseAuth.getCurrentUser());

        mProgress.dismiss();

        startActivity(new Intent(PostActivity.this, PostTest.class));

        //if (!TextUtils.isEmpty(title_val) && !TextUtils.isEmpty(desc_val)) {




        //}

    }
}
