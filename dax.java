/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.Set;

public class dax
extends xi {
    private static final Set e = aad.a(blg.cs, blg.q, blg.e, blg.E, blg.ah, blg.ag, blg.T, blg.D, blg.R, blg.o, blg.aI, blg.S, blg.p, blg.y, blg.x, blg.aD, blg.Y, blg.aV, blg.cB, blg.av, blg.aC, blg.A, blg.cM, blg.b, blg.U, blg.aG, blg.az);

    protected dax(avx avx2) {
        super(1.0f, -2.8f, avx2, e);
    }

    @Override
    public boolean a(dbk dbk2) {
        bfa bfa2 = dbk2.t();
        if (bfa2 == blg.Z) {
            return this.d.d() == 3;
        }
        if (bfa2 == blg.ah || bfa2 == blg.ag) {
            return this.d.d() >= 2;
        }
        if (bfa2 == blg.bP || bfa2 == blg.bT) {
            return this.d.d() >= 2;
        }
        if (bfa2 == blg.R || bfa2 == blg.o) {
            return this.d.d() >= 2;
        }
        if (bfa2 == blg.S || bfa2 == blg.p) {
            return this.d.d() >= 1;
        }
        if (bfa2 == blg.y || bfa2 == blg.x) {
            return this.d.d() >= 1;
        }
        if (bfa2 == blg.aC || bfa2 == blg.aD) {
            return this.d.d() >= 2;
        }
        ahk ahk2 = dbk2.a();
        if (ahk2 == ahk.e) {
            return true;
        }
        if (ahk2 == ahk.f) {
            return true;
        }
        return ahk2 == ahk.g;
    }

    @Override
    public float a(bhl bhl2, dbk dbk2) {
        ahk ahk2 = dbk2.a();
        if (ahk2 == ahk.f || ahk2 == ahk.g || ahk2 == ahk.e) {
            return this.a;
        }
        return super.a(bhl2, dbk2);
    }
}

