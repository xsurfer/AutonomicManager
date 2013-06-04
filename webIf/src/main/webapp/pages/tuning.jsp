<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title><s:text name="MyCloud.message" /></title>
<link
	href="${pageContext.request.contextPath}/assets/css/per_page/tuning.css"
	type="text/css" media="screen" rel="stylesheet" />

<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/fancybox/jquery.fancybox.css" type="text/css" media="screen" />

<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/tuning.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/fancybox/jquery.fancybox.pack.js"></script>
<script src="http://malsup.github.com/jquery.form.js"></script>
</head>

<body>
	<!-- Promo -->
	<div id="col-top"></div>
	<div class="box" id="col">

		<div id="ribbon"></div>
		<!-- /ribbon (design/ribbon.gif) -->

		<!-- Screenshot in browser (replace tmp/browser.gif) -->
		<div id="col-browser"></div>

		<div id="col-text">

			<h2>Tuning</h2>
			<!-- <h2 id="slogan"><span><s:property value="message"/></span></h2> -->

			<!-- SCALE FORM -->
			<form id="scale" action="#" method="post">
			
				<!-- RESOURCE -->
				<div class="resource">
					<fieldset class="resource">
						<legend>Scale:</legend>
						
						<!-- CURRENT -->
						<div class="current">
							<ol>
								<li><label for="current_scale">Current
										configuration:</label> <input readonly="readonly" type="text"
									name="current_scale" id="current_scale" size="3" value="4" /></li>
								<li><label for="current_opt_scale">Current optimal
										configuration:</label> <input readonly="readonly" type="text"
									name="current_opt_scale" id="current_opt_scale" size="3"
									value="5" /></li>
							</ol>
						</div>						
						
						<!-- TUNING -->
						<div class="tuning">
							<ol>
								<li>
									<div class="radio_tuning">
										<input type="radio" name="scale_tuning" value="manual">
										Manual tuning
									</div>
									<div class="conf_tuning">
										<fieldset name="scale_tuning_manual">
											<input type="text" name="scale_size" id=scale_conf size="3" />
											<select name="scale_type">
												<option value="analytical">Small</option>
												<option value="simulator">Medium</option>
												<option value="ml">Large</option>
											</select>
										</fieldset>
									</div>		

								</li>
								<li>
									<div class="radio_tuning">
										<input type="radio" name="scale_tuning" value="self">Self-tuning
									</div>
									<div class="conf_tuning">
										<fieldset name="scale_tuning_self">
											<!-- <label for="wr_tx_local_exec_time">Forecasting method:</label> -->
											<select name="scale_forecasting" class="forecasting">
												<option value="analytical">Analytical Method</option>
												<option value="simulator">Simulator</option>
												<option value="ml">Machine Learning</option>
											</select>
										</fieldset>										
									</div>
									
								</li>
							</ol>
						</div>
						
						<!-- CONTROL -->
						<div class="control">
							<input type="submit" value="Set" />
						</div>
					</fieldset>
				</div>
			</form>

			<!-- REPLICATION DEGREE FORM -->
			<form>
			
				<!-- RESOURCE -->
				<div class="resource">
					<fieldset class="resource">
						<legend>Replication Degree:</legend>
						
						<!-- CURRENT -->
						<div class="current">
							<ol>
								<li><label for="current_scale">Current
										configuration:</label> <input readonly="readonly" type="text"
									name="current_rep_degree" id="current_scale" size="3" value="4" /></li>
								<li><label for="current_opt_scale">Current optimal
										configuration:</label> <input readonly="readonly" type="text"
									name="current_opt_rep_degree" id="current_opt_scale" size="3"
									value="5" /></li>
							</ol>
						</div>						
						
						<!-- TUNING -->
						<div class="tuning">
							<ol>
								<li>
									<div class="radio_tuning">
										<input type="radio" name="rep_degree_tuning" value="manual">
										Manual tuning
									</div>
									<div class="conf_tuning">
										<fieldset name="rep_degree_tuning_manual">
											<input type="text" name="rep_degree_size" id=scale_conf size="3" />											
										</fieldset>
									</div>	
									

								</li>
								<li>
									<div class="radio_tuning">
										<input type="radio" name="rep_degree_tuning" value="self">Self-tuning
									</div>
									<div class="conf_tuning">
										<fieldset name="rep_degree_tuning_self">
											<!-- <label for="wr_tx_local_exec_time">Forecasting method:</label> -->
											<select name="rep_degree_forecasting" class="forecasting">
												<option value="analytical">Analytical Method</option>
												<option value="simulator">Simulator</option>
												<option value="ml">Machine Learning</option>
											</select>
										</fieldset>										
									</div>
																		
								</li>
							</ol>
						</div>
						
						<!-- CONTROL -->
						<div class="control">
							<input type="submit" value="Set" />
						</div>
					</fieldset>
				</div>
			</form>

			<!-- PROTOCOL SWITCHING FORM -->
			<form>
			
				<!-- RESOURCE -->
				<div class="resource">
					<fieldset class="resource">
						<legend>Protocol Switching:</legend>
						
						<!-- CURRENT -->
						<div class="current">
							<ol>
								<li><label for="current_rep_protocol">Current
										configuration:</label> <input readonly="readonly" type="text"
									name="current_rep_protocol" id="current_scale" size="3" value="4" /></li>
								<li><label for="current_opt_rep_protocol">Current optimal
										configuration:</label> <input readonly="readonly" type="text"
									name="current_opt_rep_protocol" id="current_opt_scale" size="3"
									value="5" /></li>
							</ol>
						</div>						
						
						<!-- TUNING -->
						<div class="tuning">
							<ol>
								<li>
									<div class="radio_tuning">
										<input type="radio" name="rep_protocol_tuning" value="manual">
										Manual tuning
									</div>
									<div class="conf_tuning">
										<fieldset name="rep_protocol_tuning_manual">
											<input type="text" name="rep_degree_size" id=scale_conf size="3" />											
										</fieldset>
									</div>	
									

								</li>
								<li>
									<div class="radio_tuning">
										<input type="radio" name="rep_protocol_tuning" value="self">Self-tuning
									</div>
									<div class="conf_tuning">
										<fieldset name="rep_protocol_tuning_self">
											<!-- <label for="wr_tx_local_exec_time">Forecasting method:</label> -->
											<select name="rep_protocol_forecasting" class="forecasting">
												<option value="analytical">Analytical Method</option>
												<option value="simulator">Simulator</option>
												<option value="ml">Machine Learning</option>
											</select>
										</fieldset>										
									</div>
																		
								</li>
							</ol>
						</div>
						
						<!-- CONTROL -->
						<div class="control">
							<input type="submit" value="Set" />
						</div>
					</fieldset>
				</div>
			</form>

			<!-- DATA PLACEMENT FORM -->
			<form>
			
				<!-- RESOURCE -->
				<div class="resource">
					<fieldset class="resource">
						<legend>Data Placement:</legend>
						
						<!-- CURRENT -->
						<div class="current">
							<ol>
								<li><label for="current_data_placement">Current
										configuration:</label> <input readonly="readonly" type="text"
									name="current_data_placement" size="3" value="4" /></li>
								<li><label for="current_opt_data_placement">Current optimal
										configuration:</label> <input readonly="readonly" type="text"
									name="current_opt_data_placement" size="3"
									value="5" /></li>
							</ol>
						</div>						
						
						<!-- TUNING -->
						<div class="tuning">
							<ol>
								<li>
									<div class="radio_tuning">
										
									</div>
									<div class="conf_tuning">
										<input type="checkbox" name="data_placement_tuning" value="Bike">Self-tuning										
									</div>									
								</li>
							</ol>
						</div>
						
						<!-- CONTROL -->
						<div class="control">
							<input type="submit" value="Set" />
						</div>
					</fieldset>
				</div>
			</form>

		</div>
		<!-- /col-text -->

	</div>
	<!-- /col -->
	<div id="col-bottom"></div>

	<hr class="noscreen">
	<hr class="noscreen">
</body>
</html>



