/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class l
extends cv {
    private boolean c;

    public l() {
    }

    public l(iu iu2, cgb cgb2, Random random, int n2, int n3) {
        super(n2, n3);
        this.a(iu2, cgb2, random, n2, n3);
    }

    private void a(iu iu2, cgb cgb2, Random random, int n2, int n3) {
        ih ih2 = ih.values()[random.nextInt(ih.values().length)];
        cnb cnb2 = new cnb();
        cgb2.a(n2, n3, cnb2);
        int n4 = 5;
        int n5 = 5;
        if (ih2 == ih.b) {
            n4 = -5;
        } else if (ih2 == ih.c) {
            n4 = -5;
            n5 = -5;
        } else if (ih2 == ih.d) {
            n5 = -5;
        }
        int n6 = cnb2.a(7, 7);
        int n7 = cnb2.a(7, 7 + n5);
        int n8 = cnb2.a(7 + n4, 7);
        int n9 = cnb2.a(7 + n4, 7 + n5);
        int n10 = Math.min(Math.min(n6, n7), Math.min(n8, n9));
        if (n10 < 60) {
            this.c = false;
            return;
        }
        cmz cmz2 = new cmz(n2 * 16 + 8, n10, n3 * 16 + 8);
        bze.a(cmz2, ih2, this.a, random);
        this.d();
        this.c = true;
    }

    @Override
    public boolean a() {
        return this.c;
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
    }
}

