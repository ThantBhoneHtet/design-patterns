package template_pattern;

public class TemplateDemo {
	public static void main(String[]args)
	{
		FrameworkAction action = new OrderAction();
		action.action();
		
		action = new InvoiceAction();
		action.action();
		
	}
}
