package design_pattern.factory.abstractFactory;

public class OracleDepartment implements IDepartment {
    @Override
    public void insertDepartment() {
        System.out.println("在 Oracle 中插入一条 department 记录");
    }

    @Override
    public void getDepartment() {
        System.out.println("在 Oracle 中查询 department 记录");
    }
}
