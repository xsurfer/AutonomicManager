package eu.cloudtm.commons;

import com.google.gson.Gson;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by: Fabio Perfetti
 * E-mail: perfabio87@gmail.com
 * Date: 6/1/13
 */
public class PlatformTuning {

    private static Log log = LogFactory.getLog(PlatformTuning.class);

    private Forecaster scaleForecaster;

    private Forecaster protocolForecaster;

    private Forecaster degreeForecaster;


    public Forecaster scaleForecaster(){
        return scaleForecaster;
    }

    public Forecaster protocolForecaster(){
        return protocolForecaster;
    }

    public Forecaster degreeForecaster(){
        return degreeForecaster;
    }



    public void setScaleForecaster(Forecaster _forecaster){
        scaleForecaster = _forecaster;
    }

    public void setProtocolForecaster(Forecaster _forecaster){
        scaleForecaster = _forecaster;
    }

    public void setDegreeForecaster(Forecaster _forecaster){
        scaleForecaster = _forecaster;
    }


    public PlatformTuning toJSON() {
        log.info("TO IMPLEMENT");
        Gson gson = new Gson();
        PlatformTuning state = gson.fromJson(gson.toJson(this), PlatformTuning.class);
        return state;
    }
}
