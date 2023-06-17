/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class rq
extends to {
    private boolean a;
    private ajp b;
    private cmz c;

    public void a(ajp ajp2) {
        this.b = ajp2;
    }

    public void a(boolean bl2) {
        this.a = bl2;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        if (this.b == null) {
            throw new IllegalStateException("Decoration requires priming with a spike");
        }
        int n2 = this.b.c();
        for (pj pj2 : cmz.b(new cmz(cmz2.a() - n2, 0, cmz2.c() - n2), new cmz(cmz2.a() + n2, this.b.d() + 10, cmz2.c() + n2))) {
            if (pj2.d((double)cmz2.a(), (double)pj2.b(), (double)cmz2.c()) <= (double)(n2 * n2 + 1) && pj2.b() < this.b.d()) {
                this.a(iu2, pj2, blg.Z.s());
                continue;
            }
            if (pj2.b() <= 65) continue;
            this.a(iu2, pj2, blg.a.s());
        }
        if (this.b.e()) {
            for (int i2 = -2; i2 <= 2; ++i2) {
                for (int i3 = -2; i3 <= 2; ++i3) {
                    if (cmk.a(i2) == 2 || cmk.a(i3) == 2) {
                        this.a(iu2, new cmz(cmz2.a() + i2, this.b.d(), cmz2.c() + i3), blg.bi.s());
                        this.a(iu2, new cmz(cmz2.a() + i2, this.b.d() + 1, cmz2.c() + i3), blg.bi.s());
                        this.a(iu2, new cmz(cmz2.a() + i2, this.b.d() + 2, cmz2.c() + i3), blg.bi.s());
                    }
                    this.a(iu2, new cmz(cmz2.a() + i2, this.b.d() + 3, cmz2.c() + i3), blg.bi.s());
                }
            }
        }
        abi abi2 = new abi(iu2);
        abi2.a(this.c);
        abi2.s(this.a);
        abi2.a_((float)cmz2.a() + 0.5f, this.b.d() + 1, (float)cmz2.c() + 0.5f, random.nextFloat() * 360.0f, 0.0f);
        iu2.b(abi2);
        this.a(iu2, new cmz(cmz2.a(), this.b.d(), cmz2.c()), blg.h.s());
        return true;
    }

    public void a(cmz cmz2) {
        this.c = cmz2;
    }
}

