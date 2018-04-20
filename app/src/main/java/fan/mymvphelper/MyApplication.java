package fan.mymvphelper;

import android.app.Application;

/**
 * Created by Administrator on 2018/4/20.
 */

public class MyApplication extends Application {
    public int THEME_FLAG = 1;
    public final int THEME_DAY = 1;
    public final int THEME_NIGHT = 2;

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
