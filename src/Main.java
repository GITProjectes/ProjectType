
public class Main {

	String text = "An interface for events that know how to dispatch themselves. By implementing this interface an event can be placed upon the event queue and its dispatch() method will be called when the event is dispatched, using the EventDispatchThread.This is a very useful mechanism for avoiding deadlocks. If a thread is executing in a critical section (i.e., it has entered one or more monitors), calling other synchronized code may cause deadlocks. To avoid the potential deadlocks, an ActiveEvent can be created to run the second section of code at later time. If there is contention on the monitor, the second thread will simply block until the first thread has finished its work and exited its monitors.For security reasons, it is often desirable to use an ActiveEvent to avoid calling untrusted code from a critical thread. For instance, peer implementations can use this facility to avoid making calls into user code from a system thread. Doing so avoids potential deadlocks and denial-of-service attacks.";
	String words[] = {};
	String[] words2;

	public static void main(String[] args) {
		new Main();
	}

	public String clearLitter(String text) {
		text = text.replaceAll("[\\W]+[\\s]+", " ");//
		text = text.replaceAll("[-]+", " ");//
		text = text.replaceAll(".$", "");//
		return text;
	}

	public String[] changeTextToArray(String text) {
		String[] words = text.split(" ");
		return words;
	}

	public String[] changeArrayToLowerCase(String[] words) {
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].toLowerCase();
		}
		return words;
	}

	public void printlnArray(String[] words) {
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}

	public Main() {
		text = clearLitter(text);
		words = changeTextToArray(text);
		words = changeArrayToLowerCase(words);
		printlnArray(words);
	}
}
