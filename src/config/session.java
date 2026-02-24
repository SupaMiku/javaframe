/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author USER34
 */
public class session {
    

    private static session instance;

    private int a_id;
    private String username;
    private String email;
    private String type;
    private String status;

    // Private constructor — prevents direct instantiation
    private session() { }

    // ✅ Get the single instance
    public static synchronized session getInstance() {
        if (instance == null) {
            instance = new session();
        }
        return instance;
    }

    // ✅ Check if anyone is logged in
    public static boolean isLoggedIn() {
        return instance != null;
    }

    // ✅ Clear session on logout
    public static void clear() {
        instance = null;
    }

    // Getters and Setters
    public int getA_id() { return a_id; }
    public void setA_id(int a_id) { this.a_id = a_id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    
}

    

