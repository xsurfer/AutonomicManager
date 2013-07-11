package eu.cloudtm.commons;

import com.google.gson.Gson;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 * Created by: Fabio Perfetti
 * E-mail: perfabio87@gmail.com
 * Date: 6/1/13
 */
public class PlatformConfiguration {

    private static Log log = LogFactory.getLog(PlatformConfiguration.class);


    /* SCALE */
    private int platformSize = 2;
    private int threadPerNode = 2;
    private InstanceConfig nodesConfig = InstanceConfig.MEDIUM;

    /* REP PROT */
    private ReplicationProtocol replicationProtocol = ReplicationProtocol.TWOPC;

    /* REP DEGREE */
    private int replicationDegree = 2;

    /* DATA PLACEMENT */
    private Boolean dataPlacement = false;

    public PlatformConfiguration(){
    }


    /* *** GETTER *** */

    public int platformSize(){
        return this.platformSize;
    }

    public int threadPerNode(){
        return this.threadPerNode;
    }

    public InstanceConfig nodeConfiguration(){
        return this.nodesConfig;
    }

    public ReplicationProtocol replicationProtocol(){
        return this.replicationProtocol;
    }

    public int replicationDegree(){
        return this.replicationDegree;
    }

    public boolean isDataPlacement(){
        return dataPlacement;
    }

    /* ************************ *** */
    /* *** SCALE UPDATE METHODS *** */
    /* ************************ *** */

    public void setPlatformScale(int _size, InstanceConfig _nodesConfig){
        if( _size<=0 || _nodesConfig == null )
            throw new IllegalArgumentException("Configuration not acceptable!");
        platformSize = _size;
        nodesConfig = _nodesConfig;
    }


    /* ******************************* *** */
    /* *** REP PROTOCOL UPDATE METHODS *** */
    /* ******************************* *** */

    public void setRepProtocol(ReplicationProtocol _repProtocol){
        replicationProtocol = _repProtocol;
    }

    /* ***************************** *** */
    /* *** REP DEGREE UPDATE METHODS *** */
    /* ***************************** *** */

    public void setRepDegree(int _repDegree){
        replicationDegree = _repDegree;
    }

    /* ********************************* *** */
    /* *** DATA PLACEMENT UPDATE METHODS *** */
    /* ********************************* *** */

    public void setDataPlacement(boolean enabled){
        dataPlacement = true;
    }



    public PlatformConfiguration toJSON() {
        log.info("TO IMPLEMENT");
        Gson gson = new Gson();
        PlatformConfiguration state = gson.fromJson(gson.toJson(this), PlatformConfiguration.class);
        return state;
    }
}