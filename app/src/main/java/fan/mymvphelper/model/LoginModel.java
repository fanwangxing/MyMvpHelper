package fan.mymvphelper.model;

import fan.mymvphelper.contract.LoginContract;

/**
 * Created by Administrator on 2018/4/17.
 */

public class LoginModel implements LoginContract.Model {
    @Override
    public boolean login(String username, String password) {
        if("fan".equals(username)){
            return true;
        }
        return false;
    }
}
