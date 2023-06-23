package computerArchitecture;

public class RegisterFile {
  private int[] generalRegisters;
  private int PC;
  

	public RegisterFile() {
		generalRegisters=new int[32];
		generalRegisters[0]=0;
		generalRegisters[5]=4;
		generalRegisters[6]=12;


	}
	public void setPc(int PC) {
		this.PC=PC;
	}
	public int getPc() {
		return this.PC;
	}
	public int[] getRegister() {
		return generalRegisters;
	}
	public void printReg() {
		System.out.println("PC " +": "+PC+" ");
	   for(int i=0 ; i<generalRegisters.length ; i++) {
		   System.out.print("Register "+i +":"+generalRegisters[i]+" ");
	   }
	   System.out.println("");
	}
	
}
