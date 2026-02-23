/**
 * @author Ojas Gangrade
 * @version 5.0
 * OOPSBannerApp - Uses inline array initialization for conciseness
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] bannerLines = {
            String.join("", "  *     *     ***    ***  "),
            String.join("", " * *   * *   *   *  *   * "),
            String.join("", "*   * *   *  *   *  *   * "),
            String.join("", "*   * *   *  *   *  *   * "),
            String.join("", "*   * *   *  *   *  *   * "),
            String.join("", " * *   * *   *   *  *   * "),
            String.join("", "  *     *     ***    ***  ")
        };
        
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
