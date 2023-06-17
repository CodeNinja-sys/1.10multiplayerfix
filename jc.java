/*
 * Decompiled with CFR 0.150.
 */
public class jc {
    private bhl a;
    private bhl b;
    private bhl c;
    private int d;
    private int e;
    private boolean f;

    public jc(bvp bvp2) {
        this.a(bvp2);
    }

    public jc(bhl bhl2, bhl bhl3, bhl bhl4) {
        this(bhl2, bhl3, bhl4, 0, 7);
    }

    public jc(bhl bhl2, bhl bhl3, bhl bhl4, int n2, int n3) {
        this.a = bhl2;
        this.b = bhl3;
        this.c = bhl4;
        this.d = n2;
        this.e = n3;
        this.f = true;
    }

    public jc(bhl bhl2, bhl bhl3) {
        this(bhl2, null, bhl3);
    }

    public jc(bhl bhl2, azg azg2) {
        this(bhl2, new bhl(azg2));
    }

    public bhl a() {
        return this.a;
    }

    public bhl b() {
        return this.b;
    }

    public boolean c() {
        return this.b != null;
    }

    public bhl d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public int f() {
        return this.e;
    }

    public void g() {
        ++this.d;
    }

    public void a(int n2) {
        this.e += n2;
    }

    public boolean h() {
        return this.d >= this.e;
    }

    public void i() {
        this.d = this.e;
    }

    public boolean j() {
        return this.f;
    }

    public void a(bvp bvp2) {
        bvp bvp3 = bvp2.o("buy");
        this.a = bhl.a(bvp3);
        bvp bvp4 = bvp2.o("sell");
        this.c = bhl.a(bvp4);
        if (bvp2.b("buyB", 10)) {
            this.b = bhl.a(bvp2.o("buyB"));
        }
        if (bvp2.b("uses", 99)) {
            this.d = bvp2.h("uses");
        }
        this.e = bvp2.b("maxUses", 99) ? bvp2.h("maxUses") : 7;
        this.f = bvp2.b("rewardExp", 1) ? bvp2.p("rewardExp") : true;
    }

    public bvp k() {
        bvp bvp2 = new bvp();
        bvp2.a("buy", this.a.b(new bvp()));
        bvp2.a("sell", this.c.b(new bvp()));
        if (this.b != null) {
            bvp2.a("buyB", this.b.b(new bvp()));
        }
        bvp2.a("uses", this.d);
        bvp2.a("maxUses", this.e);
        bvp2.a("rewardExp", this.f);
        return bvp2;
    }
}

