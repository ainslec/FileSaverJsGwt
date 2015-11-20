package org.consoli.filesaverdemo.client;

import org.consoli.filesaver.client.FileSaver;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * @author Chris Ainsley
 */
public class FileSaverDemo implements EntryPoint {

	private TextArea _ta;
	private Button _button;
	private TextBox _filename;
	
	public void onModuleLoad() {
		VerticalPanel vp = generateForm();
		RootPanel.get().add(vp);
	}

	public VerticalPanel generateForm() {
		VerticalPanel p = new VerticalPanel();
		
		p.add(new Label("Filename"));
		
		//NOTE : We do not perform validation of filename here because simple demo project
		
		_filename = new TextBox();

		_filename.setText("sample.txt");
		p.add(_filename);
		
		p.add(new Label("File Contents"));
		
		_ta = new TextArea();
		_ta.setText("This is the sample text to be placed in the downloaded file. The generated file is generated entirely in-memory then downloaded from the browser to the local file system without the server being involved.\r\n\r\nThe file contents will be UTF-8 format.\r\n\r\nIt is advised to normalize EOL characters to suit the client platform, such conversions are not in the scope of this component.");
		_ta.setWidth("400px");
		_ta.setHeight("300px");
		p.add(_ta);
		
		_button = new Button("Generate File");
		_button.setTitle("Generates a file entirely on the client (no server involved).");
		
		_button.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				final String fileContents = _ta.getText();
				final String fileName = _filename.getText().trim();
				if (fileName.trim().length() > 0) {
					FileSaver.saveText(fileName, fileContents);
				}
			}
		});
		
		p.add(_button);
		return p;
	}
}