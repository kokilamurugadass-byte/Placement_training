class SmallestThree {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = 5;

        if (a < b && a < c)
            System.out.println(a + " is smallest");
        else if (b < c)
            System.out.println(b + " is smallest");
        else
            System.out.println(c + " is smallest");
    }
}