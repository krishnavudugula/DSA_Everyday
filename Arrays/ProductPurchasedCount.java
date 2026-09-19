class ProductPurchasedCount {
    public static void main(String[] args) {

        int[] nums = {10, 20, 10, 30, 20, 10, 20, 30, 40};

        int n = nums.length;

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;  

            for (int j = i + 1; j < n; j++) {

                if (nums[i] == nums[j]) {

                    count++;

                    visited[j] = true;
                }
            }
                System.out.println("product " + nums[i] + " purchased " + count + " times");
        }
    }
}