/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentcar;

/**
 *
 * @author A455L
 */
public class UserSession {

    private static String username;
    private static String userID;


    public static void setUserLogin(String username) {
        UserSession.username = username;

    }
    
    public static void setUserID(String userID) {
        UserSession.userID = userID;

    }
    
    public static String getUserLogin() {
        return username;
    }
    
    public static String getUserID() {
        return userID;
    }
}
