/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.e;

import com.a.b.z;
import net.minecraft.client.g.bd;
import net.minecraft.u.bc;

public class a {
    private static a a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    private final boolean h;

    private a(boolean bl2, boolean bl3, int n2, int n3, int n4, int n5, int n6) {
        this.g = bl2;
        this.b = n2;
        this.d = n3;
        this.c = n4;
        this.e = n5;
        this.h = bl3;
        this.f = n6;
    }

    public a() {
        this(false, true, 1, 0, 1, 0, 32774);
    }

    public a(int n2, int n3, int n4) {
        this(false, false, n2, n3, n2, n3, n4);
    }

    public a(int n2, int n3, int n4, int n5, int n6) {
        this(true, false, n2, n3, n4, n5, n6);
    }

    public void a() {
        if (!this.equals(a)) {
            if (a == null || this.h != a.b()) {
                a = this;
                if (this.h) {
                    bd.k();
                    return;
                }
                bd.l();
            }
            bd.d(this.f);
            if (this.g) {
                bd.a(this.b, this.d, this.c, this.e);
            } else {
                bd.b(this.b, this.d);
            }
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        return this.f != a2.f ? false : (this.e != a2.e ? false : (this.d != a2.d ? false : (this.h != a2.h ? false : (this.g != a2.g ? false : (this.c != a2.c ? false : this.b == a2.b)))));
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

    public static a a(z z2) {
        if (z2 == null) {
            return new a();
        }
        int n2 = 32774;
        int n3 = 1;
        int n4 = 0;
        int n5 = 1;
        int n6 = 0;
        boolean bl2 = true;
        boolean bl3 = false;
        if (bc.a(z2, "func") && (n2 = net.minecraft.client.e.a.a(z2.c("func").d())) != 32774) {
            bl2 = false;
        }
        if (bc.a(z2, "srcrgb") && (n3 = net.minecraft.client.e.a.b(z2.c("srcrgb").d())) != 1) {
            bl2 = false;
        }
        if (bc.a(z2, "dstrgb") && (n4 = net.minecraft.client.e.a.b(z2.c("dstrgb").d())) != 0) {
            bl2 = false;
        }
        if (bc.a(z2, "srcalpha")) {
            n5 = net.minecraft.client.e.a.b(z2.c("srcalpha").d());
            if (n5 != 1) {
                bl2 = false;
            }
            bl3 = true;
        }
        if (bc.a(z2, "dstalpha")) {
            n6 = net.minecraft.client.e.a.b(z2.c("dstalpha").d());
            if (n6 != 0) {
                bl2 = false;
            }
            bl3 = true;
        }
        return bl2 ? new a() : (bl3 ? new a(n3, n4, n5, n6, n2) : new a(n3, n4, n2));
    }

    private static int a(String string) {
        String string2 = string.trim().toLowerCase();
        return "add".equals(string2) ? 32774 : ("subtract".equals(string2) ? 32778 : ("reversesubtract".equals(string2) ? 32779 : ("reverse_subtract".equals(string2) ? 32779 : ("min".equals(string2) ? 32775 : ("max".equals(string2) ? 32776 : 32774)))));
    }

    private static int b(String string) {
        String string2 = string.trim().toLowerCase();
        string2 = string2.replaceAll("_", "");
        string2 = string2.replaceAll("one", "1");
        string2 = string2.replaceAll("zero", "0");
        return "0".equals(string2 = string2.replaceAll("minus", "-")) ? 0 : ("1".equals(string2) ? 1 : ("srccolor".equals(string2) ? 768 : ("1-srccolor".equals(string2) ? 769 : ("dstcolor".equals(string2) ? 774 : ("1-dstcolor".equals(string2) ? 775 : ("srcalpha".equals(string2) ? 770 : ("1-srcalpha".equals(string2) ? 771 : ("dstalpha".equals(string2) ? 772 : ("1-dstalpha".equals(string2) ? 773 : -1)))))))));
    }
}

