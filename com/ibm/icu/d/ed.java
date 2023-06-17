/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.b.aa;
import com.ibm.icu.b.b;
import com.ibm.icu.d.ee;
import com.ibm.icu.d.jn;
import com.ibm.icu.d.lf;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ed {
    private static final lf b = new lf(0, 127).l();
    private String c;
    private final BitSet d = new BitSet();
    private final Set e = new HashSet();
    private final BitSet f = new BitSet();
    private final lf g = new lf();
    private final lf h = new lf(0, 0x10FFFF);
    private static final BitSet i = ed.a(new BitSet(), 25, 17, 20, 22);
    private static final BitSet j = ed.a(new BitSet(), 25, 17, 5);
    private static final BitSet k = ed.a(new BitSet(), 25, 17, 18);
    private static final BitSet l = ed.a(new BitSet(), 8, 14, 6);
    public static final Comparator a = new ee();

    private ed i() {
        this.d.clear();
        this.e.clear();
        this.g.g();
        this.f.clear();
        return this;
    }

    public ed a(lf lf2) {
        this.h.b(lf2);
        return this;
    }

    public lf a() {
        return new lf(this.h);
    }

    public ed a(String string) {
        this.c = string;
        this.i();
        BitSet bitSet = new BitSet();
        block4: for (int i2 = 0; i2 < string.length(); i2 += Character.charCount(i2)) {
            int n2 = Character.codePointAt(string, i2);
            if (com.ibm.icu.b.b.e(n2) == 9) {
                this.g.e(n2 - com.ibm.icu.b.b.b(n2));
            }
            aa.a(n2, bitSet);
            bitSet.clear(0);
            bitSet.clear(1);
            switch (bitSet.cardinality()) {
                case 0: {
                    continue block4;
                }
                case 1: {
                    this.d.or(bitSet);
                    continue block4;
                }
                default: {
                    if (this.d.intersects(bitSet) || !this.e.add(bitSet)) continue block4;
                    bitSet = new BitSet();
                }
            }
        }
        if (this.e.size() > 0) {
            this.f.set(0, 159);
            Iterator iterator = this.e.iterator();
            block5: while (iterator.hasNext()) {
                BitSet bitSet2 = (BitSet)iterator.next();
                if (this.d.intersects(bitSet2)) {
                    iterator.remove();
                    continue;
                }
                this.f.and(bitSet2);
                for (BitSet bitSet3 : this.e) {
                    if (bitSet2 == bitSet3 || !ed.a(bitSet2, bitSet3)) continue;
                    iterator.remove();
                    continue block5;
                }
            }
        }
        if (this.e.size() == 0) {
            this.f.clear();
        }
        return this;
    }

    public String b() {
        return this.c;
    }

    public BitSet c() {
        return (BitSet)this.d.clone();
    }

    public Set d() {
        HashSet<BitSet> hashSet = new HashSet<BitSet>();
        for (BitSet bitSet : this.e) {
            hashSet.add((BitSet)bitSet.clone());
        }
        return hashSet;
    }

    public lf e() {
        return new lf(this.g);
    }

    public BitSet f() {
        return (BitSet)this.f.clone();
    }

    public jn g() {
        if (!this.h.k(this.c) || this.e().a() > 1) {
            return jn.e;
        }
        if (b.k(this.c)) {
            return jn.a;
        }
        int n2 = this.d.cardinality() + (this.f.cardinality() == 0 ? this.e.size() : 1);
        if (n2 < 2) {
            return jn.b;
        }
        if (this.b(i, this.d) || this.b(j, this.d) || this.b(k, this.d)) {
            return jn.b;
        }
        if (n2 == 2 && this.d.get(25) && !this.d.intersects(l)) {
            return jn.c;
        }
        return jn.d;
    }

    public int h() {
        int n2 = this.d.cardinality() + (this.f.cardinality() == 0 ? this.e.size() : 1);
        return n2;
    }

    public String toString() {
        return this.c + ", " + this.h.a(false) + ", " + (Object)((Object)this.g()) + ", " + ed.a(this.d) + ", " + ed.a(this.e) + ", " + this.g.a(false);
    }

    private boolean b(BitSet bitSet, BitSet bitSet2) {
        if (!ed.a(bitSet, bitSet2)) {
            return false;
        }
        for (BitSet bitSet3 : this.e) {
            if (bitSet.intersects(bitSet3)) continue;
            return false;
        }
        return true;
    }

    public static String a(Set set) {
        if (set.size() == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        TreeSet treeSet = new TreeSet(a);
        treeSet.addAll(set);
        for (BitSet bitSet : treeSet) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append("; ");
            }
            stringBuilder.append(ed.a(bitSet));
        }
        return stringBuilder.toString();
    }

    public static String a(BitSet bitSet) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = bitSet.nextSetBit(0);
        while (n2 >= 0) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(' ');
            }
            stringBuilder.append(aa.c(n2));
            n2 = bitSet.nextSetBit(n2 + 1);
        }
        return stringBuilder.toString();
    }

    public static BitSet b(String string) {
        BitSet bitSet = new BitSet();
        for (String string2 : string.trim().split(",?\\s+")) {
            if (string2.length() == 0) continue;
            bitSet.set(aa.b(string2));
        }
        return bitSet;
    }

    public static Set c(String string) {
        HashSet<BitSet> hashSet = new HashSet<BitSet>();
        for (String string2 : string.trim().split("\\s*;\\s*")) {
            if (string2.length() == 0) continue;
            hashSet.add(ed.b(string2));
        }
        return hashSet;
    }

    public static final boolean a(BitSet bitSet, BitSet bitSet2) {
        int n2 = bitSet2.nextSetBit(0);
        while (n2 >= 0) {
            if (!bitSet.get(n2)) {
                return false;
            }
            n2 = bitSet2.nextSetBit(n2 + 1);
        }
        return true;
    }

    public static final BitSet a(BitSet bitSet, int ... arrn) {
        for (int n2 : arrn) {
            bitSet.set(n2);
        }
        return bitSet;
    }
}

