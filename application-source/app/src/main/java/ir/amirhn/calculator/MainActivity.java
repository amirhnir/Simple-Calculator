package ir.amirhn.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    EditText number1,number2;
    Button plus , negative , star, division;
    TextView result ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);

        plus = (Button) findViewById(R.id.plus);
        negative = (Button) findViewById(R.id.negative);
        star = (Button) findViewById(R.id.star);
        division = (Button) findViewById(R.id.division);

        result = (TextView) findViewById(R.id.result);



        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = MainActivity.this.number1.getText().toString();
                String number2 = MainActivity.this.number2.getText().toString();

                if(number1.isEmpty() || number2.isEmpty())
                    return;

                Float number1AsFloat = Float.valueOf(number1);
                Float number2AsFloat = Float.valueOf(number2);

                Float res = number1AsFloat+number2AsFloat;

                result.setText(res.toString());

            }
        });
        negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = MainActivity.this.number1.getText().toString();
                String number2 = MainActivity.this.number2.getText().toString();

                if(number1.isEmpty() || number2.isEmpty())
                    return;

                Float number1AsFloat = Float.valueOf(number1);
                Float number2AsFloat = Float.valueOf(number2);

                Float res = number1AsFloat-number2AsFloat;

                result.setText(res.toString());
            }
        });
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = MainActivity.this.number1.getText().toString();
                String number2 = MainActivity.this.number2.getText().toString();

                if(number1.isEmpty() || number2.isEmpty())
                    return;

                Float number1AsFloat = Float.valueOf(number1);
                Float number2AsFloat = Float.valueOf(number2);

                Float res = number1AsFloat*number2AsFloat;

                result.setText(res.toString());
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = MainActivity.this.number1.getText().toString();
                String number2 = MainActivity.this.number2.getText().toString();

                if(number1.isEmpty() || number2.isEmpty())
                    return;

                Float number1AsFloat = Float.valueOf(number1);
                Float number2AsFloat = Float.valueOf(number2);

                Float res = number1AsFloat/number2AsFloat;

                result.setText(res.toString());
            }
        });


    }
}
