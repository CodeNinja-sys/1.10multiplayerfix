/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.b;

import com.a.a.d.ov;
import java.util.List;

public class p {
    private static int a = 256;
    private static final List b = ov.a();
    private static final List c = ov.a();
    private static final List d = ov.a();
    private static final List e = ov.a();

    public static synchronized int[] a(int n2) {
        if (n2 <= 256) {
            if (b.isEmpty()) {
                int[] arrn = new int[256];
                c.add(arrn);
                return arrn;
            }
            int[] arrn = (int[])b.remove(b.size() - 1);
            c.add(arrn);
            return arrn;
        }
        if (n2 > a) {
            a = n2;
            d.clear();
            e.clear();
            int[] arrn = new int[a];
            e.add(arrn);
            return arrn;
        }
        if (d.isEmpty()) {
            int[] arrn = new int[a];
            e.add(arrn);
            return arrn;
        }
        int[] arrn = (int[])d.remove(d.size() - 1);
        e.add(arrn);
        return arrn;
    }

    public static synchronized void a() {
        if (!d.isEmpty()) {
            d.remove(d.size() - 1);
        }
        if (!b.isEmpty()) {
            b.remove(b.size() - 1);
        }
        d.addAll(e);
        b.addAll(c);
        e.clear();
        c.clear();
    }

    public static synchronized String b() {
        return "cache: " + d.size() + ", tcache: " + b.size() + ", allocated: " + e.size() + ", tallocated: " + c.size();
    }
}

