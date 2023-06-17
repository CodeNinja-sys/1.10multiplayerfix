/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collection;

class acj
implements aho {
    private static final bhl[] a = new bhl[9];

    acj() {
    }

    @Override
    public boolean a(yo yo2, iu iu2) {
        if (yo2.i() != 3 || yo2.h() != 3) {
            return false;
        }
        for (int i2 = 0; i2 < yo2.i(); ++i2) {
            for (int i3 = 0; i3 < yo2.h(); ++i3) {
                bhl bhl2 = yo2.c(i2, i3);
                if (bhl2 == null) {
                    return false;
                }
                azg azg2 = bhl2.a();
                if (!(i2 == 1 && i3 == 1 ? azg2 != hp.bI : azg2 != hp.g)) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public bhl a(yo yo2) {
        bhl bhl2 = yo2.c(1, 1);
        if (bhl2 == null || bhl2.a() != hp.bI) {
            return null;
        }
        bhl bhl3 = new bhl(hp.i, 8);
        anl.a(bhl3, anl.c(bhl2));
        anl.a(bhl3, (Collection)anl.b(bhl2));
        return bhl3;
    }

    @Override
    public int a() {
        return 9;
    }

    @Override
    public bhl b() {
        return null;
    }

    @Override
    public bhl[] b(yo yo2) {
        return a;
    }
}

