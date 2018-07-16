package io.github.ytam.customsnackbartoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

        CustomToast.success(this, "This is success message");

    }

    @OnClick(R.id.btnError) void clickError(){

        CustomToast.error(this, "This is error message");
    }

    @OnClick(R.id.btnInfo) void clickInfo(){

        CustomToast.info(this, "This is info message");

    }

    @OnClick(R.id.btnWarning) void clickWarning(){

        CustomToast.warning(this, "This is warning message");

    }


}
