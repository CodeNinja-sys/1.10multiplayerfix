/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class ana
extends aet {
    private final int a = 20;
    private final int f = 11;
    private final cgb g;

    public ana(cgb cgb2) {
        this.g = cgb2;
    }

    @Override
    public String a() {
        return "EndCity";
    }

    @Override
    protected boolean a(int n2, int n3) {
        int n4 = n2;
        int n5 = n3;
        if (n2 < 0) {
            n2 -= 19;
        }
        if (n3 < 0) {
            n3 -= 19;
        }
        int n6 = n2 / 20;
        int n7 = n3 / 20;
        Random random = this.e.a(n6, n7, 10387313);
        n6 *= 20;
        n7 *= 20;
        n2 = n4;
        n3 = n5;
        return n2 == (n6 += (random.nextInt(9) + random.nextInt(9)) / 2) && n3 == (n7 += (random.nextInt(9) + random.nextInt(9)) / 2) && this.g.c(n2, n3);
    }

    @Override
    protected cv b(int n2, int n3) {
        return new l(this.e, this.g, this.d, n2, n3);
    }
}

