package packageOne;

public class ToolClass {
	protected int toolsVar = 1000; //non static & protected
	static void  getToolMethod(){  //static & default
		System.out.println();
	}
	protected void setToolMethod(){  //non-static & protected - change value to 2000 & print
		int toolsVar = 2000;
		System.out.println(toolsVar);
	}

}
