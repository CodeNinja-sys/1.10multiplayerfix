/*
 * Decompiled with CFR 0.150.
 */
class dfx
implements Runnable {
    final /* synthetic */ cmz a;
    final /* synthetic */ beg b;

    dfx(beg beg2, cmz cmz2) {
        this.b = beg2;
        this.a = cmz2;
    }

    @Override
    public void run() {
        bql bql2 = this.b.a.q(this.a);
        if (bql2 instanceof agq) {
            ((agq)bql2).h();
            this.b.a.c(this.a, blg.bY, 1, 0);
        }
    }
}

