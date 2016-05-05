package ligang.huse.cn.parallax;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private String[] indexArr = {"A", "B", "C", "D", "E", "F", "G", "H",
            "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
            "V", "W", "X", "Y", "Z"};
    private ParallaxListView parallax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();//去掉标题栏
        setContentView(R.layout.activity_main);
        parallax = (ParallaxListView) findViewById(R.id.parallax);
        parallax.setOverScrollMode(ListView.OVER_SCROLL_NEVER);//永远不显示蓝色阴影
        View headview = View.inflate(getApplicationContext(), R.layout.layout_header, null);
        ImageView imageView = (ImageView) headview.findViewById(R.id.imageView);
        parallax.addHeaderView(headview);
        parallax.setImageView(imageView);
        parallax.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, indexArr));

    }
}
