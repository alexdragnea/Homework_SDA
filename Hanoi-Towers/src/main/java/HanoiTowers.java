public class HanoiTowers {

  public static void hanoiTowers(int n, char source, char destination, char aux) {
    if (n == 0)
    {
      return;
    }
    hanoiTowers(n - 1, source, aux, destination);
    System.out.println("Move disk "+ n + " from rod " +
            source +" to rod " + destination );
    hanoiTowers(n - 1, aux, destination, source);
  }

  public static void main(String[] args) {
    hanoiTowers(4, 'A', 'C', 'B');
  }
}
