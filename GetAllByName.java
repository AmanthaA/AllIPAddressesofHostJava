import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Amantha - https://www.linkedin.com/in/amanthaa/
 */
public class GetAllByName {
    
    final static String WEBADDRESS = "www.google.com"; //try localhost
    
    public static void main(String[] args) {
        
        try {
            InetAddress[] addresses = InetAddress.getAllByName(WEBADDRESS);
            for(int i=0;i<addresses.length;i++){
                System.out.println(addresses[i]);
            }
        } catch (UnknownHostException ex) {
            System.out.println(ex);
        }
    }
    
}
