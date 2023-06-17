/*
 * Decompiled with CFR 0.150.
 */
public class us
implements ds {
    private bao a;
    private int b;
    private double c;
    private double d;
    private double e;
    private double f;
    private long g;
    private int h;
    private int i;

    public us() {
    }

    public us(ajw ajw2, bao bao2) {
        this.a = bao2;
        this.c = ajw2.f();
        this.d = ajw2.g();
        this.f = ajw2.h();
        this.e = ajw2.j();
        this.g = ajw2.i();
        this.b = ajw2.l();
        this.i = ajw2.q();
        this.h = ajw2.p();
    }

    @Override
    public void a(si si2) {
        this.a = (bao)si2.a(bao.class);
        switch (this.a) {
            case a: {
                this.e = si2.P();
                break;
            }
            case b: {
                this.f = si2.P();
                this.e = si2.P();
                this.g = si2.f();
                break;
            }
            case c: {
                this.c = si2.P();
                this.d = si2.P();
                break;
            }
            case f: {
                this.i = si2.e();
                break;
            }
            case e: {
                this.h = si2.e();
                break;
            }
            case d: {
                this.c = si2.P();
                this.d = si2.P();
                this.f = si2.P();
                this.e = si2.P();
                this.g = si2.f();
                this.b = si2.e();
                this.i = si2.e();
                this.h = si2.e();
            }
        }
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        switch (this.a) {
            case a: {
                si2.a(this.e);
                break;
            }
            case b: {
                si2.a(this.f);
                si2.a(this.e);
                si2.a(this.g);
                break;
            }
            case c: {
                si2.a(this.c);
                si2.a(this.d);
                break;
            }
            case e: {
                si2.d(this.h);
                break;
            }
            case f: {
                si2.d(this.i);
                break;
            }
            case d: {
                si2.a(this.c);
                si2.a(this.d);
                si2.a(this.f);
                si2.a(this.e);
                si2.a(this.g);
                si2.d(this.b);
                si2.d(this.i);
                si2.d(this.h);
            }
        }
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public void a(ajw ajw2) {
        switch (this.a) {
            case a: {
                ajw2.a(this.e);
                break;
            }
            case b: {
                ajw2.a(this.f, this.e, this.g);
                break;
            }
            case c: {
                ajw2.b(this.c, this.d);
                break;
            }
            case d: {
                ajw2.b(this.c, this.d);
                if (this.g > 0L) {
                    ajw2.a(this.f, this.e, this.g);
                } else {
                    ajw2.a(this.e);
                }
                ajw2.a(this.b);
                ajw2.c(this.i);
                ajw2.b(this.h);
                break;
            }
            case e: {
                ajw2.b(this.h);
                break;
            }
            case f: {
                ajw2.c(this.i);
            }
        }
    }
}

