package com.example.gato;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
            Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
            EditText jugador;
            TextView winpl;
            int[] matriz = new int[9];
            boolean ganar, ganapc;
            int tiradas = 0, aleatorio = 0;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                b1 = (Button) findViewById(R.id.bt1);
                b2 = (Button) findViewById(R.id.bt2);
                b3 = (Button) findViewById(R.id.bt3);
                b4 = (Button) findViewById(R.id.bt4);
                b5 = (Button) findViewById(R.id.bt5);
                b6 = (Button) findViewById(R.id.bt6);
                b7 = (Button) findViewById(R.id.bt7);
                b8 = (Button) findViewById(R.id.bt8);
                b9 = (Button) findViewById(R.id.bt9);
                jugador=(EditText) findViewById(R.id.juagador);
                winpl = (TextView) findViewById(R.id.ganador);

                for (int i=0;i<=8;i++){
                    matriz[i]=0;
                }
                aleatorio=(int)(8*Math.random())+1;
                inicio();

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean tiro= false;
                        if (matriz[0]==0){
                            b1.setText("x");
                            matriz[0]=1;
                            tiradas++;
                            tiro=true;
                        }
                        if (tiro== true){
                            quiengana();
                            if (tiradas<5 && ganar==false && ganapc==false){
                                tirapc3(tiradas);
                            }
                            quiengana();
                            checa();
                        }
                    }
                });

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean tiro= false;
                        if (matriz[1]==0){
                            b2.setText("x");
                            matriz[1]=1;
                            tiradas++;
                            tiro=true;
                        }
                        if (tiro== true){
                            quiengana();
                            if (tiradas<5 && ganar==false && ganapc==false){
                                tirapc3(tiradas);
                            }
                            quiengana();
                            checa();
                        }
                    }
                });

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean tiro= false;
                        if (matriz[2]==0){
                            b3.setText("x");
                            matriz[2]=1;
                            tiradas++;
                            tiro=true;
                        }
                        if (tiro== true){
                            quiengana();
                            if (tiradas<5 && ganar==false && ganapc==false){
                                tirapc3(tiradas);
                            }
                            quiengana();
                            checa();
                        }

                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean tiro= false;
                        if (matriz[3]==0){
                            b4.setText("x");
                            matriz[3]=1;
                            tiradas++;
                            tiro=true;
                        }
                        if (tiro== true){
                            quiengana();
                            if (tiradas<5 && ganar==false && ganapc==false){
                                tirapc3(tiradas);
                            }
                            quiengana();
                            checa();
                        }
                    }
                });

                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean tiro= false;
                        if (matriz[4]==0){
                            b5.setText("x");
                            matriz[4]=1;
                            tiradas++;
                            tiro=true;
                        }
                        if (tiro== true){
                            quiengana();
                            if (tiradas<5 && ganar==false && ganapc==false){
                                tirapc3(tiradas);
                            }
                            quiengana();
                            checa();
                        }
                    }
                });

                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean tiro= false;
                        if (matriz[5]==0){
                            b6.setText("x");
                            matriz[5]=1;
                            tiradas++;
                            tiro=true;
                        }
                        if (tiro== true){
                            quiengana();
                            if (tiradas<5 && ganar==false && ganapc==false){
                                tirapc3(tiradas);
                            }
                            quiengana();
                            checa();
                        }
                    }
                });

                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean tiro= false;
                        if (matriz[6]==0){
                            b7.setText("x");
                            matriz[6]=1;
                            tiradas++;
                            tiro=true;
                        }
                        if (tiro== true){
                            quiengana();
                            if (tiradas<5 && ganar==false && ganapc==false){
                                tirapc3(tiradas);
                            }
                            quiengana();
                            checa();
                        }
                    }
                });

                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean tiro= false;
                        if (matriz[7]==0){
                            b8.setText("x");
                            matriz[7]=1;
                            tiradas++;
                            tiro=true;
                        }
                        if (tiro== true){
                            quiengana();
                            if (tiradas<5 && ganar==false && ganapc==false){
                                tirapc3(tiradas);
                            }
                            quiengana();
                            checa();
                        }
                    }
                });

                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean tiro= false;
                        if (matriz[8]==0){
                            b9.setText("x");
                            matriz[8]=1;
                            tiradas++;
                            tiro=true;
                        }
                        if (tiro== true){
                            quiengana();
                            if (tiradas<5 && ganar==false && ganapc==false){
                                tirapc3(tiradas);
                            }
                            quiengana();
                            checa();
                        }
                    }
                });



            }
            public void quiengana(){
                if(matriz[0]==1 && matriz [1]==1 && matriz[2]==1){
                    ganar=true;
                }
                if(matriz[3]==1 && matriz [4]==1 && matriz[5]==1){
                    ganar=true;
                }
                if(matriz[6]==1 && matriz [7]==1 && matriz[8]==1){
                    ganar=true;
                }
                if(matriz[0]==1 && matriz [3]==1 && matriz[6]==1){
                    ganar=true;
                }
                if(matriz[1]==1 && matriz [4]==1 && matriz[7]==1){
                    ganar=true;
                }
                if(matriz[8]==1 && matriz [5]==1 && matriz[2]==1){
                    ganar=true;
                }
                if(matriz[0]==1 && matriz [4]==1 && matriz[8]==1){
                    ganar=true;
                }
                if(matriz[2]==1 && matriz [4]==1 && matriz[6]==1){
                    ganar=true;
                }
                //ganapc
                if(matriz[0]==2 && matriz [1]==2 && matriz[2]==2){
                    ganapc=true;
                }
                if(matriz[3]==2 && matriz [4]==2 && matriz[5]==2){
                    ganapc=true;
                }
                if(matriz[6]==2 && matriz [7]==2 && matriz[8]==2){
                    ganapc=true;
                }
                if(matriz[0]==2 && matriz [3]==2 && matriz[6]==2){
                    ganapc=true;
                }
                if(matriz[1]==2 && matriz [4]==2 && matriz[7]==2){
                    ganapc=true;
                }
                if(matriz[8]==2 && matriz [5]==2 && matriz[2]==2){
                    ganapc=true;
                }
                if(matriz[0]==2 && matriz [4]==2 && matriz[8]==2){
                    ganapc=true;
                }
                if(matriz[2]==2 && matriz [4]==2 && matriz[6]==2){
                    ganapc=true;
                }

            }
            public void inicio(){
                int h=(int)(8*Math.random());
                if(h<=5){
                    matriz[4]=2;
                    b5.setText("o");
                    b5.setEnabled(false);
                }else{
                    esquina();
                }
            }
            public void tirapc3(int i){
                if (i==1){
                    if(matriz[4]==0){
                        matriz[4]=2;
                        b5.setText("o");
                        b5.setEnabled(false);
                    }else{
                        esquina();
                    }
                } else{
                    boolean x,y;
                    x=bloqueo();
                    if (x==false){
                        y=ganarpc1();
                        if (y==false){
                            tirapc();
                        }
                    }
                }
                if(i==4){
                    winpl.setText("bien jugado");
                }

            }
            public void esquina(){
                int esquinas[] = {0,2,6,8};
                int x=(int)(4*Math.random());
                aleatorio=esquinas[x];
                if (matriz[aleatorio]==0){
                    matriz[aleatorio]=2;
                    switch (x){
                        case 0:
                            b1.setText("o");
                            b1.setEnabled(false);
                            break;
                        case 1:
                            b3.setText("o");
                            b3.setEnabled(false);
                            break;
                        case 2:
                            b7.setText("o");
                            b7.setEnabled(false);
                            break;
                        case 3:
                            b9.setText("o");
                            b9.setEnabled(false);
                            break;
                        default:
                            break;
                    }
                }else{
                    esquina();
                }
            }
            public void tirapc(){
                aleatorio=(int)(8*Math.random())+1;
                if (matriz[aleatorio]==0){
                    matriz[aleatorio]=2;
                    switch (aleatorio){
                        case 0:
                            b1.setText("o");
                            b1.setEnabled(false);
                            break;
                        case 1:
                            b2.setText("o");
                            b2.setEnabled(false);
                            break;
                        case 2:
                            b3.setText("o");
                            b3.setEnabled(false);
                            break;
                        case 3:
                            b4.setText("o");
                            b4.setEnabled(false);
                            break;
                        case 4:
                            b5.setText("o");
                            b5.setEnabled(false);
                            break;
                        case 5:
                            b6.setText("o");
                            b6.setEnabled(false);
                            break;
                        case 6:
                            b7.setText("o");
                            b7.setEnabled(false);
                            break;
                        case 7:
                            b8.setText("o");
                            b8.setEnabled(false);
                            break;
                        case 8:
                            b9.setText("o");
                            b9.setEnabled(false);
                            break;
                    }
                }else {
                    tirapc();
                }
            }
    public void checa(){
        if(ganar==true){
            winpl.setText("ganaste :("+jugador.getText().toString());
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        if(ganapc==true){
            winpl.setText("Te gane att:pc");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        if(tiradas==5 && ganapc==false && ganar==false){
            winpl.setText("Nos quedamos empate");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    }
    public boolean bloqueo(){
        boolean x=false;
        int i=0;
        if(matriz[0]==1 && matriz [1]==1 && matriz[2]==0){
            if(i==0){
                matriz[2]=2;
                b3.setText("o");
                b3.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[0]==1 && matriz [1]==0 && matriz[2]==1){
            if(i==0){
                matriz[1]=2;
                b2.setText("o");
                b2.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[0]==0 && matriz [1]==1 && matriz[2]==1){
            if(i==0){
                matriz[0]=2;
                b1.setText("o");
                b1.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[3]==1 && matriz [4]==1 && matriz[5]==0){
            if(i==0){
                matriz[5]=2;
                b6.setText("o");
                b6.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[3]==1 && matriz [4]==0 && matriz[5]==1){
            if(i==0){
                matriz[4]=2;
                b5.setText("o");
                b5.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[3]==0 && matriz [4]==1 && matriz[5]==1){
            if(i==0){
                matriz[3]=2;
                b4.setText("o");
                b4.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[6]==0 && matriz [7]==1 && matriz[8]==1){
            if(i==0){
                matriz[6]=2;
                b7.setText("o");
                b7.setEnabled(false);
                x=true;
            }
            i++;
        }
            if(matriz[6]==1 && matriz [7]==0 && matriz[8]==1){
                if(i==0){
                    matriz[7]=2;
                    b8.setText("o");
                    b8.setEnabled(false);
                    x=true;
                }
                i++;
            }
            if(matriz[6]==1 && matriz [7]==1 && matriz[8]==0){
                if(i==0){
                    matriz[8]=2;
                    b9.setText("o");
                    b9.setEnabled(false);
                    x=true;
                }
                i++;
            }
            if(matriz[0]==0 && matriz [3]==1 && matriz[6]==1){
                if(i==0){
                    matriz[0]=2;
                    b1.setText("o");
                    b1.setEnabled(false);
                    x=true;
                }
                i++;
            }
            if(matriz[0]==1 && matriz [3]==0 && matriz[6]==1){
                if(i==0){
                    matriz[3]=2;
                    b4.setText("o");
                    b4.setEnabled(false);
                    x=true;
                }
                i++;
            }
            if(matriz[0]==1 && matriz [3]==1 && matriz[6]==0){
                if(i==0){
                    matriz[6]=2;
                    b7.setText("o");
                    b7.setEnabled(false);
                    x=true;
                }
                i++;
            }
            if(matriz[1]==0 && matriz [4]==1 && matriz[7]==1){
                if(i==0){
                    matriz[1]=2;
                    b2.setText("o");
                    b2.setEnabled(false);
                    x=true;
                }
                i++;
            }
            if(matriz[1]==1 && matriz [4]==0 && matriz[7]==1){
                if(i==0){
                    matriz[4]=2;
                    b5.setText("o");
                    b5.setEnabled(false);
                    x=true;
                }
                i++;
            }
            if(matriz[1]==1 && matriz [4]==1 && matriz[7]==0){
                if(i==0){
                    matriz[7]=2;
                    b8.setText("o");
                    b8.setEnabled(false);
                    x=true;
                }
                i++;
            }
            if(matriz[8]==0 && matriz [5]==1 && matriz[2]==1){
                if(i==0){
                    matriz[8]=2;
                    b9.setText("o");
                    b9.setEnabled(false);
                    x=true;
                }
                i++;
            }
            if(matriz[8]==1 && matriz [5]==0 && matriz[2]==1){
                if(i==0){
                    matriz[5]=2;
                    b6.setText("o");
                    b6.setEnabled(false);
                    x=true;
                }
                i++;
            }
            if(matriz[8]==1 && matriz [5]==1 && matriz[2]==0){
                if(i==0){
                    matriz[2]=2;
                    b3.setText("o");
                    b3.setEnabled(false);
                    x=true;
                }
                i++;
            }
            if(matriz[0]==0 && matriz [4]==1 && matriz[8]==1){
                if(i==0){
                    matriz[0]=2;
                    b1.setText("o");
                    b1.setEnabled(false);
                    x=true;
                }
                i++;
            }
            if(matriz[0]==1 && matriz [4]==0 && matriz[8]==1){
                if(i==0){
                    matriz[4]=2;
                    b5.setText("o");
                    b5.setEnabled(false);
                    x=true;
                }
                i++;
            }
            if(matriz[0]==1 && matriz [4]==1 && matriz[8]==0){
                if(i==0){
                    matriz[8]=2;
                    b9.setText("o");
                    b9.setEnabled(false);
                    x=true;
                }
                i++;
            }
            if(matriz[2]==0 && matriz [4]==1 && matriz[6]==1){
                if(i==0){
                    matriz[2]=2;
                    b3.setText("o");
                    b3.setEnabled(false);
                    x=true;
                }
                i++;
            }
                if(matriz[2]==1 && matriz [4]==0 && matriz[6]==1){
                    if(i==0){
                        matriz[4]=2;
                        b5.setText("o");
                        b5.setEnabled(false);
                        x=true;
                    }
                    i++;
                }
                if(matriz[2]==1 && matriz [4]==1 && matriz[6]==0){
                    if(i==0){
                        matriz[6]=2;
                        b7.setText("o");
                        b7.setEnabled(false);
                        x=true;
                    }
                    i++;
                }
                return x;
            };
    public boolean ganarpc1(){
        boolean x=false;
        int i=0;
        if(matriz[0]==2 && matriz [1]==2 && matriz[2]==0){
            if(i==0){
                matriz[2]=2;
                b3.setText("o");
                b3.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[0]==2 && matriz [1]==0 && matriz[2]==2){
            if(i==0){
                matriz[1]=2;
                b2.setText("o");
                b2.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[0]==0 && matriz [1]==2 && matriz[2]==2){
            if(i==0){
                matriz[0]=2;
                b1.setText("o");
                b1.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[3]==2 && matriz [4]==2 && matriz[5]==0){
            if(i==0){
                matriz[5]=2;
                b6.setText("o");
                b6.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[3]==2 && matriz [4]==0 && matriz[5]==2){
            if(i==0){
                matriz[4]=2;
                b5.setText("o");
                b5.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[3]==0 && matriz [4]==2 && matriz[5]==2){
            if(i==0){
                matriz[3]=2;
                b4.setText("o");
                b4.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[6]==0 && matriz [7]==2 && matriz[8]==2){
            if(i==0){
                matriz[6]=2;
                b7.setText("o");
                b7.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[6]==2 && matriz [7]==0 && matriz[8]==2){
            if(i==0){
                matriz[7]=2;
                b8.setText("o");
                b8.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[6]==2 && matriz [7]==2 && matriz[8]==0){
            if(i==0){
                matriz[8]=2;
                b9.setText("o");
                b9.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[0]==0 && matriz [3]==2 && matriz[6]==2){
            if(i==0){
                matriz[0]=2;
                b1.setText("o");
                b1.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[0]==2 && matriz [3]==0 && matriz[6]==2){
            if(i==0){
                matriz[3]=2;
                b4.setText("o");
                b4.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[0]==2 && matriz [3]==2 && matriz[6]==0){
            if(i==0){
                matriz[6]=2;
                b7.setText("o");
                b7.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[1]==0 && matriz [4]==2 && matriz[7]==2){
            if(i==0){
                matriz[1]=2;
                b2.setText("o");
                b2.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[1]==2 && matriz [4]==0 && matriz[7]==2){
            if(i==0){
                matriz[4]=2;
                b5.setText("o");
                b5.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[1]==2 && matriz [4]==2 && matriz[7]==0){
            if(i==0){
                matriz[7]=2;
                b8.setText("o");
                b8.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[8]==0 && matriz [5]==2 && matriz[2]==2){
            if(i==0){
                matriz[8]=2;
                b9.setText("o");
                b9.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[8]==2 && matriz [5]==0 && matriz[2]==2){
            if(i==0){
                matriz[5]=2;
                b6.setText("o");
                b6.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[8]==2 && matriz [5]==2 && matriz[2]==0){
            if(i==0){
                matriz[2]=2;
                b3.setText("o");
                b3.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[0]==0 && matriz [4]==2 && matriz[8]==2){
            if(i==0){
                matriz[0]=2;
                b1.setText("o");
                b1.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[0]==2 && matriz [4]==0 && matriz[8]==2){
            if(i==0){
                matriz[4]=2;
                b5.setText("o");
                b5.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[0]==2 && matriz [4]==2 && matriz[8]==0){
            if(i==0){
                matriz[8]=2;
                b9.setText("o");
                b9.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[2]==0 && matriz [4]==1 && matriz[6]==1){
            if(i==0){
                matriz[2]=2;
                b3.setText("o");
                b3.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[2]==1 && matriz [4]==0 && matriz[6]==1){
            if(i==0){
                matriz[4]=2;
                b5.setText("o");
                b5.setEnabled(false);
                x=true;
            }
            i++;
        }
        if(matriz[2]==2 && matriz [4]==2 && matriz[6]==0){
            if(i==0){
                matriz[6]=2;
                b7.setText("o");
                b7.setEnabled(false);
                x=true;
            }
            i++;
        }
        return x;
    };
}