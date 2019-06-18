package inheritance;

public class BaseClass {
	String driver = "firefox";

}
class LoginTest extends BaseClass{
	String login = "need driver";
}
class HomeTest  extends BaseClass{
	String home = "need driver";
}
class DashboardTest extends BaseClass{
	String dashboard = "need driver";
}
