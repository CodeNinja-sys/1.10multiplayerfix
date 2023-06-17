/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class fa {
    public static final int a = 4;
    public static final int b = 2;
    public static final int c = 1;
    public static final int d = 7;
    public static final int e = 6;
    public static final int f = 5;
    public static final int g = 3;
    public static final int h = 4;
    public static final int i = 2;
    public static final int j = 1;
    public static final int k = 0;
    public static final int l = 7;
    public static final int m = 6;
    public static final int n = 5;
    public static final int o = 3;
    public static final int p = 4;
    public static final int q = 2;
    public static final int r = 1;

    public static boolean a(SortedSet sortedSet, int n2, SortedSet sortedSet2) {
        if (n2 < 0 || n2 > 7) {
            throw new IllegalArgumentException("Relation " + n2 + " out of range");
        }
        boolean bl2 = (n2 & 4) != 0;
        boolean bl3 = (n2 & 2) != 0;
        boolean bl4 = (n2 & 1) != 0;
        switch (n2) {
            case 6: {
                if (sortedSet.size() >= sortedSet2.size()) break;
                return false;
            }
            case 3: {
                if (sortedSet.size() <= sortedSet2.size()) break;
                return false;
            }
            case 2: {
                if (sortedSet.size() == sortedSet2.size()) break;
                return false;
            }
        }
        if (sortedSet.size() == 0) {
            if (sortedSet2.size() == 0) {
                return true;
            }
            return bl4;
        }
        if (sortedSet2.size() == 0) {
            return bl2;
        }
        Iterator iterator = sortedSet.iterator();
        Iterator iterator2 = sortedSet2.iterator();
        Object e2 = iterator.next();
        Object e3 = iterator2.next();
        while (true) {
            int n3;
            if ((n3 = ((Comparable)e2).compareTo(e3)) == 0) {
                if (!bl3) {
                    return false;
                }
                if (!iterator.hasNext()) {
                    if (!iterator2.hasNext()) {
                        return true;
                    }
                    return bl4;
                }
                if (!iterator2.hasNext()) {
                    return bl2;
                }
                e2 = iterator.next();
                e3 = iterator2.next();
                continue;
            }
            if (n3 < 0) {
                if (!bl2) {
                    return false;
                }
                if (!iterator.hasNext()) {
                    return bl4;
                }
                e2 = iterator.next();
                continue;
            }
            if (!bl4) {
                return false;
            }
            if (!iterator2.hasNext()) {
                return bl2;
            }
            e3 = iterator2.next();
        }
    }

    public static SortedSet b(SortedSet sortedSet, int n2, SortedSet sortedSet2) {
        switch (n2) {
            case 7: {
                sortedSet.addAll(sortedSet2);
                return sortedSet;
            }
            case 6: {
                return sortedSet;
            }
            case 3: {
                sortedSet.clear();
                sortedSet.addAll(sortedSet2);
                return sortedSet;
            }
            case 4: {
                sortedSet.removeAll(sortedSet2);
                return sortedSet;
            }
            case 2: {
                sortedSet.retainAll(sortedSet2);
                return sortedSet;
            }
            case 5: {
                TreeSet treeSet = new TreeSet(sortedSet2);
                treeSet.removeAll(sortedSet);
                sortedSet.removeAll(sortedSet2);
                sortedSet.addAll(treeSet);
                return sortedSet;
            }
            case 1: {
                TreeSet treeSet = new TreeSet(sortedSet2);
                treeSet.removeAll(sortedSet);
                sortedSet.clear();
                sortedSet.addAll(treeSet);
                return sortedSet;
            }
            case 0: {
                sortedSet.clear();
                return sortedSet;
            }
        }
        throw new IllegalArgumentException("Relation " + n2 + " out of range");
    }
}

