package com.example.ticketbook;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ticketbook.bean.MemberBean;

public class JoinActivity extends AppCompatActivity {
    private String userid;
    private EditText edtName, edtPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        userid = getIntent().getStringExtra("MemberID");
        edtName = findViewById(R.id.join_name);
        edtPhone = findViewById(R.id.edtPhoneNum);
        TextView txtId = findViewById(R.id.GoogleId);

        txtId.setText("Google Id : " + userid);

        findViewById(R.id.btnCreate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                joinProcess();
            }
        });
    }

    private void joinProcess(){
        MemberBean memberBean = new MemberBean();
        memberBean.userid = userid;
        String name = "" ,phone = "", userNum = "";

        name = edtName.getText().toString();

        if(name.equals("")){
            Toast.makeText(this,"이름을 입력해주세요.",Toast.LENGTH_SHORT).show();
            return;
        }
        memberBean.name = name;

        phone = edtPhone.getText().toString();
        if(phone.equals("")){
            Toast.makeText(this,"번호를 입력해주세요.",Toast.LENGTH_SHORT).show();
            return;
        }
        memberBean.phoneNum = phone;

        //\회원가입 후 추가
        FileDB.addMember(this,memberBean);
        Toast.makeText(this,"회원가입이 완료되었습니다.",Toast.LENGTH_SHORT).show();
        finish();
    }

}
