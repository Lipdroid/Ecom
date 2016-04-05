package lipdroid.ecom;

import android.content.Context;

import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/**
 * Created by WebHawks IT on 4/5/2016.
 */

import android.app.Application;


/**
 * Created by Administrator on 6/16/2015.
 */
public class EcomApplication extends Application {
    private static final String TAG_LOG = "EcomApplication";
    private static Context sContext = null;
    @Override
    public void onCreate() {
        super.onCreate();

    }
    public static Context getCanpassContext() {
        return sContext;
    }


}


