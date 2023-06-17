/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bnf
extends ic {
    public bnf() {
    }

    public bnf(bqk bqk2, cgd cgd2) {
        super(1, bqk2, cgd2, 1, 1, 1);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        this.a(iu2, awx2, 0, 3, 0, 2, 3, 7, b, b, false);
        this.a(iu2, awx2, 5, 3, 0, 7, 3, 7, b, b, false);
        this.a(iu2, awx2, 0, 2, 0, 1, 2, 7, b, b, false);
        this.a(iu2, awx2, 6, 2, 0, 7, 2, 7, b, b, false);
        this.a(iu2, awx2, 0, 1, 0, 0, 1, 7, b, b, false);
        this.a(iu2, awx2, 7, 1, 0, 7, 1, 7, b, b, false);
        this.a(iu2, awx2, 0, 1, 7, 7, 3, 7, b, b, false);
        this.a(iu2, awx2, 1, 1, 0, 2, 3, 0, b, b, false);
        this.a(iu2, awx2, 5, 1, 0, 6, 3, 0, b, b, false);
        if (this.k.c[bqk.c.b()]) {
            this.a(iu2, awx2, 3, 1, 7, 4, 2, 7, false);
        }
        if (this.k.c[bqk.e.b()]) {
            this.a(iu2, awx2, 0, 1, 3, 1, 2, 4, false);
        }
        if (this.k.c[bqk.f.b()]) {
            this.a(iu2, awx2, 6, 1, 3, 7, 2, 4, false);
        }
        return true;
    }
}

