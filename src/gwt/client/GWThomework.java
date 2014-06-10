package gwt.client;



import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.sun.org.apache.xpath.internal.operations.Gt;


public class GWThomework implements EntryPoint {
	


	
	private final GreetingServiceAsync greetingService = Gt
			.create(GreetingService.class);

	
	public void homepage() {
		Button subMit = new Button("solve");
		final TextBox a = new TextBox();
		final TextBox b = new TextBox();
		final TextBox c = new TextBox();
		final HTML res = new HTML();
		RootPanel.get("a").add(a);
		RootPanel.get("b").add(b);
		RootPanel.get("c").add(c);
		RootPanel.get("sub_cell").add(subMit);
		RootPanel.get("res").add(res);
		subMit.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				
				String params = a.getText() + ";" + b.getText() + ";"
						+ c.getText();
				greetingService.greetServer(params,
						new AsyncCallback<String>() {

					

				
						});
			}
		});
	}
}
