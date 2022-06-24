package com.java.gen;

public class Agent {

	private int agentId;
	private String agentName;
	
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", agentName=" + agentName + "]";
	}
	
	
}
