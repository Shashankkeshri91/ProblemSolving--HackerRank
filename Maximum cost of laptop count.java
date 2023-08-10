// Maximum cost of laptop count

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'maxCost' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY cost
     *  2. STRING_ARRAY labels
     *  3. INTEGER dailyCount
     */

    public static int maxCost(List<Integer> cost, List<String> labels, int dailyCount) {
        int n = cost.size();
        int maxCost = 0;
        for(int i=0; i<n; i+= dailyCount){
            int dailyCost = 0;
            int legalCount = 0;
            
            for(int j =i; j<i+dailyCount && j<n; j++){
                dailyCost += cost.get(j);
                if(labels. get(j).equals("legal")){
                    legalCount++;
                }
            }
            maxCost = Math.max(maxCost, dailyCost);
            if(legalCount < dailyCount){
                break;
            }
        }
        return maxCost;
    }

}