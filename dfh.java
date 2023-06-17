/*
 * Decompiled with CFR 0.150.
 */
public class dfh
implements ds {
    private int a;
    private bfv b;

    public dfh() {
    }

    public dfh(int n2, bfv bfv2) {
        this.a = n2;
        this.b = bfv2;
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        this.b = bfv.a(si2.F());
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        si2.B(bfv.a(this.b));
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public cpk a(iu iu2) {
        return iu2.a(this.a);
    }

    public bfv a() {
        return this.b;
    }
}

