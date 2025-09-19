
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter water mass in kg): ");
        double mass = input.nextDouble();

        System.out.print("Enter initial temperature in Celsius: ");
        double initial = input.nextDouble();

        System.out.print("Enter final temperature in Celsius: ");
        double finalTemp = input.nextDouble();

        double energy = mass * (finalTemp - initial) * 4184;

        System.out.println("Energy needed: " + energy + " joules");

        input.close();
    }
}