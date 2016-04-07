package nyc.friendlyrobot.sample.ui.main;

import java.util.List;

import nyc.friendlyrobot.sample.data.model.Loo;
import nyc.friendlyrobot.sample.ui.base.MvpView;

public interface MainMvpView extends MvpView {

    void showLoo(List<Loo> ribots);

    void showError();

}
