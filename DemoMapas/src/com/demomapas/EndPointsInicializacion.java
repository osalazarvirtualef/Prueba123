package com.demomapas;
import com.demomapas.deviceinfoendpoint.Deviceinfoendpoint;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.virtualef.pgj.service.agentService.AgentService;
import com.virtualef.pgj.service.agentService.model.AgentDto;


public class EndPointsInicializacion {
	
	public EndPointsInicializacion() {
		// TODO Auto-generated constructor stub
	}
	
	public AgentService InicializacionAgent(){
		AgentService AgentEndpoint;
		AgentService.Builder agentEndpointbuilder = new AgentService.Builder(
				AndroidHttp.newCompatibleTransport(), new JacksonFactory(),
				new HttpRequestInitializer() {

					@Override
					public void initialize(HttpRequest arg0) {
						// TODO Auto-generated method stub
					}
				});
	
		AgentEndpoint = CloudEndpointUtils.updateBuilder(agentEndpointbuilder).build();
		return AgentEndpoint;
		
		
	}
	                    
	

}
