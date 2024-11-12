package com.saar.wisetech;


import java.util.*;
import java.util.function.DoubleToIntFunction;

/**
 * Example 1:
 * Input: n = 3, logs = [[1,3],[2,6],[1,5]], x = 5, queries = [10,11]
 * Output: [1,2]
 * Explanation:
 * For queries[0]: The servers with ids 1 and 2 get requests in the duration of [5, 10]. Hence, only server 3 gets zero requests.
 * For queries[1]: Only the server with id 2 gets a request in duration of [6,11]. Hence, the servers with ids 1 and 3 are the only servers that do not receive any requests during that time period.
 * ------------------------------------------------------------------------------------------------------------------------
 * Example 2:
 * Input: n = 3, logs = [[2,4],[2,1],[1,2],[3,1]], x = 2, queries = [3,4]
 * Output: [0,1]
 * Explanation:
 * For queries[0]: All servers get at least one request in the duration of [1, 3].
 * For queries[1]: Only server with id 3 gets no request in the duration [2,4].
 * ------------------------------------------------------------------------------------------------------------------------
 * set 0: [1,2,3]
 *
 *
 *
 * */
public class ServerQuery1 {

    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs, Comparator.comparingInt(log -> log[1]));
        int [] result = new int[queries.length];

        Map<Integer, List<Integer>> queryMap = new TreeMap<>();

        for (int i = 0; i < queries.length; i++) {
            queryMap.putIfAbsent(queries[i], new ArrayList<>());
            queryMap.get(queries[i]).add(i);

        }

        for (Map.Entry<Integer, List<Integer>> query : queryMap.entrySet()) {
            int q = query.getKey();
            int [] servers = new int[n];
            int minTime = q - x;
            int maxTime = q;
            int j =0;
            int serverCount = n;

            while(j < logs.length && logs[j][1] <= maxTime){
                int server_id = logs[j++][0]-1;
                if(servers[server_id]++ == 0) serverCount--;

            }
            int k=0;
            while(k < j && logs[k][1] < minTime){
                int server_id = logs[k++][0]-1;
                if (--servers[server_id] == 0) serverCount++;
            }
            for (int i :query.getValue()) {
                System.out.println("QUERY "+ q + " count "+ query.getValue());
                result[i] = serverCount;

            }
        }
        return result;
    }

    public static void main(String[] args) {
        ServerQuery1 s = new ServerQuery1();
        int[] result = s.countServers(3, new int[][]{{2, 4}, {2, 1}, {1, 2}, {3, 1}}, 2, new int[]{3, 4});
        System.out.println(Arrays.toString(result));
    }
}
