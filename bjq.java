/*
 * Decompiled with CFR 0.150.
 */
class bjq
extends ux {
    final /* synthetic */ iu a;
    final /* synthetic */ cmz b;
    final /* synthetic */ li g;

    bjq(li li2, tb tb2, int n2, int n3, int n4, iu iu2, cmz cmz2) {
        this.g = li2;
        this.a = iu2;
        this.b = cmz2;
        super(tb2, n2, n3, n4);
    }

    @Override
    public boolean a(bhl bhl2) {
        return false;
    }

    @Override
    public boolean a(bdl bdl2) {
        return (bdl2.G.d || bdl2.H >= this.g.a) && this.g.a > 0 && this.b();
    }

    @Override
    public void a(bdl bdl2, bhl bhl2) {
        Object object;
        if (!bdl2.G.d) {
            bdl2.j(-this.g.a);
        }
        li.a(this.g).a(0, null);
        if (li.b(this.g) > 0) {
            object = li.a(this.g).a(1);
            if (object != null && ((bhl)object).b > li.b(this.g)) {
                ((bhl)object).b -= li.b(this.g);
                li.a(this.g).a(1, (bhl)object);
            } else {
                li.a(this.g).a(1, null);
            }
        } else {
            li.a(this.g).a(1, null);
        }
        this.g.a = 0;
        object = this.a.n(this.b);
        if (!bdl2.G.d && !this.a.C && object.t() == blg.cf && bdl2.aW().nextFloat() < 0.12f) {
            int n2 = (Integer)object.b(ba.b);
            if (++n2 > 2) {
                this.a.f(this.b);
                this.a.b(1029, this.b, 0);
            } else {
                this.a.a(this.b, object.a(ba.b, Integer.valueOf(n2)), 2);
                this.a.b(1030, this.b, 0);
            }
        } else if (!this.a.C) {
            this.a.b(1030, this.b, 0);
        }
    }
}

