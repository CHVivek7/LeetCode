class Router {
    int limit;
    Queue<int[]> q; 
    HashSet<String> seen; 
    HashMap<Integer, ArrayList<Integer>> destMap;
    HashMap<Integer, Integer> startIndex; 
    public Router(int memoryLimit) {
        limit = memoryLimit;
        q = new LinkedList<>();
        seen = new HashSet<>();
        destMap = new HashMap<>();
        startIndex = new HashMap<>();
    }

    public boolean addPacket(int source, int destination, int timestamp) {
        String key = source + "#" + destination + "#" + timestamp;
        if (seen.contains(key)) return false;

        if (q.size() == limit) {
            int[] old = q.poll();
            String oldKey = old[0] + "#" + old[1] + "#" + old[2];
            seen.remove(oldKey);
            startIndex.put(old[1], startIndex.getOrDefault(old[1],0) + 1);
        }

        q.offer(new int[]{source, destination, timestamp});
        seen.add(key);
        destMap.computeIfAbsent(destination, k -> new ArrayList<>()).add(timestamp);
        return true;
    }

    public int[] forwardPacket() {
        if (q.isEmpty()) return new int[]{};
        int[] p = q.poll();

        String key = p[0] + "#" + p[1] + "#" + p[2];
        seen.remove(key);
        startIndex.put(p[1], startIndex.getOrDefault(p[1],0) + 1);

        return p;
    }

    public int getCount(int destination, int startTime, int endTime) {
        if (!destMap.containsKey(destination)) return 0;
        ArrayList<Integer> list = destMap.get(destination);
        int start = startIndex.getOrDefault(destination,0);

        int s = lowerBound(list, start, list.size() - 1, startTime);
        int e = upperBound(list, start, list.size() - 1, endTime);

        if (s > e) return 0;
        return e - s + 1;
    }

    private int lowerBound(ArrayList<Integer> list, int l, int r, int val) {
        int ans = r + 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (list.get(mid) >= val) {
                ans = mid;
                r = mid - 1;
            } else l = mid + 1;
        }
        return ans;
    }

    private int upperBound(ArrayList<Integer> list, int l, int r, int val) {
        int ans = l - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (list.get(mid) <= val) {
                ans = mid;
                l = mid + 1;
            } else r = mid - 1;
        }
        return ans;
    }
}