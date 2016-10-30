package cn.s07150818edu.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void b1(View v){
        Toast.makeText(this,"我早会了",Toast.LENGTH_LONG).show();
    }
    public void b2(View v){
        LayoutInflater lf=getLayoutInflater();
        View vroot=lf.inflate(R.layout.toastroot,null);
        LinearLayout ll=(LinearLayout)vroot.findViewById(R.id.clayout);
        lf.inflate(R.layout.toastinfo,ll);
        Toast toast=new Toast(this);
        toast.setView(vroot);
        toast.show();
    }
    public  void  b3(View v){
        Toast toast=Toast.makeText(this,"GD图片显示啦",Toast.LENGTH_LONG);
        LinearLayout ll=new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ImageView mImage=new ImageView(this);
        mImage.setImageResource(R.drawable.gd);
        View toastView=toast.getView();
        ll.addView(mImage);
        ll.addView(toastView);
        toast.setView(ll);
        toast.show();
    }
}
