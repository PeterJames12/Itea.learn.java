package pro;

public interface Itemable {
	void setCharacteristics(int item_id)throws Exception;
	int[] getCharacteristics();
	public String getName();
}
