package fiona.apple;

import java.util.Map;

public interface Command {
	void setState(Map<String, Object> state);
    Object execute();
}
