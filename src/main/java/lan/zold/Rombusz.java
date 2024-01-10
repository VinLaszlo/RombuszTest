/*
* File: Rombusz.java
* Author: Vinkovits László
* Copyright: 2023, Vinkovits László
* Group: SZOFT II/2/N
* Date: 2023-01-10
* Github: https://github.com/VinLaszlo
* Licenc: GNU GPL
* Warning: A kodban torteno esetlegesen elofordulo hibakert nem all modomban felelosseget vallalni
*/

package lan.zold;

import java.util.InputMismatchException;

public class Rombusz {

  public double calculateArea(double sideLength, double alpha) {
    double beta = 180 - alpha;
    double radAlpha = Math.toRadians(alpha);
    double radBeta = Math.toRadians(beta);
    return Math.pow(sideLength, 2) * Math.sin(radAlpha);
  }

  public double calculatePerimeter(double sideLength) {
    return 4 * sideLength;
  }

  public double calculateArea2(double sideLength, double alpha) {
    if (sideLength <= 0 || alpha <= 0) {
      throw new InputMismatchException();
    }
    return alpha;
  }

  public double calculatePerimeter2(double sideLength) {
    if (sideLength <= 0) {
      throw new InputMismatchException();
    }
    return 4 * sideLength;
  }
}
