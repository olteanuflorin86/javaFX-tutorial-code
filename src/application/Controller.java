package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller implements Initializable {

	@FXML
	private TreeView<String> myTreeView;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		TreeItem<String> rootItem = new TreeItem<>("Files",
				new ImageView(new Image("Folder_Icon.png"))); 
		
		TreeItem<String> branchItem1 = new TreeItem<>("Pictures");
		TreeItem<String> branchItem2 = new TreeItem<>("Videos");
		TreeItem<String> branchItem3 = new TreeItem<>("Music");
		
		TreeItem<String> leafItem1 = new TreeItem<>("picture1");
		TreeItem<String> leafItem2 = new TreeItem<>("picture2");
		TreeItem<String> leafItem3 = new TreeItem<>("video1");
		TreeItem<String> leafItem4 = new TreeItem<>("video2");
		TreeItem<String> leafItem5 = new TreeItem<>("music1");
		TreeItem<String> leafItem6 = new TreeItem<>("music2");
		
		branchItem1.getChildren().add(leafItem1);
		branchItem1.getChildren().add(leafItem2);
		branchItem2.getChildren().add(leafItem3);
		branchItem2.getChildren().add(leafItem4);
		branchItem3.getChildren().add(leafItem5);
		branchItem3.getChildren().add(leafItem6);
		
		rootItem.getChildren().addAll(branchItem1,branchItem2,branchItem3);
				
//		myTreeView.setShowRoot(false);
		myTreeView.setRoot(rootItem);
	}

	public void selectItem() {
		
		TreeItem<String> selectedItem = myTreeView.getSelectionModel().getSelectedItem();
		if(selectedItem != null) {
			String selectedItemAsString = selectedItem.getValue();
			System.out.println(selectedItemAsString);
		}
	}

}
