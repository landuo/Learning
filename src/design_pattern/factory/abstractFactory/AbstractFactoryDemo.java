package design_pattern.factory.abstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
//        数据库为 MySQL 时只需要创建 MySQL 的工厂即可
//        DbFactory factory = new MySQLFactory();
        DbFactory factory = new OracleFactory();
        IUser user = factory.createUser();
        user.insertUser();
        user.getUser();
        IDepartment department = factory.createDepartment();
        department.insertDepartment();
        department.getDepartment();

    }
}
