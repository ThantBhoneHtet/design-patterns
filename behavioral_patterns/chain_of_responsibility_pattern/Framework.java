package chain_of_responsibility_pattern;

import java.util.ArrayList;
import java.util.List;

public class Framework {
	List<Handler> handlers = new ArrayList<>();
	
	void use(Handler handler)
	{
		this.handlers.add(handler);
	}
	void process(Request request)
	{
		for(Handler handler: this.handlers)
		{
			handler.handle(request);
		}
	}
}