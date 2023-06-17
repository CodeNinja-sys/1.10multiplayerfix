/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.al;
import io.netty.channel.df;
import io.netty.channel.dg;
import java.util.ArrayList;

public class ak
implements df {
    static final int a = 64;
    static final int b = 1024;
    static final int c = 65536;
    private static final int e = 4;
    private static final int f = 1;
    private static final int[] g;
    public static final ak d;
    private final int h;
    private final int i;
    private final int j;

    private static int b(int n2) {
        int n3;
        int n4;
        int n5 = 0;
        int n6 = g.length - 1;
        while (true) {
            if (n6 < n5) {
                return n5;
            }
            if (n6 == n5) {
                return n6;
            }
            n4 = n5 + n6 >>> 1;
            n3 = g[n4];
            int n7 = g[n4 + 1];
            if (n2 > n7) {
                n5 = n4 + 1;
                continue;
            }
            if (n2 >= n3) break;
            n6 = n4 - 1;
        }
        if (n2 == n3) {
            return n4;
        }
        return n4 + 1;
    }

    private ak() {
        this(64, 1024, 65536);
    }

    public ak(int n2, int n3, int n4) {
        if (n2 <= 0) {
            throw new IllegalArgumentException("minimum: " + n2);
        }
        if (n3 < n2) {
            throw new IllegalArgumentException("initial: " + n3);
        }
        if (n4 < n3) {
            throw new IllegalArgumentException("maximum: " + n4);
        }
        int n5 = ak.b(n2);
        this.h = g[n5] < n2 ? n5 + 1 : n5;
        int n6 = ak.b(n4);
        this.i = g[n6] > n4 ? n6 - 1 : n6;
        this.j = n3;
    }

    @Override
    public dg a() {
        return new al(this.h, this.i, this.j);
    }

    static /* synthetic */ int a(int n2) {
        return ak.b(n2);
    }

    static /* synthetic */ int[] b() {
        return g;
    }

    static {
        int n2;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (n2 = 16; n2 < 512; n2 += 16) {
            arrayList.add(n2);
        }
        for (n2 = 512; n2 > 0; n2 <<= 1) {
            arrayList.add(n2);
        }
        g = new int[arrayList.size()];
        for (n2 = 0; n2 < g.length; ++n2) {
            ak.g[n2] = (Integer)arrayList.get(n2);
        }
        d = new ak();
    }
}

