class RandomizedSet {
    HashSet<Integer> mySet = new HashSet<>();

    public RandomizedSet() {

    }

    public boolean insert(int val) {
        if (mySet.contains(val)) {
            return false;
        } else {
            mySet.add(val);
        }
        return true;
    }

    public boolean remove(int val) {
        if (mySet.isEmpty() || !mySet.contains(val)) {
            return false;
        } else {
            mySet.remove(val);
        }
        return true;
    }

    public int getRandom() {
        Integer[] arr = mySet.toArray(new Integer[mySet.size()]);
        int index = (int) (Math.random() * arr.length);
        return arr[index];

    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */