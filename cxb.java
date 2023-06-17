/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cxb
extends ctj {
    private final dbk a;
    private final dbk b;

    public cxb(dbk dbk2, dbk dbk3) {
        super(false);
        this.b = dbk2;
        this.a = dbk3;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        dbk dbk2 = iu2.n(cmz2);
        while ((dbk2.a() == ahk.a || dbk2.a() == ahk.j) && cmz2.b() > 0) {
            cmz2 = cmz2.h();
            dbk2 = iu2.n(cmz2);
        }
        bfa bfa2 = iu2.n(cmz2).t();
        if (bfa2 == blg.d || bfa2 == blg.c) {
            cmz2 = cmz2.g();
            this.a(iu2, cmz2, this.b);
            for (int i2 = cmz2.b(); i2 <= cmz2.b() + 2; ++i2) {
                int n2 = i2 - cmz2.b();
                int n3 = 2 - n2;
                for (int i3 = cmz2.a() - n3; i3 <= cmz2.a() + n3; ++i3) {
                    int n4 = i3 - cmz2.a();
                    for (int i4 = cmz2.c() - n3; i4 <= cmz2.c() + n3; ++i4) {
                        cmz cmz3;
                        ahk ahk2;
                        int n5 = i4 - cmz2.c();
                        if (Math.abs(n4) == n3 && Math.abs(n5) == n3 && random.nextInt(2) == 0 || (ahk2 = iu2.n(cmz3 = new cmz(i3, i2, i4)).a()) != ahk.a && ahk2 != ahk.j) continue;
                        this.a(iu2, cmz3, this.a);
                    }
                }
            }
        }
        return true;
    }
}

