/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.aj;
import com.ibm.icu.a.bc;
import com.ibm.icu.a.ew;
import com.ibm.icu.d.cu;
import com.ibm.icu.d.df;
import com.ibm.icu.d.dg;
import com.ibm.icu.d.dh;
import com.ibm.icu.d.di;
import com.ibm.icu.d.dj;
import com.ibm.icu.d.dk;
import com.ibm.icu.d.dl;
import com.ibm.icu.d.dp;
import com.ibm.icu.d.eo;
import com.ibm.icu.d.iz;
import com.ibm.icu.util.az;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.dv;
import com.ibm.icu.util.n;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class dd
implements az,
Cloneable {
    private static final boolean w = false;
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    public static final int l = 11;
    public static final int m = 12;
    public static final int n = 13;
    public static final int o = 14;
    public static final int p = 15;
    public static final int q = 16;
    public static final int r = 0;
    public static final int s = 2048;
    public static final int t = 4096;
    public static final int u = 8192;
    public static final int v = 65535;
    private TreeMap x = new TreeMap();
    private TreeMap y = new TreeMap();
    private String z = "?";
    private String A = "{1} {0}";
    private String[] B = new String[16];
    private String[] C = new String[16];
    private char D;
    private boolean E;
    private transient df F;
    private transient dh G;
    private transient dg H;
    private static final int I = 16384;
    private static final int J = 24576;
    private static aj K = new ew();
    private static final String[] L = new String[]{"Era", "Year", "Quarter", "Month", "Week", "*", "Day-Of-Week", "Day", "*", "*", "*", "Hour", "Minute", "Second", "*", "Timezone"};
    private static final String[] M = new String[]{"era", "year", "*", "month", "week", "*", "weekday", "day", "*", "*", "dayperiod", "hour", "minute", "second", "*", "zone"};
    private static final String[] N = new String[]{"Era", "Year", "Quarter", "Month", "Week_in_Year", "Week_in_Month", "Weekday", "Day", "Day_Of_Year", "Day_of_Week_in_Month", "Dayperiod", "Hour", "Minute", "Second", "Fractional_Second", "Zone"};
    private static final String[] O = new String[]{"G", "y", "Q", "M", "w", "W", "E", "d", "D", "F", "H", "m", "s", "S", "v"};
    private static final Set P = new HashSet<String>(Arrays.asList(O));
    private Set Q;
    private static final int R = 1023;
    private static final int S = 64512;
    private static final int T = 16;
    private static final int U = 256;
    private static final int V = 0;
    private static final int W = -257;
    private static final int X = -258;
    private static final int Y = -259;
    private static final int Z = 65536;
    private static final int aa = 4096;
    private static final int[][] ab = new int[][]{{71, 0, -258, 1, 3}, {71, 0, -259, 4}, {121, 1, 256, 1, 20}, {89, 1, 272, 1, 20}, {117, 1, 288, 1, 20}, {85, 1, -258, 1, 3}, {85, 1, -259, 4}, {85, 1, -257, 5}, {81, 2, 256, 1, 2}, {81, 2, -258, 3}, {81, 2, -259, 4}, {113, 2, 272, 1, 2}, {113, 2, -242, 3}, {113, 2, -243, 4}, {77, 3, 256, 1, 2}, {77, 3, -258, 3}, {77, 3, -259, 4}, {77, 3, -257, 5}, {76, 3, 272, 1, 2}, {76, 3, -274, 3}, {76, 3, -275, 4}, {76, 3, -273, 5}, {108, 3, 272, 1, 1}, {119, 4, 256, 1, 2}, {87, 5, 272, 1}, {69, 6, -258, 1, 3}, {69, 6, -259, 4}, {69, 6, -257, 5}, {99, 6, 288, 1, 2}, {99, 6, -290, 3}, {99, 6, -291, 4}, {99, 6, -289, 5}, {101, 6, 272, 1, 2}, {101, 6, -274, 3}, {101, 6, -275, 4}, {101, 6, -273, 5}, {100, 7, 256, 1, 2}, {68, 8, 272, 1, 3}, {70, 9, 288, 1}, {103, 7, 304, 1, 20}, {97, 10, -258, 1}, {72, 11, 416, 1, 2}, {107, 11, 432, 1, 2}, {104, 11, 256, 1, 2}, {75, 11, 272, 1, 2}, {109, 12, 256, 1, 2}, {115, 13, 256, 1, 2}, {83, 14, 272, 1, 1000}, {65, 13, 288, 1, 1000}, {118, 15, -290, 1}, {118, 15, -291, 4}, {122, 15, -258, 1, 3}, {122, 15, -259, 4}, {90, 15, -274, 1, 3}, {90, 15, -275, 4}, {86, 15, -274, 1, 3}, {86, 15, -275, 4}};

    public static dd a() {
        return new dd();
    }

    protected dd() {
        for (int i2 = 0; i2 < 16; ++i2) {
            this.B[i2] = "{0} \u251c{2}: {1}\u2524";
            this.C[i2] = "F" + i2;
        }
        this.D = (char)72;
        this.E = false;
        this.F = new df(null);
        this.G = new dh();
        this.H = new dg(null);
        this.n();
        this.Q = new HashSet(20);
    }

    public static dd b() {
        return dd.a(dn.a(dr.b));
    }

    public static dd a(dn dn2) {
        return dd.b(dn2).h();
    }

    public static dd b(dn dn2) {
        Object object;
        String string;
        Object object2;
        Object object3;
        String string2 = dn2.toString();
        dd dd2 = (dd)K.a(string2);
        if (dd2 != null) {
            return dd2;
        }
        dd2 = new dd();
        di di2 = new di();
        String string3 = null;
        block8: for (int i2 = 0; i2 <= 3; ++i2) {
            object3 = (iz)cu.b(i2, dn2);
            dd2.a(((iz)object3).l(), false, di2);
            object3 = (iz)cu.a(i2, dn2);
            dd2.a(((iz)object3).l(), false, di2);
            if (i2 != 3) continue;
            string3 = ((iz)object3).l();
            object2 = new dh();
            ((dh)object2).a(string3);
            List list = ((dh)object2).a();
            for (int i3 = 0; i3 < list.size(); ++i3) {
                string = list.get(i3);
                if (!(string instanceof dl) || ((dl)(object = (dl)((Object)string))).a() != 11) continue;
                dd2.D = ((dl)object).toString().charAt(0);
                continue block8;
            }
        }
        bc bc2 = (bc)dv.a("com/ibm/icu/impl/data/icudt51b", dn2);
        object3 = dn2.j("calendar");
        if (object3 == null) {
            object2 = com.ibm.icu.util.n.a("calendar", dn2, true);
            object3 = object2[0];
        }
        if (object3 == null) {
            object3 = "gregorian";
        }
        try {
            object2 = bc2.b("calendar/" + (String)object3 + "/appendItems");
            for (int i4 = 0; i4 < ((dv)object2).w(); ++i4) {
                bc bc3 = (bc)((dv)object2).k(i4);
                string = ((dv)object2).k(i4).k();
                object = bc3.A();
                dd2.a(dd.a(string), (String)object);
            }
        }
        catch (MissingResourceException missingResourceException) {
            // empty catch block
        }
        try {
            object2 = bc2.b("fields");
            for (int i5 = 0; i5 < 16; ++i5) {
                if (!dd.d(i5)) continue;
                bc bc4 = ((bc)object2).b(M[i5]);
                bc bc5 = bc4.b("dn");
                object = bc5.A();
                dd2.b(i5, (String)object);
            }
        }
        catch (MissingResourceException missingResourceException) {
            // empty catch block
        }
        object2 = null;
        try {
            object2 = bc2.b("calendar/" + (String)object3 + "/availableFormats");
        }
        catch (MissingResourceException missingResourceException) {
            // empty catch block
        }
        boolean bl2 = true;
        while (object2 != null) {
            for (int i6 = 0; i6 < ((dv)object2).w(); ++i6) {
                String string4 = ((dv)object2).k(i6).k();
                if (dd2.l(string4)) continue;
                dd2.k(string4);
                object = ((dv)object2).k(i6).A();
                dd2.a((String)object, string4, bl2, di2);
            }
            bc bc6 = (bc)((bc)object2).j();
            if (bc6 == null) break;
            try {
                object2 = bc6.b("calendar/" + (String)object3 + "/availableFormats");
            }
            catch (MissingResourceException missingResourceException) {
                object2 = null;
            }
            if (object2 == null || !bc6.i().k().equals("root")) continue;
            bl2 = false;
        }
        if (string3 != null) {
            dd.a(dd2, di2, string3);
        }
        dd2.g(com.ibm.icu.util.n.a(com.ibm.icu.util.n.a(dn2), dn2, 2));
        dp dp2 = new dp(dn2);
        dd2.h(String.valueOf(dp2.i()));
        dd2.g();
        K.a(string2, dd2);
        return dd2;
    }

    public char c() {
        return this.D;
    }

    public void a(char c2) {
        this.D = c2;
    }

    private static void a(dd dd2, di di2, String string) {
        int n2;
        Object object;
        dd2.G.a(string);
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl2 = false;
        for (int i2 = 0; i2 < dh.a(dd2.G).size(); ++i2) {
            object = dh.a(dd2.G).get(i2);
            if (object instanceof String) {
                if (!bl2) continue;
                stringBuilder.append(dd2.G.b(object.toString()));
                continue;
            }
            n2 = object.toString().charAt(0);
            if (n2 == 109) {
                bl2 = true;
                stringBuilder.append(object);
                continue;
            }
            if (n2 == 115) {
                if (!bl2) break;
                stringBuilder.append(object);
                dd2.a(stringBuilder.toString(), false, di2);
                break;
            }
            if (bl2 || n2 == 122 || n2 == 90 || n2 == 118 || n2 == 86) break;
        }
        BitSet bitSet = new BitSet();
        object = new BitSet();
        for (n2 = 0; n2 < dh.a(dd2.G).size(); ++n2) {
            Object e2 = dh.a(dd2.G).get(n2);
            if (!(e2 instanceof dl)) continue;
            bitSet.set(n2);
            char c2 = e2.toString().charAt(0);
            if (c2 != 's' && c2 != 'S') continue;
            ((BitSet)object).set(n2);
            for (int i3 = n2 - 1; i3 >= 0 && !bitSet.get(i3); ++i3) {
                ((BitSet)object).set(n2);
            }
        }
        String string2 = dd.a(dd2.G, (BitSet)object);
        dd2.a(string2, false, di2);
    }

    private static String a(dh dh2, BitSet bitSet) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < dh.a(dh2).size(); ++i2) {
            if (bitSet.get(i2)) continue;
            Object e2 = dh.a(dh2).get(i2);
            if (e2 instanceof String) {
                stringBuilder.append(dh2.b(e2.toString()));
                continue;
            }
            stringBuilder.append(e2.toString());
        }
        return stringBuilder.toString();
    }

    public static int a(String string) {
        for (int i2 = 0; i2 < L.length; ++i2) {
            if (!L[i2].equals(string)) continue;
            return i2;
        }
        return -1;
    }

    private static boolean d(int n2) {
        if (n2 < 0 && n2 >= 16) {
            return false;
        }
        return M[n2].charAt(0) != '*';
    }

    public String b(String string) {
        return this.a(string, (df)null, 0);
    }

    public String a(String string, int n2) {
        return this.a(string, (df)null, n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private String a(String string, df df2, int n2) {
        String string2;
        String string3;
        string = string.replaceAll("j", String.valueOf(this.D));
        dd dd2 = this;
        synchronized (dd2) {
            this.F.a(string, this.G, false);
            dj dj2 = this.a(this.F, -1, this.H, df2);
            if (this.H.a == 0 && this.H.b == 0) {
                return this.a(dj2, this.F, false, n2);
            }
            int n3 = this.F.c();
            string3 = this.a(this.F, n3 & 0x3FF, this.H, df2, n2);
            string2 = this.a(this.F, n3 & 0xFC00, this.H, df2, n2);
        }
        if (string3 == null) {
            return string2 == null ? "" : string2;
        }
        if (string2 == null) {
            return string3;
        }
        return eo.a(this.d(), string2, string3);
    }

    public dd a(String string, boolean bl2, di di2) {
        return this.a(string, null, bl2, di2);
    }

    public dd a(String string, String string2, boolean bl2, di di2) {
        dk dk2;
        this.m();
        df df2 = string2 == null ? new df(null).a(string, this.G, false) : new df(null).a(string2, this.G, false);
        String string3 = df2.b();
        dk dk3 = (dk)this.y.get(string3);
        if (dk3 != null && (!dk3.b || string2 != null && !bl2)) {
            di2.d = 1;
            di2.e = dk3.a;
            if (!bl2) {
                return this;
            }
        }
        if ((dk2 = (dk)this.x.get(df2)) != null) {
            di2.d = 2;
            di2.e = dk2.a;
            if (!bl2 || string2 != null && dk2.b) {
                return this;
            }
        }
        di2.d = 0;
        di2.e = "";
        dk dk4 = new dk(string, string2 != null);
        this.x.put(df2, dk4);
        this.y.put(string3, dk4);
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String c(String string) {
        dd dd2 = this;
        synchronized (dd2) {
            this.F.a(string, this.G, false);
            return this.F.toString();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String d(String string) {
        dd dd2 = this;
        synchronized (dd2) {
            this.F.a(string, this.G, true);
            return this.F.toString();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String e(String string) {
        dd dd2 = this;
        synchronized (dd2) {
            this.F.a(string, this.G, true);
            return this.F.a();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String f(String string) {
        dd dd2 = this;
        synchronized (dd2) {
            this.F.a(string, this.G, false);
            return this.F.b();
        }
    }

    public Map a(Map linkedHashMap) {
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<String, String>();
        }
        for (df df2 : this.x.keySet()) {
            dk dk2 = (dk)this.x.get(df2);
            String string = dk2.a;
            if (P.contains(string)) continue;
            linkedHashMap.put(df2.toString(), string);
        }
        return linkedHashMap;
    }

    public Set a(Set hashSet) {
        if (hashSet == null) {
            hashSet = new HashSet();
        }
        hashSet.addAll(this.y.keySet());
        return hashSet;
    }

    public String a(String string, String string2) {
        return this.a(string, string2, 0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String a(String string, String string2, int n2) {
        dd dd2 = this;
        synchronized (dd2) {
            dj dj2 = new dj(string, null);
            return this.a(dj2, this.F.a(string2, this.G, false), false, n2);
        }
    }

    public void g(String string) {
        this.m();
        this.A = string;
    }

    public String d() {
        return this.A;
    }

    public void h(String string) {
        this.m();
        this.z = string;
    }

    public String e() {
        return this.z;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Collection a(Collection linkedHashSet) {
        dd dd2 = this;
        synchronized (dd2) {
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<String>();
            }
            for (df df2 : this.x.keySet()) {
                String string;
                dk dk2 = (dk)this.x.get(df2);
                String string2 = dk2.a;
                if (P.contains(string2) || !(string = this.a(df2.toString(), df2, 0)).equals(string2)) continue;
                linkedHashSet.add(string2);
            }
            return linkedHashSet;
        }
    }

    public void a(int n2, String string) {
        this.m();
        this.B[n2] = string;
    }

    public String a(int n2) {
        return this.B[n2];
    }

    public void b(int n2, String string) {
        this.m();
        this.C[n2] = string;
    }

    public String b(int n2) {
        return this.C[n2];
    }

    public static boolean i(String string) {
        char c2 = string.charAt(0);
        for (int i2 = 1; i2 < string.length(); ++i2) {
            if (string.charAt(i2) == c2) continue;
            return false;
        }
        return true;
    }

    private void k(String string) {
        this.m();
        this.Q.add(string);
    }

    private boolean l(String string) {
        return this.Q.contains(string);
    }

    public boolean f() {
        return this.E;
    }

    public dd g() {
        this.E = true;
        return this;
    }

    public dd h() {
        dd dd2 = (dd)this.clone();
        this.E = false;
        return dd2;
    }

    public Object clone() {
        try {
            dd dd2 = (dd)super.clone();
            dd2.x = (TreeMap)this.x.clone();
            dd2.y = (TreeMap)this.y.clone();
            dd2.B = (String[])this.B.clone();
            dd2.C = (String[])this.C.clone();
            dd2.F = new df(null);
            dd2.G = new dh();
            dd2.H = new dg(null);
            dd2.E = false;
            return dd2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalArgumentException("Internal Error");
        }
    }

    public boolean b(String string, String string2) {
        if (string.equals(string2)) {
            return true;
        }
        TreeSet treeSet = this.m(string);
        TreeSet treeSet2 = this.m(string2);
        if (treeSet.size() != treeSet2.size()) {
            return false;
        }
        Iterator iterator = treeSet2.iterator();
        for (String string3 : treeSet) {
            String string4;
            int n2;
            int n3 = dd.b(string3, false);
            if (ab[n3][1] == ab[n2 = dd.b(string4 = (String)iterator.next(), false)][1]) continue;
            return false;
        }
        return true;
    }

    private TreeSet m(String string) {
        List list = this.G.a(string).a();
        TreeSet<String> treeSet = new TreeSet<String>();
        for (Object e2 : list) {
            String string2 = e2.toString();
            if (string2.startsWith("G") || string2.startsWith("a")) continue;
            treeSet.add(string2);
        }
        return treeSet;
    }

    private void m() {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify frozen object");
        }
    }

    private String a(df df2, int n2, dg dg2, df df3, int n3) {
        String string = null;
        if (n2 != 0) {
            dj dj2 = this.a(df2, n2, dg2, df3);
            string = this.a(dj2, df2, false, n3);
            while (dg2.a != 0) {
                if ((dg2.a & 0x6000) == 16384 && (n2 & 0x6000) == 24576) {
                    dj2.a = string;
                    string = this.a(dj2, df2, true, n3);
                    dg2.a &= 0xFFFFBFFF;
                    continue;
                }
                int n4 = dg2.a;
                dj dj3 = this.a(df2, dg2.a, dg2, df3);
                String string2 = this.a(dj3, df2, false, n3);
                int n5 = n4 & ~dg2.a;
                int n6 = this.g(n5);
                string = eo.a(this.f(n6), string, string2, this.e(n6));
            }
        }
        return string;
    }

    private String e(int n2) {
        return "'" + this.C[n2] + "'";
    }

    private String f(int n2) {
        return this.B[n2];
    }

    private int g(int n2) {
        int n3 = 0;
        while (n2 != 0) {
            n2 >>>= 1;
            ++n3;
        }
        return n3 - 1;
    }

    private void n() {
        di di2 = new di();
        for (int i2 = 0; i2 < O.length; ++i2) {
            this.a(String.valueOf(O[i2]), false, di2);
        }
    }

    private dj a(df df2, int n2, dg dg2, df df3) {
        int n3 = Integer.MAX_VALUE;
        dj dj2 = new dj("", null);
        dg dg3 = new dg(null);
        for (df df4 : this.x.keySet()) {
            int n4;
            if (df4.equals(df3) || (n4 = df2.a(df4, n2, dg3)) >= n3) continue;
            n3 = n4;
            dk dk2 = (dk)this.x.get(df4);
            dj2.a = dk2.a;
            dj2.b = dk2.b ? df4 : null;
            dg2.a(dg3);
            if (n4 != 0) continue;
            break;
        }
        return dj2;
    }

    private String a(dj dj2, df df2, boolean bl2, int n2) {
        this.G.a(dj2.a);
        StringBuilder stringBuilder = new StringBuilder();
        for (Object e2 : this.G.a()) {
            String string;
            if (e2 instanceof String) {
                stringBuilder.append(this.G.b((String)e2));
                continue;
            }
            dl dl2 = (dl)e2;
            StringBuilder stringBuilder2 = new StringBuilder(dl2.toString());
            int n3 = dl2.a();
            if (bl2 && n3 == 13) {
                string = df.b(df2)[14];
                stringBuilder2.append(this.z);
                stringBuilder2.append(string);
            } else if (df.c(df2)[n3] != 0) {
                int n4;
                string = df.b(df2)[n3];
                int n5 = string.length();
                if (string.charAt(0) == 'E' && n5 < 3) {
                    n5 = 3;
                }
                int n6 = n5;
                df df3 = dj2.b;
                if (n3 == 11 && (n2 & 0x800) == 0 || n3 == 12 && (n2 & 0x1000) == 0 || n3 == 13 && (n2 & 0x2000) == 0) {
                    n6 = stringBuilder2.length();
                } else if (df3 != null) {
                    String string2 = df3.a(n3);
                    n4 = string2.length();
                    boolean bl3 = dl2.b();
                    boolean bl4 = df3.b(n3);
                    if (n4 == n5 || bl3 && !bl4 || bl4 && !bl3) {
                        n6 = stringBuilder2.length();
                    }
                }
                char c2 = n3 != 11 && n3 != 3 && n3 != 6 && n3 != 1 ? string.charAt(0) : stringBuilder2.charAt(0);
                stringBuilder2 = new StringBuilder();
                for (n4 = n6; n4 > 0; --n4) {
                    stringBuilder2.append(c2);
                }
            }
            stringBuilder.append((CharSequence)stringBuilder2);
        }
        return stringBuilder.toString();
    }

    public String j(String string) {
        this.G.a(string);
        StringBuilder stringBuilder = new StringBuilder();
        for (Object e2 : this.G.a()) {
            if (e2 instanceof String) {
                stringBuilder.append(this.G.b((String)e2));
                continue;
            }
            stringBuilder.append("{" + dd.n(e2.toString()) + "}");
        }
        return stringBuilder.toString();
    }

    private static String h(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < 16; ++i2) {
            if ((n2 & 1 << i2) == 0) continue;
            if (stringBuilder.length() != 0) {
                stringBuilder.append(" | ");
            }
            stringBuilder.append(N[i2]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    private static String n(String string) {
        boolean bl2;
        int n2 = dd.b(string, true);
        String string2 = N[ab[n2][1]];
        int n3 = ab[n2][2];
        boolean bl3 = bl2 = n3 < 0;
        if (bl2) {
            n3 = -n3;
        }
        string2 = n3 < 0 ? string2 + ":S" : string2 + ":N";
        return string2;
    }

    private static int b(String string, boolean bl2) {
        int n2;
        int n3 = string.length();
        if (n3 == 0) {
            return -1;
        }
        char c2 = string.charAt(0);
        for (n2 = 1; n2 < n3; ++n2) {
            if (string.charAt(n2) == c2) continue;
            return -1;
        }
        n2 = -1;
        for (int i2 = 0; i2 < ab.length; ++i2) {
            int[] arrn = ab[i2];
            if (arrn[0] != c2) continue;
            n2 = i2;
            if (arrn[3] > n3 || arrn[arrn.length - 1] < n3) continue;
            return i2;
        }
        return bl2 ? -1 : n2;
    }

    public /* synthetic */ Object i() {
        return this.h();
    }

    public /* synthetic */ Object j() {
        return this.g();
    }

    static /* synthetic */ int a(String string, boolean bl2) {
        return dd.b(string, bl2);
    }

    static /* synthetic */ int[][] k() {
        return ab;
    }

    static /* synthetic */ String[] l() {
        return O;
    }

    static /* synthetic */ String c(int n2) {
        return dd.h(n2);
    }
}

