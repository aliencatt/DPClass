package DP.DP_In_Class.Singleton;

public class Principal {

    private static Principal principal = null;

    private Principal() {

    }

    public synchronized static Principal getPrincipal() {

//    ASingleton result = instance;
//    if (result == null) {
//      synchronized (mutex) {
//        result = instance;
//        if (result == null)
//          instance = result = new ASingleton();
//      }
//    }
//    return result;

        Principal p = principal;
        if (principal == null) {
            synchronized (p) {
                p = principal;
            }
            // principal = new Principal();
        }
        return principal;
    }

    void givePersmission() {
        System.out.println("Permission Granted.....");
    }

    void frameRules() {
        System.out.println("Rules Framed......");
    }

}
