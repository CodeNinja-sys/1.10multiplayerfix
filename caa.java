/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class caa
implements ds {
    private double a;
    private double b;
    private double c;
    private float d;
    private List e;
    private float f;
    private float g;
    private float h;

    public caa() {
    }

    public caa(double d2, double d3, double d4, float f2, List list, amj amj2) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = f2;
        this.e = ov.a((Iterable)list);
        if (amj2 != null) {
            this.f = (float)amj2.b;
            this.g = (float)amj2.c;
            this.h = (float)amj2.d;
        }
    }

    @Override
    public void a(si si2) {
        this.a = si2.O();
        this.b = si2.O();
        this.c = si2.O();
        this.d = si2.O();
        int n2 = si2.K();
        this.e = ov.b(n2);
        int n3 = (int)this.a;
        int n4 = (int)this.b;
        int n5 = (int)this.c;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n6 = si2.E() + n3;
            int n7 = si2.E() + n4;
            int n8 = si2.E() + n5;
            this.e.add(new cmz(n6, n7, n8));
        }
        this.f = si2.O();
        this.g = si2.O();
        this.h = si2.O();
    }

    @Override
    public void b(si si2) {
        si2.a((float)this.a);
        si2.a((float)this.b);
        si2.a((float)this.c);
        si2.a(this.d);
        si2.E(this.e.size());
        int n2 = (int)this.a;
        int n3 = (int)this.b;
        int n4 = (int)this.c;
        for (cmz cmz2 : this.e) {
            int n5 = cmz2.a() - n2;
            int n6 = cmz2.b() - n3;
            int n7 = cmz2.c() - n4;
            si2.B(n5);
            si2.B(n6);
            si2.B(n7);
        }
        si2.a(this.f);
        si2.a(this.g);
        si2.a(this.h);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public float a() {
        return this.f;
    }

    public float b() {
        return this.g;
    }

    public float c() {
        return this.h;
    }

    public double d() {
        return this.a;
    }

    public double e() {
        return this.b;
    }

    public double f() {
        return this.c;
    }

    public float g() {
        return this.d;
    }

    public List h() {
        return this.e;
    }
}

