
class UndergroundSystem {

    Map<Integer, ArrivalInfo> arrival;
    Map<String, double[]> total;

    public UndergroundSystem() {

        arrival = new HashMap<>();
        total = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        arrival.put(id, new ArrivalInfo(id, stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        ArrivalInfo arrivals = arrival.get(id);
        String key = arrivals.stationName + "_" + stationName;
        double[] pair = total.getOrDefault(key, new double[2]);
        int time = t - arrivals.time;
        pair[0] += time;
        pair[1]++;
        total.put(key, pair);

    }

    public double getAverageTime(String startStation, String endStation) {
        String key = startStation + "_" + endStation;
        double[] pair = total.get(key);

        return pair[0] / pair[1];
    }

    class ArrivalInfo{
        int id;
        String stationName;
        int time;

        ArrivalInfo(int id, String stationName, int time) {
            this.id = id;
            this.stationName = stationName;
            this.time = time;
        }
    }
}
