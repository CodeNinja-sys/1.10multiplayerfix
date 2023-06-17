/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public class bve {
    private static final Map a = sz.c();
    private static final Map b = sz.c();

    public static void a(cnw cnw2) {
        bpx bpx2 = cnw2.a();
        Class class_ = cnw2.b();
        if (a.containsKey(bpx2)) {
            throw new IllegalArgumentException("Can't re-register item function name " + bpx2);
        }
        if (b.containsKey(class_)) {
            throw new IllegalArgumentException("Can't re-register item function class " + class_.getName());
        }
        a.put(bpx2, cnw2);
        b.put(class_, cnw2);
    }

    public static cnw a(bpx bpx2) {
        cnw cnw2 = (cnw)a.get(bpx2);
        if (cnw2 == null) {
            throw new IllegalArgumentException("Unknown loot item function '" + bpx2 + "'");
        }
        return cnw2;
    }

    public static cnw a(azp azp2) {
        cnw cnw2 = (cnw)b.get(azp2.getClass());
        if (cnw2 == null) {
            throw new IllegalArgumentException("Unknown loot item function " + azp2);
        }
        return cnw2;
    }

    static {
        bve.a(new blw());
        bve.a(new bod());
        bve.a(new blv());
        bve.a(new bxo());
        bve.a(new cki());
        bve.a(new bcm());
        bve.a(new mr());
        bve.a(new dr());
        bve.a(new cud());
    }
}

