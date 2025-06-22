package repository;

public interface AkunRepository {
    boolean register(String username, String password, String role, String gender);
    
    boolean login(String username, String password);
    
    String getRole(String username);
    
    static String showEror() {
        return "Failed to Retrieve";
    }
    
    default String hasingError() {
        return "Hashing Error";
    }
    
}
