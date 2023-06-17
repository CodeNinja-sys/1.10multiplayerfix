/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;
import java.util.Random;

public class bsf {
    private static final Map a = sz.c();
    private static final Map b = sz.c();

    public static void a(cjm cjm2) {
        bpx bpx2 = cjm2.a();
        Class class_ = cjm2.b();
        if (a.containsKey(bpx2)) {
            throw new IllegalArgumentException("Can't re-register item condition name " + bpx2);
        }
        if (b.containsKey(class_)) {
            throw new IllegalArgumentException("Can't re-register item condition class " + class_.getName());
        }
        a.put(bpx2, cjm2);
        b.put(class_, cjm2);
    }

    public static boolean a(cfv[] arrcfv, Random random, abe abe2) {
        if (arrcfv == null) {
            return true;
        }
        for (cfv cfv2 : arrcfv) {
            if (cfv2.a(random, abe2)) continue;
            return false;
        }
        return true;
    }

    public static cjm a(bpx bpx2) {
        cjm cjm2 = (cjm)a.get(bpx2);
        if (cjm2 == null) {
            throw new IllegalArgumentException("Unknown loot item condition '" + bpx2 + "'");
        }
        return cjm2;
    }

    public static cjm a(cfv cfv2) {
        cjm cjm2 = (cjm)b.get(cfv2.getClass());
        if (cjm2 == null) {
            throw new IllegalArgumentException("Unknown loot item condition " + cfv2);
        }
        return cjm2;
    }

    static {
        bsf.a(new au());
        bsf.a(new ckz());
        bsf.a(new cnp());
        bsf.a(new cjc());
        bsf.a(new agy());
    }
}

