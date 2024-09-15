public class Conversion{

  public static double footToMeter(double foot){
    return 0.305 * foot;
  }

  public static double meterToFoot(double meter){
    return 3.279 * meter;
  }

  public static void main(String[] args) {
    //table header using "%-10s" to  print stings that take 10 spaces so everything lines up
    System.out.printf("%-10s %-10s | %-10s %-10s\n", "Feet", "Meters", "Meters", "Feet");
    System.out.println("---------------------------------------------------");
  //loop to print results to table
    for (double feet = 1.0; feet <= 10.0; feet++) {
        //feet -> meters starting at 1
        double metersFromFeet = footToMeter(feet);
        //meters -> starting at 20 and incrementing meters by 5 every loop
        double feetFromMeters = meterToFoot(20.0 + (feet - 1) * 5);
        System.out.printf("%-10.1f %-10.3f | %-10.1f %-10.3f\n", feet, metersFromFeet, 20.0 + (feet - 1) * 5, feetFromMeters);
    }
}


}

/* sources used to help me write out the table:
 * number formatting - https://www.geeksforgeeks.org/formatted-output-in-java/
 * 
 * table formatting - https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/Java-print-table-format-printf-chart-console-scanner-println-line
 * 
 *chatgpt to help me figure out how to get the loop working how I wanted it to
 */