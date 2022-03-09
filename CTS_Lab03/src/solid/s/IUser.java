package solid.s;

public interface IUser {

    boolean login(String username, String password);
    boolean register(String username, String email, String password);
    boolean sendEmail(String content);

    void logError(String errorContent);
}
