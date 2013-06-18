package eu.cloudtm.stats;

import eu.cloudtm.StatsManager;
import eu.cloudtm.wpm.connector.WPMConnector;
import eu.cloudtm.wpm.logService.remote.events.PublishViewChangeEvent;
import eu.cloudtm.wpm.logService.remote.events.SubscribeEvent;
import eu.cloudtm.wpm.logService.remote.listeners.WPMStatisticsRemoteListener;
import eu.cloudtm.wpm.logService.remote.listeners.WPMViewChangeRemoteListener;
import eu.cloudtm.wpm.logService.remote.observables.Handle;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.rmi.RemoteException;
import java.util.Arrays;

/**
 * Created by: Fabio Perfetti
 * E-mail: perfabio87@gmail.com
 * Date: 6/7/13
 */
public class WPMViewChangeRemoteListenerImpl implements WPMViewChangeRemoteListener {

    private final static Log log = LogFactory.getLog(WPMViewChangeRemoteListenerImpl.class);

    private WPMConnector connector;
    private StatsManager manager;
    private Handle lastVmHandle;

    private String[] currentVMs;

    public WPMViewChangeRemoteListenerImpl(WPMConnector _connector, StatsManager _manager){
        connector = _connector;
        manager = _manager;
    }

    @Override
    public void onViewChange(PublishViewChangeEvent event)
            throws RemoteException {

        if (lastVmHandle != null) {
            log.trace("Removing last handle");
            connector.removeStatisticsRemoteListener(lastVmHandle);
            lastVmHandle = null;
        }


        currentVMs = event.getCurrentVMs();

        if (currentVMs == null) {
            log.info("The set of VMs is empty. No-op");
            return;
        }

        log.info("New set of VMs " + Arrays.toString(currentVMs));

        WPMStatisticsRemoteListener listener = new WPMStatisticsRemoteListenerImpl();

        lastVmHandle = connector.registerStatisticsRemoteListener(new SubscribeEvent(currentVMs), listener);
    }

}
