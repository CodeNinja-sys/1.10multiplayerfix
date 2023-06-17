/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.bc;
import com.ibm.icu.a.fd;
import com.ibm.icu.a.fk;
import com.ibm.icu.a.fn;
import com.ibm.icu.a.fp;
import com.ibm.icu.a.ft;
import com.ibm.icu.a.je;
import com.ibm.icu.b.b;
import com.ibm.icu.d.cv;
import com.ibm.icu.d.gz;
import com.ibm.icu.d.ke;
import com.ibm.icu.d.kf;
import com.ibm.icu.d.kg;
import com.ibm.icu.d.kh;
import com.ibm.icu.d.ki;
import com.ibm.icu.d.kj;
import com.ibm.icu.d.kk;
import com.ibm.icu.d.kl;
import com.ibm.icu.d.kr;
import com.ibm.icu.d.ks;
import com.ibm.icu.d.kv;
import com.ibm.icu.util.az;
import com.ibm.icu.util.cd;
import com.ibm.icu.util.dj;
import com.ibm.icu.util.dk;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.n;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.MissingResourceException;
import java.util.Set;

public class kc
extends kv
implements az,
Serializable {
    private static final long b = 2281246852693575022L;
    private static final int c = 128;
    private static final int d = 256;
    private dn e;
    private kl f;
    private String g;
    private String[] h;
    private String[] i;
    private String j;
    private boolean k;
    private volatile transient fk l;
    private transient String m;
    private transient String n;
    private transient Object[][] o;
    private transient boolean p;
    private transient String q;
    private transient boolean r;
    private static final String s = "Etc/GMT";
    private static final String[] t = new String[]{"GMT", "UTC", "UT"};
    private static final String u = "GMT{0}";
    private static final String v = "GMT";
    private static final String[] w = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private static final char x = ':';
    private static final String y = "0123456789";
    private static final String z = "Z";
    private static final String A = "Etc/Unknown";
    private static final String B = "unk";
    private static final String C = "Unknown";
    private static final kf[] D = new kf[]{kf.b, kf.d, kf.a, kf.c, kf.e, kf.f};
    private static final int E = 3600000;
    private static final int F = 60000;
    private static final int G = 1000;
    private static final int H = 86400000;
    private static final int I = 23;
    private static final int J = 59;
    private static final int K = 59;
    private static final int L = Integer.MAX_VALUE;
    private static kk M = new kk(null);
    private static final EnumSet N = EnumSet.of(ks.b, ks.c, ks.e, ks.f, ks.g);
    private static final EnumSet O = EnumSet.of(fp.a, fp.b, fp.c);
    private static volatile fd P;
    private static volatile fd Q;
    private static final ObjectStreamField[] R;

    protected kc(dn dn2) {
        Object object;
        String[] arrstring;
        this.e = dn2;
        this.f = kl.a(dn2);
        String string = null;
        String string2 = null;
        this.j = v;
        try {
            arrstring = (String[])bc.a("com/ibm/icu/impl/data/icudt51b/zone", dn2);
            try {
                string = arrstring.f("zoneStrings/gmtFormat");
            }
            catch (MissingResourceException missingResourceException) {
                // empty catch block
            }
            try {
                string2 = arrstring.f("zoneStrings/hourFormat");
            }
            catch (MissingResourceException missingResourceException) {
                // empty catch block
            }
            try {
                this.j = arrstring.f("zoneStrings/gmtZeroFormat");
            }
            catch (MissingResourceException missingResourceException) {}
        }
        catch (MissingResourceException missingResourceException) {
            // empty catch block
        }
        if (string == null) {
            string = u;
        }
        this.e(string);
        arrstring = new String[kf.values().length];
        if (string2 != null) {
            object = string2.split(";", 2);
            arrstring[kf.e.ordinal()] = kc.h((String)((Object)object[0]));
            arrstring[kf.a.ordinal()] = object[0];
            arrstring[kf.b.ordinal()] = kc.g((String)object[0]);
            arrstring[kf.f.ordinal()] = kc.h((String)object[1]);
            arrstring[kf.c.ordinal()] = object[1];
            arrstring[kf.d.ordinal()] = kc.g((String)object[1]);
        } else {
            for (kf kf2 : kf.values()) {
                arrstring[kf2.ordinal()] = kf.a(kf2);
            }
        }
        this.a(arrstring);
        this.i = w;
        object = gz.a(dn2);
        if (!((gz)object).f()) {
            this.i = kc.i(((gz)object).d());
        }
    }

    public static kc a(dn dn2) {
        if (dn2 == null) {
            throw new NullPointerException("locale is null");
        }
        return (kc)M.a((Object)dn2, (Object)dn2);
    }

    public kl a() {
        return this.f;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private fk k() {
        if (this.l == null) {
            kc kc2 = this;
            synchronized (kc2) {
                if (this.l == null) {
                    this.l = fk.a(this.e);
                }
            }
        }
        return this.l;
    }

    public kc a(kl kl2) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify frozen object");
        }
        this.f = kl2;
        this.l = new fk(this.e, this.f);
        return this;
    }

    public String b() {
        return this.g;
    }

    public kc a(String string) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify frozen object");
        }
        this.e(string);
        return this;
    }

    public String a(kf kf2) {
        return this.h[kf2.ordinal()];
    }

    public kc a(kf kf2, String string) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify frozen object");
        }
        if (string == null) {
            throw new NullPointerException("Null GMT offset pattern");
        }
        Object[] arrobject = kc.b(string, kf.b(kf2));
        this.h[kf2.ordinal()] = string;
        this.o[kf2.ordinal()] = arrobject;
        this.m();
        return this;
    }

    public String c() {
        StringBuilder stringBuilder = new StringBuilder(this.i.length);
        for (String string : this.i) {
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public kc b(String string) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify frozen object");
        }
        if (string == null) {
            throw new NullPointerException("Null GMT offset digits");
        }
        String[] arrstring = kc.i(string);
        if (arrstring.length != 10) {
            throw new IllegalArgumentException("Length of digits must be 10");
        }
        this.i = arrstring;
        return this;
    }

    public String d() {
        return this.j;
    }

    public kc c(String string) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify frozen object");
        }
        if (string == null) {
            throw new NullPointerException("Null GMT zero format");
        }
        if (string.length() == 0) {
            throw new IllegalArgumentException("Empty GMT zero format");
        }
        this.j = string;
        return this;
    }

    public kc a(EnumSet enumSet) {
        this.k = enumSet.contains((Object)kh.a);
        return this;
    }

    public EnumSet e() {
        if (this.k) {
            return EnumSet.of(kh.a);
        }
        return EnumSet.noneOf(kh.class);
    }

    public final String a(int n2, boolean bl2, boolean bl3, boolean bl4) {
        return this.a(n2, true, bl2, bl3, bl4);
    }

    public final String b(int n2, boolean bl2, boolean bl3, boolean bl4) {
        return this.a(n2, false, bl2, bl3, bl4);
    }

    public String a(int n2) {
        return this.a(n2, false);
    }

    public String b(int n2) {
        return this.a(n2, true);
    }

    public final String a(ki ki2, dj dj2, long l2) {
        return this.a(ki2, dj2, l2, null);
    }

    public String a(ki ki2, dj dj2, long l2, cd cd2) {
        String string = null;
        if (cd2 != null) {
            cd2.a = kj.a;
        }
        switch (ki2) {
            case a: {
                string = this.k().a(je.a(dj2));
                break;
            }
            case b: {
                string = this.k().a(dj2, fp.b, l2);
                break;
            }
            case c: {
                string = this.k().a(dj2, fp.c, l2);
                break;
            }
            case d: {
                string = this.a(dj2, ks.b, ks.c, l2, cd2);
                break;
            }
            case e: {
                string = this.a(dj2, ks.e, ks.f, l2, cd2);
                break;
            }
        }
        if (string == null) {
            int[] arrn = new int[]{0, 0};
            dj2.a(l2, false, arrn);
            int n2 = arrn[0] + arrn[1];
            switch (ki2) {
                case a: 
                case b: 
                case d: 
                case f: {
                    string = this.a(n2);
                    break;
                }
                case c: 
                case e: 
                case g: {
                    string = this.b(n2);
                    break;
                }
                case h: {
                    string = this.a(n2, true, true, true);
                    break;
                }
                case i: {
                    string = this.a(n2, false, true, true);
                    break;
                }
                case j: {
                    string = this.a(n2, true, false, true);
                    break;
                }
                case k: {
                    string = this.a(n2, false, false, true);
                    break;
                }
                case l: {
                    string = this.a(n2, true, false, false);
                    break;
                }
                case m: {
                    string = this.a(n2, false, false, false);
                    break;
                }
                case n: {
                    string = this.b(n2, true, false, true);
                    break;
                }
                case o: {
                    string = this.b(n2, false, false, true);
                    break;
                }
                case p: {
                    string = this.b(n2, true, false, false);
                    break;
                }
                case q: {
                    string = this.b(n2, false, false, false);
                    break;
                }
                case r: {
                    string = dj2.l();
                    break;
                }
                case s: {
                    string = je.b(dj2);
                    if (string != null) break;
                    string = B;
                    break;
                }
                case t: {
                    string = this.a(dj2);
                }
            }
            if (cd2 != null) {
                Object object = cd2.a = arrn[1] != 0 ? kj.c : kj.b;
            }
        }
        assert (string != null);
        return string;
    }

    public final int a(String string, ParsePosition parsePosition) {
        return kc.b(string, parsePosition, false, null);
    }

    public int b(String string, ParsePosition parsePosition) {
        return this.a(string, parsePosition, false, null);
    }

    public int c(String string, ParsePosition parsePosition) {
        return this.a(string, parsePosition, true, null);
    }

    public dj a(ki ki2, String string, ParsePosition parsePosition, EnumSet enumSet, cd cd2) {
        boolean bl2;
        kr kr2;
        Object object;
        Object object2;
        Object object3;
        int n2;
        Object object4;
        if (cd2 == null) {
            cd2 = new cd((Object)kj.a);
        } else {
            cd2.a = kj.a;
        }
        int n3 = parsePosition.getIndex();
        int n4 = string.length();
        boolean bl3 = ki2 == ki.d || ki2 == ki.b || ki2 == ki.a;
        boolean bl4 = ki2 == ki.e || ki2 == ki.c;
        int n5 = 0;
        ParsePosition parsePosition2 = new ParsePosition(n3);
        int n6 = Integer.MAX_VALUE;
        int n7 = -1;
        if (bl3 || bl4) {
            object4 = new cd(false);
            n2 = this.a(string, parsePosition2, bl4, (cd)object4);
            if (parsePosition2.getErrorIndex() == -1) {
                if (parsePosition2.getIndex() == n4 || ((Boolean)((cd)object4).a).booleanValue()) {
                    parsePosition.setIndex(parsePosition2.getIndex());
                    return this.c(n2);
                }
                n6 = n2;
                n7 = parsePosition2.getIndex();
            }
            n5 |= ki.f.u | ki.g.u;
        }
        switch (ki2) {
            case f: {
                parsePosition2.setIndex(n3);
                parsePosition2.setErrorIndex(-1);
                n2 = this.b(string, parsePosition2);
                if (parsePosition2.getErrorIndex() == -1) {
                    parsePosition.setIndex(parsePosition2.getIndex());
                    return this.c(n2);
                }
                n5 |= ki.g.u;
                break;
            }
            case g: {
                parsePosition2.setIndex(n3);
                parsePosition2.setErrorIndex(-1);
                n2 = this.c(string, parsePosition2);
                if (parsePosition2.getErrorIndex() == -1) {
                    parsePosition.setIndex(parsePosition2.getIndex());
                    return this.c(n2);
                }
                n5 |= ki.f.u;
                break;
            }
            case h: 
            case j: 
            case l: 
            case n: 
            case p: {
                parsePosition2.setIndex(n3);
                parsePosition2.setErrorIndex(-1);
                n2 = this.a(string, parsePosition2);
                if (parsePosition2.getErrorIndex() != -1) break;
                parsePosition.setIndex(parsePosition2.getIndex());
                return this.c(n2);
            }
            case i: 
            case k: 
            case m: 
            case o: 
            case q: {
                parsePosition2.setIndex(n3);
                parsePosition2.setErrorIndex(-1);
                object4 = new cd(false);
                n2 = kc.b(string, parsePosition2, false, (cd)object4);
                if (parsePosition2.getErrorIndex() != -1 || !((Boolean)((cd)object4).a).booleanValue()) break;
                parsePosition.setIndex(parsePosition2.getIndex());
                return this.c(n2);
            }
            case d: 
            case e: {
                object4 = null;
                if (ki2 == ki.d) {
                    object4 = EnumSet.of(ks.b, ks.c);
                } else {
                    assert (ki2 == ki.e);
                    object4 = EnumSet.of(ks.e, ks.f);
                }
                object3 = this.f.a((CharSequence)string, n3, (EnumSet)object4);
                if (object3 == null) break;
                object2 = null;
                object = object3.iterator();
                while (object.hasNext()) {
                    kr2 = (kr)object.next();
                    if (n3 + kr2.d() <= n7) continue;
                    object2 = kr2;
                    n7 = n3 + kr2.d();
                }
                if (object2 == null) break;
                cd2.a = this.a(((kr)object2).c());
                parsePosition.setIndex(n7);
                return dj.b(this.a(((kr)object2).a(), ((kr)object2).b()));
            }
            case a: 
            case b: 
            case c: {
                object4 = null;
                switch (ki2) {
                    case a: {
                        object4 = EnumSet.of(fp.a);
                        break;
                    }
                    case b: {
                        object4 = EnumSet.of(fp.b, fp.a);
                        break;
                    }
                    case c: {
                        object4 = EnumSet.of(fp.c, fp.a);
                    }
                }
                object3 = this.k().a(string, n3, (EnumSet)object4);
                if (object3 == null || n3 + ((fn)object3).d() <= n7) break;
                cd2.a = ((fn)object3).c();
                parsePosition.setIndex(n3 + ((fn)object3).d());
                return dj.b(((fn)object3).b());
            }
            case r: {
                parsePosition2.setIndex(n3);
                parsePosition2.setErrorIndex(-1);
                object4 = kc.e(string, parsePosition2);
                if (parsePosition2.getErrorIndex() != -1) break;
                parsePosition.setIndex(parsePosition2.getIndex());
                return dj.b((String)object4);
            }
            case s: {
                parsePosition2.setIndex(n3);
                parsePosition2.setErrorIndex(-1);
                object4 = kc.f(string, parsePosition2);
                if (parsePosition2.getErrorIndex() != -1) break;
                parsePosition.setIndex(parsePosition2.getIndex());
                return dj.b((String)object4);
            }
            case t: {
                parsePosition2.setIndex(n3);
                parsePosition2.setErrorIndex(-1);
                object4 = this.g(string, parsePosition2);
                if (parsePosition2.getErrorIndex() != -1) break;
                parsePosition.setIndex(parsePosition2.getIndex());
                return dj.b((String)object4);
            }
        }
        n5 |= ki2.u;
        if (n7 > n3) {
            assert (n6 != Integer.MAX_VALUE);
            parsePosition.setIndex(n7);
            return this.c(n6);
        }
        object4 = null;
        object3 = kj.a;
        assert (n7 < 0);
        assert (n6 == Integer.MAX_VALUE);
        if (n7 < n4 && ((n5 & 0x80) == 0 || (n5 & 0x100) == 0)) {
            parsePosition2.setIndex(n3);
            parsePosition2.setErrorIndex(-1);
            object2 = new cd(false);
            n2 = kc.b(string, parsePosition2, false, (cd)object2);
            if (parsePosition2.getErrorIndex() == -1) {
                if (parsePosition2.getIndex() == n4 || ((Boolean)((cd)object2).a).booleanValue()) {
                    parsePosition.setIndex(parsePosition2.getIndex());
                    return this.c(n2);
                }
                if (n7 < parsePosition2.getIndex()) {
                    n6 = n2;
                    object4 = null;
                    object3 = kj.a;
                    n7 = parsePosition2.getIndex();
                    assert (n7 == n3 + 1);
                }
            }
        }
        if (n7 < n4 && (n5 & ki.f.u) == 0) {
            parsePosition2.setIndex(n3);
            parsePosition2.setErrorIndex(-1);
            object2 = new cd(false);
            n2 = this.a(string, parsePosition2, false, (cd)object2);
            if (parsePosition2.getErrorIndex() == -1) {
                if (parsePosition2.getIndex() == n4 || ((Boolean)((cd)object2).a).booleanValue()) {
                    parsePosition.setIndex(parsePosition2.getIndex());
                    return this.c(n2);
                }
                if (n7 < parsePosition2.getIndex()) {
                    n6 = n2;
                    object4 = null;
                    object3 = kj.a;
                    n7 = parsePosition2.getIndex();
                }
            }
        }
        if (n7 < n4 && (n5 & ki.g.u) == 0) {
            parsePosition2.setIndex(n3);
            parsePosition2.setErrorIndex(-1);
            object2 = new cd(false);
            n2 = this.a(string, parsePosition2, true, (cd)object2);
            if (parsePosition2.getErrorIndex() == -1) {
                if (parsePosition2.getIndex() == n4 || ((Boolean)((cd)object2).a).booleanValue()) {
                    parsePosition.setIndex(parsePosition2.getIndex());
                    return this.c(n2);
                }
                if (n7 < parsePosition2.getIndex()) {
                    n6 = n2;
                    object4 = null;
                    object3 = kj.a;
                    n7 = parsePosition2.getIndex();
                }
            }
        }
        boolean bl5 = bl2 = enumSet == null ? this.e().contains((Object)kh.a) : enumSet.contains((Object)kh.a);
        if (bl2) {
            if (n7 < n4) {
                object = this.f.a((CharSequence)string, n3, N);
                kr2 = null;
                int n8 = -1;
                if (object != null) {
                    Iterator iterator = object.iterator();
                    while (iterator.hasNext()) {
                        kr kr3 = (kr)iterator.next();
                        if (n3 + kr3.d() <= n8) continue;
                        kr2 = kr3;
                        n8 = n3 + kr3.d();
                    }
                }
                if (n7 < n8) {
                    n7 = n8;
                    object4 = this.a(kr2.a(), kr2.b());
                    object3 = this.a(kr2.c());
                    n6 = Integer.MAX_VALUE;
                }
            }
            if (n7 < n4 && (object = this.k().a(string, n3, O)) != null && n7 < n3 + ((fn)object).d()) {
                n7 = n3 + ((fn)object).d();
                object4 = ((fn)object).b();
                object3 = ((fn)object).c();
                n6 = Integer.MAX_VALUE;
            }
            if (n7 < n4 && (n5 & ki.r.u) == 0) {
                parsePosition2.setIndex(n3);
                parsePosition2.setErrorIndex(-1);
                object = kc.e(string, parsePosition2);
                if (parsePosition2.getErrorIndex() == -1 && n7 < parsePosition2.getIndex()) {
                    n7 = parsePosition2.getIndex();
                    object4 = object;
                    object3 = kj.a;
                    n6 = Integer.MAX_VALUE;
                }
            }
            if (n7 < n4 && (n5 & ki.s.u) == 0) {
                parsePosition2.setIndex(n3);
                parsePosition2.setErrorIndex(-1);
                object = kc.f(string, parsePosition2);
                if (parsePosition2.getErrorIndex() == -1 && n7 < parsePosition2.getIndex()) {
                    n7 = parsePosition2.getIndex();
                    object4 = object;
                    object3 = kj.a;
                    n6 = Integer.MAX_VALUE;
                }
            }
        }
        if (n7 > n3) {
            object = null;
            if (object4 != null) {
                object = dj.b((String)object4);
            } else {
                assert (n6 != Integer.MAX_VALUE);
                object = this.c(n6);
            }
            cd2.a = object3;
            parsePosition.setIndex(n7);
            return object;
        }
        parsePosition.setErrorIndex(n3);
        return null;
    }

    public dj a(ki ki2, String string, ParsePosition parsePosition, cd cd2) {
        return this.a(ki2, string, parsePosition, null, cd2);
    }

    public final dj d(String string, ParsePosition parsePosition) {
        return this.a(ki.a, string, parsePosition, EnumSet.of(kh.a), null);
    }

    public final dj d(String string) {
        ParsePosition parsePosition = new ParsePosition(0);
        dj dj2 = this.d(string, parsePosition);
        if (parsePosition.getErrorIndex() >= 0) {
            throw new ParseException("Unparseable time zone: \"" + string + "\"", 0);
        }
        assert (dj2 != null);
        return dj2;
    }

    public StringBuffer format(Object object, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        dj dj2 = null;
        long l2 = System.currentTimeMillis();
        if (object instanceof dj) {
            dj2 = (dj)object;
        } else if (object instanceof n) {
            dj2 = ((n)object).k();
            l2 = ((n)object).h();
        } else {
            throw new IllegalArgumentException("Cannot format given Object (" + object.getClass().getName() + ") as a time zone");
        }
        assert (dj2 != null);
        String string = this.a(dj2.c(l2));
        stringBuffer.append(string);
        if (fieldPosition.getFieldAttribute() == cv.p || fieldPosition.getField() == 17) {
            fieldPosition.setBeginIndex(0);
            fieldPosition.setEndIndex(string.length());
        }
        return stringBuffer;
    }

    public AttributedCharacterIterator formatToCharacterIterator(Object object) {
        StringBuffer stringBuffer = new StringBuffer();
        FieldPosition fieldPosition = new FieldPosition(0);
        stringBuffer = this.format(object, stringBuffer, fieldPosition);
        AttributedString attributedString = new AttributedString(stringBuffer.toString());
        attributedString.addAttribute(cv.p, cv.p);
        return attributedString.getIterator();
    }

    public Object parseObject(String string, ParsePosition parsePosition) {
        return this.d(string, parsePosition);
    }

    private String a(int n2, boolean bl2) {
        if (n2 == 0) {
            return this.j;
        }
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl3 = true;
        if (n2 < 0) {
            n2 = -n2;
            bl3 = false;
        }
        int n3 = n2 / 3600000;
        int n4 = (n2 %= 3600000) / 60000;
        int n5 = (n2 %= 60000) / 1000;
        if (n3 > 23 || n4 > 59 || n5 > 59) {
            throw new IllegalArgumentException("Offset out of range :" + n2);
        }
        Object[] arrobject = bl3 ? (n5 != 0 ? this.o[kf.b.ordinal()] : (n4 != 0 || !bl2 ? this.o[kf.a.ordinal()] : this.o[kf.e.ordinal()])) : (n5 != 0 ? this.o[kf.d.ordinal()] : (n4 != 0 || !bl2 ? this.o[kf.c.ordinal()] : this.o[kf.f.ordinal()]));
        stringBuilder.append(this.m);
        block5: for (Object object : arrobject) {
            if (object instanceof String) {
                stringBuilder.append((String)object);
                continue;
            }
            if (!(object instanceof ke)) continue;
            ke ke2 = (ke)object;
            switch (ke2.a()) {
                case 'H': {
                    this.a(stringBuilder, n3, bl2 ? 1 : 2);
                    continue block5;
                }
                case 'm': {
                    this.a(stringBuilder, n4, 2);
                    continue block5;
                }
                case 's': {
                    this.a(stringBuilder, n5, 2);
                }
            }
        }
        stringBuilder.append(this.n);
        return stringBuilder.toString();
    }

    private String a(int n2, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        int n3;
        int n4;
        Character c2;
        int n5;
        int n6 = n5 = n2 < 0 ? -n2 : n2;
        if (bl3 && (n5 < 1000 || bl5 && n5 < 60000)) {
            return z;
        }
        kg kg2 = bl4 ? kg.a : kg.b;
        kg kg3 = bl5 ? kg.b : kg.c;
        Character c3 = c2 = bl2 ? null : Character.valueOf(':');
        if (n5 >= 86400000) {
            throw new IllegalArgumentException("Offset out of range :" + n2);
        }
        int[] arrn = new int[]{n5 / 3600000, (n5 %= 3600000) / 60000, (n5 %= 60000) / 1000};
        assert (arrn[0] >= 0 && arrn[0] <= 23);
        assert (arrn[1] >= 0 && arrn[1] <= 59);
        assert (arrn[2] >= 0 && arrn[2] <= 59);
        for (n4 = kg3.ordinal(); n4 > kg2.ordinal() && arrn[n4] == 0; --n4) {
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n7 = 43;
        if (n2 < 0) {
            for (n3 = 0; n3 <= n4; ++n3) {
                if (arrn[n3] == 0) continue;
                n7 = 45;
                break;
            }
        }
        stringBuilder.append((char)n7);
        for (n3 = 0; n3 <= n4; ++n3) {
            if (c2 != null && n3 != 0) {
                stringBuilder.append(c2);
            }
            if (arrn[n3] < 10) {
                stringBuilder.append('0');
            }
            stringBuilder.append(arrn[n3]);
        }
        return stringBuilder.toString();
    }

    private String a(dj dj2, ks ks2, ks ks3, long l2, cd cd2) {
        String string;
        assert (ks2 == ks.b || ks2 == ks.e);
        assert (ks3 == ks.c || ks3 == ks.f);
        boolean bl2 = dj2.a(new Date(l2));
        String string2 = string = bl2 ? this.a().a(je.a(dj2), ks3, l2) : this.a().a(je.a(dj2), ks2, l2);
        if (string != null && cd2 != null) {
            cd2.a = bl2 ? kj.c : kj.b;
        }
        return string;
    }

    private String a(dj dj2) {
        String string = this.a().b(je.a(dj2));
        if (string == null && (string = this.a().b(A)) == null) {
            string = C;
        }
        return string;
    }

    private String a(String string, String string2) {
        String string3 = string;
        if (string3 == null) {
            assert (string2 != null);
            string3 = this.f.a(string2, this.l());
            if (string3 == null) {
                throw new IllegalArgumentException("Invalid mzID: " + string2);
            }
        }
        return string3;
    }

    private synchronized String l() {
        if (this.q == null) {
            this.q = this.e.h();
            if (this.q.length() == 0) {
                dn dn2 = dn.j(this.e);
                this.q = dn2.h();
                if (this.q.length() == 0) {
                    this.q = "001";
                }
            }
        }
        return this.q;
    }

    private kj a(ks ks2) {
        switch (ks2) {
            case b: 
            case e: {
                return kj.b;
            }
            case c: 
            case f: {
                return kj.c;
            }
        }
        return kj.a;
    }

    private void e(String string) {
        int n2 = string.indexOf("{0}");
        if (n2 < 0) {
            throw new IllegalArgumentException("Bad localized GMT pattern: " + string);
        }
        this.g = string;
        this.m = kc.f(string.substring(0, n2));
        this.n = kc.f(string.substring(n2 + 3));
    }

    private static String f(String string) {
        if (string.indexOf(39) < 0) {
            return string;
        }
        boolean bl2 = false;
        boolean bl3 = false;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == '\'') {
                if (bl2) {
                    stringBuilder.append(c2);
                    bl2 = false;
                } else {
                    bl2 = true;
                }
                bl3 = !bl3;
                continue;
            }
            bl2 = false;
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    private void a(String[] arrstring) {
        int n2 = kf.values().length;
        if (arrstring.length < n2) {
            throw new IllegalArgumentException("Insufficient number of elements in gmtOffsetPatterns");
        }
        Object[][] arrarrobject = new Object[n2][];
        for (kf kf2 : kf.values()) {
            int n3 = kf2.ordinal();
            Object[] arrobject = kc.b(arrstring[n3], kf.b(kf2));
            arrarrobject[n3] = arrobject;
        }
        this.h = new String[n2];
        System.arraycopy(arrstring, 0, this.h, 0, n2);
        this.o = arrarrobject;
        this.m();
    }

    private void m() {
        this.p = false;
        block0: for (Object[] arrobject : this.o) {
            boolean bl2 = false;
            for (Object object : arrobject) {
                if (object instanceof ke) {
                    ke ke2 = (ke)object;
                    if (bl2) {
                        this.p = true;
                        continue;
                    }
                    if (ke2.a() != 'H') continue;
                    bl2 = true;
                    continue;
                }
                if (bl2) continue block0;
            }
        }
    }

    private static Object[] b(String string, String string2) {
        boolean bl2 = false;
        boolean bl3 = false;
        StringBuilder stringBuilder = new StringBuilder();
        char c2 = '\u0000';
        int n2 = 1;
        boolean bl4 = false;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        BitSet bitSet = new BitSet(string2.length());
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c3 = string.charAt(i2);
            if (c3 == '\'') {
                if (bl2) {
                    stringBuilder.append('\'');
                    bl2 = false;
                } else {
                    bl2 = true;
                    if (c2 != '\u0000') {
                        if (!ke.a(c2, n2)) {
                            bl4 = true;
                            break;
                        }
                        arrayList.add(new ke(c2, n2));
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
            int n3 = string2.indexOf(c3);
            if (n3 >= 0) {
                if (c3 == c2) {
                    ++n2;
                    continue;
                }
                if (c2 == '\u0000') {
                    if (stringBuilder.length() > 0) {
                        arrayList.add(stringBuilder.toString());
                        stringBuilder.setLength(0);
                    }
                } else if (ke.a(c2, n2)) {
                    arrayList.add(new ke(c2, n2));
                } else {
                    bl4 = true;
                    break;
                }
                c2 = c3;
                n2 = 1;
                bitSet.set(n3);
                continue;
            }
            if (c2 != '\u0000') {
                if (!ke.a(c2, n2)) {
                    bl4 = true;
                    break;
                }
                arrayList.add(new ke(c2, n2));
                c2 = '\u0000';
            }
            stringBuilder.append(c3);
        }
        if (!bl4) {
            if (c2 == '\u0000') {
                if (stringBuilder.length() > 0) {
                    arrayList.add(stringBuilder.toString());
                    stringBuilder.setLength(0);
                }
            } else if (ke.a(c2, n2)) {
                arrayList.add(new ke(c2, n2));
            } else {
                bl4 = true;
            }
        }
        if (bl4 || bitSet.cardinality() != string2.length()) {
            throw new IllegalStateException("Bad localized GMT offset pattern: " + string);
        }
        return arrayList.toArray(new Object[arrayList.size()]);
    }

    private static String g(String string) {
        int n2 = string.indexOf("mm");
        if (n2 < 0) {
            throw new RuntimeException("Bad time zone hour pattern data");
        }
        String string2 = ":";
        int n3 = string.substring(0, n2).lastIndexOf("H");
        if (n3 >= 0) {
            string2 = string.substring(n3 + 1, n2);
        }
        return string.substring(0, n2 + 2) + string2 + "ss" + string.substring(n2 + 2);
    }

    private static String h(String string) {
        int n2 = string.indexOf("mm");
        if (n2 < 0) {
            throw new RuntimeException("Bad time zone hour pattern data");
        }
        int n3 = string.substring(0, n2).lastIndexOf("HH");
        if (n3 >= 0) {
            return string.substring(0, n3 + 2);
        }
        int n4 = string.substring(0, n2).lastIndexOf("H");
        if (n4 >= 0) {
            return string.substring(0, n4 + 1);
        }
        throw new RuntimeException("Bad time zone hour pattern data");
    }

    private void a(StringBuilder stringBuilder, int n2, int n3) {
        assert (n2 >= 0 && n2 < 60);
        int n4 = n2 >= 10 ? 2 : 1;
        for (int i2 = 0; i2 < n3 - n4; ++i2) {
            stringBuilder.append(this.i[0]);
        }
        if (n4 == 2) {
            stringBuilder.append(this.i[n2 / 10]);
        }
        stringBuilder.append(this.i[n2 % 10]);
    }

    private dj c(int n2) {
        if (n2 == 0) {
            return dj.b(s);
        }
        return je.a(n2);
    }

    private int a(String string, ParsePosition parsePosition, boolean bl2, cd cd2) {
        int n2 = parsePosition.getIndex();
        int n3 = 0;
        int[] arrn = new int[]{0};
        if (cd2 != null) {
            cd2.a = false;
        }
        n3 = this.a(string, n2, bl2, arrn);
        if (arrn[0] > 0) {
            if (cd2 != null) {
                cd2.a = true;
            }
            parsePosition.setIndex(n2 + arrn[0]);
            return n3;
        }
        n3 = this.a(string, n2, arrn);
        if (arrn[0] > 0) {
            if (cd2 != null) {
                cd2.a = true;
            }
            parsePosition.setIndex(n2 + arrn[0]);
            return n3;
        }
        if (string.regionMatches(true, n2, this.j, 0, this.j.length())) {
            parsePosition.setIndex(n2 + this.j.length());
            return 0;
        }
        for (String string2 : t) {
            if (!string.regionMatches(true, n2, string2, 0, string2.length())) continue;
            parsePosition.setIndex(n2 + string2.length());
            return 0;
        }
        parsePosition.setErrorIndex(n2);
        return 0;
    }

    private int a(String string, int n2, boolean bl2, int[] arrn) {
        int n3 = n2;
        int n4 = 0;
        boolean bl3 = false;
        int n5 = this.m.length();
        if (n5 <= 0 || string.regionMatches(true, n3, this.m, 0, n5)) {
            int[] arrn2 = new int[1];
            n4 = this.b(string, n3 += n5, false, arrn2);
            if (arrn2[0] != 0 && ((n5 = this.n.length()) <= 0 || string.regionMatches(true, n3 += arrn2[0], this.n, 0, n5))) {
                n3 += n5;
                bl3 = true;
            }
        }
        arrn[0] = bl3 ? n3 - n2 : 0;
        return n4;
    }

    private int b(String string, int n2, boolean bl2, int[] arrn) {
        int n3 = 0;
        int n4 = 0;
        int n5 = 1;
        if (arrn != null && arrn.length >= 1) {
            arrn[0] = 0;
        }
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int[] arrn2 = new int[]{0, 0, 0};
        for (kf kf2 : D) {
            Object[] arrobject = this.o[kf2.ordinal()];
            assert (arrobject != null);
            n3 = this.a(string, n2, arrobject, false, arrn2);
            if (n3 <= 0) continue;
            n5 = kf.c(kf2) ? 1 : -1;
            n8 = arrn2[0];
            n7 = arrn2[1];
            n6 = arrn2[2];
            break;
        }
        if (n3 > 0 && this.p) {
            int n9 = 0;
            int n10 = 1;
            for (kf kf3 : D) {
                Object[] arrobject = this.o[kf3.ordinal()];
                assert (arrobject != null);
                n9 = this.a(string, n2, arrobject, true, arrn2);
                if (n9 <= 0) continue;
                n10 = kf.c(kf3) ? 1 : -1;
                break;
            }
            if (n9 > n3) {
                n3 = n9;
                n5 = n10;
                n8 = arrn2[0];
                n7 = arrn2[1];
                n6 = arrn2[2];
            }
        }
        if (arrn != null && arrn.length >= 1) {
            arrn[0] = n3;
        }
        if (n3 > 0) {
            n4 = ((n8 * 60 + n7) * 60 + n6) * 1000 * n5;
        }
        return n4;
    }

    private int a(String string, int n2, Object[] arrobject, boolean bl2, int[] arrn) {
        assert (arrn != null && arrn.length >= 3);
        arrn[2] = 0;
        arrn[1] = 0;
        arrn[0] = 0;
        boolean bl3 = false;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = n2;
        int[] arrn2 = new int[]{0};
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            int n7;
            Object object;
            if (arrobject[i2] instanceof String) {
                object = (String)arrobject[i2];
                n7 = ((String)object).length();
                if (!string.regionMatches(true, n6, (String)object, 0, n7)) {
                    bl3 = true;
                    break;
                }
                n6 += n7;
                continue;
            }
            assert (arrobject[i2] instanceof ke);
            object = (ke)arrobject[i2];
            n7 = ((ke)object).a();
            if (n7 == 72) {
                int n8 = bl2 ? 1 : 2;
                n5 = this.a(string, n6, 1, n8, 0, 23, arrn2);
            } else if (n7 == 109) {
                n4 = this.a(string, n6, 2, 2, 0, 59, arrn2);
            } else if (n7 == 115) {
                n3 = this.a(string, n6, 2, 2, 0, 59, arrn2);
            }
            if (arrn2[0] == 0) {
                bl3 = true;
                break;
            }
            n6 += arrn2[0];
        }
        if (bl3) {
            return 0;
        }
        arrn[0] = n5;
        arrn[1] = n4;
        arrn[2] = n3;
        return n6 - n2;
    }

    private int a(String string, int n2, int[] arrn) {
        int n3;
        int n4;
        block8: {
            int n5;
            int n6;
            block10: {
                int n7;
                block9: {
                    n6 = n2;
                    n4 = 0;
                    n3 = 0;
                    int n8 = 0;
                    for (String string2 : t) {
                        int n9 = string2.length();
                        if (!string.regionMatches(true, n6, string2, 0, n9)) continue;
                        n8 = n9;
                        break;
                    }
                    if (n8 == 0 || (n6 += n8) + 1 >= string.length()) break block8;
                    n5 = 1;
                    n7 = string.charAt(n6);
                    if (n7 != 43) break block9;
                    n5 = 1;
                    break block10;
                }
                if (n7 != 45) break block8;
                n5 = -1;
            }
            int[] arrn2 = new int[]{0};
            int n10 = this.a(string, ++n6, ':', arrn2);
            if (arrn2[0] == string.length() - n6) {
                n4 = n10 * n5;
                n6 += arrn2[0];
            } else {
                int[] arrn3 = new int[]{0};
                int n11 = this.b(string, n6, arrn3);
                if (arrn2[0] > arrn3[0]) {
                    n4 = n10 * n5;
                    n6 += arrn2[0];
                } else {
                    n4 = n11 * n5;
                    n6 += arrn3[0];
                }
            }
            n3 = n6 - n2;
        }
        arrn[0] = n3;
        return n4;
    }

    private int a(String string, int n2, char c2, int[] arrn) {
        int n3 = string.length();
        int n4 = n2;
        int[] arrn2 = new int[]{0};
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        n5 = this.a(string, n4, 1, 2, 0, 23, arrn2);
        if (arrn2[0] != 0 && (n4 += arrn2[0]) + 1 < n3 && string.charAt(n4) == c2) {
            n6 = this.a(string, n4 + 1, 2, 2, 0, 59, arrn2);
            if (arrn2[0] != 0 && (n4 += 1 + arrn2[0]) + 1 < n3 && string.charAt(n4) == c2) {
                n7 = this.a(string, n4 + 1, 2, 2, 0, 59, arrn2);
                if (arrn2[0] != 0) {
                    n4 += 1 + arrn2[0];
                }
            }
        }
        if (n4 == n2) {
            arrn[0] = 0;
            return 0;
        }
        arrn[0] = n4 - n2;
        return n5 * 3600000 + n6 * 60000 + n7 * 1000;
    }

    private int b(String string, int n2, int[] arrn) {
        int n3;
        int n4 = 6;
        int[] arrn2 = new int[6];
        int[] arrn3 = new int[6];
        int n5 = n2;
        int[] arrn4 = new int[]{0};
        int n6 = 0;
        for (n3 = 0; n3 < 6; ++n3) {
            arrn2[n3] = this.c(string, n5, arrn4);
            if (arrn2[n3] < 0) break;
            arrn3[n3] = (n5 += arrn4[0]) - n2;
            ++n6;
        }
        if (n6 == 0) {
            arrn[0] = 0;
            return 0;
        }
        n3 = 0;
        while (n6 > 0) {
            int n7 = 0;
            int n8 = 0;
            int n9 = 0;
            assert (n6 > 0 && n6 <= 6);
            switch (n6) {
                case 1: {
                    n7 = arrn2[0];
                    break;
                }
                case 2: {
                    n7 = arrn2[0] * 10 + arrn2[1];
                    break;
                }
                case 3: {
                    n7 = arrn2[0];
                    n8 = arrn2[1] * 10 + arrn2[2];
                    break;
                }
                case 4: {
                    n7 = arrn2[0] * 10 + arrn2[1];
                    n8 = arrn2[2] * 10 + arrn2[3];
                    break;
                }
                case 5: {
                    n7 = arrn2[0];
                    n8 = arrn2[1] * 10 + arrn2[2];
                    n9 = arrn2[3] * 10 + arrn2[4];
                    break;
                }
                case 6: {
                    n7 = arrn2[0] * 10 + arrn2[1];
                    n8 = arrn2[2] * 10 + arrn2[3];
                    n9 = arrn2[4] * 10 + arrn2[5];
                }
            }
            if (n7 <= 23 && n8 <= 59 && n9 <= 59) {
                n3 = n7 * 3600000 + n8 * 60000 + n9 * 1000;
                arrn[0] = arrn3[n6 - 1];
                break;
            }
            --n6;
        }
        return n3;
    }

    private int a(String string, int n2, int n3, int n4, int n5, int n6, int[] arrn) {
        int n7;
        int n8;
        int n9;
        arrn[0] = 0;
        int n10 = 0;
        int n11 = 0;
        int[] arrn2 = new int[]{0};
        for (n9 = n2; n9 < string.length() && n11 < n4 && (n8 = this.c(string, n9, arrn2)) >= 0 && (n7 = n10 * 10 + n8) <= n6; ++n11, n9 += arrn2[0]) {
            n10 = n7;
        }
        if (n11 < n3 || n10 < n5) {
            n10 = -1;
            n11 = 0;
        } else {
            arrn[0] = n9 - n2;
        }
        return n10;
    }

    private int c(String string, int n2, int[] arrn) {
        int n3 = -1;
        arrn[0] = 0;
        if (n2 < string.length()) {
            int n4 = Character.codePointAt(string, n2);
            for (int i2 = 0; i2 < this.i.length; ++i2) {
                if (n4 != this.i[i2].codePointAt(0)) continue;
                n3 = i2;
                break;
            }
            if (n3 < 0) {
                n3 = com.ibm.icu.b.b.a(n4);
            }
            if (n3 >= 0) {
                arrn[0] = Character.charCount(n4);
            }
        }
        return n3;
    }

    private static String[] i(String string) {
        int n2 = string.codePointCount(0, string.length());
        String[] arrstring = new String[n2];
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4 = string.codePointAt(n3);
            int n5 = Character.charCount(n4);
            arrstring[i2] = string.substring(n3, n3 + n5);
            n3 += n5;
        }
        return arrstring;
    }

    private static int b(String string, ParsePosition parsePosition, boolean bl2, cd cd2) {
        int n2;
        int n3;
        if (cd2 != null) {
            cd2.a = false;
        }
        if ((n3 = parsePosition.getIndex()) >= string.length()) {
            parsePosition.setErrorIndex(n3);
            return 0;
        }
        char c2 = string.charAt(n3);
        if (Character.toUpperCase(c2) == z.charAt(0)) {
            parsePosition.setIndex(n3 + 1);
            return 0;
        }
        if (c2 == '+') {
            n2 = 1;
        } else if (c2 == '-') {
            n2 = -1;
        } else {
            parsePosition.setErrorIndex(n3);
            return 0;
        }
        ParsePosition parsePosition2 = new ParsePosition(n3 + 1);
        int n4 = kc.a(string, parsePosition2, ':', kg.a, kg.c);
        if (parsePosition2.getErrorIndex() == -1 && !bl2 && parsePosition2.getIndex() - n3 <= 3) {
            ParsePosition parsePosition3 = new ParsePosition(n3 + 1);
            int n5 = kc.a(string, parsePosition3, kg.a, kg.c, false);
            if (parsePosition3.getErrorIndex() == -1 && parsePosition3.getIndex() > parsePosition2.getIndex()) {
                n4 = n5;
                parsePosition2.setIndex(parsePosition3.getIndex());
            }
        }
        if (parsePosition2.getErrorIndex() != -1) {
            parsePosition.setErrorIndex(n3);
            return 0;
        }
        parsePosition.setIndex(parsePosition2.getIndex());
        if (cd2 != null) {
            cd2.a = true;
        }
        return n2 * n4;
    }

    private static int a(String string, ParsePosition parsePosition, kg kg2, kg kg3, boolean bl2) {
        int n2;
        int n3 = parsePosition.getIndex();
        int n4 = 2 * (kg2.ordinal() + 1) - (bl2 ? 0 : 1);
        int n5 = 2 * (kg3.ordinal() + 1);
        int[] arrn = new int[n5];
        int n6 = 0;
        for (int i2 = n3; n6 < arrn.length && i2 < string.length() && (n2 = y.indexOf(string.charAt(i2))) >= 0; ++n6, ++i2) {
            arrn[n6] = n2;
        }
        if (bl2 && (n6 & 1) != 0) {
            --n6;
        }
        if (n6 < n4) {
            parsePosition.setErrorIndex(n3);
            return 0;
        }
        n2 = 0;
        int n7 = 0;
        int n8 = 0;
        boolean bl3 = false;
        while (n6 >= n4) {
            switch (n6) {
                case 1: {
                    n2 = arrn[0];
                    break;
                }
                case 2: {
                    n2 = arrn[0] * 10 + arrn[1];
                    break;
                }
                case 3: {
                    n2 = arrn[0];
                    n7 = arrn[1] * 10 + arrn[2];
                    break;
                }
                case 4: {
                    n2 = arrn[0] * 10 + arrn[1];
                    n7 = arrn[2] * 10 + arrn[3];
                    break;
                }
                case 5: {
                    n2 = arrn[0];
                    n7 = arrn[1] * 10 + arrn[2];
                    n8 = arrn[3] * 10 + arrn[4];
                    break;
                }
                case 6: {
                    n2 = arrn[0] * 10 + arrn[1];
                    n7 = arrn[2] * 10 + arrn[3];
                    n8 = arrn[4] * 10 + arrn[5];
                }
            }
            if (n2 <= 23 && n7 <= 59 && n8 <= 59) {
                bl3 = true;
                break;
            }
            n6 -= bl2 ? 2 : 1;
            n8 = 0;
            n7 = 0;
            n2 = 0;
        }
        if (!bl3) {
            parsePosition.setErrorIndex(n3);
            return 0;
        }
        parsePosition.setIndex(n3 + n6);
        return ((n2 * 60 + n7) * 60 + n8) * 1000;
    }

    private static int a(String string, ParsePosition parsePosition, char c2, kg kg2, kg kg3) {
        int n2;
        int n3 = parsePosition.getIndex();
        int[] arrn = new int[]{0, 0, 0};
        int[] arrn2 = new int[]{0, -1, -1};
        int n4 = 0;
        for (n2 = n3; n2 < string.length() && n4 <= kg3.ordinal(); ++n2) {
            int n5;
            char c3 = string.charAt(n2);
            if (c3 == c2) {
                if (n4 == 0) {
                    if (arrn2[0] == 0) break;
                    ++n4;
                    continue;
                }
                if (arrn2[n4] != -1) break;
                arrn2[n4] = 0;
                continue;
            }
            if (arrn2[n4] == -1 || (n5 = y.indexOf(c3)) < 0) break;
            arrn[n4] = arrn[n4] * 10 + n5;
            int n6 = n4;
            arrn2[n6] = arrn2[n6] + 1;
            if (arrn2[n4] < 2) continue;
            ++n4;
        }
        n2 = 0;
        n4 = 0;
        Enum enum_ = null;
        if (arrn2[0] != 0) {
            if (arrn[0] > 23) {
                n2 = arrn[0] / 10 * 3600000;
                enum_ = kg.a;
                n4 = 1;
            } else {
                n2 = arrn[0] * 3600000;
                n4 = arrn2[0];
                enum_ = kg.a;
                if (arrn2[1] == 2 && arrn[1] <= 59) {
                    n2 += arrn[1] * 60000;
                    n4 += 1 + arrn2[1];
                    enum_ = kg.b;
                    if (arrn2[2] == 2 && arrn[2] <= 59) {
                        n2 += arrn[2] * 1000;
                        n4 += 1 + arrn2[2];
                        enum_ = kg.c;
                    }
                }
            }
        }
        if (enum_ == null || enum_.ordinal() < kg2.ordinal()) {
            parsePosition.setErrorIndex(n3);
            return 0;
        }
        parsePosition.setIndex(n3 + n4);
        return n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static String e(String string, ParsePosition parsePosition) {
        Object object;
        Object object2;
        String string2 = null;
        if (P == null) {
            object2 = kc.class;
            // MONITORENTER : com.ibm.icu.d.kc.class
            if (P == null) {
                String[] arrstring;
                object = new fd(true);
                for (String string3 : arrstring = dj.o()) {
                    ((fd)object).a((CharSequence)string3, string3);
                }
                P = object;
            }
            // MONITOREXIT : object2
        }
        object2 = new int[]{0};
        object = P.a((CharSequence)string, parsePosition.getIndex(), (int[])object2);
        if (object != null) {
            string2 = (String)object.next();
            parsePosition.setIndex(parsePosition.getIndex() + object2[0]);
            return string2;
        }
        parsePosition.setErrorIndex(parsePosition.getIndex());
        return string2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static String f(String string, ParsePosition parsePosition) {
        Object object;
        Object object2;
        String string2 = null;
        if (Q == null) {
            object2 = kc.class;
            // MONITORENTER : com.ibm.icu.d.kc.class
            if (Q == null) {
                object = new fd(true);
                Set set = dj.a(dk.b, null, null);
                for (String string3 : set) {
                    String string4 = je.h(string3);
                    if (string4 == null) continue;
                    ((fd)object).a((CharSequence)string4, string3);
                }
                ((fd)object).a((CharSequence)B, A);
                Q = object;
            }
            // MONITOREXIT : object2
        }
        object2 = new int[]{0};
        object = Q.a((CharSequence)string, parsePosition.getIndex(), (int[])object2);
        if (object != null) {
            string2 = (String)object.next();
            parsePosition.setIndex(parsePosition.getIndex() + object2[0]);
            return string2;
        }
        parsePosition.setErrorIndex(parsePosition.getIndex());
        return string2;
    }

    private String g(String string, ParsePosition parsePosition) {
        int n2 = parsePosition.getIndex();
        int n3 = -1;
        String string2 = null;
        EnumSet<ks> enumSet = EnumSet.of(ks.g);
        Collection collection = this.f.a((CharSequence)string, n2, enumSet);
        if (collection != null) {
            kr kr2 = null;
            for (kr kr3 : collection) {
                if (n2 + kr3.d() <= n3) continue;
                kr2 = kr3;
                n3 = n2 + kr3.d();
            }
            if (kr2 != null) {
                string2 = this.a(kr2.a(), kr2.b());
                parsePosition.setIndex(n3);
            }
        }
        if (string2 == null) {
            parsePosition.setErrorIndex(n2);
        }
        return string2;
    }

    private void a(ObjectOutputStream objectOutputStream) {
        ObjectOutputStream.PutField putField = objectOutputStream.putFields();
        putField.put("_locale", this.e);
        putField.put("_tznames", this.f);
        putField.put("_gmtPattern", this.g);
        putField.put("_gmtOffsetPatterns", this.h);
        putField.put("_gmtOffsetDigits", this.i);
        putField.put("_gmtZeroFormat", this.j);
        putField.put("_parseAllStyles", this.k);
        objectOutputStream.writeFields();
    }

    private void a(ObjectInputStream objectInputStream) {
        ObjectInputStream.GetField getField = objectInputStream.readFields();
        this.e = (dn)getField.get("_locale", null);
        if (this.e == null) {
            throw new InvalidObjectException("Missing field: locale");
        }
        this.f = (kl)getField.get("_tznames", null);
        if (this.f == null) {
            throw new InvalidObjectException("Missing field: tznames");
        }
        this.g = (String)getField.get("_gmtPattern", null);
        if (this.g == null) {
            throw new InvalidObjectException("Missing field: gmtPattern");
        }
        String[] arrstring = (String[])getField.get("_gmtOffsetPatterns", null);
        if (arrstring == null) {
            throw new InvalidObjectException("Missing field: gmtOffsetPatterns");
        }
        if (arrstring.length < 4) {
            throw new InvalidObjectException("Incompatible field: gmtOffsetPatterns");
        }
        this.h = new String[6];
        if (arrstring.length == 4) {
            for (int i2 = 0; i2 < 4; ++i2) {
                this.h[i2] = arrstring[i2];
            }
            this.h[kf.e.ordinal()] = kc.h(this.h[kf.a.ordinal()]);
            this.h[kf.f.ordinal()] = kc.h(this.h[kf.c.ordinal()]);
        } else {
            this.h = arrstring;
        }
        this.i = (String[])getField.get("_gmtOffsetDigits", null);
        if (this.i == null) {
            throw new InvalidObjectException("Missing field: gmtOffsetDigits");
        }
        if (this.i.length != 10) {
            throw new InvalidObjectException("Incompatible field: gmtOffsetDigits");
        }
        this.j = (String)getField.get("_gmtZeroFormat", null);
        if (this.j == null) {
            throw new InvalidObjectException("Missing field: gmtZeroFormat");
        }
        this.k = getField.get("_parseAllStyles", false);
        if (getField.defaulted("_parseAllStyles")) {
            throw new InvalidObjectException("Missing field: parseAllStyles");
        }
        if (this.f instanceof ft) {
            this.f = kl.a(this.e);
            this.l = null;
        } else {
            this.l = new fk(this.e, this.f);
        }
        this.e(this.g);
        this.a(this.h);
    }

    public boolean f() {
        return this.r;
    }

    public kc g() {
        this.r = true;
        return this;
    }

    public kc h() {
        kc kc2 = (kc)super.clone();
        kc2.r = false;
        return kc2;
    }

    public /* synthetic */ Object i() {
        return this.h();
    }

    public /* synthetic */ Object j() {
        return this.g();
    }

    static {
        R = new ObjectStreamField[]{new ObjectStreamField("_locale", dn.class), new ObjectStreamField("_tznames", kl.class), new ObjectStreamField("_gmtPattern", String.class), new ObjectStreamField("_gmtOffsetPatterns", String[].class), new ObjectStreamField("_gmtOffsetDigits", String[].class), new ObjectStreamField("_gmtZeroFormat", String.class), new ObjectStreamField("_parseAllStyles", Boolean.TYPE)};
    }
}

