package methal.akel.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button eklebuton;
    ArrayList<MyMovieData> myMovieData;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eklebuton = findViewById(R.id.eklebuton);


        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myMovieData = new ArrayList<>();
        click();
        myMovieData.add(new MyMovieData("Venom","2018 film",R.drawable.avatar));
        //myMovieData.add(new MyMovieData("Batman Begins","2005 film",R.drawable.avatar));
        //myMovieData.add(new MyMovieData("Jumanji","2019 film",R.drawable.avatar));
        //myMovieData.add(new MyMovieData("Good Deeds","2012 film",R.drawable.avatar));
        //myMovieData.add(new MyMovieData("Avatar","2009 film",R.drawable.avatar));

                /*,
                new MyMovieData("),
                ,
                ,
                ,
                ,

                 */


        MyMovieAdapter myMovieAdapter = new MyMovieAdapter(myMovieData,MainActivity.this);
        recyclerView.setAdapter(myMovieAdapter);
    }


    public void click(){
        eklebuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMovieData.add(new MyMovieData("Hulk","2003 film",R.drawable.avatar));
                MyMovieAdapter myMovieAdapter = new MyMovieAdapter(myMovieData,MainActivity.this);
                recyclerView.setAdapter(myMovieAdapter);

            }
        });
    }
}