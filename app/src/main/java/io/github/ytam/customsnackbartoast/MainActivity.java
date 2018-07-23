package io.github.ytam.customsnackbartoast;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;
import io.github.ytam.customtoast.CustomToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSuccess) void clickSuccess(){

        CustomToast.success(this, "This is success message",Toast.LENGTH_SHORT);

    }

    @OnClick(R.id.btnError) void clickError(){

        CustomToast.error(this, "This is error message",Toast.LENGTH_LONG);
    }

    @OnClick(R.id.btnInfo) void clickInfo(){

        CustomToast.info(this, "This is info message",Toast.LENGTH_LONG);

    }

    @OnClick(R.id.btnWarning) void clickWarning(){

        CustomToast.warning(this, "This is warning message",Toast.LENGTH_LONG);

    }

    @OnClick(R.id.btnNormal) void clickNormal(){

        CustomToast.normal(this, "This is normal message",Toast.LENGTH_LONG);

    }

    @OnClick(R.id.btnOwn) void clickBtnOwn(){

        CustomToast.iconToast(this,"This is custom icon toast", Toast.LENGTH_LONG, Color.parseColor("#6d4c41"),R.drawable.ic_android_black_24dp);

    }
}
