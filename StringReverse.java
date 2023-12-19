class StringReverse{
  public static void main(String []args){
    String str = "Hello World";
    StringBuilder sb = new StringBuilder(str);
    System.out.print(sb.reverse().toString());
  }
}
