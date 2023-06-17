/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cul
extends bfa {
    public cul(ahk ahk2) {
        super(ahk2);
        this.a(zm.b);
    }

    @Override
    public int a(Random random) {
        return 2 + random.nextInt(2);
    }

    @Override
    public int a(int n2, Random random) {
        return cmk.a(this.a(random) + random.nextInt(n2 + 1), 1, 5);
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return hp.cN;
    }

    @Override
    public bif a(dbk dbk2) {
        return bif.p;
    }

    @Override
    protected boolean c() {
        return true;
    }
}

