/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bks
extends bfa {
    public bks() {
        super(ahk.G);
        this.a(zm.c);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, cpk cpk2) {
        cpk2.X_();
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public cxt b(dbk dbk2, iu iu2, cmz cmz2) {
        return y;
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return hp.H;
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    public kj b() {
        return kj.c;
    }

    @Override
    public void a(iu iu2, bdl bdl2, cmz cmz2, dbk dbk2, bql bql2, bhl bhl2) {
        if (!iu2.C && bhl2 != null && bhl2.a() == hp.bl) {
            bdl2.a(bpv.a(this));
            bks.a(iu2, cmz2, new bhl(azg.a(this), 1));
            return;
        }
        super.a(iu2, bdl2, cmz2, dbk2, bql2, bhl2);
    }
}

