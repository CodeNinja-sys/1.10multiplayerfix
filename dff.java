/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class dff
extends cxx {
    public dff(ain ain2) {
        super(ain2);
        this.z.z = 2;
        this.z.B = 2;
        this.z.C = 5;
    }

    @Override
    public void a(iu iu2, Random random, cnb cnb2, int n2, int n3, double d2) {
        this.x = blg.c.s();
        this.y = blg.d.s();
        if (d2 > 1.75) {
            this.x = blg.b.s();
            this.y = blg.b.s();
        } else if (d2 > -0.5) {
            this.x = blg.d.s().a(bwt.a, (Comparable)((Object)dgu.b));
        }
        this.b(iu2, random, cnb2, n2, n3, d2);
    }

    @Override
    public void a(iu iu2, Random random, cmz cmz2) {
        this.z.a(iu2, random, this, cmz2);
    }
}

