package fan.mymvphelper.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import fan.mymvphelper.MyApplication;
import fan.mymvphelper.R;

/**
 * Created by Administrator on 2018/4/17.
 */

public abstract class BaseActivity<P extends BasePresenter,M extends BaseModel> extends Activity {
    public P mPersenter;
    public M mModel;
    public MyApplication myApplication;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setMyTheme();
        init();
        setView();
        initView();
        setLisener();
        initData();
    }

    private void setMyTheme() {
        myApplication = (MyApplication)getApplication();
        if(myApplication.THEME_FLAG == myApplication.THEME_DAY){
            setTheme(R.style.DayTheme);
        }else if(myApplication.THEME_FLAG == myApplication.THEME_NIGHT){
            setTheme(R.style.LightTheme);
        }
    }

    private void init() {
        mPersenter = TUtil.getT(this,0);
        mModel = TUtil.getT(this,1);
        if(this instanceof BaseView){
            mPersenter.setVM(this,mModel);
        }


    }
    protected abstract void setView();
    protected abstract void initView();
    protected abstract void setLisener();
    protected abstract void initData();
}
