/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.bc;
import com.ibm.icu.c.a;
import com.ibm.icu.d.dm;
import com.ibm.icu.d.dp;
import com.ibm.icu.d.gs;
import com.ibm.icu.d.gt;
import com.ibm.icu.d.gz;
import com.ibm.icu.d.iu;
import com.ibm.icu.d.kv;
import com.ibm.icu.util.aj;
import com.ibm.icu.util.ao;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.dv;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.MissingResourceException;

public abstract class gq
extends kv {
    public static final int B = 0;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 3;
    public static final int F = 4;
    public static final int G = 5;
    public static final int H = 6;
    public static final int I = 0;
    public static final int J = 1;
    private static gt a;
    private static final char[] b;
    private static final String c;
    private boolean d = true;
    private byte e = (byte)40;
    private byte f = 1;
    private byte g = (byte)3;
    private byte h = 0;
    private boolean i = false;
    private int j = 40;
    private int k = 1;
    private int l = 3;
    private int m = 0;
    private aj n;
    static final int K = 1;
    private int o = 1;
    private static final long p = -2308460125733713944L;
    private boolean q;

    public StringBuffer format(Object object, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (object instanceof Long) {
            return this.a((Long)object, stringBuffer, fieldPosition);
        }
        if (object instanceof BigInteger) {
            return this.a((BigInteger)object, stringBuffer, fieldPosition);
        }
        if (object instanceof BigDecimal) {
            return this.a((BigDecimal)object, stringBuffer, fieldPosition);
        }
        if (object instanceof a) {
            return this.a((a)object, stringBuffer, fieldPosition);
        }
        if (object instanceof ao) {
            return this.a((ao)object, stringBuffer, fieldPosition);
        }
        if (object instanceof Number) {
            return this.a(((Number)object).doubleValue(), stringBuffer, fieldPosition);
        }
        throw new IllegalArgumentException("Cannot format given Object as a Number");
    }

    public final Object parseObject(String string, ParsePosition parsePosition) {
        return this.a(string, parsePosition);
    }

    public final String d(double d2) {
        return this.a(d2, new StringBuffer(), new FieldPosition(0)).toString();
    }

    public final String a(long l2) {
        StringBuffer stringBuffer = new StringBuffer(19);
        FieldPosition fieldPosition = new FieldPosition(0);
        this.a(l2, stringBuffer, fieldPosition);
        return stringBuffer.toString();
    }

    public final String a(BigInteger bigInteger) {
        return this.a(bigInteger, new StringBuffer(), new FieldPosition(0)).toString();
    }

    public final String b(BigDecimal bigDecimal) {
        return this.a(bigDecimal, new StringBuffer(), new FieldPosition(0)).toString();
    }

    public final String b(a a2) {
        return this.a(a2, new StringBuffer(), new FieldPosition(0)).toString();
    }

    public final String a(ao ao2) {
        return this.a(ao2, new StringBuffer(), new FieldPosition(0)).toString();
    }

    public abstract StringBuffer a(double var1, StringBuffer var3, FieldPosition var4);

    public abstract StringBuffer a(long var1, StringBuffer var3, FieldPosition var4);

    public abstract StringBuffer a(BigInteger var1, StringBuffer var2, FieldPosition var3);

    public abstract StringBuffer a(BigDecimal var1, StringBuffer var2, FieldPosition var3);

    public abstract StringBuffer a(a var1, StringBuffer var2, FieldPosition var3);

    public StringBuffer a(ao ao2, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        aj aj2 = this.R();
        aj aj3 = ao2.a();
        boolean bl2 = aj3.equals(aj2);
        if (!bl2) {
            this.a(aj3);
        }
        this.format(ao2.b(), stringBuffer, fieldPosition);
        if (!bl2) {
            this.a(aj2);
        }
        return stringBuffer;
    }

    public abstract Number a(String var1, ParsePosition var2);

    public Number g(String string) {
        ParsePosition parsePosition = new ParsePosition(0);
        Number number = this.a(string, parsePosition);
        if (parsePosition.getIndex() == 0) {
            throw new ParseException("Unparseable number: \"" + string + '\"', parsePosition.getErrorIndex());
        }
        return number;
    }

    public ao a(CharSequence charSequence, ParsePosition parsePosition) {
        Number number = this.a(((Object)charSequence).toString(), parsePosition);
        return number == null ? null : new ao(number, this.B());
    }

    public boolean E() {
        return this.i;
    }

    public void f(boolean bl2) {
        this.i = bl2;
    }

    public void g(boolean bl2) {
        this.q = bl2;
    }

    public boolean F() {
        return this.q;
    }

    public static final gq G() {
        return gq.a(dn.a(dr.b), 0);
    }

    public static gq a(Locale locale) {
        return gq.a(dn.a(locale), 0);
    }

    public static gq a(dn dn2) {
        return gq.a(dn2, 0);
    }

    public static final gq n(int n2) {
        return gq.a(dn.a(dr.b), n2);
    }

    public static gq a(Locale locale, int n2) {
        return gq.a(dn.a(locale), n2);
    }

    public static final gq H() {
        return gq.a(dn.a(dr.b), 0);
    }

    public static gq b(Locale locale) {
        return gq.a(dn.a(locale), 0);
    }

    public static gq b(dn dn2) {
        return gq.a(dn2, 0);
    }

    public static final gq I() {
        return gq.a(dn.a(dr.b), 4);
    }

    public static gq c(Locale locale) {
        return gq.a(dn.a(locale), 4);
    }

    public static gq c(dn dn2) {
        return gq.a(dn2, 4);
    }

    public static final gq J() {
        return gq.a(dn.a(dr.b), 1);
    }

    public static gq d(Locale locale) {
        return gq.a(dn.a(locale), 1);
    }

    public static gq d(dn dn2) {
        return gq.a(dn2, 1);
    }

    public static final gq K() {
        return gq.a(dn.a(dr.b), 2);
    }

    public static gq e(Locale locale) {
        return gq.a(dn.a(locale), 2);
    }

    public static gq e(dn dn2) {
        return gq.a(dn2, 2);
    }

    public static final gq L() {
        return gq.a(dn.a(dr.b), 3);
    }

    public static gq f(Locale locale) {
        return gq.a(dn.a(locale), 3);
    }

    public static gq f(dn dn2) {
        return gq.a(dn2, 3);
    }

    private static gt c() {
        if (a == null) {
            try {
                Class<?> class_ = Class.forName("com.ibm.icu.d.gv");
                a = (gt)class_.newInstance();
            }
            catch (MissingResourceException missingResourceException) {
                throw missingResourceException;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.getMessage());
            }
        }
        return a;
    }

    public static Locale[] M() {
        if (a == null) {
            return bc.f();
        }
        return gq.c().a();
    }

    public static dn[] N() {
        if (a == null) {
            return bc.e();
        }
        return gq.c().b();
    }

    public static Object a(gs gs2) {
        if (gs2 == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        return gq.c().a(gs2);
    }

    public static boolean a(Object object) {
        if (object == null) {
            throw new IllegalArgumentException("registryKey must not be null");
        }
        if (a == null) {
            return false;
        }
        return a.a(object);
    }

    public int hashCode() {
        return this.j * 37 + this.g;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        gq gq2 = (gq)object;
        return this.j == gq2.j && this.k == gq2.k && this.l == gq2.l && this.m == gq2.m && this.d == gq2.d && this.i == gq2.i && this.q == gq2.q;
    }

    public Object clone() {
        gq gq2 = (gq)super.clone();
        return gq2;
    }

    public boolean O() {
        return this.d;
    }

    public void h(boolean bl2) {
        this.d = bl2;
    }

    public int a() {
        return this.j;
    }

    public void a(int n2) {
        this.j = Math.max(0, n2);
        if (this.k > this.j) {
            this.k = this.j;
        }
    }

    public int b() {
        return this.k;
    }

    public void b(int n2) {
        this.k = Math.max(0, n2);
        if (this.k > this.j) {
            this.j = this.k;
        }
    }

    public int P() {
        return this.l;
    }

    public void k(int n2) {
        this.l = Math.max(0, n2);
        if (this.l < this.m) {
            this.m = this.l;
        }
    }

    public int Q() {
        return this.m;
    }

    public void l(int n2) {
        this.m = Math.max(0, n2);
        if (this.l < this.m) {
            this.l = this.m;
        }
    }

    public void a(aj aj2) {
        this.n = aj2;
    }

    public aj R() {
        return this.n;
    }

    protected aj B() {
        aj aj2 = this.R();
        if (aj2 == null) {
            dn dn2 = this.a(dn.x);
            if (dn2 == null) {
                dn2 = dn.a(dr.b);
            }
            aj2 = aj.a(dn2);
        }
        return aj2;
    }

    public int j() {
        throw new UnsupportedOperationException("getRoundingMode must be implemented by the subclass implementation.");
    }

    public void d(int n2) {
        throw new UnsupportedOperationException("setRoundingMode must be implemented by the subclass implementation.");
    }

    public static gq a(dn dn2, int n2) {
        if (n2 < 0 || n2 > 6) {
            throw new IllegalArgumentException("choice should be from NUMBERSTYLE to PLURALCURRENCYSTYLE");
        }
        return gq.c().a(dn2, n2);
    }

    static gq b(dn dn2, int n2) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        String string = gq.c(dn2, n2);
        dp dp2 = new dp(dn2);
        if ((n2 == 1 || n2 == 5) && (object4 = dp2.v()) != null) {
            string = object4;
        }
        if (n2 == 5) {
            string = string.replace("\u00a4", c);
        }
        if ((object4 = gz.a(dn2)) == null) {
            return null;
        }
        if (object4 != null && ((gz)object4).f()) {
            dn dn3;
            Object object5;
            Object object6;
            int n3 = 4;
            object3 = ((gz)object4).d();
            int n4 = ((String)object3).indexOf("/");
            int n5 = ((String)object3).lastIndexOf("/");
            if (n5 > n4) {
                object6 = ((String)object3).substring(0, n4);
                object2 = ((String)object3).substring(n4 + 1, n5);
                object5 = ((String)object3).substring(n5 + 1);
                dn3 = new dn((String)object6);
                if (((String)object2).equals("SpelloutRules")) {
                    n3 = 1;
                }
            } else {
                dn3 = dn2;
                object5 = object3;
            }
            object6 = new iu(dn3, n3);
            ((iu)object6).b((String)object5);
            object = object6;
        } else {
            object3 = new dm(string, dp2, n2);
            if (n2 == 4) {
                ((dm)object3).k(0);
                ((dm)object3).c(false);
                ((gq)object3).f(true);
            }
            object = object3;
        }
        object3 = dp2.a(dn.x);
        object2 = dp2.a(dn.w);
        ((kv)object).a((dn)object3, (dn)object2);
        return object;
    }

    protected static String b(Locale locale, int n2) {
        return gq.c(dn.a(locale), n2);
    }

    protected static String c(dn dn2, int n2) {
        int n3 = n2 == 4 ? 0 : (n2 == 5 || n2 == 6 ? 1 : n2);
        bc bc2 = (bc)dv.a("com/ibm/icu/impl/data/icudt51b", dn2);
        String[] arrstring = new String[]{"decimalFormat", "currencyFormat", "percentFormat", "scientificFormat"};
        gz gz2 = gz.a(dn2);
        String string = null;
        try {
            string = bc2.f("NumberElements/" + gz2.e() + "/patterns/" + arrstring[n3]);
        }
        catch (MissingResourceException missingResourceException) {
            string = bc2.f("NumberElements/latn/patterns/" + arrstring[n3]);
        }
        return string;
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.o < 1) {
            this.j = this.e;
            this.k = this.f;
            this.l = this.g;
            this.m = this.h;
        }
        if (this.k > this.j || this.m > this.l || this.k < 0 || this.m < 0) {
            throw new InvalidObjectException("Digit count range invalid");
        }
        this.o = 1;
    }

    private void a(ObjectOutputStream objectOutputStream) {
        this.e = (byte)(this.j > 127 ? 127 : (byte)this.j);
        this.f = (byte)(this.k > 127 ? 127 : (byte)this.k);
        this.g = (byte)(this.l > 127 ? 127 : (byte)this.l);
        this.h = (byte)(this.m > 127 ? 127 : (byte)this.m);
        objectOutputStream.defaultWriteObject();
    }

    static {
        b = new char[]{'\u00a4', '\u00a4'};
        c = new String(b);
    }
}

