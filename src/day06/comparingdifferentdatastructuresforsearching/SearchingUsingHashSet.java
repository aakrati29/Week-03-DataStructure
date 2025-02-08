package day06.comparingdifferentdatastructuresforsearching;

import java.util.HashSet;

public class SearchingUsingHashSet {
    public boolean usingHashSet() {
        return usingHashSet(null, 0);
    }

    public boolean usingHashSet(HashSet<Integer> set, int key) {
        return set.contains(key);
    }
}
