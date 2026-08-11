class RandomizedSet {

    List<Integer> myList = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();

    public RandomizedSet() {
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }

        map.put(val, myList.size());
        myList.add(val);

        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        int index = map.get(val);
        int last = myList.get(myList.size() - 1);

        myList.set(index, last);
        map.put(last, index);

        myList.remove(myList.size() - 1);
        map.remove(val);

        return true;
    }

    public int getRandom() {
        int index = (int) (Math.random() * myList.size());
        return myList.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */