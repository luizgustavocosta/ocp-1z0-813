package appendix.c.directories;

import static java.nio.file.StandardWatchEventKinds.OVERFLOW;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;


/**
 * Disclaimer
 * The Watch Service API is designed for applications that need to be notified about file change events. 
 * It is well suited for any application, like an editor or IDE, that potentially has many open files and needs to ensure that the files are synchronized with the file system. 
 * It is also well suited for an application server that watches a directory, perhaps waiting for .jsp or .jar files to drop, in order to deploy them.
 * 
 *
 */
public class MonitoringDirectoryChanges {

	public static void main(String[] args) throws IOException {
		try(WatchService watcher = FileSystems.getDefault().newWatchService()){
			Path zooData = Paths.get("C:\\Users\\lzoa\\Files\\zoo\\data");
			Path zooLog = Paths.get("C:\\Users\\lzoa\\Files\\zoo\\log");
			
			zooData.register(watcher, StandardWatchEventKinds.ENTRY_CREATE,
					StandardWatchEventKinds.ENTRY_DELETE,
					StandardWatchEventKinds.ENTRY_MODIFY);
			
			zooLog.register(watcher, StandardWatchEventKinds.ENTRY_MODIFY);
			
			// To prevent finish
			for(;;){
				WatchKey key;
				try {
					key = watcher.take();
					for (WatchEvent<?> event : key.pollEvents()) {
						Kind<?> kind = event.kind();
						// This key is registered only
				        // for ENTRY_CREATE events,
				        // but an OVERFLOW event can
				        // occur regardless if events
				        // are lost or discarded.
						if (kind == OVERFLOW)
							continue;
						
						// The filename is the context of the event.
						WatchEvent<Path> ev = (WatchEvent<Path>) event;
						Path filename = ev.context();
						// Verify that the new file is a text file
						try {
				            if (!Files.probeContentType(filename).equals("text/plain")) {
				                System.err.format(kind.name()+ " '%s'" +
				                    " is not a plain text file.%n", filename);
				                continue;
				            } else {
				            	System.err.format(kind.name()+" '%s'" +
					                    " is a plain text file.%n", filename);
				            }
						} catch (Exception e) {
						}
					}
					// Reset the key -- this step is critical if you want to
				    // receive further watch events.  If the key is no longer valid,
				    // the directory is inaccessible so exit the loop.
				    boolean valid = key.reset();
				    if (!valid) {
				        break;
				    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
