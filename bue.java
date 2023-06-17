/*
 * Decompiled with CFR 0.150.
 */
public abstract class bue
extends cea {
    public static final byc b = byc.a("axis", fy.class);

    public bue() {
        super(ahk.d);
        this.a(zm.b);
        this.c(2.0f);
        this.a(acv.a);
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        int n2 = 4;
        int n3 = 5;
        if (!iu2.a(cmz2.e(-5, -5, -5), cmz2.e(5, 5, 5))) {
            return;
        }
        for (cmz cmz3 : cmz.a(cmz2.e(-4, -4, -4), cmz2.e(4, 4, 4))) {
            dbk dbk3 = iu2.n(cmz3);
            if (dbk3.a() != ahk.j || ((Boolean)dbk3.b(aai.b)).booleanValue()) continue;
            iu2.a(cmz3, dbk3.a(aai.b, Boolean.valueOf(true)), 4);
        }
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        return this.a(n2).a(b, (Comparable)((Object)fy.a(bqk2.l())));
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        switch (ih2) {
            case d: 
            case b: {
                switch ((fy)((Object)dbk2.b(b))) {
                    case a: {
                        return dbk2.a(b, (Comparable)((Object)fy.c));
                    }
                    case c: {
                        return dbk2.a(b, (Comparable)((Object)fy.a));
                    }
                }
                return dbk2;
            }
        }
        return dbk2;
    }
}

