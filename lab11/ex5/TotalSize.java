package ex5;

public class TotalSize {
    private static final String USAGE_MESSAGE = "Usage:\n" +
            "java TotalSize [-Option] PathName\n" +
            "Options:\n" +
            "   -h: Displays usage message\n" +
            "   -r: Gets size of directories inside given directory as well\n";

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error! No path specified!");
            System.out.println(USAGE_MESSAGE);
            System.exit(1);
        }

        boolean r = false;
        int pathIndex = 0;

        if (args[0].equals("-h")) {
            System.out.println(USAGE_MESSAGE);
            System.exit(0);
        }

        if (args.length >= 2 && args[0].startsWith("-") && args[0].length() == 2) {
            switch (args[0]) {
                case "-r":
                    r = true;
                    break;
                default:
                    System.out.println("Error! Invalid option specified!");
                    System.out.println(USAGE_MESSAGE);
                    System.exit(1);
            }
            pathIndex = 1;
        }

        String path = args[pathIndex];
        System.out.println("Analyzing " + getLastDirectoryName(path));
        MyVisitor v = new MyVisitor();
        System.out.println("Total: " + v.GetSize(path, r) + " kB");
    }

    private static String getLastDirectoryName(String path) {
        String[] pathArr = path.split("/");
        return pathArr[pathArr.length - 1];
    }
}

