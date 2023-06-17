/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class bze {
    public static final bzz a = new bzz("structures");
    private static final cwl b = new cwl().a(true);
    private static final cwl c = new cwl().a(true).a(blg.a);
    private static final brj d = new cai();
    private static final List e = ov.a(new cam((Object)ih.a, new cmz(1, -1, 0)), new cam((Object)ih.b, new cmz(6, -1, 1)), new cam((Object)ih.d, new cmz(0, -1, 5)), new cam((Object)ih.c, new cmz(5, -1, 6)));
    private static final brj f = new cxl();
    private static final brj g = new adq();
    private static final List h = ov.a(new cam((Object)ih.a, new cmz(4, -1, 0)), new cam((Object)ih.b, new cmz(12, -1, 4)), new cam((Object)ih.d, new cmz(0, -1, 8)), new cam((Object)ih.c, new cmz(8, -1, 12)));
    private static final brj i = new csi();

    public static void a() {
        mb.a(cbu.class, "ECP");
    }

    private static cbu b(cbu cbu2, cmz cmz2, String string, ih ih2, boolean bl2) {
        cbu cbu3 = new cbu(string, cbu2.c, ih2, bl2);
        cmz cmz3 = cbu2.a.a(cbu2.b, cmz2, cbu3.b, cmz.e);
        cbu3.a_(cmz3.a(), cmz3.b(), cmz3.c());
        return cbu3;
    }

    public static void a(cmz cmz2, ih ih2, List list, Random random) {
        i.a();
        d.a();
        g.a();
        f.a();
        cbu cbu2 = bze.b(list, new cbu("base_floor", cmz2, ih2, true));
        cbu2 = bze.b(list, bze.b(cbu2, new cmz(-1, 0, -1), "second_floor", ih2, false));
        cbu2 = bze.b(list, bze.b(cbu2, new cmz(-1, 4, -1), "third_floor", ih2, false));
        cbu2 = bze.b(list, bze.b(cbu2, new cmz(-1, 8, -1), "third_roof", ih2, true));
        bze.b(f, 1, cbu2, null, list, random);
    }

    private static cbu b(List list, cbu cbu2) {
        list.add(cbu2);
        return cbu2;
    }

    private static boolean b(brj brj2, int n2, cbu cbu2, cmz cmz2, List list, Random random) {
        if (n2 > 8) {
            return false;
        }
        ArrayList arrayList = ov.a();
        if (brj2.a(n2, cbu2, cmz2, arrayList, random)) {
            boolean bl2 = false;
            int n3 = random.nextInt();
            for (pc pc2 : arrayList) {
                pc2.m = n3;
                pc pc3 = pc.a(list, pc2.b());
                if (pc3 == null || pc3.m == cbu2.m) continue;
                bl2 = true;
                break;
            }
            if (!bl2) {
                list.addAll(arrayList);
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ cwl b() {
        return b;
    }

    static /* synthetic */ cwl c() {
        return c;
    }

    static /* synthetic */ cbu a(cbu cbu2, cmz cmz2, String string, ih ih2, boolean bl2) {
        return bze.b(cbu2, cmz2, string, ih2, bl2);
    }

    static /* synthetic */ cbu a(List list, cbu cbu2) {
        return bze.b(list, cbu2);
    }

    static /* synthetic */ brj d() {
        return f;
    }

    static /* synthetic */ boolean a(brj brj2, int n2, cbu cbu2, cmz cmz2, List list, Random random) {
        return bze.b(brj2, n2, cbu2, cmz2, list, random);
    }

    static /* synthetic */ List e() {
        return e;
    }

    static /* synthetic */ brj f() {
        return g;
    }

    static /* synthetic */ brj g() {
        return i;
    }

    static /* synthetic */ brj h() {
        return d;
    }

    static /* synthetic */ List i() {
        return h;
    }
}

