package com.example.myfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText txtName,txtAddress,txtNo,txtEmail;
    Button btnSave,btnUpdate;

    Student obStd;

    //DatabaseReference db;
    private View view;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.txtinputName);
        txtAddress = findViewById(R.id.txtinputAddress);
        txtNo = findViewById(R.id.txtinputno);
        txtEmail = findViewById(R.id.txtinputemail);

        btnSave = findViewById(R.id.btnsave);
        btnUpdate = findViewById(R.id.btnupdate);

        obStd = new Student();


    }

    public void Save(View view){


       // db= FirebaseDatabase.getInstance().getReference().child("Student");

        try{

            if(TextUtils.isEmpty(txtName.getText().toString().trim())) {
                Toast.makeText(getApplicationContext(), "Please Enter the Name", Toast.LENGTH_LONG).show();
            }else if(TextUtils.isEmpty(txtAddress.getText().toString().trim())){
                Toast.makeText(getApplicationContext(),"Please Enter the address",Toast.LENGTH_LONG).show();
            }else if(TextUtils.isEmpty(txtNo.getText().toString().trim())){
                Toast.makeText(getApplicationContext(),"Please Enter the mobile number",Toast.LENGTH_LONG).show();
            }else if(TextUtils.isEmpty(txtEmail.getText().toString().trim())){
                Toast.makeText(getApplicationContext(),"enter the email",Toast.LENGTH_LONG).show();
            }else{

                obStd.setStudentName(txtName.getText().toString().trim());
                obStd.setAddress(txtAddress.getText().toString().trim());
                obStd.setMobileNo(txtNo.getText().toString().trim());
                obStd.setEmail(txtEmail.getText().toString().trim());

               // db.push().setValue(obStd);

                Toast.makeText(getApplicationContext(),"successful insertion",Toast.LENGTH_LONG).show();
            }


        }catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Number Format Exception",Toast.LENGTH_LONG).show();
        }
    }



  }