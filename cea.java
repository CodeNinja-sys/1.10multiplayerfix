/*
 * Decompiled with CFR 0.150.
 */
public class cea
extends bfa {
    public static final byc c = byc.a("axis", ctv.class);

    protected cea(ahk ahk2) {
        super(ahk2, ahk2.p());
    }

    protected cea(ahk ahk2, bif bif2) {
        super(ahk2, bif2);
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        switch (ih2) {
            case d: 
            case b: {
                switch ((ctv)((Object)dbk2.b(c))) {
                    case a: {
                        return dbk2.a(c, (Comparable)((Object)ctv.c));
                    }
                    case c: {
                        return dbk2.a(c, (Comparable)((Object)ctv.a));
                    }
                }
                return dbk2;
            }
        }
        return dbk2;
    }

    @Override
    public dbk a(int n2) {
        ctv ctv2 = ctv.b;
        int n3 = n2 & 0xC;
        if (n3 == 4) {
            ctv2 = ctv.a;
        } else if (n3 == 8) {
            ctv2 = ctv.c;
        }
        return this.s().a(c, (Comparable)((Object)ctv2));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        ctv ctv2 = (ctv)((Object)dbk2.b(c));
        if (ctv2 == ctv.a) {
            n2 |= 4;
        } else if (ctv2 == ctv.c) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected bkp a() {
        return new bkp(this, c);
    }

    @Override
    protected bhl a_(dbk dbk2) {
        return new bhl(azg.a(this));
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        return super.a(iu2, cmz2, bqk2, f2, f3, f4, n2, bga2).a(c, (Comparable)((Object)bqk2.l()));
    }
}

