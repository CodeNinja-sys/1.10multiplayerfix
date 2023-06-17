/*
 * Decompiled with CFR 0.150.
 */
public class cqg
implements ds {
    private int a;
    private awo b;
    private int c;

    public cqg() {
    }

    public cqg(cpk cpk2, awo awo2) {
        this(cpk2, awo2, 0);
    }

    public cqg(cpk cpk2, awo awo2, int n2) {
        this.a = cpk2.bW();
        this.b = awo2;
        this.c = n2;
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        this.b = (awo)si2.a(awo.class);
        this.c = si2.e();
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        si2.a(this.b);
        si2.d(this.c);
    }

    public void a(bws bws2) {
        bws2.a(this);
    }

    public awo a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }
}

