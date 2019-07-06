package android.example.calciapp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,brem,bclear,bdec,bzero,bequal,backs;
    double var1,var2;
    boolean add,sub,mul,div,rem;
    TextView et;
    boolean dot=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.res);
        b1=findViewById(R.id.one);
        b2=findViewById(R.id.two);
        b3=findViewById(R.id.three);
        b4=findViewById(R.id.four);
        b5=findViewById(R.id.five);
        b6=findViewById(R.id.six);
        b7=findViewById(R.id.seven);
        b8=findViewById(R.id.eight);
        b9=findViewById(R.id.nine);
        badd=findViewById(R.id.add);
        bsub=findViewById(R.id.sub);
        bmul=findViewById(R.id.mul);
        bdiv=findViewById(R.id.div);
        brem=findViewById(R.id.per);
        bclear=findViewById(R.id.clear);
        bdec=findViewById(R.id.dot);
        bzero=findViewById(R.id.zero);
        bequal=findViewById(R.id.equal);
        backs=findViewById(R.id.backspace);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"9");
            }
        });
        bzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"0");
            }
        });
        bdec.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(et.getText().length()>=0){
                    if(dot==true){
                        et.setText(et.getText()+".");
                        dot=false;
                    }

                }

            }
        });

        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(null);
                dot=true;
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et.getText().length() != 0) {
                    var1 = Double.parseDouble(et.getText() + "");
                    add = true;
                    et.setText(null);
                    dot=true;
                }
            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et.getText().length() != 0) {
                    var1 = Double.parseDouble(et.getText() + "");
                    sub = true;
                    et.setText(null);
                    dot=true;
                }
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et.getText().length() != 0) {
                    var1 = Double.parseDouble(et.getText() + "");
                    mul = true;
                    et.setText(null);
                    dot=true;
                }
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et.getText().length() != 0) {
                    var1 = Double.parseDouble(et.getText() + "");
                    div = true;
                    et.setText(null);
                    dot=true;
                }
            }
        });

        brem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et.getText().length()!=0) {
                    var1 = Double.parseDouble(et.getText() + "");
                    rem = true;
                    et.setText(null);
                    dot=true;
                }
            }
        });
        backs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et.getText().toString();
                if(str.length() == 0)
                    return;
                str = str.substring(0, str.length() - 1);
                et.setText(str);
            }
        });


        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et.getText().length() != 0) {
                    var2 = Double.parseDouble(et.getText() + "");
                    if (add) {
                        et.setText(var1 + var2 + "");
                        add = false;
                    } else if (sub == true) {
                        et.setText(var1 - var2 + "");
                        sub = false;
                    } else if (mul == true) {
                        et.setText(var1 * var2 + "");
                        mul = false;
                    } else if (div == true) {
                        et.setText((var1 / var2) + "");
                        div = false;
                    } else if (rem == true) {
                        et.setText(var1 % var2 + "");
                        rem = false;
                    }
                }
            }
        });


    }
}
