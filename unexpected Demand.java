// unexpected Demand

class Result {

    /*
     * Complete the 'filledOrders' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY order
     *  2. INTEGER k
     */

    public static int filledOrders(List<Integer> order, int k) {
        Collections.sort(order);
        int fullfilledOrders = 0;
        
        for(int ordersQuantity : order){
            if(k>= ordersQuantity){
                k -= ordersQuantity;
                fullfilledOrders++;
            }
            else{
                break;
            }
        }
        return fullfilledOrders;

    }

}
// hello
