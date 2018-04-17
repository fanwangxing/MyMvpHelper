package fan.mymvphelper.base;

import java.lang.reflect.ParameterizedType;

/**
 * Created by Administrator on 2018/4/17.
 */

public class TUtil {
    public static <T> T getT(Object object,int i){
        try {
            return ((Class<T>)((ParameterizedType)(object.getClass().getGenericSuperclass())).getActualTypeArguments()[i]).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
