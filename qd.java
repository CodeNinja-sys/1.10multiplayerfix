/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class qd
extends bfa {
    protected qd() {
        super(ahk.C, bif.u);
        this.a(zm.b);
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return hp.bm;
    }

    @Override
    public int a(Random random) {
        return 3 + random.nextInt(5);
    }

    @Override
    public int a(int n2, Random random) {
        return Math.min(9, this.a(random) + random.nextInt(1 + n2));
    }
}

