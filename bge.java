/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

class bge
extends ck {
    private final zv a;
    private int b;

    public bge(zv zv2) {
        this.a = zv2;
    }

    public void f() {
        if (this.b == 0) {
            this.b = 20;
        }
    }

    @Override
    public boolean b() {
        return this.b > 0;
    }

    @Override
    public void e() {
        --this.b;
        if (this.b <= 0) {
            iu iu2 = this.a.aQ;
            Random random = this.a.aW();
            cmz cmz2 = new cmz(this.a);
            int n2 = 0;
            block0: while (n2 <= 5 && n2 >= -5) {
                int n3 = 0;
                while (n3 <= 10 && n3 >= -10) {
                    int n4 = 0;
                    while (n4 <= 10 && n4 >= -10) {
                        cmz cmz3 = cmz2.e(n3, n2, n4);
                        dbk dbk2 = iu2.n(cmz3);
                        if (dbk2.t() == blg.be) {
                            if (iu2.F().b("mobGriefing")) {
                                iu2.b(cmz3, true);
                            } else {
                                iu2.a(cmz3, ((btc)((Object)dbk2.b(aob.a))).b(), 3);
                            }
                            if (random.nextBoolean()) break block0;
                        }
                        n4 = n4 <= 0 ? 1 - n4 : 0 - n4;
                    }
                    n3 = n3 <= 0 ? 1 - n3 : 0 - n3;
                }
                n2 = n2 <= 0 ? 1 - n2 : 0 - n2;
            }
        }
    }
}

