package eu.cloudtm.statistics;

/**
 * Created with IntelliJ IDEA.
 * User: fabio
 * Date: 7/8/13
 * Time: 3:57 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Sample {

    public long getId();

    public double getParam(Param param);

}
