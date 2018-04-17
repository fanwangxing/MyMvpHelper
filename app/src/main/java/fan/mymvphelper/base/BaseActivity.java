package fan.mymvphelper.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 2018/4/17.
 */

public abstract class BaseActivity<P extends BasePresenter,M extends BaseModel> extends Activity {
    public P mPersenter;
    public M mModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        setContentView(getLayoutResID());
        mPersenter = TUtil.getT(this,0);
        mModel = TUtil.getT(this,1);
        if(this instanceof BaseView){
            mPersenter.setVM(this,mModel);
        }

        initView();
    }
    protected abstract int getLayoutResID();
    protected abstract void initView();
}
