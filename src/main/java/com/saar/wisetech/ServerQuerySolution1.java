package com.saar.wisetech;


import java.util.*;

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
 * */
public class ServerQuerySolution1 {

    public int[] countServers(int n, int[][] logs, int x, int[] queries) {

        int totalQueries = queries.length;
        int[] servers = new int[n + 1], output = new int[totalQueries];

        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Arrays.sort(logs, Comparator.comparingInt(log -> log[1]));

        for (int i = 0; i < totalQueries; i++) {
            map.putIfAbsent(queries[i], new ArrayList<>());
            map.get(queries[i]).add(i);
        }
        int a = 0, b = 0, c = n;
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            int t = entry.getKey();
            while (a < logs.length && logs[a][1] <= t) {
                int s = logs[a++][0];
                if (servers[s]++ == 0) c--;
            }
            while (b < a && logs[b][1] < t - x) {
                int s = logs[b++][0];
                if (--servers[s] == 0) c++;
            }
            for (int i : entry.getValue()) output[i] = c;
        }
        return output;
    }
}
