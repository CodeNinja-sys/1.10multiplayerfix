/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class ddo
extends ar {
    protected ddo() {
        super(ahk.e);
    }

    @Override
    public bql a(iu iu2, int n2) {
        return new ze();
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return null;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, float f2, int n2) {
        super.a(iu2, cmz2, dbk2, f2, n2);
        int n3 = 15 + iu2.p.nextInt(15) + iu2.p.nextInt(15);
        this.b(iu2, cmz2, n3);
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public cpb g(dbk dbk2) {
        return cpb.d;
    }

    @Override
    public kj b() {
        return kj.c;
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return null;
    }
}

