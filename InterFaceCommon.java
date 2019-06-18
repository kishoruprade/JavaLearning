package inheritance;

public interface InterFaceCommon {
	void add();
	void delete();
	void multiply();
	void substract();

}
abstract class AbstractInterface implements InterFaceCommon{
	public abstract void add();
}

/*
 * class -->>Class--- extends
 * Class to Inteface --implements
 * Interface to Interface --extends
 * Interface to class -->>not possible
 * 
 */


