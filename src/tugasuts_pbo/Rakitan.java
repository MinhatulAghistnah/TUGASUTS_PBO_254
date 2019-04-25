
package tugasuts_pbo;

/**
 *
 * @author MINHATUL A
 */
public class Rakitan {

    public static void main(String[] args) {
        Intel intel1 = new Intel(2);
        AMD amd1 = new AMD(3);
        Komputer komputer1 = new Komputer (intel1);
        
        komputer1.cetakInfo();
        komputer1.memasang(intel1);
        komputer1.mencabut(amd1);
        komputer1.cetakInfo();
    }
    
}
