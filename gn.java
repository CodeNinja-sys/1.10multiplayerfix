/*
 * Decompiled with CFR 0.150.
 */
public class gn
implements ds {
    private int a;
    private bhl b;

    public gn() {
    }

    public gn(int n2, bhl bhl2) {
        this.a = n2;
        this.b = bhl2 != null ? bhl2.j() : null;
    }

    public void a(bws bws2) {
        bws2.a(this);
    }

    @Override
    public void a(si si2) {
        this.a = si2.G();
        this.b = si2.i();
    }

    @Override
    public void b(si si2) {
        si2.C(this.a);
        si2.a(this.b);
    }

    public int a() {
        return this.a;
    }

    public bhl b() {
        return this.b;
    }
}

