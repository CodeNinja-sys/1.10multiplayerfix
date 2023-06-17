/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.z;

public class aar {
    private static aar a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    private final boolean h;

    private aar(boolean bl2, boolean bl3, int n2, int n3, int n4, int n5, int n6) {
        this.g = bl2;
        this.b = n2;
        this.d = n3;
        this.c = n4;
        this.e = n5;
        this.h = bl3;
        this.f = n6;
    }

    public aar() {
        this(false, true, 1, 0, 1, 0, 32774);
    }

    public aar(int n2, int n3, int n4) {
        this(false, false, n2, n3, n2, n3, n4);
    }

    public aar(int n2, int n3, int n4, int n5, int n6) {
        this(true, false, n2, n3, n4, n5, n6);
    }

    public void a() {
        if (this.equals(a)) {
            return;
        }
        if (a == null || this.h != a.b()) {
            a = this;
            if (this.h) {
                cja.k();
                return;
            }
            cja.l();
        }
        cja.d(this.f);
        if (this.g) {
            cja.a(this.b, this.d, this.c, this.e);
        } else {
            cja.b(this.b, this.d);
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof aar)) {
            return false;
        }
        aar aar2 = (aar)object;
        if (this.f != aar2.f) {
            return false;
        }
        if (this.e != aar2.e) {
            return false;
        }
        if (this.d != aar2.d) {
            return false;
        }
        if (this.h != aar2.h) {
            return false;
        }
        if (this.g != aar2.g) {
            return false;
        }
        if (this.c != aar2.c) {
            return false;
        }
        return this.b == aar2.b;
    }

    public int hashCode() {
        int n2 = this.b;
        n2 = 31 * n2 + this.c;
        n2 = 31 * n2 + this.d;
        n2 = 31 * n2 + this.e;
        n2 = 31 * n2 + this.f;
        n2 = 31 * n2 + (this.g ? 1 : 0);
        n2 = 31 * n2 + (this.h ? 1 : 0);
        return n2;
    }

    public boolean b() {
        return this.h;
    }

    public static aar a(z z2) {
        if (z2 == null) {
            return new aar();
        }
        int n2 = 32774;
        int n3 = 1;
        int n4 = 0;
        int n5 = 1;
        int n6 = 0;
        boolean bl2 = true;
        boolean bl3 = false;
        if (cwe.a(z2, "func") && (n2 = aar.a(z2.c("func").d())) != 32774) {
            bl2 = false;
        }
        if (cwe.a(z2, "srcrgb") && (n3 = aar.b(z2.c("srcrgb").d())) != 1) {
            bl2 = false;
        }
        if (cwe.a(z2, "dstrgb") && (n4 = aar.b(z2.c("dstrgb").d())) != 0) {
            bl2 = false;
        }
        if (cwe.a(z2, "srcalpha")) {
            n5 = aar.b(z2.c("srcalpha").d());
            if (n5 != 1) {
                bl2 = false;
            }
            bl3 = true;
        }
        if (cwe.a(z2, "dstalpha")) {
            n6 = aar.b(z2.c("dstalpha").d());
            if (n6 != 0) {
                bl2 = false;
            }
            bl3 = true;
        }
        if (bl2) {
            return new aar();
        }
        if (bl3) {
            return new aar(n3, n4, n5, n6, n2);
        }
        return new aar(n3, n4, n2);
    }

    private static int a(String string) {
        String string2 = string.trim().toLowerCase();
        if ("add".equals(string2)) {
            return 32774;
        }
        if ("subtract".equals(string2)) {
            return 32778;
        }
        if ("reversesubtract".equals(string2)) {
            return 32779;
        }
        if ("reverse_subtract".equals(string2)) {
            return 32779;
        }
        if ("min".equals(string2)) {
            return 32775;
        }
        if ("max".equals(string2)) {
            return 32776;
        }
        return 32774;
    }

    private static int b(String string) {
        String string2 = string.trim().toLowerCase();
        string2 = string2.replaceAll("_", "");
        string2 = string2.replaceAll("one", "1");
        string2 = string2.replaceAll("zero", "0");
        if ("0".equals(string2 = string2.replaceAll("minus", "-"))) {
            return 0;
        }
        if ("1".equals(string2)) {
            return 1;
        }
        if ("srccolor".equals(string2)) {
            return 768;
        }
        if ("1-srccolor".equals(string2)) {
            return 769;
        }
        if ("dstcolor".equals(string2)) {
            return 774;
        }
        if ("1-dstcolor".equals(string2)) {
            return 775;
        }
        if ("srcalpha".equals(string2)) {
            return 770;
        }
        if ("1-srcalpha".equals(string2)) {
            return 771;
        }
        if ("dstalpha".equals(string2)) {
            return 772;
        }
        if ("1-dstalpha".equals(string2)) {
            return 773;
        }
        return -1;
    }
}

