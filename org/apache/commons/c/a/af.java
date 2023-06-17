/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import org.apache.commons.c.a.ag;
import org.apache.commons.c.a.ah;
import org.apache.commons.c.a.ai;
import org.apache.commons.c.a.aj;
import org.apache.commons.c.a.ak;
import org.apache.commons.c.aa;
import org.apache.commons.c.o;

public abstract class af
implements Serializable {
    private static final long f = -2587890625525655916L;
    public static final af a = new ag();
    public static final af b = new ah();
    public static final af c = new ai();
    public static final af d = new aj();
    public static final af e = new ak();
    private static final ThreadLocal g = new ThreadLocal();
    private boolean h = true;
    private boolean i = true;
    private boolean j = false;
    private boolean k = true;
    private String l = "[";
    private String m = "]";
    private String n = "=";
    private boolean o = false;
    private boolean p = false;
    private String q = ",";
    private String r = "{";
    private String s = ",";
    private boolean t = true;
    private String u = "}";
    private boolean v = true;
    private String w = "<null>";
    private String x = "<size=";
    private String y = ">";
    private String z = "<";
    private String A = ">";

    static Map u() {
        return (Map)g.get();
    }

    static boolean a(Object object) {
        Map map = af.u();
        return map != null && map.containsKey(object);
    }

    static void b(Object object) {
        if (object != null) {
            Map map = af.u();
            if (map == null) {
                g.set(new WeakHashMap());
            }
            af.u().put(object, null);
        }
    }

    static void c(Object object) {
        Map map;
        if (object != null && (map = af.u()) != null) {
            map.remove(object);
            if (map.isEmpty()) {
                g.remove();
            }
        }
    }

    protected af() {
    }

    public void a(StringBuffer stringBuffer, String string) {
        this.b(stringBuffer, string);
    }

    public void b(StringBuffer stringBuffer, String string) {
        int n2;
        int n3;
        if (string != null && (n3 = string.indexOf(this.l) + this.l.length()) != (n2 = string.lastIndexOf(this.m)) && n3 >= 0 && n2 >= 0) {
            String string2 = string.substring(n3, n2);
            if (this.o) {
                this.a(stringBuffer);
            }
            stringBuffer.append(string2);
            this.d(stringBuffer);
        }
    }

    public void a(StringBuffer stringBuffer, Object object) {
        if (object != null) {
            this.c(stringBuffer, object);
            this.d(stringBuffer, object);
            this.b(stringBuffer);
            if (this.o) {
                this.d(stringBuffer);
            }
        }
    }

    public void b(StringBuffer stringBuffer, Object object) {
        if (!this.p) {
            this.a(stringBuffer);
        }
        this.c(stringBuffer);
        af.c(object);
    }

    protected void a(StringBuffer stringBuffer) {
        int n2 = stringBuffer.length();
        int n3 = this.q.length();
        if (n2 > 0 && n3 > 0 && n2 >= n3) {
            boolean bl2 = true;
            for (int i2 = 0; i2 < n3; ++i2) {
                if (stringBuffer.charAt(n2 - 1 - i2) == this.q.charAt(n3 - 1 - i2)) continue;
                bl2 = false;
                break;
            }
            if (bl2) {
                stringBuffer.setLength(n2 - n3);
            }
        }
    }

    public void a(StringBuffer stringBuffer, String string, Object object, Boolean bl2) {
        this.d(stringBuffer, string);
        if (object == null) {
            this.c(stringBuffer, string);
        } else {
            this.a(stringBuffer, string, object, this.a(bl2));
        }
        this.e(stringBuffer, string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(StringBuffer stringBuffer, String string, Object object, boolean bl2) {
        if (af.a(object) && !(object instanceof Number) && !(object instanceof Boolean) && !(object instanceof Character)) {
            this.b(stringBuffer, string, object);
            return;
        }
        af.b(object);
        try {
            if (object instanceof Collection) {
                if (bl2) {
                    this.a(stringBuffer, string, (Collection)object);
                } else {
                    this.c(stringBuffer, string, ((Collection)object).size());
                }
            } else if (object instanceof Map) {
                if (bl2) {
                    this.a(stringBuffer, string, (Map)object);
                } else {
                    this.c(stringBuffer, string, ((Map)object).size());
                }
            } else if (object instanceof long[]) {
                if (bl2) {
                    this.a(stringBuffer, string, (long[])object);
                } else {
                    this.b(stringBuffer, string, (long[])object);
                }
            } else if (object instanceof int[]) {
                if (bl2) {
                    this.a(stringBuffer, string, (int[])object);
                } else {
                    this.b(stringBuffer, string, (int[])object);
                }
            } else if (object instanceof short[]) {
                if (bl2) {
                    this.a(stringBuffer, string, (short[])object);
                } else {
                    this.b(stringBuffer, string, (short[])object);
                }
            } else if (object instanceof byte[]) {
                if (bl2) {
                    this.a(stringBuffer, string, (byte[])object);
                } else {
                    this.b(stringBuffer, string, (byte[])object);
                }
            } else if (object instanceof char[]) {
                if (bl2) {
                    this.a(stringBuffer, string, (char[])object);
                } else {
                    this.b(stringBuffer, string, (char[])object);
                }
            } else if (object instanceof double[]) {
                if (bl2) {
                    this.a(stringBuffer, string, (double[])object);
                } else {
                    this.b(stringBuffer, string, (double[])object);
                }
            } else if (object instanceof float[]) {
                if (bl2) {
                    this.a(stringBuffer, string, (float[])object);
                } else {
                    this.b(stringBuffer, string, (float[])object);
                }
            } else if (object instanceof boolean[]) {
                if (bl2) {
                    this.a(stringBuffer, string, (boolean[])object);
                } else {
                    this.b(stringBuffer, string, (boolean[])object);
                }
            } else if (object.getClass().isArray()) {
                if (bl2) {
                    this.a(stringBuffer, string, (Object[])object);
                } else {
                    this.b(stringBuffer, string, (Object[])object);
                }
            } else if (bl2) {
                this.a(stringBuffer, string, object);
            } else {
                this.c(stringBuffer, string, object);
            }
        }
        finally {
            af.c(object);
        }
    }

    protected void b(StringBuffer stringBuffer, String string, Object object) {
        aa.a(stringBuffer, object);
    }

    protected void a(StringBuffer stringBuffer, String string, Object object) {
        stringBuffer.append(object);
    }

    protected void a(StringBuffer stringBuffer, String string, Collection collection) {
        stringBuffer.append(collection);
    }

    protected void a(StringBuffer stringBuffer, String string, Map map) {
        stringBuffer.append(map);
    }

    protected void c(StringBuffer stringBuffer, String string, Object object) {
        stringBuffer.append(this.z);
        stringBuffer.append(this.a(object.getClass()));
        stringBuffer.append(this.A);
    }

    public void a(StringBuffer stringBuffer, String string, long l2) {
        this.d(stringBuffer, string);
        this.b(stringBuffer, string, l2);
        this.e(stringBuffer, string);
    }

    protected void b(StringBuffer stringBuffer, String string, long l2) {
        stringBuffer.append(l2);
    }

    public void a(StringBuffer stringBuffer, String string, int n2) {
        this.d(stringBuffer, string);
        this.b(stringBuffer, string, n2);
        this.e(stringBuffer, string);
    }

    protected void b(StringBuffer stringBuffer, String string, int n2) {
        stringBuffer.append(n2);
    }

    public void a(StringBuffer stringBuffer, String string, short s2) {
        this.d(stringBuffer, string);
        this.b(stringBuffer, string, s2);
        this.e(stringBuffer, string);
    }

    protected void b(StringBuffer stringBuffer, String string, short s2) {
        stringBuffer.append(s2);
    }

    public void a(StringBuffer stringBuffer, String string, byte by2) {
        this.d(stringBuffer, string);
        this.b(stringBuffer, string, by2);
        this.e(stringBuffer, string);
    }

    protected void b(StringBuffer stringBuffer, String string, byte by2) {
        stringBuffer.append(by2);
    }

    public void a(StringBuffer stringBuffer, String string, char c2) {
        this.d(stringBuffer, string);
        this.b(stringBuffer, string, c2);
        this.e(stringBuffer, string);
    }

    protected void b(StringBuffer stringBuffer, String string, char c2) {
        stringBuffer.append(c2);
    }

    public void a(StringBuffer stringBuffer, String string, double d2) {
        this.d(stringBuffer, string);
        this.b(stringBuffer, string, d2);
        this.e(stringBuffer, string);
    }

    protected void b(StringBuffer stringBuffer, String string, double d2) {
        stringBuffer.append(d2);
    }

    public void a(StringBuffer stringBuffer, String string, float f2) {
        this.d(stringBuffer, string);
        this.b(stringBuffer, string, f2);
        this.e(stringBuffer, string);
    }

    protected void b(StringBuffer stringBuffer, String string, float f2) {
        stringBuffer.append(f2);
    }

    public void a(StringBuffer stringBuffer, String string, boolean bl2) {
        this.d(stringBuffer, string);
        this.b(stringBuffer, string, bl2);
        this.e(stringBuffer, string);
    }

    protected void b(StringBuffer stringBuffer, String string, boolean bl2) {
        stringBuffer.append(bl2);
    }

    public void a(StringBuffer stringBuffer, String string, Object[] arrobject, Boolean bl2) {
        this.d(stringBuffer, string);
        if (arrobject == null) {
            this.c(stringBuffer, string);
        } else if (this.a(bl2)) {
            this.a(stringBuffer, string, arrobject);
        } else {
            this.b(stringBuffer, string, arrobject);
        }
        this.e(stringBuffer, string);
    }

    protected void a(StringBuffer stringBuffer, String string, Object[] arrobject) {
        stringBuffer.append(this.r);
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            Object object = arrobject[i2];
            if (i2 > 0) {
                stringBuffer.append(this.s);
            }
            if (object == null) {
                this.c(stringBuffer, string);
                continue;
            }
            this.a(stringBuffer, string, object, this.t);
        }
        stringBuffer.append(this.u);
    }

    protected void d(StringBuffer stringBuffer, String string, Object object) {
        stringBuffer.append(this.r);
        int n2 = Array.getLength(object);
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object2 = Array.get(object, i2);
            if (i2 > 0) {
                stringBuffer.append(this.s);
            }
            if (object2 == null) {
                this.c(stringBuffer, string);
                continue;
            }
            this.a(stringBuffer, string, object2, this.t);
        }
        stringBuffer.append(this.u);
    }

    protected void b(StringBuffer stringBuffer, String string, Object[] arrobject) {
        this.c(stringBuffer, string, arrobject.length);
    }

    public void a(StringBuffer stringBuffer, String string, long[] arrl, Boolean bl2) {
        this.d(stringBuffer, string);
        if (arrl == null) {
            this.c(stringBuffer, string);
        } else if (this.a(bl2)) {
            this.a(stringBuffer, string, arrl);
        } else {
            this.b(stringBuffer, string, arrl);
        }
        this.e(stringBuffer, string);
    }

    protected void a(StringBuffer stringBuffer, String string, long[] arrl) {
        stringBuffer.append(this.r);
        for (int i2 = 0; i2 < arrl.length; ++i2) {
            if (i2 > 0) {
                stringBuffer.append(this.s);
            }
            this.b(stringBuffer, string, arrl[i2]);
        }
        stringBuffer.append(this.u);
    }

    protected void b(StringBuffer stringBuffer, String string, long[] arrl) {
        this.c(stringBuffer, string, arrl.length);
    }

    public void a(StringBuffer stringBuffer, String string, int[] arrn, Boolean bl2) {
        this.d(stringBuffer, string);
        if (arrn == null) {
            this.c(stringBuffer, string);
        } else if (this.a(bl2)) {
            this.a(stringBuffer, string, arrn);
        } else {
            this.b(stringBuffer, string, arrn);
        }
        this.e(stringBuffer, string);
    }

    protected void a(StringBuffer stringBuffer, String string, int[] arrn) {
        stringBuffer.append(this.r);
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            if (i2 > 0) {
                stringBuffer.append(this.s);
            }
            this.b(stringBuffer, string, arrn[i2]);
        }
        stringBuffer.append(this.u);
    }

    protected void b(StringBuffer stringBuffer, String string, int[] arrn) {
        this.c(stringBuffer, string, arrn.length);
    }

    public void a(StringBuffer stringBuffer, String string, short[] arrs, Boolean bl2) {
        this.d(stringBuffer, string);
        if (arrs == null) {
            this.c(stringBuffer, string);
        } else if (this.a(bl2)) {
            this.a(stringBuffer, string, arrs);
        } else {
            this.b(stringBuffer, string, arrs);
        }
        this.e(stringBuffer, string);
    }

    protected void a(StringBuffer stringBuffer, String string, short[] arrs) {
        stringBuffer.append(this.r);
        for (int i2 = 0; i2 < arrs.length; ++i2) {
            if (i2 > 0) {
                stringBuffer.append(this.s);
            }
            this.b(stringBuffer, string, arrs[i2]);
        }
        stringBuffer.append(this.u);
    }

    protected void b(StringBuffer stringBuffer, String string, short[] arrs) {
        this.c(stringBuffer, string, arrs.length);
    }

    public void a(StringBuffer stringBuffer, String string, byte[] arrby, Boolean bl2) {
        this.d(stringBuffer, string);
        if (arrby == null) {
            this.c(stringBuffer, string);
        } else if (this.a(bl2)) {
            this.a(stringBuffer, string, arrby);
        } else {
            this.b(stringBuffer, string, arrby);
        }
        this.e(stringBuffer, string);
    }

    protected void a(StringBuffer stringBuffer, String string, byte[] arrby) {
        stringBuffer.append(this.r);
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            if (i2 > 0) {
                stringBuffer.append(this.s);
            }
            this.b(stringBuffer, string, arrby[i2]);
        }
        stringBuffer.append(this.u);
    }

    protected void b(StringBuffer stringBuffer, String string, byte[] arrby) {
        this.c(stringBuffer, string, arrby.length);
    }

    public void a(StringBuffer stringBuffer, String string, char[] arrc, Boolean bl2) {
        this.d(stringBuffer, string);
        if (arrc == null) {
            this.c(stringBuffer, string);
        } else if (this.a(bl2)) {
            this.a(stringBuffer, string, arrc);
        } else {
            this.b(stringBuffer, string, arrc);
        }
        this.e(stringBuffer, string);
    }

    protected void a(StringBuffer stringBuffer, String string, char[] arrc) {
        stringBuffer.append(this.r);
        for (int i2 = 0; i2 < arrc.length; ++i2) {
            if (i2 > 0) {
                stringBuffer.append(this.s);
            }
            this.b(stringBuffer, string, arrc[i2]);
        }
        stringBuffer.append(this.u);
    }

    protected void b(StringBuffer stringBuffer, String string, char[] arrc) {
        this.c(stringBuffer, string, arrc.length);
    }

    public void a(StringBuffer stringBuffer, String string, double[] arrd, Boolean bl2) {
        this.d(stringBuffer, string);
        if (arrd == null) {
            this.c(stringBuffer, string);
        } else if (this.a(bl2)) {
            this.a(stringBuffer, string, arrd);
        } else {
            this.b(stringBuffer, string, arrd);
        }
        this.e(stringBuffer, string);
    }

    protected void a(StringBuffer stringBuffer, String string, double[] arrd) {
        stringBuffer.append(this.r);
        for (int i2 = 0; i2 < arrd.length; ++i2) {
            if (i2 > 0) {
                stringBuffer.append(this.s);
            }
            this.b(stringBuffer, string, arrd[i2]);
        }
        stringBuffer.append(this.u);
    }

    protected void b(StringBuffer stringBuffer, String string, double[] arrd) {
        this.c(stringBuffer, string, arrd.length);
    }

    public void a(StringBuffer stringBuffer, String string, float[] arrf, Boolean bl2) {
        this.d(stringBuffer, string);
        if (arrf == null) {
            this.c(stringBuffer, string);
        } else if (this.a(bl2)) {
            this.a(stringBuffer, string, arrf);
        } else {
            this.b(stringBuffer, string, arrf);
        }
        this.e(stringBuffer, string);
    }

    protected void a(StringBuffer stringBuffer, String string, float[] arrf) {
        stringBuffer.append(this.r);
        for (int i2 = 0; i2 < arrf.length; ++i2) {
            if (i2 > 0) {
                stringBuffer.append(this.s);
            }
            this.b(stringBuffer, string, arrf[i2]);
        }
        stringBuffer.append(this.u);
    }

    protected void b(StringBuffer stringBuffer, String string, float[] arrf) {
        this.c(stringBuffer, string, arrf.length);
    }

    public void a(StringBuffer stringBuffer, String string, boolean[] arrbl, Boolean bl2) {
        this.d(stringBuffer, string);
        if (arrbl == null) {
            this.c(stringBuffer, string);
        } else if (this.a(bl2)) {
            this.a(stringBuffer, string, arrbl);
        } else {
            this.b(stringBuffer, string, arrbl);
        }
        this.e(stringBuffer, string);
    }

    protected void a(StringBuffer stringBuffer, String string, boolean[] arrbl) {
        stringBuffer.append(this.r);
        for (int i2 = 0; i2 < arrbl.length; ++i2) {
            if (i2 > 0) {
                stringBuffer.append(this.s);
            }
            this.b(stringBuffer, string, arrbl[i2]);
        }
        stringBuffer.append(this.u);
    }

    protected void b(StringBuffer stringBuffer, String string, boolean[] arrbl) {
        this.c(stringBuffer, string, arrbl.length);
    }

    protected void c(StringBuffer stringBuffer, Object object) {
        if (this.i && object != null) {
            af.b(object);
            if (this.j) {
                stringBuffer.append(this.a(object.getClass()));
            } else {
                stringBuffer.append(object.getClass().getName());
            }
        }
    }

    protected void d(StringBuffer stringBuffer, Object object) {
        if (this.c() && object != null) {
            af.b(object);
            stringBuffer.append('@');
            stringBuffer.append(Integer.toHexString(System.identityHashCode(object)));
        }
    }

    protected void b(StringBuffer stringBuffer) {
        stringBuffer.append(this.l);
    }

    protected void c(StringBuffer stringBuffer) {
        stringBuffer.append(this.m);
    }

    protected void c(StringBuffer stringBuffer, String string) {
        stringBuffer.append(this.w);
    }

    protected void d(StringBuffer stringBuffer) {
        stringBuffer.append(this.q);
    }

    protected void d(StringBuffer stringBuffer, String string) {
        if (this.h && string != null) {
            stringBuffer.append(string);
            stringBuffer.append(this.n);
        }
    }

    protected void e(StringBuffer stringBuffer, String string) {
        this.d(stringBuffer);
    }

    protected void c(StringBuffer stringBuffer, String string, int n2) {
        stringBuffer.append(this.x);
        stringBuffer.append(n2);
        stringBuffer.append(this.y);
    }

    protected boolean a(Boolean bl2) {
        if (bl2 == null) {
            return this.v;
        }
        return bl2;
    }

    protected String a(Class class_) {
        return org.apache.commons.c.o.a(class_);
    }

    protected boolean a() {
        return this.i;
    }

    protected void a(boolean bl2) {
        this.i = bl2;
    }

    protected boolean b() {
        return this.j;
    }

    protected void b(boolean bl2) {
        this.j = bl2;
    }

    protected boolean c() {
        return this.k;
    }

    protected void c(boolean bl2) {
        this.k = bl2;
    }

    protected boolean d() {
        return this.h;
    }

    protected void d(boolean bl2) {
        this.h = bl2;
    }

    protected boolean e() {
        return this.v;
    }

    protected void e(boolean bl2) {
        this.v = bl2;
    }

    protected boolean f() {
        return this.t;
    }

    protected void f(boolean bl2) {
        this.t = bl2;
    }

    protected String g() {
        return this.r;
    }

    protected void a(String string) {
        if (string == null) {
            string = "";
        }
        this.r = string;
    }

    protected String h() {
        return this.u;
    }

    protected void b(String string) {
        if (string == null) {
            string = "";
        }
        this.u = string;
    }

    protected String i() {
        return this.s;
    }

    protected void c(String string) {
        if (string == null) {
            string = "";
        }
        this.s = string;
    }

    protected String j() {
        return this.l;
    }

    protected void d(String string) {
        if (string == null) {
            string = "";
        }
        this.l = string;
    }

    protected String k() {
        return this.m;
    }

    protected void e(String string) {
        if (string == null) {
            string = "";
        }
        this.m = string;
    }

    protected String l() {
        return this.n;
    }

    protected void f(String string) {
        if (string == null) {
            string = "";
        }
        this.n = string;
    }

    protected String m() {
        return this.q;
    }

    protected void g(String string) {
        if (string == null) {
            string = "";
        }
        this.q = string;
    }

    protected boolean n() {
        return this.o;
    }

    protected void g(boolean bl2) {
        this.o = bl2;
    }

    protected boolean o() {
        return this.p;
    }

    protected void h(boolean bl2) {
        this.p = bl2;
    }

    protected String p() {
        return this.w;
    }

    protected void h(String string) {
        if (string == null) {
            string = "";
        }
        this.w = string;
    }

    protected String q() {
        return this.x;
    }

    protected void i(String string) {
        if (string == null) {
            string = "";
        }
        this.x = string;
    }

    protected String r() {
        return this.y;
    }

    protected void j(String string) {
        if (string == null) {
            string = "";
        }
        this.y = string;
    }

    protected String s() {
        return this.z;
    }

    protected void k(String string) {
        if (string == null) {
            string = "";
        }
        this.z = string;
    }

    protected String t() {
        return this.A;
    }

    protected void l(String string) {
        if (string == null) {
            string = "";
        }
        this.A = string;
    }
}

