/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class ff
extends bue {
    public static final byc a = byc.a("variant", zg.class, new daw());

    public ff() {
        this.D(this.O.b().a(a, (Comparable)((Object)zg.a)).a(b, (Comparable)((Object)fy.b)));
    }

    @Override
    public bif a(dbk dbk2) {
        zg zg2 = (zg)((Object)dbk2.b(a));
        switch ((fy)((Object)dbk2.b(b))) {
            default: {
                switch (zg2) {
                    default: {
                        return zg.b.c();
                    }
                    case b: {
                        return zg.f.c();
                    }
                    case c: {
                        return bif.p;
                    }
                    case d: 
                }
                return zg.b.c();
            }
            case b: 
        }
        return zg2.c();
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        list.add(new bhl(azg2, 1, zg.a.b()));
        list.add(new bhl(azg2, 1, zg.b.b()));
        list.add(new bhl(azg2, 1, zg.c.b()));
        list.add(new bhl(azg2, 1, zg.d.b()));
    }

    @Override
    public dbk a(int n2) {
        dbk dbk2 = this.s().a(a, (Comparable)((Object)zg.a((n2 & 3) % 4)));
        switch (n2 & 0xC) {
            case 0: {
                dbk2 = dbk2.a(b, (Comparable)((Object)fy.b));
                break;
            }
            case 4: {
                dbk2 = dbk2.a(b, (Comparable)((Object)fy.a));
                break;
            }
            case 8: {
                dbk2 = dbk2.a(b, (Comparable)((Object)fy.c));
                break;
            }
            default: {
                dbk2 = dbk2.a(b, (Comparable)((Object)fy.d));
            }
        }
        return dbk2;
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((zg)((Object)dbk2.b(a))).b();
        switch ((fy)((Object)dbk2.b(b))) {
            case a: {
                n2 |= 4;
                break;
            }
            case c: {
                n2 |= 8;
                break;
            }
            case d: {
                n2 |= 0xC;
            }
        }
        return n2;
    }

    @Override
    protected bkp a() {
        return new bkp(this, a, b);
    }

    @Override
    protected bhl a_(dbk dbk2) {
        return new bhl(azg.a(this), 1, ((zg)((Object)dbk2.b(a))).b());
    }

    @Override
    public int d(dbk dbk2) {
        return ((zg)((Object)dbk2.b(a))).b();
    }
}

