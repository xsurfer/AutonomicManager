package eu.cloudtm.autonomicManager.workloadAnalyzer;

import eu.cloudtm.autonomicManager.ControllerLogger;
import eu.cloudtm.autonomicManager.Optimizer;
import eu.cloudtm.autonomicManager.Reconfigurator;
import eu.cloudtm.oracles.exceptions.OracleException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: fabio
 * Date: 7/19/13
 * Time: 5:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class PureReactiveAlertManager extends AlertManager {

    private static Log log = LogFactory.getLog(PureReactiveAlertManager.class);

    private ReentrantLock reconfigurationLock = new ReentrantLock();

    public PureReactiveAlertManager(Optimizer optimizer,
                                    Reconfigurator reconfigurator) {
        super(optimizer, reconfigurator);
    }

    @Override
    public void workloadChanged(WorkloadEvent event) {

        if(!reconfigurator.isReconfiguring()){
            if( reconfigurationLock.tryLock() ){
                try{
                    optimizer.optimize(event.getSample());
                } catch (OracleException e) {
                    ControllerLogger.log.warn("Exception thrown querying oracles");
                } finally {
                    reconfigurationLock.unlock();
                }
            }
        }
    }

    @Override
    public void workloadWillChange(WorkloadEvent e) {

    }
}
