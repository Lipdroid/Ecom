package lipdroid.ecom.Utils;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;

public class APIUtils {
    public static Context sContext = null;

    public APIUtils(Context context) {
        sContext = context;
    }

    public static HashMap<String, Object> parseJSON(int type, String jsonString) {
        HashMap<String, Object> returnHashMap = new HashMap<String, Object>();
        try {
            JSONObject mainJsonObj = new JSONObject(jsonString);
            JSONObject jsonObj = new JSONObject();
            JSONArray jsonArr = new JSONArray();
            String error = new String();
            String result = new String();
            int code = 0;

            switch (type) {
                case 1:

                    break;


                default:
                    break;
            }
        } catch (Exception e) {
                 e.printStackTrace();
        }

        return returnHashMap;
    }



}
