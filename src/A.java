class A {
    static void b(int x){
        System.out.println("Arguments = "+ x);
    }
    static void b(int y, int z){
        System.out.println("Arguments = "+ y + " and " + z);
    }

    public static void main(String[] args) {
        b(3, 5);
        b(8);
    }
}
