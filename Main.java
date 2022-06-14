class Main {
  public static void main(String[] args) {

        int[] list = {18, 67, 12, 34, 54, 98, 47};

            selectionSort(list);

        }


        public static void selectionSort(int data[]) {
            int in, out, min;
            for (out=0; out < data.length-1; out++) {
                min = out;
                for (in = out+1; in < data.length; in++) {
                    if (data[in] < data[min]) {
                        min = in;            // new minimum
                    }
                }
                int tmp = data[out];     // swap items
                data[out] = data[min];   //
                data[min] = tmp;		   //
                for (int i = 0; i < data.length; i++)
                    System.out.print(data[i] + " ");
                System.out.println();
            }
        }
}