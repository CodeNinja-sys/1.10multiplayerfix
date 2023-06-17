/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.mq;
import com.c.a.c.i;
import com.c.a.d.a;
import com.c.a.e;

public class tr
extends bql
implements avf {
    private int a;
    private int b;
    private e c;
    private int d;
    private boolean e;
    private static bas f;
    private static i g;

    public static void a(bas bas2) {
        f = bas2;
    }

    public static void a(i i2) {
        g = i2;
    }

    @Override
    public bvp b(bvp bvp2) {
        super.b(bvp2);
        bvp2.a("SkullType", (byte)(this.a & 0xFF));
        bvp2.a("Rot", (byte)(this.b & 0xFF));
        if (this.c != null) {
            bvp bvp3 = new bvp();
            ayj.a(bvp3, this.c);
            bvp2.a("Owner", bvp3);
        }
        return bvp2;
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        this.a = bvp2.f("SkullType");
        this.b = bvp2.f("Rot");
        if (this.a == 3) {
            String string;
            if (bvp2.b("Owner", 10)) {
                this.c = ayj.a(bvp2.o("Owner"));
            } else if (bvp2.b("ExtraType", 8) && !aco.b(string = bvp2.l("ExtraType"))) {
                this.c = new e(null, string);
                this.h();
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
        if (this.e) {
            return (float)this.d + f2;
        }
        return this.d;
    }

    public e d() {
        return this.c;
    }

    @Override
    public hv a_() {
        return new hv(this.l, 4, this.b());
    }

    @Override
    public bvp b() {
        return this.b(new bvp());
    }

    public void a(int n2) {
        this.a = n2;
        this.c = null;
    }

    public void a(e e2) {
        this.a = 3;
        this.c = e2;
        this.h();
    }

    private void h() {
        this.c = tr.b(this.c);
        this.c_();
    }

    public static e b(e e2) {
        if (e2 == null || aco.b(e2.b())) {
            return e2;
        }
        if (e2.d() && e2.c().f("textures")) {
            return e2;
        }
        if (f == null || g == null) {
            return e2;
        }
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

    public int f() {
        return this.a;
    }

    public int g() {
        return this.b;
    }

    public void b(int n2) {
        this.b = n2;
    }

    @Override
    public void a_(cdk cdk2) {
        if (this.k != null && this.k.n(this.y()).b(cvc.a) == bqk.b) {
            this.b = cdk2.a(this.b, 16);
        }
    }

    @Override
    public void a_(ih ih2) {
        if (this.k != null && this.k.n(this.y()).b(cvc.a) == bqk.b) {
            this.b = ih2.a(this.b, 16);
        }
    }
}

