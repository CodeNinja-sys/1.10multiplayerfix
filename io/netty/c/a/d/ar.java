/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.g;
import io.netty.c.a.d.am;
import io.netty.c.a.d.aq;
import io.netty.c.a.d.as;
import io.netty.c.a.d.av;
import io.netty.c.a.d.aw;
import io.netty.c.a.d.bj;
import io.netty.c.a.d.bm;
import io.netty.c.a.d.br;
import io.netty.c.a.d.k;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class ar
implements Iterable {
    private static final byte[] a = new byte[]{58, 32};
    private static final byte[] c = new byte[]{13, 10};
    private static final CharSequence d = ar.e("Content-Length");
    private static final CharSequence e = ar.e("Connection");
    private static final CharSequence f = ar.e("close");
    private static final CharSequence g = ar.e("keep-alive");
    private static final CharSequence h = ar.e("Host");
    private static final CharSequence i = ar.e("Date");
    private static final CharSequence j = ar.e("Expect");
    private static final CharSequence k = ar.e("100-continue");
    private static final CharSequence l = ar.e("Transfer-Encoding");
    private static final CharSequence m = ar.e("chunked");
    private static final CharSequence n = ar.e("Sec-WebSocket-Key1");
    private static final CharSequence o = ar.e("Sec-WebSocket-Key2");
    private static final CharSequence p = ar.e("Sec-WebSocket-Origin");
    private static final CharSequence q = ar.e("Sec-WebSocket-Location");
    public static final ar b = new as();

    public static boolean a(av av2) {
        String string = av2.q().c(e);
        if (string != null && ar.a(f, (CharSequence)string)) {
            return false;
        }
        if (av2.r().e()) {
            return !ar.a(f, (CharSequence)string);
        }
        return ar.a(g, (CharSequence)string);
    }

    public static void a(av av2, boolean bl2) {
        ar ar2 = av2.q();
        if (av2.r().e()) {
            if (bl2) {
                ar2.b(e);
            } else {
                ar2.b(e, (Object)f);
            }
        } else if (bl2) {
            ar2.b(e, (Object)g);
        } else {
            ar2.b(e);
        }
    }

    public static String a(av av2, String string) {
        return av2.q().b(string);
    }

    public static String a(av av2, CharSequence charSequence) {
        return av2.q().c(charSequence);
    }

    public static String a(av av2, String string, String string2) {
        return ar.a(av2, (CharSequence)string, string2);
    }

    public static String a(av av2, CharSequence charSequence, String string) {
        String string2 = av2.q().c(charSequence);
        if (string2 == null) {
            return string;
        }
        return string2;
    }

    public static void a(av av2, String string, Object object) {
        av2.q().b(string, object);
    }

    public static void a(av av2, CharSequence charSequence, Object object) {
        av2.q().b(charSequence, object);
    }

    public static void a(av av2, String string, Iterable iterable) {
        av2.q().b(string, iterable);
    }

    public static void a(av av2, CharSequence charSequence, Iterable iterable) {
        av2.q().b(charSequence, iterable);
    }

    public static void b(av av2, String string, Object object) {
        av2.q().a(string, object);
    }

    public static void b(av av2, CharSequence charSequence, Object object) {
        av2.q().a(charSequence, object);
    }

    public static void b(av av2, String string) {
        av2.q().a(string);
    }

    public static void b(av av2, CharSequence charSequence) {
        av2.q().b(charSequence);
    }

    public static void b(av av2) {
        av2.q().a();
    }

    public static int c(av av2, String string) {
        return ar.c(av2, (CharSequence)string);
    }

    public static int c(av av2, CharSequence charSequence) {
        String string = ar.a(av2, charSequence);
        if (string == null) {
            throw new NumberFormatException("header not found: " + charSequence);
        }
        return Integer.parseInt(string);
    }

    public static int a(av av2, String string, int n2) {
        return ar.a(av2, (CharSequence)string, n2);
    }

    public static int a(av av2, CharSequence charSequence, int n2) {
        String string = ar.a(av2, charSequence);
        if (string == null) {
            return n2;
        }
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return n2;
        }
    }

    public static void b(av av2, String string, int n2) {
        av2.q().b(string, (Object)n2);
    }

    public static void b(av av2, CharSequence charSequence, int n2) {
        av2.q().b(charSequence, (Object)n2);
    }

    public static void b(av av2, String string, Iterable iterable) {
        av2.q().b(string, iterable);
    }

    public static void b(av av2, CharSequence charSequence, Iterable iterable) {
        av2.q().b(charSequence, iterable);
    }

    public static void c(av av2, String string, int n2) {
        av2.q().a(string, (Object)n2);
    }

    public static void c(av av2, CharSequence charSequence, int n2) {
        av2.q().a(charSequence, (Object)n2);
    }

    public static Date d(av av2, String string) {
        return ar.d(av2, (CharSequence)string);
    }

    public static Date d(av av2, CharSequence charSequence) {
        String string = ar.a(av2, charSequence);
        if (string == null) {
            throw new ParseException("header not found: " + charSequence, 0);
        }
        return am.a().parse(string);
    }

    public static Date a(av av2, String string, Date date) {
        return ar.a(av2, (CharSequence)string, date);
    }

    public static Date a(av av2, CharSequence charSequence, Date date) {
        String string = ar.a(av2, charSequence);
        if (string == null) {
            return date;
        }
        try {
            return am.a().parse(string);
        }
        catch (ParseException parseException) {
            return date;
        }
    }

    public static void b(av av2, String string, Date date) {
        ar.b(av2, (CharSequence)string, date);
    }

    public static void b(av av2, CharSequence charSequence, Date date) {
        if (date != null) {
            av2.q().b(charSequence, (Object)am.a().format(date));
        } else {
            av2.q().b(charSequence, null);
        }
    }

    public static void c(av av2, String string, Iterable iterable) {
        av2.q().b(string, iterable);
    }

    public static void c(av av2, CharSequence charSequence, Iterable iterable) {
        av2.q().b(charSequence, iterable);
    }

    public static void c(av av2, String string, Date date) {
        av2.q().a(string, (Object)date);
    }

    public static void c(av av2, CharSequence charSequence, Date date) {
        av2.q().a(charSequence, (Object)date);
    }

    public static long c(av av2) {
        String string = ar.a(av2, d);
        if (string != null) {
            return Long.parseLong(string);
        }
        long l2 = ar.l(av2);
        if (l2 >= 0L) {
            return l2;
        }
        throw new NumberFormatException("header not found: Content-Length");
    }

    public static long a(av av2, long l2) {
        String string = av2.q().c(d);
        if (string != null) {
            try {
                return Long.parseLong(string);
            }
            catch (NumberFormatException numberFormatException) {
                return l2;
            }
        }
        long l3 = ar.l(av2);
        if (l3 >= 0L) {
            return l3;
        }
        return l2;
    }

    private static int l(av av2) {
        bm bm2;
        ar ar2 = av2.q();
        if (av2 instanceof bj) {
            bj bj2 = (bj)av2;
            if (aw.b.equals(bj2.s()) && ar2.e(n) && ar2.e(o)) {
                return 8;
            }
        } else if (av2 instanceof bm && (bm2 = (bm)av2).s().a() == 101 && ar2.e(p) && ar2.e(q)) {
            return 16;
        }
        return -1;
    }

    public static void b(av av2, long l2) {
        av2.q().b(d, (Object)l2);
    }

    public static String d(av av2) {
        return av2.q().c(h);
    }

    public static String e(av av2, String string) {
        return ar.a(av2, h, string);
    }

    public static void f(av av2, String string) {
        av2.q().b(h, (Object)string);
    }

    public static void e(av av2, CharSequence charSequence) {
        av2.q().b(h, (Object)charSequence);
    }

    public static Date e(av av2) {
        return ar.d(av2, i);
    }

    public static Date a(av av2, Date date) {
        return ar.a(av2, i, date);
    }

    public static void b(av av2, Date date) {
        if (date != null) {
            av2.q().b(i, (Object)am.a().format(date));
        } else {
            av2.q().b(i, null);
        }
    }

    public static boolean f(av av2) {
        if (!(av2 instanceof bj)) {
            return false;
        }
        if (av2.r().a(br.b) < 0) {
            return false;
        }
        String string = av2.q().c(j);
        if (string == null) {
            return false;
        }
        if (ar.a(k, (CharSequence)string)) {
            return true;
        }
        return av2.q().a(j, k, true);
    }

    public static void g(av av2) {
        ar.b(av2, true);
    }

    public static void b(av av2, boolean bl2) {
        if (bl2) {
            av2.q().b(j, (Object)k);
        } else {
            av2.q().b(j);
        }
    }

    static void f(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Header names cannot be null");
        }
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            if (c2 > '\u007f') {
                throw new IllegalArgumentException("Header name cannot contain non-ASCII characters: " + charSequence);
            }
            switch (c2) {
                case '\t': 
                case '\n': 
                case '\u000b': 
                case '\f': 
                case '\r': 
                case ' ': 
                case ',': 
                case ':': 
                case ';': 
                case '=': {
                    throw new IllegalArgumentException("Header name cannot contain the following prohibited characters: =,;: \\t\\r\\n\\v\\f: " + charSequence);
                }
            }
        }
    }

    static void g(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Header values cannot be null");
        }
        int n2 = 0;
        block19: for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            switch (c2) {
                case '\u000b': {
                    throw new IllegalArgumentException("Header value contains a prohibited character '\\v': " + charSequence);
                }
                case '\f': {
                    throw new IllegalArgumentException("Header value contains a prohibited character '\\f': " + charSequence);
                }
            }
            switch (n2) {
                case 0: {
                    switch (c2) {
                        case '\r': {
                            n2 = 1;
                            continue block19;
                        }
                        case '\n': {
                            n2 = 2;
                        }
                    }
                    continue block19;
                }
                case 1: {
                    switch (c2) {
                        case '\n': {
                            n2 = 2;
                            continue block19;
                        }
                    }
                    throw new IllegalArgumentException("Only '\\n' is allowed after '\\r': " + charSequence);
                }
                case 2: {
                    switch (c2) {
                        case '\t': 
                        case ' ': {
                            n2 = 0;
                            continue block19;
                        }
                    }
                    throw new IllegalArgumentException("Only ' ' and '\\t' are allowed after '\\n': " + charSequence);
                }
            }
        }
        if (n2 != 0) {
            throw new IllegalArgumentException("Header value must not end with '\\r' or '\\n':" + charSequence);
        }
    }

    public static boolean h(av av2) {
        return av2.q().a(l, m, true);
    }

    public static void i(av av2) {
        List list = av2.q().d(l);
        if (list.isEmpty()) {
            return;
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            if (!ar.a((CharSequence)string, m)) continue;
            iterator.remove();
        }
        if (list.isEmpty()) {
            av2.q().b(l);
        } else {
            av2.q().b(l, (Iterable)list);
        }
    }

    public static void j(av av2) {
        ar.b(av2, l, (Object)m);
        ar.b(av2, d);
    }

    public static boolean k(av av2) {
        return av2.q().e(d);
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null) {
            return false;
        }
        int n2 = charSequence.length();
        if (n2 != charSequence2.length()) {
            return false;
        }
        for (int i2 = n2 - 1; i2 >= 0; --i2) {
            char c2;
            char c3 = charSequence.charAt(i2);
            if (c3 == (c2 = charSequence2.charAt(i2))) continue;
            if (c3 >= 'A' && c3 <= 'Z') {
                c3 = (char)(c3 + 32);
            }
            if (c2 >= 'A' && c2 <= 'Z') {
                c2 = (char)(c2 + 32);
            }
            if (c3 == c2) continue;
            return false;
        }
        return true;
    }

    static int h(CharSequence charSequence) {
        if (charSequence instanceof aq) {
            return ((aq)charSequence).a();
        }
        int n2 = 0;
        for (int i2 = charSequence.length() - 1; i2 >= 0; --i2) {
            char c2 = charSequence.charAt(i2);
            if (c2 >= 'A' && c2 <= 'Z') {
                c2 = (char)(c2 + 32);
            }
            n2 = 31 * n2 + c2;
        }
        if (n2 > 0) {
            return n2;
        }
        if (n2 == Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        return -n2;
    }

    static void a(ar ar2, g g2) {
        if (ar2 instanceof k) {
            ((k)ar2).a(g2);
        } else {
            for (Map.Entry entry : ar2) {
                ar.a((CharSequence)entry.getKey(), (CharSequence)entry.getValue(), g2);
            }
        }
    }

    static void a(CharSequence charSequence, CharSequence charSequence2, g g2) {
        if (!ar.a(charSequence, g2)) {
            g2.c(a);
        }
        if (!ar.a(charSequence2, g2)) {
            g2.c(c);
        }
    }

    public static boolean a(CharSequence charSequence, g g2) {
        if (charSequence instanceof aq) {
            return ((aq)charSequence).a(g2);
        }
        ar.b(charSequence, g2);
        return false;
    }

    static void b(CharSequence charSequence, g g2) {
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            g2.B((byte)charSequence.charAt(i2));
        }
    }

    public static CharSequence e(String string) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        return new aq(string);
    }

    public static CharSequence f(String string) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        return new aq(string, a);
    }

    public static CharSequence g(String string) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        return new aq(string, c);
    }

    protected ar() {
    }

    public abstract String b(String var1);

    public String c(CharSequence charSequence) {
        return this.b(charSequence.toString());
    }

    public abstract List c(String var1);

    public List d(CharSequence charSequence) {
        return this.c(charSequence.toString());
    }

    public abstract List b();

    public abstract boolean d(String var1);

    public boolean e(CharSequence charSequence) {
        return this.d(charSequence.toString());
    }

    public abstract boolean c();

    public abstract Set d();

    public abstract ar a(String var1, Object var2);

    public ar a(CharSequence charSequence, Object object) {
        return this.a(charSequence.toString(), object);
    }

    public abstract ar a(String var1, Iterable var2);

    public ar a(CharSequence charSequence, Iterable iterable) {
        return this.a(charSequence.toString(), iterable);
    }

    public ar a(ar ar2) {
        if (ar2 == null) {
            throw new NullPointerException("headers");
        }
        for (Map.Entry entry : ar2) {
            this.a((String)entry.getKey(), entry.getValue());
        }
        return this;
    }

    public abstract ar b(String var1, Object var2);

    public ar b(CharSequence charSequence, Object object) {
        return this.b(charSequence.toString(), object);
    }

    public abstract ar b(String var1, Iterable var2);

    public ar b(CharSequence charSequence, Iterable iterable) {
        return this.b(charSequence.toString(), iterable);
    }

    public ar b(ar ar2) {
        if (ar2 == null) {
            throw new NullPointerException("headers");
        }
        this.a();
        for (Map.Entry entry : ar2) {
            this.a((String)entry.getKey(), entry.getValue());
        }
        return this;
    }

    public abstract ar a(String var1);

    public ar b(CharSequence charSequence) {
        return this.a(charSequence.toString());
    }

    public abstract ar a();

    public boolean a(String string, String string2, boolean bl2) {
        List list = this.c(string);
        if (list.isEmpty()) {
            return false;
        }
        for (String string3 : list) {
            if (!(bl2 ? ar.a((CharSequence)string3, (CharSequence)string2) : string3.equals(string2))) continue;
            return true;
        }
        return false;
    }

    public boolean a(CharSequence charSequence, CharSequence charSequence2, boolean bl2) {
        return this.a(charSequence.toString(), charSequence2.toString(), bl2);
    }
}

