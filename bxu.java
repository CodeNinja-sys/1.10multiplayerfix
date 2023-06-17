/*
 * Decompiled with CFR 0.150.
 */
public class bxu
implements ds {
    private int a;
    private int b;
    private bhl c;

    public bxu() {
    }

    public bxu(int n2, int n3, bhl bhl2) {
        this.a = n2;
        this.b = n3;
        this.c = bhl2 == null ? null : bhl2.j();
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    @Override
    public void a(si si2) {
        this.a = si2.E();
        this.b = si2.G();
        this.c = si2.i();
    }

    @Override
    public void b(si si2) {
        si2.B(this.a);
        si2.C(this.b);
        si2.a(this.c);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public bhl c() {
        return this.c;
    }
}

