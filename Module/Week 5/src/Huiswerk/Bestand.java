package Huiswerk;

import java.io.File;
import java.io.IOException;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Bestand extends Stage {

	private FileChooser fileChooser = new FileChooser();
	private String      bestand     = null;
	private File        file;

	public String openTekstBestand() {
		file = this.fileChooser.showOpenDialog(this);

		try {
			this.bestand = file.getCanonicalPath();
		}

		catch(IOException e) {}
		catch (NullPointerException e) {}

		return bestand;
	}
}