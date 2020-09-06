package design_pattern.factory.abstractFactory;

public interface DbFactory {
    IUser createUser();

    IDepartment createDepartment();
}
