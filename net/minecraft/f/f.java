/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import com.a.a.d.mq;
import com.c.a.c.i;
import com.c.a.d.a;
import com.c.a.e;
import net.minecraft.c.b.h;
import net.minecraft.e.u;
import net.minecraft.f.ap;
import net.minecraft.g.hs;
import net.minecraft.u.ad;
import net.minecraft.u.aw;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.u.bw;
import net.minecraft.x.d.b.j;

public class f
extends ap
implements aw {
    private int a;
    private int b;
    private e c;
    private int d;
    private boolean e;
    private static h f;
    private static i g;

    public static void a(h h2) {
        f = h2;
    }

    public static void a(i i2) {
        g = i2;
    }

    @Override
    public net.minecraft.e.e a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("SkullType", (byte)(this.a & 0xFF));
        e2.a("Rot", (byte)(this.b & 0xFF));
        if (this.c != null) {
            net.minecraft.e.e e3 = new net.minecraft.e.e();
            u.a(e3, this.c);
            e2.a("Owner", e3);
        }
        return e2;
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        this.a = e2.f("SkullType");
        this.b = e2.f("Rot");
        if (this.a == 3) {
            String string;
            if (e2.b("Owner", 10)) {
                this.c = u.a(e2.o("Owner"));
            } else if (e2.b("ExtraType", 8) && !bw.b(string = e2.l("ExtraType"))) {
                this.c = new e(null, string);
                this.g();
            }
        }
    }

    @Override
    public void a() {
        if (this.a == 5) {
            if (this.k.x(this.l)) {
                this.e = true;
                ++this.d;
            } else {
                this.e = false;
            }
        }
    }

    public float a(float f2) {
        return this.e ? (float)this.d + f2 : (float)this.d;
    }

    public e b() {
        return this.c;
    }

    @Override
    public j bJ_() {
        return new j(this.l, 4, this.d());
    }

    @Override
    public net.minecraft.e.e d() {
        return this.a(new net.minecraft.e.e());
    }

    public void a(int n2) {
        this.a = n2;
        this.c = null;
    }

    public void a(e e2) {
        this.a = 3;
        this.c = e2;
        this.g();
    }

    private void g() {
        this.c = net.minecraft.f.f.b(this.c);
        this.C();
    }

    public static e b(e e2) {
        if (e2 != null && !bw.b(e2.b())) {
            if (e2.d() && e2.c().f("textures")) {
                return e2;
            }
            if (f != null && g != null) {
                e e3 = f.a(e2.b());
                if (e3 == null) {
                    return e2;
                }
                a a2 = (a)mq.d((Iterable)e3.c().c("textures"), null);
                if (a2 == null) {
                    e3 = g.b(e3, true);
                }
                return e3;
            }
            return e2;
        }
        return e2;
    }

    public int e() {
        return this.a;
    }

    public int f() {
        return this.b;
    }

    public void b(int n2) {
        this.b = n2;
    }

    @Override
    public void a(bi bi2) {
        if (this.k != null && this.k.n(this.D()).a(hs.a) == ad.b) {
            this.b = bi2.a(this.b, 16);
        }
    }

    @Override
    public void a(bq bq2) {
        if (this.k != null && this.k.n(this.D()).a(hs.a) == ad.b) {
            this.b = bq2.a(this.b, 16);
        }
    }
}

