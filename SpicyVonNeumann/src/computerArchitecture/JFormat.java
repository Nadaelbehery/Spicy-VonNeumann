package computerArchitecture;

public class JFormat extends Instructions{
   int address;
   
	public JFormat(int ID,String instruction) {
		super(ID,instruction);
	}
	public void decode() {
		super.decode();
		String add=instruction.substring(4, 32);
		address=Integer.parseInt(add,2);
	}
   
}