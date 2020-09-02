package th.ac.su.cp.myhomework;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CheckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheack);

        Button checkButton = findViewById(R.id.check_button);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(CheckActivity.this);
                EditText checkText = findViewById(R.id.editTextNumber);
                String text = checkText.getText().toString();
                if(text.length()!=13){
                    Toast t = Toast.makeText(CheckActivity.this,"กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",Toast.LENGTH_LONG);
                    t.show();
                }
                else if(text.equals("1111111111111")||text.equals("2222222222222")){

                    dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                    dialog.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");
                    dialog.setPositiveButton("OK",null);
                    dialog.show();

                }
                else{
                    dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                    dialog.setMessage("คุณไม่มีสิทธิเลือกตั้ง");
                    dialog.setPositiveButton("OK",null);
                    dialog.show();
                }

            }
        });
    }
}