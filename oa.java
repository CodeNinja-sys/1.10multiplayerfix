/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public class oa {
    private static final Map a = sz.c();
    private static final Map b = sz.c();

    public static void a(buz buz2) {
        bpx bpx2 = buz2.a();
        Class class_ = buz2.b();
        if (a.containsKey(bpx2)) {
            throw new IllegalArgumentException("Can't re-register entity property name " + bpx2);
        }
        if (b.containsKey(class_)) {
            throw new IllegalArgumentException("Can't re-register entity property class " + class_.getName());
        }
        a.put(bpx2, buz2);
        b.put(class_, buz2);
    }

    public static buz a(bpx bpx2) {
        buz buz2 = (buz)a.get(bpx2);
        if (buz2 == null) {
            throw new IllegalArgumentException("Unknown loot entity property '" + bpx2 + "'");
        }
        return buz2;
    }

    public static buz a(he he2) {
        buz buz2 = (buz)b.get(he2.getClass());
        if (buz2 == null) {
            throw new IllegalArgumentException("Unknown loot entity property " + he2);
        }
        return buz2;
    }

    static {
        oa.a(new dbv());
    }
}

