/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.c;

import com.ibm.icu.a.c.a;

class f
implements Comparable {
    private String a = "";
    private String b = "";
    private String c = "";
    private String d = "";
    private volatile int e;

    public f(String string, String string2, String string3, String string4) {
        if (string != null) {
            this.a = string;
        }
        if (string2 != null) {
            this.b = string2;
        }
        if (string3 != null) {
            this.c = string3;
        }
        if (string4 != null) {
            this.d = string4;
        }
    }

    public boolean equals(Object object) {
        return this == object || object instanceof f && com.ibm.icu.a.c.a.a(((f)object).a, this.a) && com.ibm.icu.a.c.a.a(((f)object).b, this.b) && com.ibm.icu.a.c.a.a(((f)object).c, this.c) && com.ibm.icu.a.c.a.a(((f)object).d, this.d);
    }

    public int a(f f2) {
        int n2 = com.ibm.icu.a.c.a.b(this.a, f2.a);
        if (n2 == 0 && (n2 = com.ibm.icu.a.c.a.b(this.b, f2.b)) == 0 && (n2 = com.ibm.icu.a.c.a.b(this.c, f2.c)) == 0) {
            n2 = com.ibm.icu.a.c.a.b(this.d, f2.d);
        }
        return n2;
    }

    public int hashCode() {
        int n2 = this.e;
        if (n2 == 0) {
            int n3;
            for (n3 = 0; n3 < this.a.length(); ++n3) {
                n2 = 31 * n2 + com.ibm.icu.a.c.a.b(this.a.charAt(n3));
            }
            for (n3 = 0; n3 < this.b.length(); ++n3) {
                n2 = 31 * n2 + com.ibm.icu.a.c.a.b(this.b.charAt(n3));
            }
            for (n3 = 0; n3 < this.c.length(); ++n3) {
                n2 = 31 * n2 + com.ibm.icu.a.c.a.b(this.c.charAt(n3));
            }
            for (n3 = 0; n3 < this.d.length(); ++n3) {
                n2 = 31 * n2 + com.ibm.icu.a.c.a.b(this.d.charAt(n3));
            }
            this.e = n2;
        }
        return n2;
    }

    public static f b(f f2) {
        String string = com.ibm.icu.a.c.a.a(f2.a).intern();
        String string2 = com.ibm.icu.a.c.a.c(f2.b).intern();
        String string3 = com.ibm.icu.a.c.a.b(f2.c).intern();
        String string4 = com.ibm.icu.a.c.a.b(f2.d).intern();
        return new f(string, string2, string3, string4);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((f)object);
    }

    static /* synthetic */ String c(f f2) {
        return f2.a;
    }

    static /* synthetic */ String d(f f2) {
        return f2.b;
    }

    static /* synthetic */ String e(f f2) {
        return f2.c;
    }

    static /* synthetic */ String f(f f2) {
        return f2.d;
    }
}

