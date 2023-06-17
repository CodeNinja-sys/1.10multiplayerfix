/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.ad;
import com.ibm.icu.a.aj;
import com.ibm.icu.a.eb;
import com.ibm.icu.a.ew;
import com.ibm.icu.d.cu;
import com.ibm.icu.d.cv;
import com.ibm.icu.d.cw;
import com.ibm.icu.d.cx;
import com.ibm.icu.d.dm;
import com.ibm.icu.d.dp;
import com.ibm.icu.d.dv;
import com.ibm.icu.d.dw;
import com.ibm.icu.d.eo;
import com.ibm.icu.d.gq;
import com.ibm.icu.d.gz;
import com.ibm.icu.d.jc;
import com.ibm.icu.d.kc;
import com.ibm.icu.d.ki;
import com.ibm.icu.d.kj;
import com.ibm.icu.d.kx;
import com.ibm.icu.d.lf;
import com.ibm.icu.util.b;
import com.ibm.icu.util.bg;
import com.ibm.icu.util.cd;
import com.ibm.icu.util.dj;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.n;
import com.ibm.icu.util.r;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;

public class iz
extends cu {
    private static final long a = 4774881970558875024L;
    static final int b = 2;
    static boolean c = false;
    private static final int[] aX = new int[]{0, 10, 20, 20, 30, 30, 20, 30, 30, 40, 50, 50, 60, 70, 80, 0, 0, 10, 30, 10, 0, 40};
    private static final int[] aY = new int[]{-1, 40, -1, -1, 20, 30, 30, 0, 50, -1, -1, 50, 20, 20, -1, 0, -1, 20, -1, 80, -1, 10, 0, 30, 0, 10, 0, -1, -1, -1, -1, -1, -1, 40, -1, 30, 30, 30, -1, 0, 50, -1, -1, 50, -1, 60, -1, -1, -1, 20, -1, 70, -1, 10, 0, 20, 0, 10, 0, -1, -1, -1, -1, -1};
    private static final int aZ = 5000;
    private static final int ba = 6000;
    private int bb = 2;
    private String bc;
    private String bd;
    private HashMap be;
    private HashMap bf;
    private cw bg;
    private transient dn bh;
    private Date bi;
    private transient int bj;
    private transient long bk;
    private transient kj bl = kj.a;
    private static final int bm = 3600000;
    private static final int bn = -32000;
    private static final String bo = "\uab00";
    private transient boolean bp;
    private volatile kc bq;
    private transient dv br;
    private static dn bs = null;
    private static String bt = null;
    private static final String bu = "yy/MM/dd HH:mm";
    private static final int bv = 64;
    private static final int[] bw = new int[]{-1, 22, -1, -1, 10, 9, 11, 0, 5, -1, -1, 16, 26, 2, -1, 31, -1, 27, -1, 8, -1, 30, 29, 13, 32, 18, 23, -1, -1, -1, -1, -1, -1, 14, -1, 25, 3, 19, -1, 21, 15, -1, -1, 4, -1, 6, -1, -1, -1, 28, -1, 7, -1, 20, 24, 12, 33, 1, 17, -1, -1, -1, -1, -1};
    private static final int[] bx = new int[]{0, 1, 2, 5, 11, 11, 12, 13, 14, 7, 6, 8, 3, 4, 9, 10, 10, 15, 17, 18, 19, 20, 21, 15, 15, 18, 2, 2, 2, 15, 1, 15, 15, 15};
    private static final int[] by = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33};
    private static final cv[] bz = new cv[]{cv.g, cv.s, cv.n, cv.c, cv.i, cv.h, cv.m, cv.o, cv.l, cv.d, cv.f, cv.e, cv.r, cv.q, cv.b, cv.k, cv.j, cv.p, cv.x, cv.t, cv.u, cv.v, cv.w, cv.p, cv.p, cv.d, cv.n, cv.y, cv.y, cv.p, cv.s, cv.p, cv.p, cv.p};
    private static aj bA = new ew();
    private transient Object[] bB;
    private transient boolean bC;
    private transient char[] bD;
    private transient char[] bE;
    private static final String bF = "MYyudehHmsSDFwWkK";
    static final lf aW = new lf("[GyYuUQqMLlwWd]").l();

    public iz() {
        this(iz.t(), null, null, null, null, true, null);
    }

    public iz(String string) {
        this(string, null, null, null, null, true, null);
    }

    public iz(String string, Locale locale) {
        this(string, null, null, null, dn.a(locale), true, null);
    }

    public iz(String string, dn dn2) {
        this(string, null, null, null, dn2, true, null);
    }

    public iz(String string, String string2, dn dn2) {
        this(string, null, null, null, dn2, false, string2);
    }

    public iz(String string, cw cw2) {
        this(string, (cw)cw2.clone(), null, null, null, true, null);
    }

    public iz(String string, cw cw2, dn dn2) {
        this(string, (cw)cw2.clone(), null, null, dn2, true, null);
    }

    iz(String string, cw cw2, n n2, dn dn2, boolean bl2, String string2) {
        this(string, (cw)cw2.clone(), (n)n2.clone(), null, dn2, bl2, string2);
    }

    private iz(String string, cw cw2, n n2, gq gq2, dn dn2, boolean bl2, String string2) {
        this.bc = string;
        this.bg = cw2;
        this.d = n2;
        this.e = gq2;
        this.bh = dn2;
        this.bp = bl2;
        this.bd = string2;
        this.r();
    }

    public static iz a(r r2) {
        String string = r2.b();
        boolean bl2 = string != null && string.length() > 0;
        return new iz(r2.a(), r2.e(), r2.c(), null, r2.d(), bl2, r2.b());
    }

    private void r() {
        if (this.bh == null) {
            this.bh = dn.a(dr.b);
        }
        if (this.bg == null) {
            this.bg = new cw(this.bh);
        }
        if (this.d == null) {
            this.d = com.ibm.icu.util.n.a(this.bh);
        }
        if (this.e == null) {
            gz gz2 = gz.a(this.bh);
            if (gz2.f()) {
                this.e = gq.a(this.bh);
            } else {
                String string = gz2.d();
                String string2 = gz2.e();
                this.e = new ad(this.bh, string, string2);
            }
        }
        this.bk = System.currentTimeMillis();
        this.a(this.d.a(dn.x), this.d.a(dn.w));
        this.x();
        if (this.bd != null) {
            this.a(this.bh);
        }
        this.br = dv.c;
    }

    private synchronized void b(boolean bl2) {
        if (bl2 || this.bq == null) {
            this.bq = kc.a(this.bh);
            String string = null;
            if (this.e instanceof dm) {
                dp dp2 = ((dm)this.e).c();
                string = new String(dp2.e());
            } else if (this.e instanceof ad) {
                string = new String(((ad)this.e).d());
            }
            if (string != null && !this.bq.c().equals(string)) {
                if (this.bq.f()) {
                    this.bq = this.bq.h();
                }
                this.bq.b(string);
            }
        }
    }

    private kc s() {
        if (this.bq == null) {
            this.b(false);
        }
        return this.bq;
    }

    private static synchronized String t() {
        dn dn2 = dn.a(dr.b);
        if (!dn2.equals(bs)) {
            bs = dn2;
            n n2 = com.ibm.icu.util.n.a(bs);
            try {
                com.ibm.icu.a.r r2 = new com.ibm.icu.a.r(bs, n2.b());
                String[] arrstring = r2.a();
                int n3 = 8;
                if (arrstring.length >= 13) {
                    n3 += 4;
                }
                bt = eo.a(arrstring[n3], arrstring[3], arrstring[7]);
            }
            catch (MissingResourceException missingResourceException) {
                bt = bu;
            }
        }
        return bt;
    }

    private void c(Date date) {
        this.bi = date;
        this.d.a(date);
        this.bj = this.d.b(1);
    }

    private void a(long l2) {
        this.bk = l2;
        n n2 = (n)this.d.clone();
        n2.a(l2);
        n2.f(1, -80);
        this.bi = n2.g();
        this.bj = n2.b(1);
    }

    private Date u() {
        if (this.bi == null) {
            this.a(this.bk);
        }
        return this.bi;
    }

    private int v() {
        if (this.bi == null) {
            this.a(this.bk);
        }
        return this.bj;
    }

    public void b(Date date) {
        this.c(date);
    }

    public Date k() {
        return this.u();
    }

    public StringBuffer a(n n2, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        dj dj2 = null;
        if (n2 != this.d && !n2.b().equals(this.d.b())) {
            this.d.a(n2.h());
            dj2 = this.d.k();
            this.d.b(n2.k());
            n2 = this.d;
        }
        StringBuffer stringBuffer2 = this.a(n2, this.br, stringBuffer, fieldPosition, null);
        if (dj2 != null) {
            this.d.b(dj2);
        }
        return stringBuffer2;
    }

    private StringBuffer a(n n2, dv dv2, StringBuffer stringBuffer, FieldPosition fieldPosition, List list) {
        fieldPosition.setBeginIndex(0);
        fieldPosition.setEndIndex(0);
        Object[] arrobject = this.w();
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            int n3;
            if (arrobject[i2] instanceof String) {
                stringBuffer.append((String)arrobject[i2]);
                continue;
            }
            jc jc2 = (jc)arrobject[i2];
            int n4 = 0;
            if (list != null) {
                n4 = stringBuffer.length();
            }
            if (this.bp) {
                this.a(stringBuffer, jc2.a, jc2.b, stringBuffer.length(), i2, dv2, fieldPosition, n2);
            } else {
                stringBuffer.append(this.a(jc2.a, jc2.b, stringBuffer.length(), i2, dv2, fieldPosition, n2));
            }
            if (list == null || (n3 = stringBuffer.length()) - n4 <= 0) continue;
            cv cv2 = this.a(jc2.a);
            FieldPosition fieldPosition2 = new FieldPosition(cv2);
            fieldPosition2.setBeginIndex(n4);
            fieldPosition2.setEndIndex(n3);
            list.add(fieldPosition2);
        }
        return stringBuffer;
    }

    protected cv a(char c2) {
        int n2 = -1;
        if ('A' <= c2 && c2 <= 'z') {
            n2 = bw[c2 - 64];
        }
        if (n2 != -1) {
            return bz[n2];
        }
        return null;
    }

    protected String a(char c2, int n2, int n3, FieldPosition fieldPosition, cw cw2, n n4) {
        return this.a(c2, n2, n3, 0, dv.c, fieldPosition, n4);
    }

    protected String a(char c2, int n2, int n3, int n4, dv dv2, FieldPosition fieldPosition, n n5) {
        StringBuffer stringBuffer = new StringBuffer();
        this.a(stringBuffer, c2, n2, n3, n4, dv2, fieldPosition, n5);
        return stringBuffer.toString();
    }

    protected void a(StringBuffer stringBuffer, char c2, int n2, int n3, int n4, dv dv2, FieldPosition fieldPosition, n n5) {
        String[] arrstring;
        Object object;
        Object object2;
        int n6 = Integer.MAX_VALUE;
        int n7 = stringBuffer.length();
        dj dj2 = n5.k();
        long l2 = n5.h();
        String string = null;
        int n8 = -1;
        if ('A' <= c2 && c2 <= 'z') {
            n8 = bw[c2 - 64];
        }
        if (n8 == -1) {
            if (c2 == 'l') {
                return;
            }
            throw new IllegalArgumentException("Illegal pattern character '" + c2 + "' in \"" + this.bc + '\"');
        }
        int n9 = bx[n8];
        int n10 = n5.b(n9);
        gq gq2 = this.b(c2);
        cx cx2 = cx.a;
        switch (n8) {
            case 0: {
                if (n5.b().equals("chinese")) {
                    this.a(gq2, stringBuffer, n10, 1, 9);
                    break;
                }
                if (n2 == 5) {
                    iz.a(this.bg.u, n10, stringBuffer);
                    cx2 = cx.j;
                    break;
                }
                if (n2 == 4) {
                    iz.a(this.bg.t, n10, stringBuffer);
                    cx2 = cx.h;
                    break;
                }
                iz.a(this.bg.s, n10, stringBuffer);
                cx2 = cx.i;
                break;
            }
            case 30: {
                if (this.bg.P != null && n10 <= this.bg.P.length) {
                    iz.a(this.bg.P, n10 - 1, stringBuffer);
                    break;
                }
            }
            case 1: 
            case 18: {
                if (this.bd != null && (this.bd.compareTo("hebr") == 0 || this.bd.indexOf("y=hebr") >= 0) && n10 > 5000 && n10 < 6000) {
                    n10 -= 5000;
                }
                if (n2 == 2) {
                    this.a(gq2, stringBuffer, n10, 2, 2);
                    break;
                }
                this.a(gq2, stringBuffer, n10, n2, Integer.MAX_VALUE);
                break;
            }
            case 2: 
            case 26: {
                if (n5.b().equals("hebrew")) {
                    object2 = com.ibm.icu.util.bg.C(n5.b(1));
                    if (object2 != 0 && n10 == 6 && n2 >= 3) {
                        n10 = 13;
                    }
                    if (object2 == 0 && n10 >= 6 && n2 < 3) {
                        --n10;
                    }
                }
                int n11 = object2 = this.bg.O != null && this.bg.O.length >= 7 ? n5.b(22) : 0;
                if (n2 == 5) {
                    if (n8 == 2) {
                        iz.a(this.bg.x, n10, stringBuffer, object2 != 0 ? this.bg.O[2] : null);
                    } else {
                        iz.a(this.bg.A, n10, stringBuffer, object2 != 0 ? this.bg.O[5] : null);
                    }
                    cx2 = cx.d;
                    break;
                }
                if (n2 == 4) {
                    if (n8 == 2) {
                        iz.a(this.bg.v, n10, stringBuffer, object2 != 0 ? this.bg.O[0] : null);
                        cx2 = cx.b;
                        break;
                    }
                    iz.a(this.bg.y, n10, stringBuffer, object2 != 0 ? this.bg.O[3] : null);
                    cx2 = cx.c;
                    break;
                }
                if (n2 == 3) {
                    if (n8 == 2) {
                        iz.a(this.bg.w, n10, stringBuffer, object2 != 0 ? this.bg.O[1] : null);
                        cx2 = cx.b;
                        break;
                    }
                    iz.a(this.bg.z, n10, stringBuffer, object2 != 0 ? this.bg.O[4] : null);
                    cx2 = cx.c;
                    break;
                }
                object = new StringBuffer();
                this.a(gq2, (StringBuffer)object, n10 + 1, n2, Integer.MAX_VALUE);
                arrstring = new String[]{((StringBuffer)object).toString()};
                iz.a(arrstring, 0, stringBuffer, object2 != 0 ? this.bg.O[6] : null);
                break;
            }
            case 4: {
                if (n10 == 0) {
                    this.a(gq2, stringBuffer, n5.n(11) + 1, n2, Integer.MAX_VALUE);
                    break;
                }
                this.a(gq2, stringBuffer, n10, n2, Integer.MAX_VALUE);
                break;
            }
            case 8: {
                this.e.b(Math.min(3, n2));
                this.e.a(Integer.MAX_VALUE);
                if (n2 == 1) {
                    n10 /= 100;
                } else if (n2 == 2) {
                    n10 /= 10;
                }
                object = new FieldPosition(-1);
                this.e.a(n10, stringBuffer, (FieldPosition)object);
                if (n2 <= 3) break;
                this.e.b(n2 - 3);
                this.e.a(0L, stringBuffer, (FieldPosition)object);
                break;
            }
            case 19: {
                if (n2 < 3) {
                    this.a(gq2, stringBuffer, n10, n2, Integer.MAX_VALUE);
                    break;
                }
                n10 = n5.b(7);
            }
            case 9: {
                if (n2 == 5) {
                    iz.a(this.bg.E, n10, stringBuffer);
                    cx2 = cx.g;
                    break;
                }
                if (n2 == 4) {
                    iz.a(this.bg.B, n10, stringBuffer);
                    cx2 = cx.e;
                    break;
                }
                if (n2 == 6 && this.bg.D != null) {
                    iz.a(this.bg.D, n10, stringBuffer);
                    cx2 = cx.e;
                    break;
                }
                iz.a(this.bg.C, n10, stringBuffer);
                cx2 = cx.e;
                break;
            }
            case 14: {
                iz.a(this.bg.J, n10, stringBuffer);
                break;
            }
            case 15: {
                if (n10 == 0) {
                    this.a(gq2, stringBuffer, n5.p(10) + 1, n2, Integer.MAX_VALUE);
                    break;
                }
                this.a(gq2, stringBuffer, n10, n2, Integer.MAX_VALUE);
                break;
            }
            case 17: {
                if (n2 < 4) {
                    string = this.s().a(ki.e, dj2, l2);
                    cx2 = cx.n;
                } else {
                    string = this.s().a(ki.d, dj2, l2);
                    cx2 = cx.m;
                }
                stringBuffer.append(string);
                break;
            }
            case 23: {
                string = n2 < 4 ? this.s().a(ki.m, dj2, l2) : (n2 == 5 ? this.s().a(ki.p, dj2, l2) : this.s().a(ki.f, dj2, l2));
                stringBuffer.append(string);
                break;
            }
            case 24: {
                if (n2 == 1) {
                    string = this.s().a(ki.c, dj2, l2);
                    cx2 = cx.n;
                } else if (n2 == 4) {
                    string = this.s().a(ki.b, dj2, l2);
                    cx2 = cx.m;
                }
                stringBuffer.append(string);
                break;
            }
            case 29: {
                if (n2 == 1) {
                    string = this.s().a(ki.s, dj2, l2);
                } else if (n2 == 2) {
                    string = this.s().a(ki.r, dj2, l2);
                } else if (n2 == 3) {
                    string = this.s().a(ki.t, dj2, l2);
                } else if (n2 == 4) {
                    string = this.s().a(ki.a, dj2, l2);
                    cx2 = cx.k;
                }
                stringBuffer.append(string);
                break;
            }
            case 31: {
                if (n2 == 1) {
                    string = this.s().a(ki.g, dj2, l2);
                } else if (n2 == 4) {
                    string = this.s().a(ki.f, dj2, l2);
                }
                stringBuffer.append(string);
                break;
            }
            case 32: {
                if (n2 == 1) {
                    string = this.s().a(ki.h, dj2, l2);
                } else if (n2 == 2) {
                    string = this.s().a(ki.j, dj2, l2);
                } else if (n2 == 3) {
                    string = this.s().a(ki.n, dj2, l2);
                } else if (n2 == 4) {
                    string = this.s().a(ki.l, dj2, l2);
                } else if (n2 == 5) {
                    string = this.s().a(ki.p, dj2, l2);
                }
                stringBuffer.append(string);
                break;
            }
            case 33: {
                if (n2 == 1) {
                    string = this.s().a(ki.i, dj2, l2);
                } else if (n2 == 2) {
                    string = this.s().a(ki.k, dj2, l2);
                } else if (n2 == 3) {
                    string = this.s().a(ki.o, dj2, l2);
                } else if (n2 == 4) {
                    string = this.s().a(ki.m, dj2, l2);
                } else if (n2 == 5) {
                    string = this.s().a(ki.q, dj2, l2);
                }
                stringBuffer.append(string);
                break;
            }
            case 25: {
                if (n2 < 3) {
                    this.a(gq2, stringBuffer, n10, 1, Integer.MAX_VALUE);
                    break;
                }
                n10 = n5.b(7);
                if (n2 == 5) {
                    iz.a(this.bg.I, n10, stringBuffer);
                    cx2 = cx.g;
                    break;
                }
                if (n2 == 4) {
                    iz.a(this.bg.F, n10, stringBuffer);
                    cx2 = cx.f;
                    break;
                }
                if (n2 == 6 && this.bg.H != null) {
                    iz.a(this.bg.H, n10, stringBuffer);
                    cx2 = cx.f;
                    break;
                }
                iz.a(this.bg.G, n10, stringBuffer);
                cx2 = cx.f;
                break;
            }
            case 27: {
                if (n2 >= 4) {
                    iz.a(this.bg.L, n10 / 3, stringBuffer);
                    break;
                }
                if (n2 == 3) {
                    iz.a(this.bg.K, n10 / 3, stringBuffer);
                    break;
                }
                this.a(gq2, stringBuffer, n10 / 3 + 1, n2, Integer.MAX_VALUE);
                break;
            }
            case 28: {
                if (n2 >= 4) {
                    iz.a(this.bg.N, n10 / 3, stringBuffer);
                    break;
                }
                if (n2 == 3) {
                    iz.a(this.bg.M, n10 / 3, stringBuffer);
                    break;
                }
                this.a(gq2, stringBuffer, n10 / 3 + 1, n2, Integer.MAX_VALUE);
                break;
            }
            default: {
                this.a(gq2, stringBuffer, n10, n2, Integer.MAX_VALUE);
            }
        }
        if (n4 == 0) {
            object2 = 0;
            if (dv2 != null) {
                switch (dv2) {
                    case e: {
                        object2 = 1;
                        break;
                    }
                    case f: 
                    case g: {
                        if (this.bg.S == null) break;
                        object = (boolean[])this.bg.S.get((Object)cx2);
                        object2 = dv2 == dv.f ? object[0] : object[1];
                        break;
                    }
                }
            }
            if (object2 != 0) {
                object = stringBuffer.substring(n7);
                arrstring = com.ibm.icu.b.b.a(this.bh, (String)object, null, 768);
                stringBuffer.replace(n7, stringBuffer.length(), (String)arrstring);
            }
        }
        if (fieldPosition.getBeginIndex() == fieldPosition.getEndIndex()) {
            if (fieldPosition.getField() == by[n8]) {
                fieldPosition.setBeginIndex(n3);
                fieldPosition.setEndIndex(n3 + stringBuffer.length() - n7);
            } else if (fieldPosition.getFieldAttribute() == bz[n8]) {
                fieldPosition.setBeginIndex(n3);
                fieldPosition.setEndIndex(n3 + stringBuffer.length() - n7);
            }
        }
    }

    private static void a(String[] arrstring, int n2, StringBuffer stringBuffer) {
        if (arrstring != null && n2 >= 0 && n2 < arrstring.length) {
            stringBuffer.append(arrstring[n2]);
        }
    }

    private static void a(String[] arrstring, int n2, StringBuffer stringBuffer, String string) {
        if (arrstring != null && n2 >= 0 && n2 < arrstring.length) {
            if (string == null) {
                stringBuffer.append(arrstring[n2]);
            } else {
                stringBuffer.append(eo.a(string, arrstring[n2]));
            }
        }
    }

    private Object[] w() {
        if (this.bB != null) {
            return this.bB;
        }
        this.bB = (Object[])bA.a(this.bc);
        if (this.bB != null) {
            return this.bB;
        }
        boolean bl2 = false;
        boolean bl3 = false;
        StringBuilder stringBuilder = new StringBuilder();
        char c2 = '\u0000';
        int n2 = 1;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (int i2 = 0; i2 < this.bc.length(); ++i2) {
            char c3 = this.bc.charAt(i2);
            if (c3 == '\'') {
                if (bl2) {
                    stringBuilder.append('\'');
                    bl2 = false;
                } else {
                    bl2 = true;
                    if (c2 != '\u0000') {
                        arrayList.add(new jc(c2, n2));
                        c2 = '\u0000';
                    }
                }
                bl3 = !bl3;
                continue;
            }
            bl2 = false;
            if (bl3) {
                stringBuilder.append(c3);
                continue;
            }
            if (c3 >= 'a' && c3 <= 'z' || c3 >= 'A' && c3 <= 'Z') {
                if (c3 == c2) {
                    ++n2;
                    continue;
                }
                if (c2 == '\u0000') {
                    if (stringBuilder.length() > 0) {
                        arrayList.add(stringBuilder.toString());
                        stringBuilder.setLength(0);
                    }
                } else {
                    arrayList.add(new jc(c2, n2));
                }
                c2 = c3;
                n2 = 1;
                continue;
            }
            if (c2 != '\u0000') {
                arrayList.add(new jc(c2, n2));
                c2 = '\u0000';
            }
            stringBuilder.append(c3);
        }
        if (c2 == '\u0000') {
            if (stringBuilder.length() > 0) {
                arrayList.add(stringBuilder.toString());
                stringBuilder.setLength(0);
            }
        } else {
            arrayList.add(new jc(c2, n2));
        }
        this.bB = arrayList.toArray(new Object[arrayList.size()]);
        bA.a(this.bc, this.bB);
        return this.bB;
    }

    protected void a(gq gq2, StringBuffer stringBuffer, int n2, int n3, int n4) {
        if (this.bC && n2 >= 0) {
            this.a(stringBuffer, n2, n3, n4);
        } else {
            gq2.b(n3);
            gq2.a(n4);
            gq2.a(n2, stringBuffer, new FieldPosition(-1));
        }
    }

    public void a(gq gq2) {
        super.a(gq2);
        this.x();
        this.b(true);
    }

    private void x() {
        if (this.e instanceof dm) {
            this.bD = ((dm)this.e).c().e();
            this.bC = true;
        } else if (this.e instanceof ad) {
            this.bD = ((ad)this.e).d();
            this.bC = true;
        } else {
            this.bC = false;
        }
        if (this.bC) {
            this.bE = new char[10];
        }
    }

    private void a(StringBuffer stringBuffer, int n2, int n3, int n4) {
        int n5;
        int n6 = this.bE.length < n4 ? this.bE.length : n4;
        int n7 = n6 - 1;
        while (true) {
            this.bE[n7] = this.bD[n2 % 10];
            if (n7 == 0 || (n2 /= 10) == 0) break;
            --n7;
        }
        for (n5 = n3 - (n6 - n7); n5 > 0 && n7 > 0; --n5) {
            this.bE[--n7] = this.bD[0];
        }
        while (n5 > 0) {
            stringBuffer.append(this.bD[0]);
            --n5;
        }
        stringBuffer.append(this.bE, n7, n6 - n7);
    }

    protected String a(long l2, int n2, int n3) {
        this.e.b(n2);
        this.e.a(n3);
        return this.e.a(l2);
    }

    private static final boolean b(char c2, int n2) {
        int n3 = bF.indexOf(c2);
        return n3 > 0 || n3 == 0 && n2 < 3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void a(String var1_1, n var2_2, ParsePosition var3_3) {
        block44: {
            block43: {
                block41: {
                    block42: {
                        block39: {
                            block38: {
                                var4_4 = null;
                                var5_5 = null;
                                if (var2_2 != this.d && !var2_2.b().equals(this.d.b())) {
                                    this.d.a(var2_2.h());
                                    var4_4 = this.d.k();
                                    this.d.b(var2_2.k());
                                    var5_5 = var2_2;
                                    var2_2 = this.d;
                                }
                                var7_7 = var6_6 = var3_3.getIndex();
                                this.bl = kj.a;
                                var8_8 = new boolean[]{false};
                                var9_9 = -1;
                                var10_10 = 0;
                                var11_11 = 0;
                                var12_12 = null;
                                if (this.bg.O != null && this.bg.O.length >= 7) {
                                    var12_12 = new eo(this.bg.O[6], this.bh);
                                }
                                var13_13 = this.w();
                                var14_14 = 0;
                                while (var14_14 < var13_13.length) {
                                    if (var13_13[var14_14] instanceof jc) {
                                        var15_15 = (jc)var13_13[var14_14];
                                        if (var15_15.c && var9_9 == -1 && var14_14 + 1 < var13_13.length && var13_13[var14_14 + 1] instanceof jc && ((jc)var13_13[var14_14 + 1]).c) {
                                            var9_9 = var14_14;
                                            var10_10 = var15_15.b;
                                            var11_11 = var6_6;
                                        }
                                        if (var9_9 != -1) {
                                            var16_21 = var15_15.b;
                                            if (var9_9 == var14_14) {
                                                var16_21 = var10_10;
                                            }
                                            if ((var6_6 = this.a(var1_1, var6_6, var15_15.a, var16_21, true, false, var8_8, var2_2, var12_12)) < 0) {
                                                if (--var10_10 == 0) {
                                                    var3_3.setIndex(var7_7);
                                                    var3_3.setErrorIndex(var6_6);
                                                    if (var4_4 == null) return;
                                                    this.d.b(var4_4);
                                                    return;
                                                }
                                                var14_14 = var9_9;
                                                var6_6 = var11_11;
                                                continue;
                                            }
                                        } else if (var15_15.a != 'l') {
                                            var9_9 = -1;
                                            var16_21 = var6_6;
                                            if ((var6_6 = this.a(var1_1, var6_6, var15_15.a, var15_15.b, false, true, var8_8, var2_2, var12_12)) < 0) {
                                                if (var6_6 != -32000) {
                                                    var3_3.setIndex(var7_7);
                                                    var3_3.setErrorIndex(var16_21);
                                                    if (var4_4 == null) return;
                                                    this.d.b(var4_4);
                                                    return;
                                                }
                                                var6_6 = var16_21;
                                                if (var14_14 + 1 < var13_13.length) {
                                                    var17_26 = null;
                                                    try {
                                                        var17_26 = (String)var13_13[var14_14 + 1];
                                                    }
                                                    catch (ClassCastException var18_28) {
                                                        var3_3.setIndex(var7_7);
                                                        var3_3.setErrorIndex(var16_21);
                                                        if (var4_4 == null) return;
                                                        this.d.b(var4_4);
                                                        return;
                                                    }
                                                    if (var17_26 == null) {
                                                        var17_26 = (String)var13_13[var14_14 + 1];
                                                    }
                                                    var18_27 = var17_26.length();
                                                    for (var19_30 = 0; var19_30 < var18_27 && eb.c(var20_31 = var17_26.charAt(var19_30)); ++var19_30) {
                                                    }
                                                    if (var19_30 == var18_27) {
                                                        ++var14_14;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        var9_9 = -1;
                                        var15_15 = new boolean[1];
                                        var6_6 = this.a(var1_1, var6_6, var13_13, var14_14, (boolean[])var15_15);
                                        if (var15_15[0] == false) {
                                            var3_3.setIndex(var7_7);
                                            var3_3.setErrorIndex(var6_6);
                                            if (var4_4 == null) return;
                                            this.d.b(var4_4);
                                            return;
                                        }
                                    }
                                    ++var14_14;
                                }
                                if (var6_6 < var1_1.length() && (var15_16 = var1_1.charAt(var6_6)) == '.' && this.j() && var13_13.length != 0 && (var16_22 = var13_13[var13_13.length - 1]) instanceof jc && !((jc)var16_22).c) {
                                    ++var6_6;
                                }
                                var3_3.setIndex(var6_6);
                                try {
                                    block40: {
                                        if (!var8_8[0] && this.bl == kj.a) break block38;
                                        if (var8_8[0] && (var16_24 = (var15_18 = (n)var2_2.clone()).g()).before(this.u())) {
                                            var2_2.d(1, this.v() + 100);
                                        }
                                        if (this.bl == kj.a) break block38;
                                        var15_19 = (n)var2_2.clone();
                                        var16_25 = var15_19.k();
                                        var17_26 = null;
                                        if (var16_25 instanceof b) {
                                            var17_26 = (b)var16_25;
                                        }
                                        var15_19.d(15, 0);
                                        var15_19.d(16, 0);
                                        var18_29 = var15_19.h();
                                        var20_32 = new int[2];
                                        if (var17_26 != null) {
                                            if (this.bl == kj.b) {
                                                var17_26.a(var18_29, 1, 1, var20_32);
                                            } else {
                                                var17_26.a(var18_29, 3, 3, var20_32);
                                            }
                                        } else {
                                            var16_25.a(var18_29, true, var20_32);
                                            if (this.bl == kj.b && var20_32[1] != 0 || this.bl == kj.c && var20_32[1] == 0) {
                                                var16_25.a(var18_29 - 86400000L, true, var20_32);
                                            }
                                        }
                                        var21_33 = var20_32[1];
                                        if (this.bl != kj.b) break block40;
                                        if (var20_32[1] != 0) {
                                            var21_33 = 0;
                                        }
                                        ** GOTO lbl129
                                    }
                                    if (var20_32[1] != 0) ** GOTO lbl129
                                    if (var17_26 != null) {
                                        var26_35 = var22_34 = var18_29 + (long)var20_32[0];
                                        var28_36 = var22_34;
                                        var30_37 = 0;
                                        var31_38 = 0;
                                        break block39;
                                    }
                                    var21_33 = var16_25.d();
lbl126:
                                    // 6 sources

                                    while (true) {
                                        if (var21_33 == 0) {
                                            var21_33 = 3600000;
                                        }
lbl129:
                                        // 5 sources

                                        var2_2.d(15, var20_32[0]);
                                        var2_2.d(16, var21_33);
                                        break;
                                    }
                                }
                                catch (IllegalArgumentException var15_20) {
                                    var3_3.setErrorIndex(var6_6);
                                    var3_3.setIndex(var7_7);
                                    if (var4_4 == null) return;
                                    this.d.b(var4_4);
                                    return;
                                }
                            }
                            if (var5_5 != null) {
                                var5_5.b(var2_2.k());
                                var5_5.a(var2_2.h());
                            }
                            if (var4_4 == null) return;
                            this.d.b(var4_4);
                            return;
                        }
                        while ((var24_39 = var17_26.b(var26_35, true)) != null) {
                            var26_35 = var24_39.a() - 1L;
                            var30_37 = var24_39.c().g();
                            if (var30_37 == 0) continue;
                        }
                        while ((var25_40 = var17_26.a(var28_36, false)) != null) {
                            var28_36 = var25_40.a();
                            var31_38 = var25_40.b().g();
                            if (var31_38 == 0) continue;
                        }
                        if (var24_39 == null || var25_40 == null) break block41;
                        if (var22_34 - var26_35 <= var28_36 - var22_34) break block42;
                        var21_33 = var31_38;
                        ** GOTO lbl126
                    }
                    var21_33 = var30_37;
                    ** GOTO lbl126
                }
                if (var24_39 == null || var30_37 == 0) break block43;
                var21_33 = var30_37;
                ** GOTO lbl126
            }
            if (var25_40 == null || var31_38 == 0) break block44;
            var21_33 = var31_38;
            ** GOTO lbl126
        }
        var21_33 = var17_26.d();
        ** while (true)
    }

    private int a(String string, int n2, Object[] arrobject, int n3, boolean[] arrbl) {
        char c2;
        int n4 = n2;
        String string2 = (String)arrobject[n3];
        int n5 = string2.length();
        int n6 = string.length();
        int n7 = 0;
        while (n7 < n5 && n2 < n6) {
            char c3 = string2.charAt(n7);
            char c4 = string.charAt(n2);
            if (eb.c(c3) && eb.c(c4)) {
                while (n7 + 1 < n5 && eb.c(string2.charAt(n7 + 1))) {
                    ++n7;
                }
                while (n2 + 1 < n6 && eb.c(string.charAt(n2 + 1))) {
                    ++n2;
                }
            } else if (c3 != c4) {
                Object object;
                if (c4 != '.' || n2 != n4 || 0 >= n3 || !this.j() || !((object = arrobject[n3 - 1]) instanceof jc) || (c2 = ((jc)object).c) != '\u0000') break;
                ++n2;
                continue;
            }
            ++n7;
            ++n2;
        }
        boolean bl2 = arrbl[0] = n7 == n5;
        if (!arrbl[0] && this.j() && 0 < n3 && n3 < arrobject.length - 1 && n4 < n6) {
            Object object = arrobject[n3 - 1];
            Object object2 = arrobject[n3 + 1];
            if (object instanceof jc && object2 instanceof jc) {
                char c5 = ((jc)object).a;
                c2 = ((jc)object2).a;
                if (aW.b(c5) != aW.b(c2)) {
                    char c6;
                    int n8 = n4;
                    while (eb.c(c6 = string.charAt(n8))) {
                        ++n8;
                    }
                    arrbl[0] = n8 > n4;
                    n2 = n8;
                }
            }
        }
        return n2;
    }

    protected int a(String string, int n2, int n3, String[] arrstring, n n4) {
        return this.a(string, n2, n3, arrstring, null, n4);
    }

    protected int a(String string, int n2, int n3, String[] arrstring, String string2, n n4) {
        int n5 = 0;
        int n6 = arrstring.length;
        if (n3 == 7) {
            n5 = 1;
        }
        int n7 = 0;
        int n8 = -1;
        int n9 = 0;
        int n10 = 0;
        while (n5 < n6) {
            int n11 = arrstring[n5].length();
            if (n11 > n7 && (n10 = this.a(string, n2, arrstring[n5], n11)) >= 0) {
                n8 = n5;
                n7 = n10;
                n9 = 0;
            }
            if (string2 != null) {
                String string3 = eo.a(string2, arrstring[n5]);
                n11 = string3.length();
                if (n11 > n7 && (n10 = this.a(string, n2, string3, n11)) >= 0) {
                    n8 = n5;
                    n7 = n10;
                    n9 = 1;
                }
            }
            ++n5;
        }
        if (n8 >= 0) {
            if (n3 == 1) {
                ++n8;
            }
            n4.d(n3, n8);
            if (string2 != null) {
                n4.d(22, n9);
            }
            return n2 + n7;
        }
        return -n2;
    }

    private int a(String string, int n2, String string2, int n3) {
        boolean bl2 = string.regionMatches(true, n2, string2, 0, n3);
        if (bl2) {
            return n3;
        }
        if (string2.length() > 0 && string2.charAt(string2.length() - 1) == '.' && string.regionMatches(true, n2, string2, 0, n3 - 1)) {
            return n3 - 1;
        }
        return -1;
    }

    protected int b(String string, int n2, int n3, String[] arrstring, n n4) {
        int n5 = arrstring.length;
        int n6 = 0;
        int n7 = -1;
        int n8 = 0;
        for (int i2 = 0; i2 < n5; ++i2) {
            int n9 = arrstring[i2].length();
            if (n9 <= n6 || (n8 = this.a(string, n2, arrstring[i2], n9)) < 0) continue;
            n7 = i2;
            n6 = n8;
        }
        if (n7 >= 0) {
            n4.d(n3, n7 * 3);
            return n2 + n6;
        }
        return -n2;
    }

    protected int a(String string, int n2, char c2, int n3, boolean bl2, boolean bl3, boolean[] arrbl, n n4) {
        return this.a(string, n2, c2, n3, bl2, bl3, arrbl, n4, null);
    }

    protected int a(String string, int n2, char c2, int n3, boolean bl2, boolean bl3, boolean[] arrbl, n n4, eo eo2) {
        Object object;
        int n5;
        Number number = null;
        gq gq2 = null;
        int n6 = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        boolean bl4 = this.j();
        int n7 = -1;
        if ('A' <= c2 && c2 <= 'z') {
            n7 = bw[c2 - 64];
        }
        if (n7 == -1) {
            return -n2;
        }
        gq2 = this.b(c2);
        int n8 = bx[n7];
        if (eo2 != null) {
            eo2.a(0, (Format)gq2);
        }
        while (true) {
            if (n2 >= string.length()) {
                return -n2;
            }
            n5 = kx.a(string, n2);
            if (!com.ibm.icu.b.b.T(n5) || !eb.c(n5)) break;
            n2 += kx.a(n5);
        }
        parsePosition.setIndex(n2);
        if (n7 == 4 || n7 == 15 || n7 == 2 && n3 <= 2 || n7 == 26 && n3 <= 2 || n7 == 1 || n7 == 18 || n7 == 30 || n7 == 0 && n4.b().equals("chinese") || n7 == 8) {
            n5 = 0;
            if (eo2 != null && (n7 == 2 || n7 == 26)) {
                object = eo2.a(string, parsePosition);
                if (object != null && parsePosition.getIndex() > n2 && object[0] instanceof Number) {
                    n5 = 1;
                    number = (Number)object[0];
                    n4.d(22, 1);
                } else {
                    parsePosition.setIndex(n2);
                    n4.d(22, 0);
                }
            }
            if (n5 == 0) {
                if (bl2) {
                    if (n2 + n3 > string.length()) {
                        return -n2;
                    }
                    number = this.a(string, n3, parsePosition, bl3, gq2);
                } else {
                    number = this.a(string, parsePosition, bl3, gq2);
                }
                if (number == null && n7 != 30) {
                    return -n2;
                }
            }
            if (number != null) {
                n6 = number.intValue();
            }
        }
        switch (n7) {
            case 0: {
                if (n4.b().equals("chinese")) {
                    n4.d(0, n6);
                    return parsePosition.getIndex();
                }
                n5 = 0;
                n5 = n3 == 5 ? this.a(string, n2, 0, this.bg.u, null, n4) : (n3 == 4 ? this.a(string, n2, 0, this.bg.t, null, n4) : this.a(string, n2, 0, this.bg.s, null, n4));
                if (n5 == -n2) {
                    n5 = -32000;
                }
                return n5;
            }
            case 1: 
            case 18: {
                if (this.bd != null && (this.bd.compareTo("hebr") == 0 || this.bd.indexOf("y=hebr") >= 0) && n6 < 1000) {
                    n6 += 5000;
                } else if (n3 == 2 && parsePosition.getIndex() - n2 == 2 && !n4.b().equals("chinese") && com.ibm.icu.b.b.g(string.charAt(n2)) && com.ibm.icu.b.b.g(string.charAt(n2 + 1))) {
                    int n9 = this.v() % 100;
                    arrbl[0] = n6 == n9;
                    n6 += this.v() / 100 * 100 + (n6 < n9 ? 100 : 0);
                }
                n4.d(n8, n6);
                if (c) {
                    if (!com.ibm.icu.util.bg.C(n6)) {
                        n4.f(2, 1);
                    }
                    c = false;
                }
                return parsePosition.getIndex();
            }
            case 30: {
                int n10;
                if (this.bg.P != null && (n10 = this.a(string, n2, 1, this.bg.P, null, n4)) > 0) {
                    return n10;
                }
                if (number != null && (bl4 || this.bg.P == null || n6 > this.bg.P.length)) {
                    n4.d(1, n6);
                    return parsePosition.getIndex();
                }
                return -n2;
            }
            case 2: 
            case 26: {
                int n11;
                boolean bl5;
                if (n3 <= 2) {
                    n4.d(2, n6 - 1);
                    if (n4.b().equals("hebrew") && n6 >= 6) {
                        if (n4.e(1)) {
                            if (!com.ibm.icu.util.bg.C(n4.b(1))) {
                                n4.d(2, n6);
                            }
                        } else {
                            c = true;
                        }
                    }
                    return parsePosition.getIndex();
                }
                boolean bl6 = bl5 = this.bg.O != null && this.bg.O.length >= 7;
                int n12 = n7 == 2 ? this.a(string, n2, 2, this.bg.v, bl5 ? this.bg.O[0] : null, n4) : (n11 = this.a(string, n2, 2, this.bg.y, bl5 ? this.bg.O[3] : null, n4));
                if (n11 > 0) {
                    return n11;
                }
                return n7 == 2 ? this.a(string, n2, 2, this.bg.w, bl5 ? this.bg.O[1] : null, n4) : this.a(string, n2, 2, this.bg.z, bl5 ? this.bg.O[4] : null, n4);
            }
            case 4: {
                if (n6 == n4.n(11) + 1) {
                    n6 = 0;
                }
                n4.d(11, n6);
                return parsePosition.getIndex();
            }
            case 8: {
                int n13;
                if (n13 < 3) {
                    for (n13 = parsePosition.getIndex() - n2; n13 < 3; ++n13) {
                        n6 *= 10;
                    }
                } else {
                    int n14 = 1;
                    while (n13 > 3) {
                        n14 *= 10;
                        --n13;
                    }
                    n6 /= n14;
                }
                n4.d(14, n6);
                return parsePosition.getIndex();
            }
            case 9: {
                int n15 = this.a(string, n2, 7, this.bg.B, null, n4);
                if (n15 > 0) {
                    return n15;
                }
                n15 = this.a(string, n2, 7, this.bg.C, null, n4);
                if (n15 > 0) {
                    return n15;
                }
                if (this.bg.D != null) {
                    return this.a(string, n2, 7, this.bg.D, null, n4);
                }
                return n15;
            }
            case 25: {
                int n16 = this.a(string, n2, 7, this.bg.F, null, n4);
                if (n16 > 0) {
                    return n16;
                }
                n16 = this.a(string, n2, 7, this.bg.G, null, n4);
                if (n16 > 0) {
                    return n16;
                }
                if (this.bg.H != null) {
                    return this.a(string, n2, 7, this.bg.H, null, n4);
                }
                return n16;
            }
            case 14: {
                return this.a(string, n2, 9, this.bg.J, null, n4);
            }
            case 15: {
                if (n6 == n4.p(10) + 1) {
                    n6 = 0;
                }
                n4.d(10, n6);
                return parsePosition.getIndex();
            }
            case 17: {
                object = new cd();
                ki ki2 = n3 < 4 ? ki.e : ki.d;
                dj dj2 = this.s().a(ki2, string, parsePosition, (cd)object);
                if (dj2 != null) {
                    this.bl = (kj)((Object)object.a);
                    n4.b(dj2);
                    return parsePosition.getIndex();
                }
                return -n2;
            }
            case 23: {
                object = new cd();
                ki ki3 = n3 < 4 ? ki.m : (n3 == 5 ? ki.p : ki.f);
                dj dj3 = this.s().a(ki3, string, parsePosition, (cd)object);
                if (dj3 != null) {
                    this.bl = (kj)((Object)object.a);
                    n4.b(dj3);
                    return parsePosition.getIndex();
                }
                return -n2;
            }
            case 24: {
                object = new cd();
                ki ki4 = n3 < 4 ? ki.c : ki.b;
                dj dj4 = this.s().a(ki4, string, parsePosition, (cd)object);
                if (dj4 != null) {
                    this.bl = (kj)((Object)object.a);
                    n4.b(dj4);
                    return parsePosition.getIndex();
                }
                return -n2;
            }
            case 29: {
                object = new cd();
                ki ki5 = null;
                switch (n3) {
                    case 1: {
                        ki5 = ki.s;
                        break;
                    }
                    case 2: {
                        ki5 = ki.r;
                        break;
                    }
                    case 3: {
                        ki5 = ki.t;
                        break;
                    }
                    default: {
                        ki5 = ki.a;
                    }
                }
                dj dj5 = this.s().a(ki5, string, parsePosition, (cd)object);
                if (dj5 != null) {
                    this.bl = (kj)((Object)object.a);
                    n4.b(dj5);
                    return parsePosition.getIndex();
                }
                return -n2;
            }
            case 31: {
                object = new cd();
                ki ki6 = n3 < 4 ? ki.g : ki.f;
                dj dj6 = this.s().a(ki6, string, parsePosition, (cd)object);
                if (dj6 != null) {
                    this.bl = (kj)((Object)object.a);
                    n4.b(dj6);
                    return parsePosition.getIndex();
                }
                return -n2;
            }
            case 32: {
                ki ki7;
                object = new cd();
                switch (n3) {
                    case 1: {
                        ki7 = ki.h;
                        break;
                    }
                    case 2: {
                        ki7 = ki.j;
                        break;
                    }
                    case 3: {
                        ki7 = ki.n;
                        break;
                    }
                    case 4: {
                        ki7 = ki.l;
                        break;
                    }
                    default: {
                        ki7 = ki.p;
                    }
                }
                dj dj7 = this.s().a(ki7, string, parsePosition, (cd)object);
                if (dj7 != null) {
                    this.bl = (kj)((Object)object.a);
                    n4.b(dj7);
                    return parsePosition.getIndex();
                }
                return -n2;
            }
            case 33: {
                ki ki8;
                object = new cd();
                switch (n3) {
                    case 1: {
                        ki8 = ki.i;
                        break;
                    }
                    case 2: {
                        ki8 = ki.k;
                        break;
                    }
                    case 3: {
                        ki8 = ki.o;
                        break;
                    }
                    case 4: {
                        ki8 = ki.m;
                        break;
                    }
                    default: {
                        ki8 = ki.q;
                    }
                }
                dj dj8 = this.s().a(ki8, string, parsePosition, (cd)object);
                if (dj8 != null) {
                    this.bl = (kj)((Object)object.a);
                    n4.b(dj8);
                    return parsePosition.getIndex();
                }
                return -n2;
            }
            case 27: {
                if (n3 <= 2) {
                    n4.d(2, (n6 - 1) * 3);
                    return parsePosition.getIndex();
                }
                int n17 = this.b(string, n2, 2, this.bg.L, n4);
                if (n17 > 0) {
                    return n17;
                }
                return this.b(string, n2, 2, this.bg.K, n4);
            }
            case 28: {
                if (n3 <= 2) {
                    n4.d(2, (n6 - 1) * 3);
                    return parsePosition.getIndex();
                }
                int n18 = this.b(string, n2, 2, this.bg.N, n4);
                if (n18 > 0) {
                    return n18;
                }
                return this.b(string, n2, 2, this.bg.M, n4);
            }
        }
        if (bl2) {
            if (n2 + n3 > string.length()) {
                return -n2;
            }
            number = this.a(string, n3, parsePosition, bl3, gq2);
        } else {
            number = this.a(string, parsePosition, bl3, gq2);
        }
        if (number != null) {
            n4.d(n8, number.intValue());
            return parsePosition.getIndex();
        }
        return -n2;
    }

    private Number a(String string, ParsePosition parsePosition, boolean bl2, gq gq2) {
        return this.a(string, -1, parsePosition, bl2, gq2);
    }

    private Number a(String string, int n2, ParsePosition parsePosition, boolean bl2, gq gq2) {
        int n3;
        Number number;
        int n4 = parsePosition.getIndex();
        if (bl2) {
            number = gq2.a(string, parsePosition);
        } else if (gq2 instanceof dm) {
            String string2 = ((dm)gq2).e();
            ((dm)gq2).b(bo);
            number = gq2.a(string, parsePosition);
            ((dm)gq2).b(string2);
        } else {
            boolean bl3 = gq2 instanceof ad;
            if (bl3) {
                ((ad)gq2).a(true);
            }
            number = gq2.a(string, parsePosition);
            if (bl3) {
                ((ad)gq2).a(false);
            }
        }
        if (n2 > 0 && (n3 = parsePosition.getIndex() - n4) > n2) {
            double d2 = number.doubleValue();
            n3 -= n2;
            while (n3 > 0) {
                d2 /= 10.0;
                --n3;
            }
            parsePosition.setIndex(n4 + n2);
            number = (int)d2;
        }
        return number;
    }

    private String a(String string, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl2 = false;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            int n2;
            char c2 = string.charAt(i2);
            if (bl2) {
                if (c2 == '\'') {
                    bl2 = false;
                }
            } else if (c2 == '\'') {
                bl2 = true;
            } else if ((c2 >= 'a' && c2 <= 'z' || c2 >= 'A' && c2 <= 'Z') && (n2 = string2.indexOf(c2)) != -1) {
                c2 = string3.charAt(n2);
            }
            stringBuilder.append(c2);
        }
        if (bl2) {
            throw new IllegalArgumentException("Unfinished quote in pattern");
        }
        return stringBuilder.toString();
    }

    public String l() {
        return this.bc;
    }

    public String m() {
        return this.a(this.bc, "GyMdkHmsSEDFwWahKzYeugAZvcLQqVUOXx", this.bg.R);
    }

    public void c(String string) {
        this.bc = string;
        this.a((dn)null, (dn)null);
        this.bB = null;
    }

    public void d(String string) {
        this.bc = this.a(string, this.bg.R, "GyMdkHmsSEDFwWahKzYeugAZvcLQqVUOXx");
        this.a((dn)null, (dn)null);
    }

    public cw n() {
        return (cw)this.bg.clone();
    }

    public void a(cw cw2) {
        this.bg = (cw)cw2.clone();
    }

    protected cw o() {
        return this.bg;
    }

    public kc p() {
        return this.s().g();
    }

    public void a(kc kc2) {
        this.bq = kc2.f() ? kc2 : kc2.h().g();
    }

    public void a(dv dv2) {
        if (dv2.a() == dw.b) {
            this.br = dv2;
        }
    }

    public dv a(dw dw2) {
        return dw2 == dw.b && this.br != null ? this.br : dv.c;
    }

    public Object clone() {
        iz iz2 = (iz)super.clone();
        iz2.bg = (cw)this.bg.clone();
        return iz2;
    }

    public int hashCode() {
        return this.bc.hashCode();
    }

    public boolean equals(Object object) {
        if (!super.equals(object)) {
            return false;
        }
        iz iz2 = (iz)object;
        return this.bc.equals(iz2.bc) && this.bg.equals(iz2.bg);
    }

    private void a(ObjectOutputStream objectOutputStream) {
        if (this.bi == null) {
            this.a(this.bk);
        }
        this.b(false);
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.br.b());
    }

    private void a(ObjectInputStream objectInputStream) {
        int n2;
        objectInputStream.defaultReadObject();
        int n3 = n2 = this.bb > 1 ? objectInputStream.readInt() : -1;
        if (this.bb < 1) {
            this.bk = System.currentTimeMillis();
        } else {
            this.c(this.bi);
        }
        this.bb = 2;
        this.bh = this.a(dn.x);
        if (this.bh == null) {
            this.bh = dn.a(dr.b);
        }
        this.x();
        this.br = dv.c;
        if (n2 >= 0) {
            for (dv dv2 : dv.values()) {
                if (dv2.b() != n2) continue;
                this.br = dv2;
                break;
            }
        }
    }

    public AttributedCharacterIterator formatToCharacterIterator(Object object) {
        n n2 = this.d;
        if (object instanceof n) {
            n2 = (n)object;
        } else if (object instanceof Date) {
            this.d.a((Date)object);
        } else if (object instanceof Number) {
            this.d.a(((Number)object).longValue());
        } else {
            throw new IllegalArgumentException("Cannot format given Object as a Date");
        }
        StringBuffer stringBuffer = new StringBuffer();
        FieldPosition fieldPosition = new FieldPosition(0);
        ArrayList arrayList = new ArrayList();
        this.a(n2, this.br, stringBuffer, fieldPosition, arrayList);
        AttributedString attributedString = new AttributedString(stringBuffer.toString());
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            FieldPosition fieldPosition2 = (FieldPosition)arrayList.get(i2);
            Format.Field field = fieldPosition2.getFieldAttribute();
            attributedString.addAttribute(field, field, fieldPosition2.getBeginIndex(), fieldPosition2.getEndIndex());
        }
        return attributedString.getIterator();
    }

    dn q() {
        return this.bh;
    }

    boolean c(int n2) {
        return iz.a(this.bc, n2);
    }

    static boolean a(String string, int n2) {
        int n3;
        int n4 = aX[n2];
        boolean bl2 = false;
        char c2 = '\u0000';
        int n5 = 0;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c3 = string.charAt(i2);
            if (c3 != c2 && n5 > 0) {
                n3 = aY[c2 - 64];
                if (n4 <= n3) {
                    return false;
                }
                n5 = 0;
            }
            if (c3 == '\'') {
                if (i2 + 1 < string.length() && string.charAt(i2 + 1) == '\'') {
                    ++i2;
                    continue;
                }
                bl2 = !bl2;
                continue;
            }
            if (bl2 || (c3 < 'a' || c3 > 'z') && (c3 < 'A' || c3 > 'Z')) continue;
            c2 = c3;
            ++n5;
        }
        return n5 <= 0 || n4 > (n3 = aY[c2 - 64]);
    }

    public final StringBuffer a(n n2, n n3, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        jc jc2;
        int n4;
        int n5;
        if (!n2.a(n3)) {
            throw new IllegalArgumentException("can not format on two different calendars");
        }
        Object[] arrobject = this.w();
        int n6 = -1;
        int n7 = -1;
        try {
            for (n5 = 0; n5 < arrobject.length; ++n5) {
                if (!this.a(n2, n3, arrobject, n5)) continue;
                n6 = n5;
                break;
            }
            if (n6 == -1) {
                return this.a(n2, stringBuffer, fieldPosition);
            }
            for (n5 = arrobject.length - 1; n5 >= n6; --n5) {
                if (!this.a(n2, n3, arrobject, n5)) continue;
                n7 = n5;
                break;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IllegalArgumentException(illegalArgumentException.toString());
        }
        if (n6 == 0 && n7 == arrobject.length - 1) {
            this.a(n2, stringBuffer, fieldPosition);
            stringBuffer.append(" \u2013 ");
            this.a(n3, stringBuffer, fieldPosition);
            return stringBuffer;
        }
        n5 = 1000;
        for (n4 = n6; n4 <= n7; ++n4) {
            if (arrobject[n4] instanceof String) continue;
            jc2 = (jc)arrobject[n4];
            char c2 = jc2.a;
            int n8 = -1;
            if ('A' <= c2 && c2 <= 'z') {
                n8 = aY[c2 - 64];
            }
            if (n8 == -1) {
                throw new IllegalArgumentException("Illegal pattern character '" + c2 + "' in \"" + this.bc + '\"');
            }
            if (n8 >= n5) continue;
            n5 = n8;
        }
        try {
            for (n4 = 0; n4 < n6; ++n4) {
                if (!this.a(arrobject, n4, n5)) continue;
                n6 = n4;
                break;
            }
            for (n4 = arrobject.length - 1; n4 > n7; --n4) {
                if (!this.a(arrobject, n4, n5)) continue;
                n7 = n4;
                break;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IllegalArgumentException(illegalArgumentException.toString());
        }
        if (n6 == 0 && n7 == arrobject.length - 1) {
            this.a(n2, stringBuffer, fieldPosition);
            stringBuffer.append(" \u2013 ");
            this.a(n3, stringBuffer, fieldPosition);
            return stringBuffer;
        }
        fieldPosition.setBeginIndex(0);
        fieldPosition.setEndIndex(0);
        for (n4 = 0; n4 <= n7; ++n4) {
            if (arrobject[n4] instanceof String) {
                stringBuffer.append((String)arrobject[n4]);
                continue;
            }
            jc2 = (jc)arrobject[n4];
            if (this.bp) {
                this.a(stringBuffer, jc2.a, jc2.b, stringBuffer.length(), n4, this.br, fieldPosition, n2);
                continue;
            }
            stringBuffer.append(this.a(jc2.a, jc2.b, stringBuffer.length(), n4, this.br, fieldPosition, n2));
        }
        stringBuffer.append(" \u2013 ");
        for (n4 = n6; n4 < arrobject.length; ++n4) {
            if (arrobject[n4] instanceof String) {
                stringBuffer.append((String)arrobject[n4]);
                continue;
            }
            jc2 = (jc)arrobject[n4];
            if (this.bp) {
                this.a(stringBuffer, jc2.a, jc2.b, stringBuffer.length(), n4, this.br, fieldPosition, n3);
                continue;
            }
            stringBuffer.append(this.a(jc2.a, jc2.b, stringBuffer.length(), n4, this.br, fieldPosition, n3));
        }
        return stringBuffer;
    }

    private boolean a(n n2, n n3, Object[] arrobject, int n4) {
        int n5;
        if (arrobject[n4] instanceof String) {
            return false;
        }
        jc jc2 = (jc)arrobject[n4];
        char c2 = jc2.a;
        int n6 = -1;
        if ('A' <= c2 && c2 <= 'z') {
            n6 = bw[c2 - 64];
        }
        if (n6 == -1) {
            throw new IllegalArgumentException("Illegal pattern character '" + c2 + "' in \"" + this.bc + '\"');
        }
        int n7 = bx[n6];
        int n8 = n2.b(n7);
        return n8 != (n5 = n3.b(n7));
    }

    private boolean a(Object[] arrobject, int n2, int n3) {
        if (arrobject[n2] instanceof String) {
            return false;
        }
        jc jc2 = (jc)arrobject[n2];
        char c2 = jc2.a;
        int n4 = -1;
        if ('A' <= c2 && c2 <= 'z') {
            n4 = aY[c2 - 64];
        }
        if (n4 == -1) {
            throw new IllegalArgumentException("Illegal pattern character '" + c2 + "' in \"" + this.bc + '\"');
        }
        return n4 >= n3;
    }

    protected gq b(char c2) {
        Character c3 = Character.valueOf(c2);
        if (this.bf != null && this.bf.containsKey(c3)) {
            String string = ((String)this.bf.get(c3)).toString();
            gq gq2 = (gq)this.be.get(string);
            return gq2;
        }
        return this.e;
    }

    private void a(dn dn2) {
        this.be = new HashMap();
        this.bf = new HashMap();
        this.a(dn2, this.bd);
    }

    private void a(dn dn2, String string) {
        if (string == null || string.length() == 0) {
            return;
        }
        int n2 = 0;
        boolean bl2 = true;
        while (bl2) {
            boolean bl3;
            String string2;
            int n3;
            int n4 = string.indexOf(";", n2);
            if (n4 == -1) {
                bl2 = false;
                n3 = string.length();
            } else {
                n3 = n4;
            }
            String string3 = string.substring(n2, n3);
            int n5 = string3.indexOf("=");
            if (n5 == -1) {
                string2 = string3;
                bl3 = true;
            } else {
                string2 = string3.substring(n5 + 1);
                Character c2 = Character.valueOf(string3.charAt(0));
                this.bf.put(c2, string2);
                bl3 = false;
            }
            dn dn3 = new dn(dn2.k() + "@numbers=" + string2);
            gq gq2 = gq.b(dn3, 0);
            gq2.h(false);
            if (bl3) {
                this.a(gq2);
            } else {
                this.bC = false;
            }
            if (!this.be.containsKey(string2)) {
                this.be.put(string2, gq2);
            }
            n2 = n4 + 1;
        }
    }

    static /* synthetic */ boolean a(char c2, int n2) {
        return iz.b(c2, n2);
    }
}

