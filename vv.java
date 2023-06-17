/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;
import org.lwjgl.util.e.d;

public class vv {
    private final afl c;
    public final btr a;
    public final btr b;
    private final List d = ov.a();
    private final List e = ov.a();
    private final List f = ov.a();
    private final List g = ov.a();
    private d h;

    public vv(akx akx2, String string, btr btr2, btr btr3) {
        this.c = new afl(akx2, string);
        this.a = btr2;
        this.b = btr3;
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
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.k();
        cja.i();
        cja.c();
        cja.o();
        cja.f();
        cja.h();
        cja.v();
        cja.i(0);
    }

    public void a(d d2) {
        this.h = d2;
    }

    public void a(float f2) {
        this.c();
        this.a.e();
        float f3 = this.b.a;
        float f4 = this.b.b;
        cja.b(0, 0, (int)f3, (int)f4);
        this.c.a("DiffuseSampler", this.a);
        for (int i2 = 0; i2 < this.d.size(); ++i2) {
            this.c.a((String)this.e.get(i2), this.d.get(i2));
            this.c.b("AuxSize" + i2).a(((Integer)this.f.get(i2)).intValue(), ((Integer)this.g.get(i2)).intValue());
        }
        this.c.b("ProjMat").a(this.h);
        this.c.b("InSize").a(this.a.a, this.a.b);
        this.c.b("OutSize").a(f3, f4);
        this.c.b("Time").a(f2);
        bxy bxy2 = bxy.B();
        this.c.b("ScreenSize").a(bxy2.d, bxy2.e);
        this.c.c();
        this.b.f();
        this.b.a(false);
        cja.a(false);
        cja.a(true, true, true, true);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(7, bxb.f);
        bix2.b(0.0, (double)f4, 500.0).b(255, 255, 255, 255).d();
        bix2.b((double)f3, (double)f4, 500.0).b(255, 255, 255, 255).d();
        bix2.b((double)f3, 0.0, 500.0).b(255, 255, 255, 255).d();
        bix2.b(0.0, 0.0, 500.0).b(255, 255, 255, 255).d();
        bha2.b();
        cja.a(true);
        cja.a(true, true, true, true);
        this.c.b();
        this.b.e();
        this.a.d();
        for (Object e2 : this.d) {
            if (!(e2 instanceof btr)) continue;
            ((btr)e2).d();
        }
    }

    public afl b() {
        return this.c;
    }
}

