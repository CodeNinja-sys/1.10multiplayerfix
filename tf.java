/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class tf
extends bfa {
    public tf() {
        super(ahk.e);
        this.a(zm.b);
        this.a(0.2f);
        this.b(true);
    }

    @Override
    public bif a(dbk dbk2) {
        return bif.K;
    }

    @Override
    public void a(iu iu2, cmz cmz2, cpk cpk2) {
        if (!cpk2.cg() && cpk2 instanceof bga && !acz.j((bga)cpk2)) {
            cpk2.a(ahy.e, 1.0f);
        }
        super.a(iu2, cmz2, cpk2);
    }

    @Override
    public int c(dbk dbk2, bnj bnj2, cmz cmz2) {
        return 0xF000F0;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        cmz cmz3 = cmz2.g();
        dbk dbk3 = iu2.n(cmz3);
        if (dbk3.t() == blg.j || dbk3.t() == blg.i) {
            iu2.f(cmz3);
            iu2.a(null, cmz2, dah.bx, csg.e, 0.5f, 2.6f + (iu2.p.nextFloat() - iu2.p.nextFloat()) * 0.8f);
            if (iu2 instanceof alj) {
                ((alj)iu2).a(lz.m, (double)cmz3.a() + 0.5, (double)cmz3.b() + 0.25, (double)cmz3.c() + 0.5, 8, 0.5, 0.25, 0.5, 0.0, new int[0]);
            }
        }
    }

    @Override
    public boolean a(dbk dbk2, cpk cpk2) {
        return cpk2.cg();
    }
}

