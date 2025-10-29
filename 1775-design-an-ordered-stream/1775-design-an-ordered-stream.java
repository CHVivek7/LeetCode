public class OrderedStream {
    int i;
    List<String> list;

    public OrderedStream(int n) {
        this.i = 0;
        this.list = new ArrayList<>(Collections.nCopies(n, null));
    }

    public List<String> insert(int idKey, String value) {
        int index = idKey - 1; 

        if (index >= 0 && index < list.size()) {
            list.set(index, value);
        }
        List<String> res = new ArrayList<>();
        while (i < list.size() && list.get(i) != null) {
            res.add(list.get(i));
            i++;
        }
        return res;
    }
}