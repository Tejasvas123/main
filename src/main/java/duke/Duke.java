package duke;

import duke.logic.commands.Command;
import duke.exceptions.DukeException;
import duke.models.LockerList;
import duke.parser.Parser;
import duke.storage.Storage;
import duke.storage.StorageManager;
import duke.ui.Ui;

public class Duke {
    private Ui ui;
    private Storage storage;
    private LockerList lockers;
    private Parser parser;

    private static final String FILE_NAME_FOR_STORAGE = "data.json";

    /**
     * Instantiates the SpongeBob class by loading data from a file.
     * @param filename stores the file name from which the data is being loaded.
     */
    public Duke(String filename) {
        try {
            ui = new Ui();
            parser = new Parser();
            storage = new StorageManager(filename);
            lockers = new LockerList(storage.retrieveData().getAllLockers());
        } catch (DukeException e) {
            ui.showLoadingError(e.getMessage());
            lockers = new LockerList();
        }
    }

    /**
     *  executes various tasks/commands related to SpongeBob.
     */
    public void run() {
        ui.showWelcome();
        boolean isExit = false;
        while (!isExit) {
            try {
                String fullCommand = ui.readCommand();
                ui.printDash();
                Command c = parser.parse(fullCommand);
                c.execute(lockers, ui, storage);
                isExit = c.isExit();
            } catch (DukeException e) {
                ui.showError(e.getMessage());
            }
        }
    }

    /**
     * Responsible for instantiating SpongeBob with the file name "data.json".
     * data.json is the file from which the data is loaded for the list of lockers.
     * @param args contains the supplied command-line arguments as an array of String objects.
     */
    public static void main(String[] args) {
        new Duke(FILE_NAME_FOR_STORAGE).run();
    }
}