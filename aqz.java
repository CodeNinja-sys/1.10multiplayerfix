/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class aqz
implements cyw,
dab {
    private static final d a = org.apache.logging.log4j.c.c();
    private final Map b = new ConcurrentHashMap();
    private final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    private final File d;
    private final cgy e;
    private boolean f;

    public aqz(File file, cgy cgy2) {
        this.d = file;
        this.e = cgy2;
    }

    @Override
    public bhm a(iu iu2, int n2, int n3) {
        zz zz2 = new zz(n2, n3);
        bvp bvp2 = (bvp)this.b.get(zz2);
        if (bvp2 == null) {
            DataInputStream dataInputStream = ov.b(this.d, n2, n3);
            if (dataInputStream != null) {
                bvp2 = this.e.a((bsl)bst.c, cyb.a(dataInputStream));
            } else {
                return null;
            }
        }
        return this.a(iu2, n2, n3, bvp2);
    }

    protected bhm a(iu iu2, int n2, int n3, bvp bvp2) {
        if (!bvp2.b("Level", 10)) {
            a.b("Chunk file at {},{} is missing level data, skipping", n2, n3);
            return null;
        }
        bvp bvp3 = bvp2.o("Level");
        if (!bvp3.b("Sections", 9)) {
            a.b("Chunk file at {},{} is missing block data, skipping", n2, n3);
            return null;
        }
        bhm bhm2 = this.a(iu2, bvp3);
        if (!bhm2.a(n2, n3)) {
            a.b("Chunk file at {},{} is in the wrong location; relocating. (Expected {}, {}, got {}, {})", n2, n3, n2, n3, bhm2.b, bhm2.c);
            bvp3.a("xPos", n2);
            bvp3.a("zPos", n3);
            bhm2 = this.a(iu2, bvp3);
        }
        return bhm2;
    }

    @Override
    public void a(iu iu2, bhm bhm2) {
        iu2.x();
        try {
            bvp bvp2 = new bvp();
            bvp bvp3 = new bvp();
            bvp2.a("Level", bvp3);
            bvp2.a("DataVersion", 510);
            this.a(bhm2, iu2, bvp3);
            this.a(bhm2.k(), bvp2);
        }
        catch (Exception exception) {
            a.b("Failed to save chunk", (Throwable)exception);
        }
    }

    protected void a(zz zz2, bvp bvp2) {
        if (!this.c.contains(zz2)) {
            this.b.put(zz2, bvp2);
        }
        agw.a().a(this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a() {
        if (this.b.isEmpty()) {
            if (this.f) {
                a.d("ThreadedAnvilChunkStorage ({}): All chunks are saved", this.d.getName());
            }
            return false;
        }
        zz zz2 = (zz)this.b.keySet().iterator().next();
        try {
            this.c.add(zz2);
            bvp bvp2 = (bvp)this.b.remove(zz2);
            if (bvp2 != null) {
                try {
                    this.b(zz2, bvp2);
                }
                catch (Exception exception) {
                    a.b("Failed to save chunk", (Throwable)exception);
                }
            }
            boolean bl2 = true;
            return bl2;
        }
        finally {
            this.c.remove(zz2);
        }
    }

    private void b(zz zz2, bvp bvp2) {
        DataOutputStream dataOutputStream = ov.c(this.d, zz2.a, zz2.b);
        cyb.a(bvp2, (DataOutput)dataOutputStream);
        dataOutputStream.close();
    }

    @Override
    public void b(iu iu2, bhm bhm2) {
    }

    @Override
    public void b() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void c() {
        try {
            this.f = true;
            while (this.a()) {
            }
        }
        finally {
            this.f = false;
        }
    }

    public static void a(cgy cgy2) {
        cgy2.a(bst.c, (cui)new bqc());
    }

    private void a(bhm bhm2, iu iu2, bvp bvp2) {
        Object object;
        Object object2;
        Object object3;
        bvp bvp3;
        bvp2.a("xPos", bhm2.b);
        bvp2.a("zPos", bhm2.c);
        bvp2.a("LastUpdate", iu2.z());
        bvp2.a("HeightMap", bhm2.r());
        bvp2.a("TerrainPopulated", bhm2.u());
        bvp2.a("LightPopulated", bhm2.v());
        bvp2.a("InhabitedTime", bhm2.x());
        aei[] arraei = bhm2.b();
        bmh bmh2 = new bmh();
        boolean bl2 = !iu2.q.n();
        for (aei object4 : arraei) {
            if (object4 == bhm.a) continue;
            bvp3 = new bvp();
            bvp3.a("Y", (byte)(object4.c() >> 4 & 0xFF));
            object3 = new byte[4096];
            object2 = new ama();
            object = object4.e().a((byte[])object3, (ama)object2);
            bvp3.a("Blocks", (byte[])object3);
            bvp3.a("Data", ((ama)object2).a());
            if (object != null) {
                bvp3.a("Add", ((ama)object).a());
            }
            bvp3.a("BlockLight", object4.f().a());
            if (bl2) {
                bvp3.a("SkyLight", object4.g().a());
            } else {
                bvp3.a("SkyLight", new byte[object4.f().a().length]);
            }
            bmh2.a(bvp3);
        }
        bvp2.a("Sections", bmh2);
        bvp2.a("Biomes", bhm2.l());
        bhm2.g(false);
        bmh bmh3 = new bmh();
        for (int i2 = 0; i2 < bhm2.t().length; ++i2) {
            for (cpk cpk2 : bhm2.t()[i2]) {
                if (!cpk2.c(bvp3 = new bvp())) continue;
                bhm2.g(true);
                bmh3.a(bvp3);
            }
        }
        bvp2.a("Entities", bmh3);
        bmh bmh4 = new bmh();
        for (bql bql2 : bhm2.s().values()) {
            bvp3 = bql2.b(new bvp());
            bmh4.a(bvp3);
        }
        bvp2.a("TileEntities", bmh4);
        List list = iu2.a(bhm2, false);
        if (list != null) {
            long l2 = iu2.z();
            object3 = new bmh();
            object2 = list.iterator();
            while (object2.hasNext()) {
                object = (api)object2.next();
                bvp bvp4 = new bvp();
                bpx bpx2 = (bpx)bfa.v.b(((api)object).a());
                bvp4.a("i", bpx2 == null ? "" : bpx2.toString());
                bvp4.a("x", ((api)object).a.a());
                bvp4.a("y", ((api)object).a.b());
                bvp4.a("z", ((api)object).a.c());
                bvp4.a("t", (int)(((api)object).b - l2));
                bvp4.a("p", ((api)object).c);
                ((bmh)object3).a(bvp4);
            }
            bvp2.a("TileTicks", (azt)object3);
        }
    }

    private bhm a(iu iu2, bvp bvp2) {
        bmh bmh2;
        bmh bmh3;
        bmh bmh4;
        Object object;
        Object object2;
        Object object3;
        int n2 = bvp2.h("xPos");
        int n3 = bvp2.h("zPos");
        bhm bhm2 = new bhm(iu2, n2, n3);
        bhm2.a(bvp2.n("HeightMap"));
        bhm2.d(bvp2.p("TerrainPopulated"));
        bhm2.e(bvp2.p("LightPopulated"));
        bhm2.c(bvp2.i("InhabitedTime"));
        bmh bmh5 = bvp2.c("Sections", 10);
        int n4 = 16;
        aei[] arraei = new aei[16];
        boolean bl2 = !iu2.q.n();
        for (int i2 = 0; i2 < bmh5.b(); ++i2) {
            bvp bvp3 = bmh5.b(i2);
            byte by2 = bvp3.f("Y");
            object3 = new aei(by2 << 4, bl2);
            object2 = bvp3.m("Blocks");
            object = new ama(bvp3.m("Data"));
            ama ama2 = bvp3.b("Add", 7) ? new ama(bvp3.m("Add")) : null;
            ((aei)object3).e().a((byte[])object2, (ama)object, ama2);
            ((aei)object3).a(new ama(bvp3.m("BlockLight")));
            if (bl2) {
                ((aei)object3).b(new ama(bvp3.m("SkyLight")));
            }
            ((aei)object3).d();
            arraei[by2] = object3;
        }
        bhm2.a(arraei);
        if (bvp2.b("Biomes", 7)) {
            bhm2.a(bvp2.m("Biomes"));
        }
        if ((bmh4 = bvp2.c("Entities", 10)) != null) {
            for (int i3 = 0; i3 < bmh4.b(); ++i3) {
                bvp bvp4 = bmh4.b(i3);
                aqz.a(bvp4, iu2, bhm2);
                bhm2.g(true);
            }
        }
        if ((bmh3 = bvp2.c("TileEntities", 10)) != null) {
            for (int i4 = 0; i4 < bmh3.b(); ++i4) {
                object3 = bmh3.b(i4);
                object2 = bql.a(iu2, (bvp)object3);
                if (object2 == null) continue;
                bhm2.a((bql)object2);
            }
        }
        if (bvp2.b("TileTicks", 9) && (bmh2 = bvp2.c("TileTicks", 10)) != null) {
            for (int i5 = 0; i5 < bmh2.b(); ++i5) {
                object2 = bmh2.b(i5);
                object = ((bvp)object2).b("i", 8) ? bfa.a(((bvp)object2).l("i")) : bfa.f(((bvp)object2).h("i"));
                iu2.b(new cmz(((bvp)object2).h("x"), ((bvp)object2).h("y"), ((bvp)object2).h("z")), (bfa)object, ((bvp)object2).h("t"), ((bvp)object2).h("p"));
            }
        }
        return bhm2;
    }

    public static cpk a(bvp bvp2, iu iu2, bhm bhm2) {
        cpk cpk2 = aqz.a(bvp2, iu2);
        if (cpk2 == null) {
            return null;
        }
        bhm2.a(cpk2);
        if (bvp2.b("Passengers", 9)) {
            bmh bmh2 = bvp2.c("Passengers", 10);
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                cpk cpk3 = aqz.a(bmh2.b(i2), iu2, bhm2);
                if (cpk3 == null) continue;
                cpk3.a(cpk2, true);
            }
        }
        return cpk2;
    }

    public static cpk a(bvp bvp2, iu iu2, double d2, double d3, double d4, boolean bl2) {
        cpk cpk2 = aqz.a(bvp2, iu2);
        if (cpk2 == null) {
            return null;
        }
        cpk2.a_(d2, d3, d4, cpk2.ba, cpk2.bb);
        if (bl2 && !iu2.b(cpk2)) {
            return null;
        }
        if (bvp2.b("Passengers", 9)) {
            bmh bmh2 = bvp2.c("Passengers", 10);
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                cpk cpk3 = aqz.a(bmh2.b(i2), iu2, d2, d3, d4, bl2);
                if (cpk3 == null) continue;
                cpk3.a(cpk2, true);
            }
        }
        return cpk2;
    }

    protected static cpk a(bvp bvp2, iu iu2) {
        try {
            return vb.a(bvp2, iu2);
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
    }

    public static void a(cpk cpk2, iu iu2) {
        if (iu2.b(cpk2) && cpk2.cq()) {
            for (cpk cpk3 : cpk2.cH()) {
                aqz.a(cpk3, iu2);
            }
        }
    }

    public static cpk a(bvp bvp2, iu iu2, boolean bl2) {
        cpk cpk2 = aqz.a(bvp2, iu2);
        if (cpk2 == null) {
            return null;
        }
        if (bl2 && !iu2.b(cpk2)) {
            return null;
        }
        if (bvp2.b("Passengers", 9)) {
            bmh bmh2 = bvp2.c("Passengers", 10);
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                cpk cpk3 = aqz.a(bmh2.b(i2), iu2, bl2);
                if (cpk3 == null) continue;
                cpk3.a(cpk2, true);
            }
        }
        return cpk2;
    }
}

