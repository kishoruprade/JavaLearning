package accessSpecifiers;

import functionPkg.PublicClass;

public class Public {

	private class PrivateClass {
		private String ac = "selenium";
		public String getString()
		{
		return ac;
		}

	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PublicClass.add();

	}

}
