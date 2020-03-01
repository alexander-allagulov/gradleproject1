/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

import java.util.Properties;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author aallagul
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("=== Hello gradle ===");

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    LocalDateTime date = LocalDateTime.now();

    for (int i = 0; i < 1000; i++) {
      date = LocalDateTime.now();
      System.out.println("i = " + i + " " + formatter.format(date));
      Thread.sleep(5000L);
    }

  }
  
}
