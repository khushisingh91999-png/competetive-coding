public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean left = true;
            boolean right = true;

            // Check left side
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    left = false;
                    break;
                }
            }

            // Check right side
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    right = false;
                    break;
                }
            }

            if (left && right) {
                System.out.println("Pivot Element: " + arr[i]);
                return;
            }
        }

        System.out.println("No Pivot Element Found");
    }
}