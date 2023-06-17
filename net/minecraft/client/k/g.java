/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.b.bx;
import com.a.a.b.dg;
import com.a.a.d.ov;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.aw;
import net.minecraft.client.k.bh;
import net.minecraft.client.k.cv;
import net.minecraft.client.k.de;
import net.minecraft.client.k.y;
import net.minecraft.client.r;
import net.minecraft.u.b.n;
import net.minecraft.u.d.a;
import net.minecraft.u.d.k;
import net.minecraft.w.a.i;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class g
extends de {
    private static final dg a = dg.a('\n');
    private static final bx b = bx.a("\\n");
    private static final d c = org.apache.logging.log4j.c.c();
    private final r d;
    private final List e = ov.a();
    private final List f = ov.a();
    private final List g = ov.a();
    private int h;
    private boolean i;

    public g(r r2) {
        this.d = r2;
    }

    public void a(int n2) {
        if (this.d.w.n != net.minecraft.w.a.i.c) {
            int n3 = this.i();
            int n4 = this.g.size();
            float f2 = this.d.w.r * 0.9f + 0.1f;
            if (n4 > 0) {
                int n5;
                int n6;
                int n7;
                int n8;
                boolean bl2 = false;
                if (this.e()) {
                    bl2 = true;
                }
                float f3 = this.h();
                int n9 = n.f((float)this.f() / f3);
                bd.D();
                bd.c(2.0f, 8.0f, 0.0f);
                bd.b(f3, f3, 1.0f);
                int n10 = 0;
                for (n8 = 0; n8 + this.h < this.g.size() && n8 < n3; ++n8) {
                    aw aw2 = (aw)this.g.get(n8 + this.h);
                    if (aw2 == null || (n7 = n2 - aw2.b()) >= 200 && !bl2) continue;
                    double d2 = (double)n7 / 200.0;
                    d2 = 1.0 - d2;
                    d2 *= 10.0;
                    d2 = n.a(d2, 0.0, 1.0);
                    d2 *= d2;
                    n6 = (int)(255.0 * d2);
                    if (bl2) {
                        n6 = 255;
                    }
                    n6 = (int)((float)n6 * f2);
                    ++n10;
                    if (n6 <= 3) continue;
                    n5 = 0;
                    int n11 = -n8 * 9;
                    net.minecraft.client.k.g.a(-2, n11 - 9, 0 + n9 + 4, n11, n6 / 2 << 24);
                    String string = aw2.a().d();
                    bd.l();
                    this.d.m.a(string, 0.0f, (float)(n11 - 8), 0xFFFFFF + (n6 << 24));
                    bd.c();
                    bd.k();
                }
                if (bl2) {
                    n8 = this.d.m.a;
                    bd.c(-3.0f, 0.0f, 0.0f);
                    int n12 = n4 * n8 + n4;
                    n7 = n10 * n8 + n10;
                    int n13 = this.h * n7 / n4;
                    int n14 = n7 * n7 / n12;
                    if (n12 != n7) {
                        n6 = n13 > 0 ? 170 : 96;
                        n5 = this.i ? 0xCC3333 : 0x3333AA;
                        net.minecraft.client.k.g.a(0, -n13, 2, -n13 - n14, n5 + (n6 << 24));
                        net.minecraft.client.k.g.a(2, -n13, 1, -n13 - n14, 0xCCCCCC + (n6 << 24));
                    }
                }
                bd.E();
            }
        }
    }

    public void a() {
        this.g.clear();
        this.f.clear();
        this.e.clear();
    }

    public void a(a a2) {
        this.a(a2, 0);
    }

    public void a(a a2, int n2) {
        this.a(a2, n2, this.d.t.d(), false);
        c.d("[CHAT] {}", b.a(a.a(a2.c())));
    }

    private void a(a a2, int n2, int n3, boolean bl2) {
        if (n2 != 0) {
            this.c(n2);
        }
        int n4 = n.d((float)this.f() / this.h());
        List list = net.minecraft.client.k.y.a(a2, n4, this.d.m, false, false);
        boolean bl3 = this.e();
        for (a a3 : list) {
            if (bl3 && this.h > 0) {
                this.i = true;
                this.b(1);
            }
            this.g.add(0, new aw(n3, a3, n2));
        }
        while (this.g.size() > 100) {
            this.g.remove(this.g.size() - 1);
        }
        if (!bl2) {
            this.f.add(0, new aw(n3, a2, n2));
            while (this.f.size() > 100) {
                this.f.remove(this.f.size() - 1);
            }
        }
    }

    public void b() {
        this.g.clear();
        this.d();
        for (int i2 = this.f.size() - 1; i2 >= 0; --i2) {
            aw aw2 = (aw)this.f.get(i2);
            this.a(aw2.a(), aw2.c(), aw2.b(), true);
        }
    }

    public List c() {
        return this.e;
    }

    public void a(String string) {
        if (this.e.isEmpty() || !((String)this.e.get(this.e.size() - 1)).equals(string)) {
            this.e.add(string);
        }
    }

    public void d() {
        this.h = 0;
        this.i = false;
    }

    public void b(int n2) {
        this.h += n2;
        int n3 = this.g.size();
        if (this.h > n3 - this.i()) {
            this.h = n3 - this.i();
        }
        if (this.h <= 0) {
            this.h = 0;
            this.i = false;
        }
    }

    public a a(int n2, int n3) {
        if (!this.e()) {
            return null;
        }
        cv cv2 = new cv(this.d);
        int n4 = cv2.e();
        float f2 = this.h();
        int n5 = n2 / n4 - 2;
        int n6 = n3 / n4 - 40;
        n5 = n.d((float)n5 / f2);
        n6 = n.d((float)n6 / f2);
        if (n5 >= 0 && n6 >= 0) {
            int n7 = Math.min(this.i(), this.g.size());
            if (n5 <= n.d((float)this.f() / this.h()) && n6 < this.d.m.a * n7 + n7) {
                int n8 = n6 / this.d.m.a + this.h;
                if (n8 >= 0 && n8 < this.g.size()) {
                    aw aw2 = (aw)this.g.get(n8);
                    int n9 = 0;
                    for (a a2 : aw2.a()) {
                        if (!(a2 instanceof k) || (n9 += this.d.m.a(net.minecraft.client.k.y.a(((k)a2).g(), false))) <= n5) continue;
                        return a2;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public boolean e() {
        return this.d.o instanceof bh;
    }

    public void c(int n2) {
        aw aw2;
        Iterator iterator = this.g.iterator();
        while (iterator.hasNext()) {
            aw2 = (aw)iterator.next();
            if (aw2.c() != n2) continue;
            iterator.remove();
        }
        iterator = this.f.iterator();
        while (iterator.hasNext()) {
            aw2 = (aw)iterator.next();
            if (aw2.c() != n2) continue;
            iterator.remove();
            break;
        }
    }

    public int f() {
        return net.minecraft.client.k.g.a(this.d.w.G);
    }

    public int g() {
        return net.minecraft.client.k.g.b(this.e() ? this.d.w.I : this.d.w.H);
    }

    public float h() {
        return this.d.w.F;
    }

    public static int a(float f2) {
        int n2 = 320;
        int n3 = 40;
        return n.d(f2 * 280.0f + 40.0f);
    }

    public static int b(float f2) {
        int n2 = 180;
        int n3 = 20;
        return n.d(f2 * 160.0f + 20.0f);
    }

    public int i() {
        return this.g() / 9;
    }
}

