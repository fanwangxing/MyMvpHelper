package fan.mymvphelper.base;

/**
 * Created by Administrator on 2018/4/17.
 */

public abstract class BasePresenter<M,V> {
    public M mModel;
    public V mView;
    public void setVM(V view,M model){
        this.mModel = model;
        this.mView = view;
    }
}
