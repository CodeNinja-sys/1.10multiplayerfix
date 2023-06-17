/*
 * Decompiled with CFR 0.150.
 */
import java.util.UUID;

public class bz
implements ds {
    private int a;
    private UUID b;
    private cmz c;
    private bqk d;
    private String e;

    public bz() {
    }

    public bz(cbk cbk2) {
        this.a = cbk2.bW();
        this.b = cbk2.cx();
        this.c = cbk2.p();
        this.d = cbk2.b;
        this.e = cbk2.c.B;
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        this.b = si2.g();
        this.e = si2.e(dgd.A);
        this.c = si2.c();
        this.d = bqk.b(si2.F());
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        si2.a(this.b);
        si2.a(this.e);
        si2.a(this.c);
        si2.B(this.d.c());
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public int a() {
        return this.a;
    }

    public UUID b() {
        return this.b;
    }

    public cmz c() {
        return this.c;
    }

    public bqk d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }
}

