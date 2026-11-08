class Main {
    public static void main(String[] args) {
        if (args.length > 0 && "--help".equals(args[0])) {
            System.out.println("Использование: java Main [--help|--version]");
            return;
        }
        if (args.length > 0 && "--version".equals(args[0])) {
            System.out.println("Практическая работа №6, ветка dev");
            return;
        }
        System.out.print("Это добавлено в ветке dev");
    }
}