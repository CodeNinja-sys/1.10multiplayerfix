/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class aaq
implements tv {
    private final iu a;
    private final Random b;
    private final dbk[] c = new dbk[256];
    private final bnv d;
    private final List e = ov.a();
    private final boolean f;
    private final boolean g;
    private qw h;
    private qw i;

    public aaq(iu iu2, long l2, boolean bl2, String string) {
        this.a = iu2;
        this.b = new Random(l2);
        this.d = bnv.a(string);
        if (bl2) {
            Map map = this.d.b();
            if (map.containsKey("village")) {
                Map map2 = (Map)map.get("village");
                if (!map2.containsKey("size")) {
                    map2.put("size", "1");
                }
                this.e.add(new fo(map2));
            }
            if (map.containsKey("biome_1")) {
                this.e.add(new bah((Map)map.get("biome_1")));
            }
            if (map.containsKey("mineshaft")) {
                this.e.add(new cbw((Map)map.get("mineshaft")));
            }
            if (map.containsKey("stronghold")) {
                this.e.add(new bki((Map)map.get("stronghold")));
            }
            if (map.containsKey("oceanmonument")) {
                this.e.add(new cfy((Map)map.get("oceanmonument")));
            }
        }
        if (this.d.b().containsKey("lake")) {
            this.h = new qw(blg.j);
        }
        if (this.d.b().containsKey("lava_lake")) {
            this.i = new qw(blg.l);
        }
        this.g = this.d.b().containsKey("dungeon");
        int n2 = 0;
        int n3 = 0;
        boolean bl3 = true;
        for (pb pb2 : this.d.c()) {
            for (int i2 = pb2.c(); i2 < pb2.c() + pb2.a(); ++i2) {
                dbk dbk2 = pb2.b();
                if (dbk2.t() == blg.a) continue;
                bl3 = false;
                this.c[i2] = dbk2;
            }
            if (pb2.b().t() == blg.a) {
                n3 += pb2.a();
                continue;
            }
            n2 += pb2.a() + n3;
            n3 = 0;
        }
        iu2.b(n2);
        this.f = bl3 && this.d.a() != anr.a(cff.P) ? false : this.d.b().containsKey("decoration");
    }

    @Override
    public bhm a(int n2, int n3) {
        int n4;
        Object object2;
        cnb cnb2 = new cnb();
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            object2 = this.c[i2];
            if (object2 == null) continue;
            for (int i3 = 0; i3 < 16; ++i3) {
                for (n4 = 0; n4 < 16; ++n4) {
                    cnb2.a(i3, i2, n4, (dbk)object2);
                }
            }
        }
        for (Object object2 : this.e) {
            object2.a(this.a, n2, n3, cnb2);
        }
        bhm bhm2 = new bhm(this.a, cnb2, n2, n3);
        object2 = this.a.t_().b(null, n2 * 16, n3 * 16, 16, 16);
        byte[] arrby = bhm2.l();
        for (n4 = 0; n4 < arrby.length; ++n4) {
            arrby[n4] = (byte)anr.a(object2[n4]);
        }
        bhm2.d();
        return bhm2;
    }

    @Override
    public void b(int n2, int n3) {
        int n4 = n2 * 16;
        int n5 = n3 * 16;
        cmz cmz2 = new cmz(n4, 0, n5);
        anr anr2 = this.a.a(new cmz(n4 + 16, 0, n5 + 16));
        boolean bl2 = false;
        this.b.setSeed(this.a.y());
        long l2 = this.b.nextLong() / 2L * 2L + 1L;
        long l3 = this.b.nextLong() / 2L * 2L + 1L;
        this.b.setSeed((long)n2 * l2 + (long)n3 * l3 ^ this.a.y());
        zz zz2 = new zz(n2, n3);
        Object object = this.e.iterator();
        while (object.hasNext()) {
            aet aet2 = (aet)object.next();
            boolean bl3 = aet2.a(this.a, this.b, zz2);
            if (!(aet2 instanceof fo)) continue;
            bl2 |= bl3;
        }
        if (this.h != null && !bl2 && this.b.nextInt(4) == 0) {
            this.h.a(this.a, this.b, cmz2.e(this.b.nextInt(16) + 8, this.b.nextInt(256), this.b.nextInt(16) + 8));
        }
        if (!(this.i == null || bl2 || this.b.nextInt(8) != 0 || ((cjx)(object = cmz2.e(this.b.nextInt(16) + 8, this.b.nextInt(this.b.nextInt(248) + 8), this.b.nextInt(16) + 8))).b() >= this.a.u() && this.b.nextInt(10) != 0)) {
            this.i.a(this.a, this.b, (cmz)object);
        }
        if (this.g) {
            for (int i2 = 0; i2 < 8; ++i2) {
                new ll().a(this.a, this.b, cmz2.e(this.b.nextInt(16) + 8, this.b.nextInt(256), this.b.nextInt(16) + 8));
            }
        }
        if (this.f) {
            anr2.a(this.a, this.b, cmz2);
        }
    }

    @Override
    public boolean a(bhm bhm2, int n2, int n3) {
        return false;
    }

    @Override
    public List a(nx nx2, cmz cmz2) {
        anr anr2 = this.a.a(cmz2);
        return anr2.a(nx2);
    }

    @Override
    public cmz a(iu iu2, String string, cmz cmz2) {
        if ("Stronghold".equals(string)) {
            for (aet aet2 : this.e) {
                if (!(aet2 instanceof bki)) continue;
                return aet2.b(iu2, cmz2);
            }
        }
        return null;
    }

    @Override
    public void b(bhm bhm2, int n2, int n3) {
        for (aet aet2 : this.e) {
            aet2.a(this.a, n2, n3, null);
        }
    }
}

