/*
 * Decompiled with CFR 0.150.
 */
public class cqn
implements ds {
    private int a;
    private int b;

    public cqn() {
    }

    public cqn(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public void a(bws bws2) {
        bws2.a(this);
    }

    @Override
    public void a(si si2) {
        this.a = si2.E();
        this.b = si2.E();
    }

    @Override
    public void b(si si2) {
        si2.B(this.a);
        si2.B(this.b);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }
}

