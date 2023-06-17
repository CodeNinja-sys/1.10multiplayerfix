/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import com.a.a.d.ov;
import io.netty.b.bi;
import io.netty.b.g;
import java.util.List;
import java.util.Map;
import net.minecraft.f.ap;
import net.minecraft.q.f.a.e;
import net.minecraft.q.f.k;
import net.minecraft.u.b.b;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class ao
implements p {
    private int a;
    private int b;
    private int c;
    private byte[] d;
    private List e;
    private boolean f;

    public ao() {
    }

    public ao(k k2, int n2) {
        this.a = k2.b;
        this.b = k2.c;
        this.f = n2 == 65535;
        boolean bl2 = !k2.q().q.n();
        this.d = new byte[this.a(k2, bl2, n2)];
        this.c = this.a(new net.minecraft.x.a(this.g()), k2, bl2, n2);
        this.e = ov.a();
        for (Map.Entry entry : k2.s().entrySet()) {
            b b2 = (b)entry.getKey();
            ap ap2 = (ap)entry.getValue();
            int n3 = b2.k() >> 4;
            if (!this.e() && (n2 & 1 << n3) == 0) continue;
            net.minecraft.e.e e2 = ap2.d();
            this.e.add(e2);
        }
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.K();
        this.b = a2.K();
        this.f = a2.D();
        this.c = a2.e();
        int n2 = a2.e();
        if (n2 > 0x200000) {
            throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
        }
        this.d = new byte[n2];
        a2.b(this.d);
        int n3 = a2.e();
        this.e = ov.a();
        for (int i2 = 0; i2 < n3; ++i2) {
            this.e.add(a2.h());
        }
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.E(this.a);
        a2.E(this.b);
        a2.a(this.f);
        a2.d(this.c);
        a2.d(this.d.length);
        a2.c(this.d);
        a2.d(this.e.size());
        for (net.minecraft.e.e e2 : this.e) {
            a2.a(e2);
        }
    }

    public void a(a a2) {
        a2.a(this);
    }

    public net.minecraft.x.a a() {
        return new net.minecraft.x.a(bi.a(this.d));
    }

    private g g() {
        g g2 = bi.a(this.d);
        g2.h(0);
        return g2;
    }

    public int a(net.minecraft.x.a a2, k k2, boolean bl2, int n2) {
        int n3 = 0;
        e[] arre = k2.h();
        int n4 = arre.length;
        for (int i2 = 0; i2 < n4; ++i2) {
            e e2 = arre[i2];
            if (e2 == k.a || this.e() && e2.a() || (n2 & 1 << i2) == 0) continue;
            n3 |= 1 << i2;
            e2.e().b(a2);
            a2.c(e2.f().a());
            if (!bl2) continue;
            a2.c(e2.g().a());
        }
        if (this.e()) {
            a2.c(k2.l());
        }
        return n3;
    }

    protected int a(k k2, boolean bl2, int n2) {
        int n3 = 0;
        e[] arre = k2.h();
        int n4 = arre.length;
        for (int i2 = 0; i2 < n4; ++i2) {
            e e2 = arre[i2];
            if (e2 == k.a || this.e() && e2.a() || (n2 & 1 << i2) == 0) continue;
            n3 += e2.e().a();
            n3 += e2.f().a().length;
            if (!bl2) continue;
            n3 += e2.g().a().length;
        }
        if (this.e()) {
            n3 += k2.l().length;
        }
        return n3;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public boolean e() {
        return this.f;
    }

    public List f() {
        return this.e;
    }
}

