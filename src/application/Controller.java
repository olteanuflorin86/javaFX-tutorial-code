package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

public class Controller implements Initializable {

	@FXML
	private WebView myWebView;
	
//	@FXML
//	private Button loadButton;
	
	@FXML
	private TextField textField;
	
	private WebEngine engine;
	
	private WebHistory webHistory;
	
	private String homePage;
	
	private double webZoom;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		engine = myWebView.getEngine();
		homePage = "www.google.com";
		textField.setText(homePage);
//		webZoom = myWebView.getZoom();
		webZoom = 1;
		loadPage();
	}

	public void loadPage() {		
//		engine.load("http://www.google.com");
		String textFieldValue = textField.getText();
		engine.load("http://" + textFieldValue);
	}

	public void refreshPage() {
		engine.reload();
	}
	
	public void zoomIn() {
		webZoom=webZoom*1.25;
		myWebView.setZoom(webZoom);
	}
	
	public void zoomOut() {
		webZoom=webZoom*0.75;
		myWebView.setZoom(webZoom);
	}

	public void displayHistory() {
		
		webHistory = engine.getHistory();
		ObservableList<WebHistory.Entry> entries = webHistory.getEntries();
		
		for(WebHistory.Entry entry : entries) {
			System.out.println(entry);
			System.out.println(entry.getUrl() + " " + entry.getLastVisitedDate());
		}
	}
	
	public void goBack() {
		webHistory = engine.getHistory();
		ObservableList<WebHistory.Entry> entries = webHistory.getEntries();
		webHistory.go(-1);
		textField.setText(entries.get(webHistory.getCurrentIndex()).getUrl());
	}
	
	public void goForward() {
		webHistory = engine.getHistory();
		ObservableList<WebHistory.Entry> entries = webHistory.getEntries();
		webHistory.go(1);
		textField.setText(entries.get(webHistory.getCurrentIndex()).getUrl());
	}
	
	public void executeJS() {
		engine.executeScript("window.location = \"http://youtube.com\";");
	}
}
