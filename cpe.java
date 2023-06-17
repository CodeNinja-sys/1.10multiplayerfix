/*
 * Decompiled with CFR 0.150.
 */
public class cpe
implements ds {
    public int a;

    public cpe() {
    }

    public cpe(cpk cpk2) {
        this.a = cpk2.bW();
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public cpk a(iu iu2) {
        return iu2.a(this.a);
    }
}

