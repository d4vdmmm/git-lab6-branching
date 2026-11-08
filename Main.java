class Main {
    public static void main(String[] args) {
        if (args.length > 0 && "--help".equals(args[0])) {
            System.out.println("Использование: java Main [--help]");
            return;
        }

        System.out.print("Это добавлено в ветке dev");
    }
}