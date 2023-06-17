/*
 * Decompiled with CFR 0.150.
 */
public class bso
extends yw {
    @Override
    public void a(kj kj2) {
        if (!this.b) {
            return;
        }
        for (adr adr2 : this.a) {
            bqe bqe2 = (bqe)adr2;
            cja.D();
            this.a(adr2);
            cja.p(bqe2.a(kj2, bqe2.g()));
            cja.E();
        }
        cja.F();
        this.a.clear();
    }
}

