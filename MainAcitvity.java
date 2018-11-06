package game.ticktaktoe;

import android.media.Image;
import android.support.v4.widget.ImageViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int y = 1;
    int z = 0;
    String b1x= "";
    String b2x= "";
    String b3x= "";
    String b4x= "";
    String b5x= "";
    String b6x= "";
    String b7x= "";
    String b8x= "";
    String b9x= "";
    TextView textElement;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button1);









    }

    public void buttonOnClick(View v) {
        TextView textElement = (TextView) findViewById(R.id.textView2);
        if (y == 1){
            b1x = "x";
            Button button=(Button) v;
            ((Button) v).setText(b1x);
            y = 0;
        }
        else{
            b1x = "o";
            Button button=(Button) v;
            ((Button) v).setText(b1x);
            y = 1;


        }

        playeronewins();
        playertwowins();

    }

    public void buttonOnClick2(View v){
        TextView textElement = (TextView) findViewById(R.id.textView2);
        if (y == 1){
            b2x = "x";
            Button button=(Button) v;
            ((Button) v).setText(b2x);
            y = 0;
        }
        else{
            b2x = "o";
            Button button=(Button) v;
            ((Button) v).setText(b2x);
            y = 1;


        }
        playeronewins();
        playertwowins();
    }
    public void buttonOnClick3(View v){
        TextView textElement = (TextView) findViewById(R.id.textView2);
        if (y == 1){
            b3x = "x";
            Button button=(Button) v;
            ((Button) v).setText(b3x);
            y = 0;

        }
        else{
            b3x = "o";
            Button button=(Button) v;
            ((Button) v).setText(b3x);
            y = 1;



        }
        playeronewins();
        playertwowins();
    }
    public void buttonOnClick4(View v){
        TextView textElement = (TextView) findViewById(R.id.textView2);
        if (y == 1){
            b4x = "x";
            Button button=(Button) v;
            ((Button) v).setText(b4x);
            y = 0;

        }
        else{
            b4x = "o";
            Button button=(Button) v;
            ((Button) v).setText(b4x);
            y = 1;



        }
        playeronewins();
        playertwowins();
    }
    public void buttonOnClick5(View v){
        TextView textElement = (TextView) findViewById(R.id.textView2);
        if (y == 1){
            b5x = "x";
            Button button=(Button) v;
            ((Button) v).setText(b5x);
            y = 0;

        }
        else{
            b5x = "o";
            Button button=(Button) v;
            ((Button) v).setText(b5x);
            y = 1;



        }
        playeronewins();
        playertwowins();
    }
    public void buttonOnClick6(View v){
        TextView textElement = (TextView) findViewById(R.id.textView2);
        if (y == 1){
            b6x = "x";
            Button button=(Button) v;
            ((Button) v).setText(b6x);
            y = 0;

        }
        else{
            b6x = "o";
            Button button=(Button) v;
            ((Button) v).setText(b6x);
            y = 1;



        }
        playeronewins();
        playertwowins();
    }
    public void buttonOnClick7(View v){
        TextView textElement = (TextView) findViewById(R.id.textView2);
        if (y == 1){
            b7x = "x";
            Button button=(Button) v;
            ((Button) v).setText(b7x);
            y = 0;

        }
        else{
            b7x = "o";
            Button button=(Button) v;
            ((Button) v).setText(b7x);
            y = 1;



        }
        playeronewins();
        playertwowins();
    }
    public void buttonOnClick8(View v){
        TextView textElement = (TextView) findViewById(R.id.textView2);
        if (y == 1){
            b8x = "x";
            Button button=(Button) v;
            ((Button) v).setText(b8x);
            y = 0;

        }
        else{
            b8x = "o";
            Button button=(Button) v;
            ((Button) v).setText(b8x);
            y = 1;



        }

        playeronewins();
        playertwowins();
    }
    public void buttonOnClick9(View v){
        TextView textElement = (TextView) findViewById(R.id.textView2);
        if (y == 1){
            b9x = "x";
            Button button=(Button) v;
            ((Button) v).setText(b9x);
            y = 0;

        }
        else{
            b9x = "o";
            Button button=(Button) v;
            ((Button) v).setText(b9x);
            y = 1;



        }
        playeronewins();
        playertwowins();
    }

    public void playeronewins(){
        TextView textElement = (TextView) findViewById(R.id.textView2);
        if(b1x.equals("x") && b2x.equals("x") && b3x.equals("x")){
            textElement.setText("Player 1 wins");

        }
        else if(b4x.equals("x") && b5x.equals("x") && b6x.equals("x")){
            textElement.setText("Player 1 wins");
        }
        else if(b7x.equals("x") && b8x.equals("x") && b9x.equals("x")){
            textElement.setText("Player 1 wins");
        }
        else if(b1x.equals("x") && b5x.equals("x") && b9x.equals("x")){
            textElement.setText("Player 1 wins");
        }
        else if(b3x.equals("x") && b5x.equals("x") && b7x.equals("x")){
            textElement.setText("Player 1 wins");
        }
        else if(b1x.equals("x") && b4x.equals("x") && b7x.equals("x")){
            textElement.setText("Player 1 wins");
        }
        else if(b3x.equals("x") && b6x.equals("x") && b9x.equals("x")){
            textElement.setText("Player 1 wins");
        }
        if(b2x.equals("x") && b5x.equals("x") && b8x.equals("x")){
            textElement.setText("Player 1 wins");
        }

    }
    public void playertwowins(){
        TextView textElement = (TextView) findViewById(R.id.textView2);
        if(b1x.equals("o") && b2x.equals("o") && b3x.equals("o")){
            textElement.setText("Player 2 wins");

        }
        else if(b4x.equals("o") && b5x.equals("o") && b6x.equals("o")){
            textElement.setText("Player 2 wins");
        }
        else if(b7x.equals("o") && b8x.equals("o") && b9x.equals("o")){
            textElement.setText("Player 2 wins");
        }
        else if(b1x.equals("o") && b5x.equals("o") && b9x.equals("o")){
            textElement.setText("Player 2 wins");
        }
        else if(b3x.equals("o") && b5x.equals("o") && b7x.equals("o")){
            textElement.setText("Player 2 wins");
        }
        else if(b1x.equals("o") && b4x.equals("o") && b7x.equals("o")){
            textElement.setText("Player 2 wins");
        }
        else if(b3x.equals("o") && b6x.equals("o") && b9x.equals("o")){
            textElement.setText("Player 2 wins");
        }
        if(b2x.equals("o") && b5x.equals("o") && b8x.equals("o")){
            textElement.setText("Player 2 wins");
        }


    }



}
