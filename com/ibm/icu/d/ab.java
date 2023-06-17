/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.di;
import com.ibm.icu.a.dt;
import com.ibm.icu.a.jd;
import com.ibm.icu.b.b;
import com.ibm.icu.d.fo;
import com.ibm.icu.d.gm;
import com.ibm.icu.d.kx;
import com.ibm.icu.d.lf;
import com.ibm.icu.d.lq;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class ab {
    private static boolean a = false;
    private static boolean b = true;
    private final gm c;
    private final dt d;
    private String e;
    private boolean f;
    private String[][] g;
    private int[] h;
    private transient StringBuilder i = new StringBuilder();
    private static final Set j = new HashSet();

    public ab(String string) {
        di di2 = di.a();
        this.c = di2.c;
        this.d = di2.a.b();
        this.a(string);
    }

    public String a() {
        return this.e;
    }

    public void b() {
        this.f = false;
        for (int i2 = 0; i2 < this.h.length; ++i2) {
            this.h[i2] = 0;
        }
    }

    public String c() {
        if (this.f) {
            return null;
        }
        this.i.setLength(0);
        for (int i2 = 0; i2 < this.g.length; ++i2) {
            this.i.append(this.g[i2][this.h[i2]]);
        }
        String string = this.i.toString();
        int n2 = this.h.length - 1;
        while (true) {
            if (n2 < 0) {
                this.f = true;
                break;
            }
            int n3 = n2;
            this.h[n3] = this.h[n3] + 1;
            if (this.h[n2] < this.g[n2].length) break;
            this.h[n2] = 0;
            --n2;
        }
        return string;
    }

    public void a(String string) {
        int n2;
        int n3;
        this.e = this.c.d(string);
        this.f = false;
        if (string.length() == 0) {
            this.g = new String[1][];
            this.h = new int[1];
            this.g[0] = new String[]{""};
            return;
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        int n4 = 0;
        for (n2 = kx.d(this.e, 1); n2 < this.e.length(); n2 += Character.charCount(n3)) {
            n3 = this.e.codePointAt(n2);
            if (!this.d.m(n3)) continue;
            arrayList.add(this.e.substring(n4, n2));
            n4 = n2;
        }
        arrayList.add(this.e.substring(n4, n2));
        this.g = new String[arrayList.size()][];
        this.h = new int[arrayList.size()];
        for (n2 = 0; n2 < this.g.length; ++n2) {
            if (a) {
                System.out.println("SEGMENT");
            }
            this.g[n2] = this.b((String)arrayList.get(n2));
        }
    }

    public static void a(String string, boolean bl2, Set set) {
        int n2;
        if (string.length() <= 2 && kx.a(string) <= 1) {
            set.add(string);
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < string.length(); i2 += kx.a(n2)) {
            n2 = kx.a(string, i2);
            if (bl2 && i2 != 0 && com.ibm.icu.b.b.H(n2) == 0) continue;
            hashSet.clear();
            ab.a(string.substring(0, i2) + string.substring(i2 + kx.a(n2)), bl2, hashSet);
            String string2 = kx.c(string, i2);
            for (String string3 : hashSet) {
                String string4 = string2 + string3;
                set.add(string4);
            }
        }
    }

    private String[] b(String string) {
        String[] arrstring2;
        HashSet<String> hashSet = new HashSet<String>();
        Set set = this.c(string);
        HashSet hashSet2 = new HashSet();
        for (String[] arrstring2 : set) {
            hashSet2.clear();
            ab.a((String)arrstring2, b, hashSet2);
            for (String string2 : hashSet2) {
                if (fo.a(string2, string, 0) == 0) {
                    if (a) {
                        System.out.println("Adding Permutation: " + jd.a((CharSequence)string2));
                    }
                    hashSet.add(string2);
                    continue;
                }
                if (!a) continue;
                System.out.println("-Skipping Permutation: " + jd.a((CharSequence)string2));
            }
        }
        arrstring2 = new String[hashSet.size()];
        hashSet.toArray(arrstring2);
        return arrstring2;
    }

    private Set c(String string) {
        int n2;
        HashSet<String> hashSet = new HashSet<String>();
        if (a) {
            System.out.println("Adding: " + jd.a((CharSequence)string));
        }
        hashSet.add(string);
        StringBuffer stringBuffer = new StringBuffer();
        lf lf2 = new lf();
        for (int i2 = 0; i2 < string.length(); i2 += Character.charCount(n2)) {
            n2 = string.codePointAt(i2);
            if (!this.d.a(n2, lf2)) continue;
            lq lq2 = new lq(lf2);
            while (lq2.a()) {
                int n3 = lq2.b;
                Set set = this.a(n3, string, i2, stringBuffer);
                if (set == null) continue;
                String string2 = string.substring(0, i2);
                string2 = string2 + kx.d(n3);
                for (String string3 : set) {
                    hashSet.add(string2 + string3);
                }
            }
        }
        return hashSet;
    }

    private Set a(int n2, String string, int n3, StringBuffer stringBuffer) {
        int n4;
        String string2;
        if (a) {
            System.out.println(" extract: " + jd.a((CharSequence)kx.d(n2)) + ", " + jd.a((CharSequence)string.substring(n3)));
        }
        if ((string2 = this.d.k(n2)) == null) {
            string2 = kx.d(n2);
        }
        boolean bl2 = false;
        int n5 = 0;
        int n6 = kx.a(string2, 0);
        n5 += kx.a(n6);
        stringBuffer.setLength(0);
        for (int i2 = n3; i2 < string.length(); i2 += kx.a(n4)) {
            n4 = kx.a(string, i2);
            if (n4 == n6) {
                if (a) {
                    System.out.println("  matches: " + jd.a((CharSequence)kx.d(n4)));
                }
                if (n5 == string2.length()) {
                    stringBuffer.append(string.substring(i2 + kx.a(n4)));
                    bl2 = true;
                    break;
                }
                n6 = kx.a(string2, n5);
                n5 += kx.a(n6);
                continue;
            }
            if (a) {
                System.out.println("  buffer: " + jd.a((CharSequence)kx.d(n4)));
            }
            kx.f(stringBuffer, n4);
        }
        if (!bl2) {
            return null;
        }
        if (a) {
            System.out.println("Matches");
        }
        if (stringBuffer.length() == 0) {
            return j;
        }
        String string3 = stringBuffer.toString();
        if (0 != fo.a(kx.d(n2) + string3, string.substring(n3), 0)) {
            return null;
        }
        return this.c(string3);
    }

    static {
        j.add("");
    }
}

