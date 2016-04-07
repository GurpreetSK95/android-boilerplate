package nyc.friendlyrobot.sample.data.remote;

import nyc.friendlyrobot.sample.data.model.Foo;
import retrofit2.http.GET;
import retrofit2.http.Header;
import rx.Observable;

public interface Api {

    String ENDPOINT = "https://api.ribot.io/";

    @GET("ribots")
    Observable<Foo> foo(@Header("fresh") String fresh);
}
