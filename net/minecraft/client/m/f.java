/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.m;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.client.f.s;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.g;
import net.minecraft.client.m.b;
import net.minecraft.client.m.c;
import net.minecraft.client.r;
import org.lwjgl.util.e.d;

public class f {
    private final c c;
    public final b a;
    public final b b;
    private final List d = ov.a();
    private final List e = ov.a();
    private final List f = ov.a();
    private final List g = ov.a();
    private d h;

    public f(s s2, String string, b b2, b b3) {
        this.c = new c(s2, string);
        this.a = b2;
        this.b = b3;
    }

    public void a() {
        this.c.a();
    }

    public void a(String string, Object object, int n2, int n3) {
        this.e.add(this.e.size(), string);
        this.d.add(this.d.size(), object);
        this.f.add(this.f.size(), n2);
        this.g.add(this.g.size(), n3);
    }

    private void c() {
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        bd.k();
        bd.i();
        bd.c();
        bd.o();
        bd.f();
        bd.h();
        bd.v();
        bd.i(0);
    }

    public void a(d d2) {
        this.h = d2;
    }

    public void a(float f2) {
        this.c();
        this.a.e();
        float f3 = this.b.a;
        float f4 = this.b.b;
        bd.b(0, 0, (int)f3, (int)f4);
        this.c.a("DiffuseSampler", this.a);
        for (int i2 = 0; i2 < this.d.size(); ++i2) {
            this.c.a((String)this.e.get(i2), this.d.get(i2));
            this.c.b("AuxSize" + i2).a(((Integer)this.f.get(i2)).intValue(), ((Integer)this.g.get(i2)).intValue());
        }
        this.c.b("ProjMat").a(this.h);
        this.c.b("InSize").a(this.a.a, this.a.b);
        this.c.b("OutSize").a(f3, f4);
        this.c.b("Time").a(f2);
        r r2 = r.z();
        this.c.b("ScreenSize").a(r2.e, r2.f);
        this.c.c();
        this.b.f();
        this.b.a(false);
        bd.a(false);
        bd.a(true, true, true, true);
        ci ci2 = ci.a();
        g g2 = ci2.c();
        g2.a(7, net.minecraft.client.g.d.b.f);
        g2.b(0.0, (double)f4, 500.0).b(255, 255, 255, 255).d();
        g2.b((double)f3, (double)f4, 500.0).b(255, 255, 255, 255).d();
        g2.b((double)f3, 0.0, 500.0).b(255, 255, 255, 255).d();
        g2.b(0.0, 0.0, 500.0).b(255, 255, 255, 255).d();
        ci2.b();
        bd.a(true);
        bd.a(true, true, true, true);
        this.c.b();
        this.b.e();
        this.a.d();
        for (Object e2 : this.d) {
            if (!(e2 instanceof b)) continue;
            ((b)e2).d();
        }
    }

    public c b() {
        return this.c;
    }
}

