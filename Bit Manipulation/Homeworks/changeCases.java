/*
input:
A
a
A

output:
a
A
a
*/

import java.util.Scanner;

class Main {
  public static char toLower(char big) {
    return (char) (big | (1 << 5));
  }

  public static char toUpper(char small) {
    return (char) (small & (~(1 << 5)));
  }
