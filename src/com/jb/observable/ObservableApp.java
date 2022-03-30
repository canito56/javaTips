package com.jb.observable;

public class ObservableApp {

	public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("logfile.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("jorge.bardaro@gmail.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
