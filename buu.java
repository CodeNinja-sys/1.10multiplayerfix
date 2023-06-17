/*
 * Decompiled with CFR 0.150.
 */
public class buu
implements ds {
    private int a;
    private int b;
    private int c;
    private short d;
    private bhl e;
    private aao f;

    public buu() {
    }

    public buu(int n2, int n3, int n4, aao aao2, bhl bhl2, short s2) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.e = bhl2 != null ? bhl2.j() : null;
        this.d = s2;
        this.f = aao2;
    }

    public void a(bws bws2) {
        bws2.a(this);
    }

    @Override
    public void a(si si2) {
        this.a = si2.E();
        this.b = si2.G();
        this.c = si2.E();
        this.d = si2.G();
        this.f = (aao)si2.a(aao.class);
        this.e = si2.i();
    }

    @Override
    public void b(si si2) {
        si2.B(this.a);
        si2.C(this.b);
        si2.B(this.c);
        si2.C(this.d);
        si2.a(this.f);
        si2.a(this.e);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public short d() {
        return this.d;
    }

    public bhl e() {
        return this.e;
    }

    public aao f() {
        return this.f;
    }
}

