/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.UUID;

public class hb
implements ds {
    private int a;
    private UUID b;
    private double c;
    private double d;
    private double e;
    private byte f;
    private byte g;
    private bwm h;
    private List i;

    public hb() {
    }

    public hb(bdl bdl2) {
        this.a = bdl2.bW();
        this.b = bdl2.aq().a();
        this.c = bdl2.aU;
        this.d = bdl2.aV;
        this.e = bdl2.aW;
        this.f = (byte)(bdl2.ba * 256.0f / 360.0f);
        this.g = (byte)(bdl2.bb * 256.0f / 360.0f);
        this.h = bdl2.bY();
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        this.b = si2.g();
        this.c = si2.P();
        this.d = si2.P();
        this.e = si2.P();
        this.f = si2.E();
        this.g = si2.E();
        this.i = bwm.b(si2);
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        si2.a(this.b);
        si2.a(this.c);
        si2.a(this.d);
        si2.a(this.e);
        si2.B(this.f);
        si2.B(this.g);
        this.h.a(si2);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public List a() {
        if (this.i == null) {
            this.i = this.h.c();
        }
        return this.i;
    }

    public int b() {
        return this.a;
    }

    public UUID c() {
        return this.b;
    }

    public double d() {
        return this.c;
    }

    public double e() {
        return this.d;
    }

    public double f() {
        return this.e;
    }

    public byte g() {
        return this.f;
    }

    public byte h() {
        return this.g;
    }
}

