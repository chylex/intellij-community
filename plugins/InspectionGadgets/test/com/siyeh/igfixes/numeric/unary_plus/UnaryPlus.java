class Test {
  void test(int a, int b) {
    int i;
    i = i + - - a;
    i = <caret>+(+ + a++);
    i = +(+ +4);
    i = +(-a) + + - +b;
  }

  void test() {
    byte i = 1;
    test(+i);
  }

  void test(short s) {
  }

  void test(int i) {
  }
}