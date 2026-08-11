class RandomizedSet {
    HashSet<Integer> mySet = new HashSet<>();
    List<Integer>mylist=new ArrayList<>();
    public RandomizedSet() {

    }

    public boolean insert(int val) {
        if (mySet.contains(val)) {
            return false;
        } else {
            mySet.add(val);
            mylist.add(val);
        }
        return true;
    }

    public boolean remove(int val) {
        if (mySet.isEmpty() || !mySet.contains(val)) {
            return false;
        } else {
            mySet.remove(val);
            mylist.remove(Integer.valueOf(val));
        }
        return true;
    }

    public int getRandom() {
        int index = (int) (Math.random() * mylist.size());
        return mylist.get(index);

    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */