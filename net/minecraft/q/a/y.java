/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a;

import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.List;
import java.util.Map;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.m.cu;
import net.minecraft.q.a.a;
import net.minecraft.q.f;
import net.minecraft.q.k;
import net.minecraft.u.b.n;
import net.minecraft.u.b.t;
import net.minecraft.u.b.u;
import net.minecraft.w.a.b;
import net.minecraft.w.f.l;
import net.minecraft.x.p;

public class y
extends f {
    public int a;
    public int b;
    public byte c;
    public boolean d;
    public byte e;
    public byte[] f = new byte[16384];
    public List g = ov.a();
    private final Map j = sz.c();
    public Map h = sz.d();

    public y(String string) {
        super(string);
    }

    public void a(double d2, double d3, int n2) {
        int n3 = 128 * (1 << n2);
        int n4 = n.c((d2 + 64.0) / (double)n3);
        int n5 = n.c((d3 + 64.0) / (double)n3);
        this.a = n4 * n3 + n3 / 2 - 64;
        this.b = n5 * n3 + n3 / 2 - 64;
    }

    @Override
    public void a(e e2) {
        this.c = e2.f("dimension");
        this.a = e2.h("xCenter");
        this.b = e2.h("zCenter");
        this.e = e2.f("scale");
        this.e = (byte)n.a(this.e, 0, 4);
        this.d = e2.b("trackingPosition", 1) ? e2.p("trackingPosition") : true;
        int n2 = e2.g("width");
        int n3 = e2.g("height");
        if (n2 == 128 && n3 == 128) {
            this.f = e2.m("colors");
        } else {
            byte[] arrby = e2.m("colors");
            this.f = new byte[16384];
            int n4 = (128 - n2) / 2;
            int n5 = (128 - n3) / 2;
            for (int i2 = 0; i2 < n3; ++i2) {
                int n6 = i2 + n5;
                if (n6 < 0 && n6 >= 128) continue;
                for (int i3 = 0; i3 < n2; ++i3) {
                    int n7 = i3 + n4;
                    if (n7 < 0 && n7 >= 128) continue;
                    this.f[n7 + n6 * 128] = arrby[i3 + i2 * n2];
                }
            }
        }
    }

    @Override
    public e b(e e2) {
        e2.a("dimension", this.c);
        e2.a("xCenter", this.a);
        e2.a("zCenter", this.b);
        e2.a("scale", this.e);
        e2.a("width", (short)128);
        e2.a("height", (short)128);
        e2.a("colors", this.f);
        e2.a("trackingPosition", this.d);
        return e2;
    }

    public void a(b b2, cu cu2) {
        Object object;
        if (!this.j.containsKey(b2)) {
            a a2 = new a(this, b2);
            this.j.put(b2, a2);
            this.g.add(a2);
        }
        if (!b2.q.f(cu2)) {
            this.h.remove(b2.X());
        }
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            object = (a)this.g.get(i2);
            if (!object.a.bk && (object.a.q.f(cu2) || cu2.y())) {
                if (cu2.y() || object.a.bS != this.c || !this.d) continue;
                this.a(0, object.a.aQ, ((a)object).a.X(), object.a.aU, object.a.aW, object.a.ba);
                continue;
            }
            this.j.remove(((a)object).a);
            this.g.remove(object);
        }
        if (cu2.y() && this.d) {
            l l2 = cu2.z();
            object = l2.l();
            this.a(1, b2.aQ, "frame-" + l2.ca(), ((t)object).cy_(), ((t)object).l(), l2.b.c() * 90);
        }
        if (cu2.n() && cu2.o().b("Decorations", 9)) {
            q q2 = cu2.o().c("Decorations", 10);
            for (int i3 = 0; i3 < q2.e(); ++i3) {
                e e2 = q2.b(i3);
                if (this.h.containsKey(e2.l("id"))) continue;
                this.a(e2.f("type"), b2.aQ, e2.l("id"), e2.k("x"), e2.k("z"), e2.k("rot"));
            }
        }
    }

    private void a(int n2, k k2, String string, double d2, double d3, double d4) {
        byte by2;
        int n3 = 1 << this.e;
        float f2 = (float)(d2 - (double)this.a) / (float)n3;
        float f3 = (float)(d3 - (double)this.b) / (float)n3;
        byte by3 = (byte)((double)(f2 * 2.0f) + 0.5);
        byte by4 = (byte)((double)(f3 * 2.0f) + 0.5);
        int n4 = 63;
        if (f2 >= -63.0f && f3 >= -63.0f && f2 <= 63.0f && f3 <= 63.0f) {
            by2 = (byte)((d4 += d4 < 0.0 ? -8.0 : 8.0) * 16.0 / 360.0);
            if (this.c < 0) {
                int n5 = (int)(k2.F().f() / 10L);
                by2 = (byte)(n5 * n5 * 34187121 + n5 * 121 >> 15 & 0xF);
            }
        } else {
            if (Math.abs(f2) >= 320.0f || Math.abs(f3) >= 320.0f) {
                this.h.remove(string);
                return;
            }
            n2 = 6;
            by2 = 0;
            if (f2 <= -63.0f) {
                by3 = -128;
            }
            if (f3 <= -63.0f) {
                by4 = -128;
            }
            if (f2 >= 63.0f) {
                by3 = 127;
            }
            if (f3 >= 63.0f) {
                by4 = 127;
            }
        }
        this.h.put(string, new u((byte)n2, by3, by4, by2));
    }

    public p a(cu cu2, k k2, b b2) {
        a a2 = (a)this.j.get(b2);
        return a2 == null ? null : a2.a(cu2);
    }

    public void a(int n2, int n3) {
        super.d();
        for (a a2 : this.g) {
            a2.a(n2, n3);
        }
    }

    public a a(b b2) {
        a a2 = (a)this.j.get(b2);
        if (a2 == null) {
            a2 = new a(this, b2);
            this.j.put(b2, a2);
            this.g.add(a2);
        }
        return a2;
    }
}

