class MethodOverloading {
    void display(int a, double b){
        System.out.println("Method 1");
    }
    void display(int a, double b, double c){
        System.out.println("Method 2");
    }
    public static void main(String[] args) {
    MethodOverloading mol = new MethodOverloading();
    mol.display(1, 7);
    mol.display(2,4.67, 7.87765);
    }
}
