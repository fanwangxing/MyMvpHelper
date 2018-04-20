package fan.mymvphelper.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import fan.mymvphelper.MyApplication;
import fan.mymvphelper.R;
import fan.mymvphelper.base.BaseActivity;
import fan.mymvphelper.contract.LoginContract;
import fan.mymvphelper.model.LoginModel;
import fan.mymvphelper.presenter.LoginPresenter;

/**
 * Created by Administrator on 2018/4/17.
 */

public class LoginActivity extends BaseActivity<LoginPresenter,LoginModel> implements LoginContract.View {


    private android.widget.EditText username;
    private android.widget.EditText password;
    private android.widget.Button login;


    @Override
    protected void setView() {
        setContentView(R.layout.activity_login);
    }


    @Override
    protected void initView() {
        this.login = (Button) findViewById(R.id.login);
        this.password = (EditText) findViewById(R.id.password);
        this.username = (EditText) findViewById(R.id.username);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myApplication.THEME_FLAG = 2;
                LoginActivity.super.recreate();
//                mPersenter.login(username.getText().toString(),password.getText().toString());
            }
        });

    }

    @Override
    protected void setLisener() {

    }

    @Override
    protected void initData() {

    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this, "登陆成功", Toast.LENGTH_SHORT).show();

    }
}
