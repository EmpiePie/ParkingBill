public class Solution {

    public int solution(String E, String L) {

        String[] entryTime = E.split(":");
        String[] exitTime = L.split(":");

        int entryHour = Integer.parseInt(entryTime[0]);
        int entryMin = Integer.parseInt(entryTime[1]);

        int exitHour = Integer.parseInt(exitTime[0]);
        int exitMin = Integer.parseInt(exitTime[1]);

        int parkingFee = 2;

        int parkingTime = exitHour - entryHour;

        if (exitMin > entryMin) {

            parkingTime++;
        }

        parkingFee += 3;
        parkingTime--;

        while (parkingTime > 0) {

            parkingFee += 4;
            parkingTime--;
        }

        return parkingFee;
    }
}
