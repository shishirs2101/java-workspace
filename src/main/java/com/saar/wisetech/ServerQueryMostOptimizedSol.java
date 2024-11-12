package com.saar.wisetech;

import java.util.Arrays;

public class ServerQueryMostOptimizedSol {
    public class SortedQuery {
        int idx, val;

        SortedQuery(int i, int v){
            idx = i;
            val = v;
        }
    }

    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int q = queries.length, logsLength = logs.length;
        // stores the queries in sorted order
        SortedQuery[] sq = new SortedQuery[q];
        for(int i=0; i<q; i++)
            sq[i] = new SortedQuery(i, queries[i]);

        // stores the number of occurences of each server id
        int[] cntMap = new int[n + 1];
        // number of unique servers
        int cnt = 0;

        // sort logs based on time
        Arrays.sort(logs, (a, b) -> a[1] - b[1]);
        // sort queries based on query "end"
        Arrays.sort(sq, (a, b) -> a.val - b.val);

        int l = 0, r = 0;
        int[] res = new int[q];
        for(int i=0; i<q; i++){
            int end = sq[i].val, start = end - x;

            while(l < logsLength && logs[l][1] < start){
                cntMap[logs[l][0]]--;
                if(cntMap[logs[l][0]] == 0) cnt--;
                l++;
            }

            while(r < logsLength && logs[r][1] <= end){
                cntMap[logs[r][0]]++;
                if(cntMap[logs[r][0]] == 1) cnt++;
                r++;
            }

            res[sq[i].idx] = n - cnt;
        }

        return res;
    }
}
