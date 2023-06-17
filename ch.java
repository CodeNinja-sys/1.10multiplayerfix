/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;
import net.minecraft.c.a;

public class ch
extends to {
    private static final bpx a = new bpx("fossils/fossil_spine_01");
    private static final bpx b = new bpx("fossils/fossil_spine_02");
    private static final bpx c = new bpx("fossils/fossil_spine_03");
    private static final bpx d = new bpx("fossils/fossil_spine_04");
    private static final bpx e = new bpx("fossils/fossil_spine_01_coal");
    private static final bpx f = new bpx("fossils/fossil_spine_02_coal");
    private static final bpx g = new bpx("fossils/fossil_spine_03_coal");
    private static final bpx h = new bpx("fossils/fossil_spine_04_coal");
    private static final bpx i = new bpx("fossils/fossil_skull_01");
    private static final bpx j = new bpx("fossils/fossil_skull_02");
    private static final bpx k = new bpx("fossils/fossil_skull_03");
    private static final bpx l = new bpx("fossils/fossil_skull_04");
    private static final bpx m = new bpx("fossils/fossil_skull_01_coal");
    private static final bpx n = new bpx("fossils/fossil_skull_02_coal");
    private static final bpx o = new bpx("fossils/fossil_skull_03_coal");
    private static final bpx p = new bpx("fossils/fossil_skull_04_coal");
    private static final bpx[] q = new bpx[]{a, b, c, d, i, j, k, l};
    private static final bpx[] r = new bpx[]{e, f, g, h, m, n, o, p};

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        int n2;
        Random random2 = iu2.a(cmz2.a(), cmz2.c()).a(987234911L);
        a a2 = iu2.f();
        ih[] arrih = ih.values();
        ih ih2 = arrih[random2.nextInt(arrih.length)];
        int n3 = random2.nextInt(q.length);
        bzz bzz2 = iu2.D().g();
        ed ed2 = bzz2.a(a2, q[n3]);
        ed ed3 = bzz2.a(a2, r[n3]);
        zz zz2 = new zz(cmz2);
        awx awx2 = new awx(zz2.c(), 0, zz2.d(), zz2.e(), 256, zz2.f());
        cwl cwl2 = new cwl().a(ih2).a(awx2).a(random2);
        cmz cmz3 = ed2.a(ih2);
        int n4 = random2.nextInt(16 - cmz3.a());
        int n5 = random2.nextInt(16 - cmz3.c());
        int n6 = 256;
        for (n2 = 0; n2 < cmz3.a(); ++n2) {
            for (int i2 = 0; i2 < cmz3.a(); ++i2) {
                n6 = Math.min(n6, iu2.b(cmz2.a() + n2 + n4, cmz2.c() + i2 + n5));
            }
        }
        n2 = Math.max(n6 - 15 - random2.nextInt(10), 10);
        cmz cmz4 = ed2.a(cmz2.e(n4, n2, n5), cdk.a, ih2);
        cwl2.a(0.9f);
        ed2.a(iu2, cmz4, cwl2, 4);
        cwl2.a(0.1f);
        ed3.a(iu2, cmz4, cwl2, 4);
        return true;
    }
}

