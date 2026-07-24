import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    
        int start=0;
        int end=999;
        
        int count=0;
        for(int i=0;i<a.size();i++)
        {
            if(start<a.get(i))
            {
                start=a.get(i);
            }
        }
        for(int i=0;i<b.size();i++)
        {
            if(end>b.get(i))
            {
                end=b.get(i);
            }
        }
        for(int i=start;i<=end;i++)
        {
            boolean valid=true;
            for(int j=0;j<a.size();j++)
            {
                if(i%a.get(j)!=0)
                {
                    valid=false;
                    break;
                }
            }
            if(valid)
            {
                for(int j=0;j<b.size();j++)
                {
                    if(b.get(j)%i!=0)
                    {
                        valid=false;
                        
                        break;
                    }
                }
            }
            if(valid)
            {
                count++;
            }
        }
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
