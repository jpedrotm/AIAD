package agents;

import java.util.List;

import sajas.core.*;

public abstract class IAgent extends sajas.core.Agent{
	public static enum Type {
			EXPLORATORY_DRIVER,
			RATIONAL_DRIVER,
			PARKING_FACILITY
	}
	public static int tick = 0;
	
	public String id;
	public Type type;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	public static void updateTick() {
		++IAgent.tick;
	}
	
	
	public List<String> getTransportAvailable() {
		return null;
	}
}
