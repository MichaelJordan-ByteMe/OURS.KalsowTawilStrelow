/**
 * 
 */
package edu.csbsju.cs;

/**
 * @author ntawil001 and bkalsow001 and rstrelow001
 *
 */
public class SimplePrint {

	private String myName;
	private int pAge;
	/**
	 * @param myName
	 * @param pAge
	 */
	public SimplePrint(String pName, int pAge) {
		super();
		this.myName = pName;
		this.pAge = pAge;
	}

	/**
	 * @param pName the pName to set
	 */
	public void setpName(String pName) {
		this.pName = pName;
	}

	/**
	 * @param pAge the pAge to set
	 */
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	/**
	 * 
	 */
	public SimplePrint() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tawil, Kalsow, Strelow");
		for(int i=0; i<args.length;i++)
		{
			System.out.println("args[ " + i + " ] = " + args[i] );
		}
	}

}
