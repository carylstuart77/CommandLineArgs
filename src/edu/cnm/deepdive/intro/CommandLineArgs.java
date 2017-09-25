package edu.cnm.deepdive.intro;
//One Line comment
/*
  block comment
 */

/**
 * Javadoc comment
 * This class demontrates iteration over command line arguments.
 * @author Caryl Stuart
 */
public class CommandLineArgs {

  private static final String ARGUMENT_FORMAT = "Argument %d = %s%n";

  /**
   * Iterates through the arguments <code>args</code> printing each one.
   * <p>
   *   Some more description blah.
   * </p>
   * @param args command line arguments
   */
    public static void main(String[] args){
      //each args is feed into argument
      //for (String argument : args){
      //Basic or traditional for
      //
      /*  for (int i =0; i < args.length; i++){
          String argument = args[i];
        System.out.printf("%d: %s%n", i, argument);
        */
      for (int i = args.length - 1; i >= 0; i--) {
        String argument = args[i];
      System.out.printf(ARGUMENT_FORMAT, i, argument);

    }
    }
}
