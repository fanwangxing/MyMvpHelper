package fan.mymvphelper.contract;

import fan.mymvphelper.base.BaseModel;
import fan.mymvphelper.base.BasePresenter;
import fan.mymvphelper.base.BaseView;

/**
 * Created by Administrator on 2018/4/17.
 */

public interface LoginContract {
    interface Model extends BaseModel {
        boolean login(String username,String password);
    }

    interface View extends BaseView{
        void loginSuccess();
    }

   abstract class Presenter extends BasePresenter<Model,View>{
        public abstract void login(String name,String password);
    }
}
