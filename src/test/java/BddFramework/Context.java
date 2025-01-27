package BddFramework;

import java.util.HashMap;
import java.util.Map;

public class Context {

    Map<String,String> mapData;

    public Context(){
        mapData=new HashMap<>();
    }

    //setter
    public void setMapData(String key,String value){
       mapData.put(key, value);
    }

    //getter
    public String getMapData(String key){
       return mapData.get(key);
    }
}
