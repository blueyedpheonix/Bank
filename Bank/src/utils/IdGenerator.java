package utils;

public class IdGenerator {
    private static int AccountID;
    private static int ClientID;
    public static int getAccountID(){
        return ++AccountID;
    }
    public static int getClientID(){
        return ++ClientID;
    }
}
