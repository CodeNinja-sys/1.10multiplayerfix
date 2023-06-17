/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class qx
implements ds {
    private int a;
    private List b;

    public qx() {
    }

    public qx(int n2, bwm bwm2, boolean bl2) {
        this.a = n2;
        this.b = bl2 ? bwm2.c() : bwm2.b();
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        this.b = bwm.b(si2);
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        bwm.a(this.b, si2);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public List a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }
}

