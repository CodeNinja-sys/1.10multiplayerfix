/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.ar;
import com.ibm.icu.a.bc;
import com.ibm.icu.a.eb;
import com.ibm.icu.c.a;
import com.ibm.icu.d.dm;
import com.ibm.icu.d.dp;
import com.ibm.icu.d.fm;
import com.ibm.icu.d.gq;
import com.ibm.icu.d.in;
import com.ibm.icu.d.io;
import com.ibm.icu.d.ip;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.dv;
import com.ibm.icu.util.dy;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;

public class iu
extends gq {
    static final long a = -7664252765575395068L;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    private transient fm[] f = null;
    private transient String[] g = null;
    private transient fm h = null;
    private dn i = null;
    private transient ip j = null;
    private transient boolean k;
    private transient dp l = null;
    private transient dm m = null;
    private boolean n = false;
    private transient String o;
    private transient String p;
    private transient in q;
    private Map r;
    private String[] s;
    private static final boolean t = ar.b("rbnf");
    private static final String[] u = new String[]{"SpelloutRules", "OrdinalRules", "DurationRules", "NumberingSystemRules"};
    private static final String[] v = new String[]{"SpelloutLocalizations", "OrdinalLocalizations", "DurationLocalizations", "NumberingSystemLocalizations"};

    public iu(String string) {
        this.i = dn.a(dr.b);
        this.a(string, (String[][])null);
    }

    public iu(String string, String[][] arrstring) {
        this.i = dn.a(dr.b);
        this.a(string, arrstring);
    }

    public iu(String string, Locale locale) {
        this(string, dn.a(locale));
    }

    public iu(String string, dn dn2) {
        this.i = dn2;
        this.a(string, (String[][])null);
    }

    public iu(String string, String[][] arrstring, dn dn2) {
        this.i = dn2;
        this.a(string, arrstring);
    }

    public iu(Locale locale, int n2) {
        this(dn.a(locale), n2);
    }

    public iu(dn dn2, int n2) {
        this.i = dn2;
        bc bc2 = (bc)dv.a("com/ibm/icu/impl/data/icudt51b/rbnf", dn2);
        dn dn3 = bc2.i();
        this.a(dn3, dn3);
        String string = "";
        String[][] arrstring = null;
        try {
            string = bc2.getString(u[n2 - 1]);
        }
        catch (MissingResourceException missingResourceException) {
            try {
                bc bc3 = bc2.b("RBNFRules/" + u[n2 - 1]);
                dy dy2 = bc3.D();
                while (dy2.d()) {
                    string = string.concat(dy2.b());
                }
            }
            catch (MissingResourceException missingResourceException2) {
                // empty catch block
            }
        }
        try {
            dv dv2 = bc2.l(v[n2 - 1]);
            arrstring = new String[dv2.w()][];
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                arrstring[i2] = dv2.k(i2).u();
            }
        }
        catch (MissingResourceException missingResourceException) {
            // empty catch block
        }
        this.a(string, arrstring);
    }

    public iu(int n2) {
        this(dn.a(dr.b), n2);
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object object) {
        if (!(object instanceof iu)) {
            return false;
        }
        iu iu2 = (iu)object;
        if (!this.i.equals(iu2.i) || this.n != iu2.n) {
            return false;
        }
        if (this.f.length != iu2.f.length) {
            return false;
        }
        for (int i2 = 0; i2 < this.f.length; ++i2) {
            if (this.f[i2].equals(iu2.f[i2])) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < this.f.length; ++i2) {
            stringBuilder.append(this.f[i2].toString());
        }
        return stringBuilder.toString();
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeUTF(this.toString());
        objectOutputStream.writeObject(this.i);
    }

    private void a(ObjectInputStream objectInputStream) {
        dn dn2;
        String string = objectInputStream.readUTF();
        try {
            dn2 = (dn)objectInputStream.readObject();
        }
        catch (Exception exception) {
            dn2 = dn.a(dr.b);
        }
        iu iu2 = new iu(string, dn2);
        this.f = iu2.f;
        this.h = iu2.h;
        this.s = iu2.s;
        this.l = iu2.l;
        this.m = iu2.m;
        this.i = iu2.i;
    }

    public String[] c() {
        return (String[])this.s.clone();
    }

    public dn[] d() {
        if (this.r != null) {
            Set set = this.r.keySet();
            String[] arrstring = set.toArray(new String[set.size()]);
            Arrays.sort(arrstring, String.CASE_INSENSITIVE_ORDER);
            dn[] arrdn = new dn[arrstring.length];
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                arrdn[i2] = new dn(arrstring[i2]);
            }
            return arrdn;
        }
        return null;
    }

    private String[] h(dn dn2) {
        if (dn2 != null && this.r != null) {
            String[] arrstring = new String[]{dn2.k(), dn.a(dr.a).k()};
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                String string = arrstring[i2];
                while (string.length() > 0) {
                    String[] arrstring2 = (String[])this.r.get(string);
                    if (arrstring2 != null) {
                        return arrstring2;
                    }
                    string = dn.f(string);
                }
            }
        }
        return null;
    }

    public String[] g(dn dn2) {
        String[] arrstring = this.h(dn2);
        if (arrstring != null) {
            return (String[])arrstring.clone();
        }
        arrstring = this.c();
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            arrstring[i2] = arrstring[i2].substring(1);
        }
        return arrstring;
    }

    public String[] e() {
        return this.g(dn.a(dr.a));
    }

    public String a(String string, dn dn2) {
        String[] arrstring = this.s;
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            if (!arrstring[i2].equals(string)) continue;
            String[] arrstring2 = this.h(dn2);
            if (arrstring2 != null) {
                return arrstring2[i2];
            }
            return arrstring[i2].substring(1);
        }
        throw new IllegalArgumentException("unrecognized rule set name: " + string);
    }

    public String a(String string) {
        return this.a(string, dn.a(dr.a));
    }

    public String a(double d2, String string) {
        if (string.startsWith("%%")) {
            throw new IllegalArgumentException("Can't use internal rule set");
        }
        return this.a(d2, this.c(string));
    }

    public String a(long l2, String string) {
        if (string.startsWith("%%")) {
            throw new IllegalArgumentException("Can't use internal rule set");
        }
        return this.a(l2, this.c(string));
    }

    public StringBuffer a(double d2, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.a(d2, this.h));
        return stringBuffer;
    }

    public StringBuffer a(long l2, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.a(l2, this.h));
        return stringBuffer;
    }

    public StringBuffer a(BigInteger bigInteger, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return this.a(new a(bigInteger), stringBuffer, fieldPosition);
    }

    public StringBuffer a(BigDecimal bigDecimal, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return this.a(new a(bigDecimal), stringBuffer, fieldPosition);
    }

    public StringBuffer a(a a2, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return this.a(a2.doubleValue(), stringBuffer, fieldPosition);
    }

    public Number a(String string, ParsePosition parsePosition) {
        String string2 = string.substring(parsePosition.getIndex());
        ParsePosition parsePosition2 = new ParsePosition(0);
        Number number = null;
        Number number2 = 0L;
        ParsePosition parsePosition3 = new ParsePosition(parsePosition2.getIndex());
        for (int i2 = this.f.length - 1; i2 >= 0; --i2) {
            if (!this.f[i2].d() || !this.f[i2].e()) continue;
            number = this.f[i2].a(string2, parsePosition2, Double.MAX_VALUE);
            if (parsePosition2.getIndex() > parsePosition3.getIndex()) {
                number2 = number;
                parsePosition3.setIndex(parsePosition2.getIndex());
            }
            if (parsePosition3.getIndex() == string2.length()) break;
            parsePosition2.setIndex(0);
        }
        parsePosition.setIndex(parsePosition.getIndex() + parsePosition3.getIndex());
        return number2;
    }

    public void a(boolean bl2) {
        this.n = bl2;
    }

    public boolean f() {
        return this.n;
    }

    public void a(ip ip2) {
        this.j = ip2;
    }

    public ip g() {
        if (this.j == null && this.n && !this.k) {
            try {
                this.k = true;
                Class<?> class_ = Class.forName("com.ibm.icu.text.RbnfScannerProviderImpl");
                ip ip2 = (ip)class_.newInstance();
                this.a(ip2);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return this.j;
    }

    public void b(String string) {
        if (string == null) {
            if (this.s.length > 0) {
                this.h = this.c(this.s[0]);
            } else {
                this.h = null;
                int n2 = this.f.length;
                while (--n2 >= 0) {
                    String string2 = this.f[n2].c();
                    if (!string2.equals("%spellout-numbering") && !string2.equals("%digits-ordinal") && !string2.equals("%duration")) continue;
                    this.h = this.f[n2];
                    return;
                }
                n2 = this.f.length;
                while (--n2 >= 0) {
                    if (!this.f[n2].d()) continue;
                    this.h = this.f[n2];
                    break;
                }
            }
        } else {
            if (string.startsWith("%%")) {
                throw new IllegalArgumentException("cannot use private rule set: " + string);
            }
            this.h = this.c(string);
        }
    }

    public String h() {
        if (this.h != null && this.h.d()) {
            return this.h.c();
        }
        return "";
    }

    public void a(dp dp2) {
        if (dp2 != null) {
            this.l = (dp)dp2.clone();
            if (this.m != null) {
                this.m.a(this.l);
            }
            for (int i2 = 0; i2 < this.f.length; ++i2) {
                this.f[i2].a(this.g[i2], this);
            }
        }
    }

    fm i() {
        return this.h;
    }

    io k() {
        ip ip2;
        if (this.n && (ip2 = this.g()) != null) {
            return ip2.a(this.i, this.o);
        }
        return null;
    }

    dp l() {
        if (this.l == null) {
            this.l = new dp(this.i);
        }
        return this.l;
    }

    dm m() {
        if (this.m == null) {
            this.m = (dm)gq.a(this.i);
            if (this.l != null) {
                this.m.a(this.l);
            }
        }
        return this.m;
    }

    private String a(StringBuilder stringBuilder, String string) {
        String string2 = null;
        int n2 = stringBuilder.indexOf(string);
        if (n2 != -1 && (n2 == 0 || stringBuilder.charAt(n2 - 1) == ';')) {
            int n3;
            int n4 = stringBuilder.indexOf(";%", n2);
            if (n4 == -1) {
                n4 = stringBuilder.length() - 1;
            }
            for (n3 = n2 + string.length(); n3 < n4 && eb.c(stringBuilder.charAt(n3)); ++n3) {
            }
            string2 = stringBuilder.substring(n3, n4);
            stringBuilder.delete(n2, n4 + 1);
        }
        return string2;
    }

    private void a(String string, String[][] arrstring) {
        int n2;
        int n3;
        int n4;
        this.a(arrstring);
        StringBuilder stringBuilder = this.d(string);
        this.o = this.a(stringBuilder, "%%lenient-parse:");
        this.p = this.a(stringBuilder, "%%post-process:");
        int n5 = 0;
        for (n4 = stringBuilder.indexOf(";%"); n4 != -1; ++n4) {
            ++n5;
            n4 = stringBuilder.indexOf(";%", n4);
        }
        this.f = new fm[++n5];
        this.g = new String[n5];
        n4 = 0;
        int n6 = 0;
        int n7 = stringBuilder.indexOf(";%");
        while (n7 != -1) {
            this.g[n4] = stringBuilder.substring(n6, n7 + 1);
            this.f[n4] = new fm(this.g, n4);
            ++n4;
            n6 = n7 + 1;
            n7 = stringBuilder.indexOf(";%", n6);
        }
        this.g[n4] = stringBuilder.substring(n6);
        this.f[n4] = new fm(this.g, n4);
        n7 = 0;
        int n8 = this.f.length;
        this.h = this.f[this.f.length - 1];
        while (--n8 >= 0) {
            String string2 = this.f[n8].c();
            if (!string2.equals("%spellout-numbering") && !string2.equals("%digits-ordinal") && !string2.equals("%duration")) continue;
            this.h = this.f[n8];
            n7 = 1;
            break;
        }
        if (n7 == 0) {
            for (int i2 = this.f.length - 1; i2 >= 0; --i2) {
                if (this.f[i2].c().startsWith("%%")) continue;
                this.h = this.f[i2];
                break;
            }
        }
        for (n3 = 0; n3 < this.f.length; ++n3) {
            this.f[n3].a(this.g[n3], this);
        }
        n3 = 0;
        for (int i3 = 0; i3 < this.f.length; ++i3) {
            if (this.f[i3].c().startsWith("%%")) continue;
            ++n3;
        }
        String[] arrstring2 = new String[n3];
        n3 = 0;
        for (n2 = this.f.length - 1; n2 >= 0; --n2) {
            if (this.f[n2].c().startsWith("%%")) continue;
            arrstring2[n3++] = this.f[n2].c();
        }
        if (this.s != null) {
            block7: for (n2 = 0; n2 < this.s.length; ++n2) {
                String string3 = this.s[n2];
                for (int i4 = 0; i4 < arrstring2.length; ++i4) {
                    if (string3.equals(arrstring2[i4])) continue block7;
                }
                throw new IllegalArgumentException("did not find public rule set: " + string3);
            }
            this.h = this.c(this.s[0]);
        } else {
            this.s = arrstring2;
        }
    }

    private void a(String[][] arrstring) {
        if (arrstring != null) {
            this.s = (String[])arrstring[0].clone();
            HashMap<String, String[]> hashMap = new HashMap<String, String[]>();
            for (int i2 = 1; i2 < arrstring.length; ++i2) {
                String[] arrstring2 = arrstring[i2];
                String string = arrstring2[0];
                String[] arrstring3 = new String[arrstring2.length - 1];
                if (arrstring3.length != this.s.length) {
                    throw new IllegalArgumentException("public name length: " + this.s.length + " != localized names[" + i2 + "] length: " + arrstring3.length);
                }
                System.arraycopy(arrstring2, 1, arrstring3, 0, arrstring3.length);
                hashMap.put(string, arrstring3);
            }
            if (!hashMap.isEmpty()) {
                this.r = hashMap;
            }
        }
    }

    private StringBuilder d(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 != -1 && n2 < string.length()) {
            while (n2 < string.length() && eb.c(string.charAt(n2))) {
                ++n2;
            }
            if (n2 < string.length() && string.charAt(n2) == ';') {
                ++n2;
                continue;
            }
            int n3 = string.indexOf(59, n2);
            if (n3 == -1) {
                stringBuilder.append(string.substring(n2));
                n2 = -1;
                continue;
            }
            if (n3 < string.length()) {
                stringBuilder.append(string.substring(n2, n3 + 1));
                n2 = n3 + 1;
                continue;
            }
            n2 = -1;
        }
        return stringBuilder;
    }

    private String a(double d2, fm fm2) {
        StringBuffer stringBuffer = new StringBuffer();
        fm2.a(d2, stringBuffer, 0);
        this.a(stringBuffer, fm2);
        return stringBuffer.toString();
    }

    private String a(long l2, fm fm2) {
        StringBuffer stringBuffer = new StringBuffer();
        fm2.a(l2, stringBuffer, 0);
        this.a(stringBuffer, fm2);
        return stringBuffer.toString();
    }

    private void a(StringBuffer stringBuffer, fm fm2) {
        if (this.p != null) {
            if (this.q == null) {
                int n2 = this.p.indexOf(";");
                if (n2 == -1) {
                    n2 = this.p.length();
                }
                String string = this.p.substring(0, n2).trim();
                try {
                    Class<?> class_ = Class.forName(string);
                    this.q = (in)class_.newInstance();
                    this.q.a(this, this.p);
                }
                catch (Exception exception) {
                    if (t) {
                        System.out.println("could not locate " + string + ", error " + exception.getClass().getName() + ", " + exception.getMessage());
                    }
                    this.q = null;
                    this.p = null;
                    return;
                }
            }
            this.q.a(stringBuffer, fm2);
        }
    }

    fm c(String string) {
        for (int i2 = 0; i2 < this.f.length; ++i2) {
            if (!this.f[i2].c().equals(string)) continue;
            return this.f[i2];
        }
        throw new IllegalArgumentException("No rule set named " + string);
    }
}

