/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class avv
extends cmy {
    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        if (n2 > 3) {
            n2 = 3;
        }
        if (random.nextInt(10 - n2 * 3) == 0) {
            return hp.am;
        }
        return azg.a(this);
    }

    @Override
    public bif a(dbk dbk2) {
        return bif.m;
    }

    @Override
    public int m(dbk dbk2) {
        return -8356741;
    }
}

