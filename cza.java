/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public abstract class cza
extends ko {
    protected final int a;
    protected final dbk b;
    protected final dbk c;
    protected int d;

    public cza(boolean bl2, int n2, int n3, dbk dbk2, dbk dbk3) {
        super(bl2);
        this.a = n2;
        this.d = n3;
        this.b = dbk2;
        this.c = dbk3;
    }

    protected int a(Random random) {
        int n2 = random.nextInt(3) + this.a;
        if (this.d > 1) {
            n2 += random.nextInt(this.d);
        }
        return n2;
    }

    private boolean c(iu iu2, cmz cmz2, int n2) {
        boolean bl2 = true;
        if (cmz2.b() < 1 || cmz2.b() + n2 + 1 > 256) {
            return false;
        }
        for (int i2 = 0; i2 <= 1 + n2; ++i2) {
            int n3 = 2;
            if (i2 == 0) {
                n3 = 1;
            } else if (i2 >= 1 + n2 - 2) {
                n3 = 2;
            }
            for (int i3 = -n3; i3 <= n3 && bl2; ++i3) {
                for (int i4 = -n3; i4 <= n3 && bl2; ++i4) {
                    if (cmz2.b() + i2 >= 0 && cmz2.b() + i2 < 256 && this.a(iu2.n(cmz2.e(i3, i2, i4)).t())) continue;
                    bl2 = false;
                }
            }
        }
        return bl2;
    }

    private boolean a(cmz cmz2, iu iu2) {
        cmz cmz3 = cmz2.h();
        bfa bfa2 = iu2.n(cmz3).t();
        if (bfa2 != blg.c && bfa2 != blg.d || cmz2.b() < 2) {
            return false;
        }
        this.a(iu2, cmz3);
        this.a(iu2, cmz3.l());
        this.a(iu2, cmz3.j());
        this.a(iu2, cmz3.j().l());
        return true;
    }

    protected boolean a(iu iu2, Random random, cmz cmz2, int n2) {
        return this.c(iu2, cmz2, n2) && this.a(cmz2, iu2);
    }

    protected void a(iu iu2, cmz cmz2, int n2) {
        int n3 = n2 * n2;
        for (int i2 = -n2; i2 <= n2 + 1; ++i2) {
            for (int i3 = -n2; i3 <= n2 + 1; ++i3) {
                cmz cmz3;
                ahk ahk2;
                int n4 = i2 - 1;
                int n5 = i3 - 1;
                if (i2 * i2 + i3 * i3 > n3 && n4 * n4 + n5 * n5 > n3 && i2 * i2 + n5 * n5 > n3 && n4 * n4 + i3 * i3 > n3 || (ahk2 = iu2.n(cmz3 = cmz2.e(i2, 0, i3)).a()) != ahk.a && ahk2 != ahk.j) continue;
                this.a(iu2, cmz3, this.c);
            }
        }
    }

    protected void b(iu iu2, cmz cmz2, int n2) {
        int n3 = n2 * n2;
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                cmz cmz3;
                ahk ahk2;
                if (i2 * i2 + i3 * i3 > n3 || (ahk2 = iu2.n(cmz3 = cmz2.e(i2, 0, i3)).a()) != ahk.a && ahk2 != ahk.j) continue;
                this.a(iu2, cmz3, this.c);
            }
        }
    }
}

