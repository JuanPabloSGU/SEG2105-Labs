package com.example.simplecalculator;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * An class representing the calculator app.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Returns the value entered in the display of the calculator that the user inputted.
     * @param operator represents the operator chosen.
     * @param value1 represents the first value.
     * @param value2 represents the second value.
     * @return returns the mathematical result of the operation.
     */
    public float calculate(String operator, Float value1, Float value2) {
        switch(operator){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "/":
                return value1 / value2;
            case "*":
                return value1 * value2;
        }
        return 0;
    }

    /**
     * onCreate are the instance variables that are used in the make up the application.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0); // 0
        btn1 = findViewById(R.id.btn1); // 1
        btn2 = findViewById(R.id.btn2); // 2
        btn3 = findViewById(R.id.btn3); // 3
        btn4 = findViewById(R.id.btn4); // 4
        btn5 = findViewById(R.id.btn5); // 5
        btn6 = findViewById(R.id.btn6); // 6
        btn7 = findViewById(R.id.btn7); // 7
        btn8 = findViewById(R.id.btn8); // 8
        btn9 = findViewById(R.id.btn9); // 9
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnDiv = findViewById(R.id.btnDiv);
        btnMul = findViewById(R.id.btnMul);
        btnClr = findViewById(R.id.btnClr);
        btnEql = findViewById(R.id.btnEql);
        btnDec = findViewById(R.id.btnDec);
        display = findViewById(R.id.display);


        /**
         * When this button is clicked, the resulting number is displayed.
         * In this case the number is 0.
         */
        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                display.setText(display.getText() + "0");
            }
        });

        /**
         * When this button is clicked, the resulting number is displayed.
         * In this case the number is 1.
         */
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                display.setText(display.getText() + "1");
            }
        });

        /**
         * When this button is clicked, the resulting number is displayed.
         * In this case the number is 2.
         */
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                display.setText(display.getText() + "2");
            }
        });

        /**
         * When this button is clicked, the resulting number is displayed.
         * In this case the number is 3.
         */
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                display.setText(display.getText() + "3");
            }
        });

        /**
         * When this button is clicked, the resulting number is displayed.
         * In this case the number is 3.
         */
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                display.setText(display.getText() + "4");
            }
        });

        /**
         * When this button is clicked, the resulting number is displayed.
         * In this case the number is 4.
         */
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                display.setText(display.getText() + "5");
            }
        });

        /**
         * When this button is clicked, the resulting number is displayed.
         * In this case the number is 6.
         */
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                display.setText(display.getText() + "6");
            }
        });

        /**
         * When this button is clicked, the resulting number is displayed.
         * In this case the number is 7.
         */
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                display.setText(display.getText() + "7");
            }
        });

        /**
         * When this button is clicked, the resulting number is displayed.
         * In this case the number is 8.
         */
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                display.setText(display.getText() + "8");
            }
        });

        /**
         * When this button is clicked, the resulting number is displayed.
         * In this case the number is 9.
         */
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                display.setText(display.getText() + "9");
            }
        });

        /**
         * When this button is clicked, the resulting operation is displayed.
         * In this case the operation is Addition.
         */
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                display.setText(display.getText() + "+");
            }
        });

        /**
         * When this button is clicked, the resulting operation is displayed.
         * In this case the operation is Subtraction.
         */
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "-");
            }
        });

        /**
         * When this button is clicked, the resulting operation is displayed.
         * In this case the operation is Division.
         */
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "/");
            }
        });

        /**
         * When this button is clicked, the resulting operation is displayed.
         * In this case the operation is Multiplication.
         */
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "*");
            }
        });

        /**
         * When this button is clicked, the display screen is cleared.
         */
        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("");
            }
        });

        /**
         * When this button is clicked, the result is the mathematical operation completed.
         */
        btnEql.setOnClickListener(new View.OnClickListener() {

            /**
             * onClick is when the button is clicked this routine is run.
             * @param view
             */
            @Override
            public void onClick(View view) {
                String equation_test = (display.getText()).toString();



                if(equation_test.isEmpty()){
                    return;
                }

                // line below changes all '-' to '+-' past the first number
                equation_test = equation_test.replaceAll("\\b-{1}","+-");
                if(equation_test == ""){
                    display.setText("");
                }
//                else if(equation_test.indexOf("(\\+|\\*|/){2,}") != -1){
//                    display.setText("Invalid Input");
//                }
//                else if(equation_test == "Invalid Input"){
//                    display.setText("Invalid Input");
//                }
                else {
                    // updated regex to not detect negative sign for numbers, will now store as ["-5", "-6",...] etc.
                    List<String> numbers = new ArrayList<String>(Arrays.asList(equation_test.split("\\+|\\*|/")));
                    List<String> operators = new ArrayList<String>(Arrays.asList(equation_test.split("-?\\d*\\.?\\d*")));
                    boolean is_float = equation_test.indexOf(".") != -1;
                    operators.removeAll(Arrays.asList("", null));
                    System.out.println(numbers.toString());
                    System.out.println(operators.toString());
                    String value_to_display;
                    // float total = 0;
                    // float last_value = Float.parseFloat(numbers.get(0));
                    float ans = 0;
                    while(!operators.isEmpty()){
                        if (numbers.size() > 1) {
                            if (operators.indexOf("*") != -1) {
                                int i = operators.indexOf("*");
                                float multiplication = calculate("*", Float.parseFloat(numbers.get(i )), Float.parseFloat(numbers.get(i + 1)));
                                numbers.set(i, String.valueOf(multiplication));
                                numbers.remove(i + 1);
                                operators.remove(i);
                            } else if (operators.indexOf("/") != -1) {
                                int i = operators.indexOf("/");
                                float division = calculate("/", Float.parseFloat(numbers.get(i )), Float.parseFloat(numbers.get(i + 1)));
                                numbers.set(i, String.valueOf(division));
                                numbers.remove(i + 1);
                                operators.remove(i);
                            } else {
                                float aos = calculate(operators.get(0), Float.parseFloat(numbers.get(0)), Float.parseFloat(numbers.get(1)));
                                numbers.remove(1);
                                numbers.set(0, String.valueOf(aos));
                                operators.remove(0);
                            }
                        } else {
                            break;
                        }
                    }
                    ans = Float.parseFloat(numbers.get(0));
                    /**for (int i = 0; i < operators.size(); i++) {
                     String operator = operators.get(i);
                     float next_value = Float.parseFloat(numbers.get(i + 1));
                     last_value = calculate(operator, last_value, next_value);
                     } */
                    if (!is_float) {
                        value_to_display = String.valueOf(Math.round(ans));
                    } else {
                        value_to_display = String.valueOf(ans);
                    }
                    display.setText(value_to_display);
                }
            }
        });

        /**
         * When this button is clicked, a decimal is added to the screen.
         */
        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + ".");
            }
        });

    }

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9, btnAdd, btnSub, btnDiv, btnMul, btnClr, btnEql, btnDec;

    TextView display;
}
