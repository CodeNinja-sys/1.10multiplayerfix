/*
 * Decompiled with CFR 0.150.
 */
import java.util.EnumSet;
import java.util.Set;

public enum bgf {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4);

    private final int f;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bgf() {
        void var3_1;
        this.f = var3_1;
    }

    private int a() {
        return 1 << this.f;
    }

    private boolean b(int n2) {
        return (n2 & this.a()) == this.a();
    }

    public static Set a(int n2) {
        EnumSet<bgf> enumSet = EnumSet.noneOf(bgf.class);
        for (bgf bgf2 : bgf.values()) {
            if (!bgf2.b(n2)) continue;
            enumSet.add(bgf2);
        }
        return enumSet;
    }

    public static int a(Set set) {
        int n2 = 0;
        for (bgf bgf2 : set) {
            n2 |= bgf2.a();
        }
        return n2;
    }
}

