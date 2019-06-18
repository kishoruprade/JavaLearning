package inheritance;

public class MultiLevelParent {
	int parentVar =10;

}


class MultiLevelChild extends MultiLevelParent{
	int childVar = 20;
	}

class MutliLevelChildofChild extends MultiLevelChild{
	int childofChildVar = 30;
	String s = "multilevel";
}
