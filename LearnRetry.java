package steps;

import java.util.NoSuchElementException;

public class LearnRetry {
	
public void createLead() {
	System.out.println("Create Lead");
	throw new NoSuchElementException();

}
}
