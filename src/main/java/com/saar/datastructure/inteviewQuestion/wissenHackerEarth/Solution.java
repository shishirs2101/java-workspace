package com.saar.datastructure.inteviewQuestion.wissenHackerEarth;

import java.util.*;

public class Solution {

    /**  INPUT
     * 3
     * Gmail 2,Facebook 3,Gmail 4,Facebook 5,Gmail 7
     * Gmail 2,Facebook 3,Gmail 4,Facebook 5,Gmail 7,Gmail 10,Gmail 12,Gmail 12
     * Gmail 2,Facebook 3,Gmail 4,Facebook 5,Gmail 7,Facebook 10,Facebook 12,Gmail 12
     */

    public static class RatingStatisticsCollectorImpl implements RatingStatisticsCollector {

         Map<String,List<Integer>>appRating = new HashMap<>();
         Map<String,Integer>appCount = new HashMap<>();

        private  void putRating(String app, int rating){

            if (!appRating.containsKey(app)){

                appRating.put(app,new ArrayList<Integer>(){{add(rating);}});
            }else {
                List<Integer> list = appRating.get(app);
                list.add(rating);
                appRating.put(app,list);
            }

            if (!appCount.containsKey(app)){
                appCount.put(app,1);
            }else {
                Integer existingAppCount = appCount.get(app);
                appCount.put(app,existingAppCount+1);
            }
        }

        @Override
        public void putNewRating(String app, int rating){
            putRating(app,rating);
        }

        @Override
        public double getAverageRating(String app){
            if (!appRating.containsKey(app)) return 0.0;
            List<Integer> list = appRating.get(app);
            double avgRating = 0.0;
            for (Integer rating : list) {
                avgRating = avgRating +rating;
            }
            return avgRating/list.size();
        }

        @Override
        public int getRatingsCount(String app){
            return appCount.get(app);
        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface RatingStatisticsCollector {
        // Ratings feed will call this method when new app rating information is received. This is input to your class. ratings is a non negative integer between 0 to 10.
        public void putNewRating(String app, int rating);

        // Report the average rating of the app.
        public double getAverageRating(String app);

        // Report the total number of rating for an app.
        public int getRatingsCount(String app);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final RatingStatisticsCollector stats = new RatingStatisticsCollectorImpl();
            final Set<String> apps = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String app = tokens[0];
                apps.add(app);
                final int runs = Integer.parseInt(tokens[1]);

                stats.putNewRating(app, runs);

            }
            for (String app : apps) {
                System.out.println(
                        String.format("%s %.2f %d", app, stats.getAverageRating(app), stats.getRatingsCount(app)));
            }

        }
        scanner.close();

    }
}