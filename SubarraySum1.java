    /* Given an unsorted array arr of nonnegative
	integers and an integer sum, find a continuous subarray which
	adds to a given sum. There may be more than one subarrays with 
	sum as the given sum, print first such subarray.  */
class SubarraySum1 {

    int subarraySum(int arr[], int n, int sum)
    {
        int currentSum, i, j;

        // Pick a starting point
        for (i = 0; i < n; i++) {
            currentSum = arr[i];
			System.out.println();
              System.out.print("Anchor " +i+"="+currentSum);
            // try all subarrays starting with 'i'
            for (j = i + 1; j <= n; j++) {
                if (currentSum == sum) {
                    int p = j - 1;
					System.out.println();
                    System.out.println(
                        "Sum was found from the index " + i
                        + " to " + p);
                    return 1;
                }else if(currentSum > sum || j == n)
				{
                     break;
				}
                currentSum = currentSum + arr[j];
				System.out.print("   Sarr["+j+"]="+currentSum);
            }
        }

        System.out.println("No subarray found");
        return 0;
    }

    public static void main(String[] args)
    {
        SubarraySum1 arraySum = new SubarraySum1();
        int arr[] = { 12, 2, 3, 8, 9, 7, 11, 23, 13 };
        int n = arr.length;
        int sum = 27;
        arraySum.subarraySum(arr, n, sum);
    }
}