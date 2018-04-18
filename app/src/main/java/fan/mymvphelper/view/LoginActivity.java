package fan.mymvphelper.view;

import fan.mymvphelper.R;
import fan.mymvphelper.base.BaseActivity;
import fan.mymvphelper.contract.LoginContract;
import fan.mymvphelper.model.LoginModel;
import fan.mymvphelper.presenter.LoginPresenter;

/**
 * Created by Administrator on 2018/4/17.
 */

public class LoginActivity extends BaseActivity<LoginPresenter,LoginModel> implements LoginContract.View {
    @Override
    protected int getLayoutResID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {


    }

    @Override
    public void loginSuccess() {

    }
}
