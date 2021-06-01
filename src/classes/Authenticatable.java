package classes;
/*
 * Interface that allows for password checks in other classes
 */

public interface Authenticatable {
	void setPassw(String passw);
	boolean checkPassw(String passw);
}
