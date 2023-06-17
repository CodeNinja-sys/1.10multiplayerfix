/*
 * Decompiled with CFR 0.150.
 */
public class zb
implements ds {
    public cop a;
    public int b;
    public int c;
    public int d;
    public cbg e;

    public zb() {
    }

    public zb(csk csk2, cop cop2) {
        this(csk2, cop2, true);
    }

    public zb(csk csk2, cop cop2, boolean bl2) {
        this.a = cop2;
        bga bga2 = csk2.c();
        switch (cop2) {
            case b: {
                this.d = csk2.d();
                this.c = bga2 == null ? -1 : bga2.bW();
                break;
            }
            case c: {
                this.b = csk2.f().bW();
                this.c = bga2 == null ? -1 : bga2.bW();
                this.e = bl2 ? csk2.b() : new aym("");
            }
        }
    }

    @Override
    public void a(si si2) {
        this.a = (cop)si2.a(cop.class);
        if (this.a == cop.b) {
            this.d = si2.e();
            this.c = si2.K();
        } else if (this.a == cop.c) {
            this.b = si2.e();
            this.c = si2.K();
            this.e = si2.d();
        }
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        if (this.a == cop.b) {
            si2.d(this.d);
            si2.E(this.c);
        } else if (this.a == cop.c) {
            si2.d(this.b);
            si2.E(this.c);
            si2.a(this.e);
        }
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }
}

