/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.gg;
import com.ibm.icu.b.aa;
import com.ibm.icu.d.ed;
import com.ibm.icu.d.gm;
import com.ibm.icu.d.je;
import com.ibm.icu.d.jm;
import com.ibm.icu.d.jn;
import com.ibm.icu.d.jo;
import com.ibm.icu.d.jp;
import com.ibm.icu.d.lf;
import java.util.Set;

public class jd {
    public static final lf a = new lf("[\\-.\\u00B7\\u05F3\\u05F4\\u0F0B\\u200C\\u200D\\u2019]");
    public static final lf b = new lf("[[0-z\\u00C0-\\u017E\\u01A0\\u01A1\\u01AF\\u01B0\\u01CD-\\u01DC\\u01DE-\\u01E3\\u01E6-\\u01F5\\u01F8-\\u021B\\u021E\\u021F\\u0226-\\u0233\\u02BB\\u02BC\\u02EC\\u0300-\\u0304\\u0306-\\u030C\\u030F-\\u0311\\u0313\\u0314\\u031B\\u0323-\\u0328\\u032D\\u032E\\u0330\\u0331\\u0335\\u0338\\u0339\\u0342-\\u0345\\u037B-\\u03CE\\u03FC-\\u045F\\u048A-\\u0525\\u0531-\\u0586\\u05D0-\\u05F2\\u0621-\\u063F\\u0641-\\u0655\\u0660-\\u0669\\u0670-\\u068D\\u068F-\\u06D5\\u06E5\\u06E6\\u06EE-\\u06FF\\u0750-\\u07B1\\u0901-\\u0939\\u093C-\\u094D\\u0950\\u0960-\\u0972\\u0979-\\u0A4D\\u0A5C-\\u0A74\\u0A81-\\u0B43\\u0B47-\\u0B61\\u0B66-\\u0C56\\u0C60\\u0C61\\u0C66-\\u0CD6\\u0CE0-\\u0CEF\\u0D02-\\u0D28\\u0D2A-\\u0D39\\u0D3D-\\u0D43\\u0D46-\\u0D4D\\u0D57-\\u0D61\\u0D66-\\u0D8E\\u0D91-\\u0DA5\\u0DA7-\\u0DDE\\u0DF2\\u0E01-\\u0ED9\\u0F00\\u0F20-\\u0F8B\\u0F90-\\u109D\\u10D0-\\u10F0\\u10F7-\\u10FA\\u1200-\\u135A\\u135F\\u1380-\\u138F\\u1401-\\u167F\\u1780-\\u17A2\\u17A5-\\u17A7\\u17A9-\\u17B3\\u17B6-\\u17CA\\u17D2\\u17D7-\\u17DC\\u17E0-\\u17E9\\u1810-\\u18A8\\u18AA-\\u18F5\\u1E00-\\u1E99\\u1F00-\\u1FFC\\u2D30-\\u2D65\\u2D80-\\u2DDE\\u3005-\\u3007\\u3041-\\u31B7\\u3400-\\u9FCB\\uA000-\\uA48C\\uA67F\\uA717-\\uA71F\\uA788\\uAA60-\\uAA7B\\uAC00-\\uD7A3\\uFA0E-\\uFA29\\U00020000-\\U0002B734]-[[:Cn:][:nfkcqc=n:][:XIDC=n:]]]");
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 4;
    public static final int f = 8;
    public static final int g = 16;
    public static final int h = 16;
    public static final int i = 32;
    public static final int j = 64;
    public static final int k = 128;
    public static final int l = -1;
    static final int m = 944111087;
    private ed u = null;
    private int v;
    private int w;
    private jp x;
    private Set y;
    private lf z;
    private jn A;
    private static gm B = gm.b();
    static final int n = 0x1000000;
    static final int o = 0x2000000;
    static final int p = 0x4000000;
    static final int q = 0x8000000;
    static final int r = 0x10000000;
    static final int s = 29;

    private jd() {
    }

    public jn a() {
        return this.A;
    }

    public int b() {
        return this.w;
    }

    public Set c() {
        return this.y;
    }

    public lf d() {
        return this.z;
    }

    public boolean a(String string, jm jm2) {
        int n2;
        Object object;
        int n3 = string.length();
        int n4 = 0;
        if (jm2 != null) {
            jm2.b = 0;
            jm2.c = null;
            jm2.d = null;
        }
        ed ed2 = null;
        if (0 != (this.w & 0x90)) {
            ed2 = this.e().a(string).a(this.z);
        }
        if (0 != (this.w & 0x10)) {
            object = ed2.g();
            if (object.compareTo(this.A) > 0) {
                n4 |= 0x10;
            }
            if (jm2 != null) {
                jm2.d = object;
            }
        }
        if (0 != (this.w & 0x80)) {
            object = ed2.e();
            if (((lf)object).a() > 1) {
                n4 |= 0x80;
            }
            if (jm2 != null) {
                jm2.c = object;
            }
        }
        if (0 != (this.w & 0x40)) {
            int n5 = 0;
            while (n5 < n3) {
                n2 = Character.codePointAt(string, n5);
                n5 = Character.offsetByCodePoints(string, n5, 1);
                if (this.z.b(n2)) continue;
                n4 |= 0x40;
                break;
            }
        }
        if (0 != (this.w & 0x26)) {
            int n6;
            String string2 = B.d(string);
            if (0 != (this.w & 0x20)) {
                n6 = 0;
                boolean bl2 = false;
                lf lf2 = new lf();
                n2 = 0;
                while (n2 < n3) {
                    int n7 = Character.codePointAt(string2, n2);
                    n2 = Character.offsetByCodePoints(string2, n2, 1);
                    if (Character.getType(n7) != 6) {
                        n6 = 0;
                        if (!bl2) continue;
                        lf2.g();
                        bl2 = false;
                        continue;
                    }
                    if (n6 == 0) {
                        n6 = n7;
                        continue;
                    }
                    if (!bl2) {
                        lf2.e(n6);
                        bl2 = true;
                    }
                    if (lf2.b(n7)) {
                        n4 |= 0x20;
                        break;
                    }
                    lf2.e(n7);
                }
            }
            if (0 != (this.w & 6)) {
                if (ed2 == null) {
                    ed2 = this.e();
                    ed2.a(string);
                }
                n2 = ed2.h();
                jo jo2 = new jo();
                this.a((CharSequence)string2, jo2);
                n6 = jo2.c();
                if (0 != (this.w & 4) && n6 >= 2 && n2 == 1) {
                    n4 |= 4;
                }
                if (0 != (this.w & 2) && n6 >= 1 && n2 > 1) {
                    n4 |= 2;
                }
            }
        }
        if (jm2 != null) {
            jm2.a = n4;
        }
        this.a(ed2);
        return 0 != n4;
    }

    public boolean a(String string) {
        return this.a(string, (jm)null);
    }

    public int a(String string, String string2) {
        String string3;
        boolean bl2;
        String string4;
        String string5;
        if ((this.w & 7) == 0) {
            throw new IllegalArgumentException("No confusable checks are enabled.");
        }
        int n2 = this.w & 8;
        int n3 = 0;
        ed ed2 = this.e();
        ed2.a(string);
        int n4 = ed2.h();
        ed2.a(string2);
        int n5 = ed2.h();
        this.a(ed2);
        if (0 != (this.w & 1) && n4 <= 1 && n5 <= 1 && (string5 = this.a(n2 |= 1, string)).equals(string4 = this.a(n2, string2))) {
            n3 |= 1;
        }
        if (n3 & true) {
            return n3;
        }
        boolean bl3 = bl2 = n4 <= 1 && n5 <= 1 && 0 != (this.w & 4);
        if ((0 != (this.w & 2) || bl2) && (string4 = this.a(n2 &= 0xFFFFFFFE, string)).equals(string3 = this.a(n2, string2))) {
            n3 |= 2;
            if (bl2) {
                n3 |= 4;
            }
        }
        return n3;
    }

    public String a(int n2, String string) {
        int n3;
        int n4 = 0;
        switch (n2) {
            case 0: {
                n4 = 0x4000000;
                break;
            }
            case 1: {
                n4 = 0x1000000;
                break;
            }
            case 8: {
                n4 = 0x8000000;
                break;
            }
            case 9: {
                n4 = 0x2000000;
                break;
            }
            default: {
                throw new IllegalArgumentException("SpoofChecker.getSkeleton(), bad type value.");
            }
        }
        String string2 = B.d(string);
        int n5 = string2.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < n5; i2 += Character.charCount(n3)) {
            n3 = Character.codePointAt(string2, i2);
            this.a(n3, n4, stringBuilder);
        }
        String string3 = stringBuilder.toString();
        string3 = B.d(string3);
        return string3;
    }

    private void a(int n2, int n3, StringBuilder stringBuilder) {
        int n4;
        int n5;
        int n6 = 0;
        int n7 = 0;
        int n8 = this.x.a.e;
        boolean bl2 = false;
        do {
            int n9;
            if (n2 == (n9 = this.x.b[n7 = n6 + (n5 = (n8 - n6) / 2)] & 0x1FFFFF)) {
                bl2 = true;
                break;
            }
            if (n2 < n9) {
                n8 = n7;
                continue;
            }
            n6 = n7 + 1;
        } while (n6 < n8);
        if (!bl2) {
            stringBuilder.appendCodePoint(n2);
            return;
        }
        n5 = 0;
        int n10 = this.x.b[n7] & 0xFF000000;
        if ((n10 & n3) == 0) {
            if (0 != (n10 & 0x10000000)) {
                n4 = n7 - 1;
                while ((this.x.b[n4] & 0xFFFFFF) == n2) {
                    n10 = this.x.b[n4] & 0xFF000000;
                    if (0 != (n10 & n3)) {
                        n7 = n4;
                        n5 = 1;
                        break;
                    }
                    --n4;
                }
                if (n5 == 0) {
                    n4 = n7 + 1;
                    while ((this.x.b[n4] & 0xFFFFFF) == n2) {
                        n10 = this.x.b[n4] & 0xFF000000;
                        if (0 != (n10 & n3)) {
                            n7 = n4;
                            n5 = 1;
                            break;
                        }
                        ++n4;
                    }
                }
            }
            if (n5 == 0) {
                stringBuilder.appendCodePoint(n2);
                return;
            }
        }
        n4 = jd.a(n10) + 1;
        int n11 = n7;
        short s2 = this.x.c[n11];
        if (n4 == 1) {
            stringBuilder.append((char)s2);
            return;
        }
        if (n4 == 4) {
            int n12;
            int n13 = this.x.a.k;
            for (n12 = 0; n12 < n13; ++n12) {
                if (this.x.d[n12].a < s2) continue;
                n4 = this.x.d[n12].b;
                break;
            }
            assert (n12 < n13);
        }
        assert (s2 + n4 <= this.x.a.i);
        stringBuilder.append(this.x.e, (int)s2, n4);
    }

    void a(CharSequence charSequence, jo jo2) {
        int n2 = 0;
        gg gg2 = 0 != (this.w & 8) ? this.x.f : this.x.g;
        jo2.a();
        while (n2 < charSequence.length()) {
            int n3 = Character.codePointAt(charSequence, n2);
            n2 = Character.offsetByCodePoints(charSequence, n2, 1);
            int n4 = gg2.a(n3);
            if (n4 == 0) {
                int n5 = aa.a(n3);
                assert (n5 > 1);
                jo2.b(n5);
                continue;
            }
            if (n4 == 1) continue;
            jo2.c(this.x.h[n4]);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private ed e() {
        ed ed2 = null;
        jd jd2 = this;
        synchronized (jd2) {
            ed2 = this.u;
            this.u = null;
        }
        if (ed2 == null) {
            ed2 = new ed();
        }
        return ed2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(ed ed2) {
        if (ed2 != null) {
            jd jd2 = this;
            synchronized (jd2) {
                if (this.u == null) {
                    this.u = ed2;
                }
            }
        }
    }

    static final int a(int n2) {
        return n2 >> 29 & 3;
    }

    static /* synthetic */ int a(jd jd2) {
        return jd2.v;
    }

    static /* synthetic */ int b(jd jd2) {
        return jd2.w;
    }

    static /* synthetic */ lf c(jd jd2) {
        return jd2.z;
    }

    static /* synthetic */ Set d(jd jd2) {
        return jd2.y;
    }

    static /* synthetic */ jn e(jd jd2) {
        return jd2.A;
    }

    /* synthetic */ jd(je je2) {
        this();
    }

    static /* synthetic */ int a(jd jd2, int n2) {
        jd2.v = n2;
        return jd2.v;
    }

    static /* synthetic */ int b(jd jd2, int n2) {
        jd2.w = n2;
        return jd2.w;
    }

    static /* synthetic */ jp a(jd jd2, jp jp2) {
        jd2.x = jp2;
        return jd2.x;
    }

    static /* synthetic */ lf a(jd jd2, lf lf2) {
        jd2.z = lf2;
        return jd2.z;
    }

    static /* synthetic */ Set a(jd jd2, Set set) {
        jd2.y = set;
        return jd2.y;
    }

    static /* synthetic */ jn a(jd jd2, jn jn2) {
        jd2.A = jn2;
        return jd2.A;
    }
}

