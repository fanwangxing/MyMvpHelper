package fan.mymvphelper.presenter;

import fan.mymvphelper.contract.LoginContract;

/**
 * Created by Administrator on 2018/4/17.
 */

public class LoginPresenter extends LoginContract.Presenter {
    @Override
    public void login(String name, String password) {
        if(mModel.login(name,password)){
            mView.loginSuccess();
        }

    }
}
