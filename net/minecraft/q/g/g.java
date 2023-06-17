/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.b.q;
import net.minecraft.q.f.e;
import net.minecraft.q.f.o;
import net.minecraft.q.k;
import net.minecraft.u.b.n;
import net.minecraft.w.ag;

public class g
implements o {
    private static final List c = ov.a();
    private static final int d;
    private static final int e;
    protected static final b a;
    protected static final b b;
    private final k f;

    static {
        a = p.a.v();
        b = p.cv.v();
        for (cn cn2 : cn.v) {
            c.addAll(cn2.u().a());
        }
        d = n.f(n.c((float)c.size()));
        e = n.f((float)c.size() / (float)d);
    }

    public g(k k2) {
        this.f = k2;
    }

    @Override
    public net.minecraft.q.f.k a(int n2, int n3) {
        int n4;
        e e2 = new e();
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                int n5 = n2 * 16 + i2;
                n4 = n3 * 16 + i3;
                e2.a(i2, 60, i3, b);
                b b2 = g.c(n5, n4);
                if (b2 == null) continue;
                e2.a(i2, 70, i3, b2);
            }
        }
        net.minecraft.q.f.k k2 = new net.minecraft.q.f.k(this.f, e2, n2, n3);
        k2.b();
        q[] arrq = this.f.k().b(null, n2 * 16, n3 * 16, 16, 16);
        byte[] arrby = k2.l();
        for (n4 = 0; n4 < arrby.length; ++n4) {
            arrby[n4] = (byte)q.a(arrq[n4]);
        }
        k2.b();
        return k2;
    }

    public static b c(int n2, int n3) {
        int n4;
        b b2 = a;
        if (n2 > 0 && n3 > 0 && n2 % 2 != 0 && n3 % 2 != 0 && (n2 /= 2) <= d && (n3 /= 2) <= e && (n4 = n.a(n2 * d + n3)) < c.size()) {
            b2 = (b)c.get(n4);
        }
        return b2;
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public boolean a(net.minecraft.q.f.k k2, int n2, int n3) {
        return false;
    }

    @Override
    public List a(ag ag2, net.minecraft.u.b.b b2) {
        q q2 = this.f.a(b2);
        return q2.a(ag2);
    }

    @Override
    public net.minecraft.u.b.b a(k k2, String string, net.minecraft.u.b.b b2) {
        return null;
    }

    @Override
    public void b(net.minecraft.q.f.k k2, int n2, int n3) {
    }
}

