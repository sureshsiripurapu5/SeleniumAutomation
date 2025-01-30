package allAboutSelenium.bddFrameWorkTask;

import java.util.HashMap;
import java.util.Map;

public class Context {

    Map<String, String> mapData;

    public Context(){
        mapData = new HashMap<>();
    }

    public void setContext(String key, String value){
        mapData.put(key,value);
    }

    public String getContext(String key){
        return  mapData.get(key);
    }
}
