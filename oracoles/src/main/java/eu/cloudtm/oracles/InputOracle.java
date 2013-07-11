package eu.cloudtm.oracles;

import eu.cloudtm.statistics.WPMParam;

/**
 * Created with IntelliJ IDEA.
 * User: fabio
 * Date: 7/10/13
 * Time: 6:43 PM
 * To change this template use File | Settings | File Templates.
 */
public interface InputOracle {

    public Object getPerNodeParam(WPMParam param, String nodeIp);

    public double getAvgParam(WPMParam param);

}