/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import com.a.a.d.ov;
import java.util.List;
import java.util.Random;
import net.minecraft.k.a;
import net.minecraft.q.a.d;
import net.minecraft.q.ab;
import net.minecraft.q.b.ao;
import net.minecraft.q.b.q;
import net.minecraft.q.g.b.g;
import net.minecraft.q.g.b.p;
import net.minecraft.u.b.b;
import net.minecraft.u.bo;

public class i {
    private g a;
    private g b;
    private final ao c = new ao(this);
    private final List d = ov.a(net.minecraft.a.i.f, net.minecraft.a.i.c, net.minecraft.a.i.g, net.minecraft.a.i.u, net.minecraft.a.i.t, net.minecraft.a.i.w, net.minecraft.a.i.x);

    protected i() {
    }

    private i(long l2, ab ab2, String string) {
        this();
        g[] arrg = g.a(l2, ab2, string);
        this.a = arrg[0];
        this.b = arrg[1];
    }

    public i(d d2) {
        this(d2.a(), d2.t(), d2.u());
    }

    public List a() {
        return this.d;
    }

    public q a(b b2) {
        return this.a(b2, null);
    }

    public q a(b b2, q q2) {
        return this.c.a(b2.cy_(), b2.l(), q2);
    }

    public float a(float f2, int n2) {
        return f2;
    }

    public q[] a(q[] arrq, int n2, int n3, int n4, int n5) {
        p.a();
        if (arrq == null || arrq.length < n4 * n5) {
            arrq = new q[n4 * n5];
        }
        int[] arrn = this.a.a(n2, n3, n4, n5);
        try {
            for (int i2 = 0; i2 < n4 * n5; ++i2) {
                arrq[i2] = q.a(arrn[i2], net.minecraft.a.i.b);
            }
            return arrq;
        }
        catch (Throwable throwable) {
            a a2 = net.minecraft.k.a.a(throwable, "Invalid Biome id");
            net.minecraft.k.i i3 = a2.a("RawBiomeBlock");
            i3.a("biomes[] size", arrq.length);
            i3.a("x", n2);
            i3.a("z", n3);
            i3.a("w", n4);
            i3.a("h", n5);
            throw new bo(a2);
        }
    }

    public q[] b(q[] arrq, int n2, int n3, int n4, int n5) {
        return this.a(arrq, n2, n3, n4, n5, true);
    }

    public q[] a(q[] arrq, int n2, int n3, int n4, int n5, boolean bl2) {
        p.a();
        if (arrq == null || arrq.length < n4 * n5) {
            arrq = new q[n4 * n5];
        }
        if (bl2 && n4 == 16 && n5 == 16 && (n2 & 0xF) == 0 && (n3 & 0xF) == 0) {
            q[] arrq2 = this.c.b(n2, n3);
            System.arraycopy(arrq2, 0, arrq, 0, n4 * n5);
            return arrq;
        }
        int[] arrn = this.b.a(n2, n3, n4, n5);
        for (int i2 = 0; i2 < n4 * n5; ++i2) {
            arrq[i2] = q.a(arrn[i2], net.minecraft.a.i.b);
        }
        return arrq;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(int n2, int n3, int n4, List list) {
        p.a();
        int n5 = n2 - n4 >> 2;
        int n6 = n3 - n4 >> 2;
        int n7 = n2 + n4 >> 2;
        int n8 = n3 + n4 >> 2;
        int n9 = n7 - n5 + 1;
        int n10 = n8 - n6 + 1;
        int[] arrn = this.a.a(n5, n6, n9, n10);
        try {
            int n11 = 0;
            while (true) {
                if (n11 >= n9 * n10) {
                    return true;
                }
                q q2 = q.b(arrn[n11]);
                if (!list.contains(q2)) {
                    return false;
                }
                ++n11;
            }
        }
        catch (Throwable throwable) {
            a a2 = net.minecraft.k.a.a(throwable, "Invalid Biome id");
            net.minecraft.k.i i2 = a2.a("Layer");
            i2.a("Layer", this.a.toString());
            i2.a("x", n2);
            i2.a("z", n3);
            i2.a("radius", n4);
            i2.a("allowed", list);
            throw new bo(a2);
        }
    }

    public b a(int n2, int n3, int n4, List list, Random random) {
        p.a();
        int n5 = n2 - n4 >> 2;
        int n6 = n3 - n4 >> 2;
        int n7 = n2 + n4 >> 2;
        int n8 = n3 + n4 >> 2;
        int n9 = n7 - n5 + 1;
        int n10 = n8 - n6 + 1;
        int[] arrn = this.a.a(n5, n6, n9, n10);
        b b2 = null;
        int n11 = 0;
        for (int i2 = 0; i2 < n9 * n10; ++i2) {
            int n12 = n5 + i2 % n9 << 2;
            int n13 = n6 + i2 / n9 << 2;
            q q2 = q.b(arrn[i2]);
            if (!list.contains(q2) || b2 != null && random.nextInt(n11 + 1) != 0) continue;
            b2 = new b(n12, 0, n13);
            ++n11;
        }
        return b2;
    }

    public void b() {
        this.c.a();
    }
}

