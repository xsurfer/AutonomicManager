package eu.cloudtm.controller;

import eu.cloudtm.common.dto.WhatIfCustomParamDTO;
import eu.cloudtm.controller.model.KPI;
import eu.cloudtm.stats.Sample;

import java.util.Set;

/**
 * Created by: Fabio Perfetti
 * E-mail: perfabio87@gmail.com
 * Date: 6/12/13
 */
public interface IOracle {

    public KPI minimizeCosts(Sample sample, double arrivalRate, double abortRate, double responseTime);

    public KPI maximizeThroughput(Sample sample);

    public Set<KPI> whatIf(Sample sample, WhatIfCustomParamDTO customParam);

    public KPI forecast(Sample sample, int numNodes, int numThreads);

    public KPI forecastWithCustomParam(Sample sample, WhatIfCustomParamDTO customParam, int numNodes, int numThreads);

}