/*
 * Decompiled with CFR 0.150.
 */
public class cnj
implements ds {
    private int a;
    private ahr b;
    private amj c;
    private bqp d;

    public cnj() {
    }

    public cnj(cpk cpk2) {
        this.a = cpk2.bW();
        this.b = ahr.b;
    }

    public cnj(cpk cpk2, bqp bqp2) {
        this.a = cpk2.bW();
        this.b = ahr.a;
        this.d = bqp2;
    }

    public cnj(cpk cpk2, bqp bqp2, amj amj2) {
        this.a = cpk2.bW();
        this.b = ahr.c;
        this.d = bqp2;
        this.c = amj2;
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        this.b = (ahr)si2.a(ahr.class);
        if (this.b == ahr.c) {
            this.c = new amj(si2.O(), si2.O(), si2.O());
        }
        if (this.b == ahr.a || this.b == ahr.c) {
            this.d = (bqp)si2.a(bqp.class);
        }
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        si2.a(this.b);
        if (this.b == ahr.c) {
            si2.a((float)this.c.b);
            si2.a((float)this.c.c);
            si2.a((float)this.c.d);
        }
        if (this.b == ahr.a || this.b == ahr.c) {
            si2.a(this.d);
        }
    }

    public void a(bws bws2) {
        bws2.a(this);
    }

    public cpk a(iu iu2) {
        return iu2.a(this.a);
    }

    public ahr a() {
        return this.b;
    }

    public bqp b() {
        return this.d;
    }

    public amj c() {
        return this.c;
    }
}

