/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.f;

import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import org.apache.a.ag;
import org.apache.a.c;
import org.apache.a.f;
import org.apache.a.g;
import org.apache.a.k.x;
import org.apache.a.n;
import org.apache.a.o.d;

public class l {
    public static final String a = "application/x-www-form-urlencoded";
    private static final char b = '&';
    private static final char c = ';';
    private static final String d = "=";
    private static final char[] e;
    private static final String f;
    private static final BitSet g;
    private static final BitSet h;
    private static final BitSet i;
    private static final BitSet j;
    private static final BitSet k;
    private static final BitSet l;
    private static final BitSet m;
    private static final int n = 16;

    public static List a(URI uRI, String string) {
        String string2 = uRI.getRawQuery();
        if (string2 != null && string2.length() > 0) {
            ArrayList arrayList = new ArrayList();
            Scanner scanner = new Scanner(string2);
            org.apache.a.c.f.l.a(arrayList, scanner, f, string);
            return arrayList;
        }
        return Collections.emptyList();
    }

    public static List a(n n2) {
        String string;
        org.apache.a.h.g g2 = org.apache.a.h.g.a(n2);
        if (g2 != null && g2.a().equalsIgnoreCase(a) && (string = org.apache.a.o.g.a(n2, org.apache.a.c.f)) != null && string.length() > 0) {
            Charset charset = g2.b();
            if (charset == null) {
                charset = org.apache.a.n.f.t;
            }
            return org.apache.a.c.f.l.a(string, charset, e);
        }
        return Collections.emptyList();
    }

    public static boolean b(n n2) {
        g[] arrg;
        f f2 = n2.d();
        if (f2 != null && (arrg = f2.e()).length > 0) {
            String string = arrg[0].a();
            return string.equalsIgnoreCase(a);
        }
        return false;
    }

    public static void a(List list, Scanner scanner, String string) {
        org.apache.a.c.f.l.a(list, scanner, f, string);
    }

    public static void a(List list, Scanner scanner, String string, String string2) {
        scanner.useDelimiter(string);
        while (scanner.hasNext()) {
            String string3 = null;
            String string4 = null;
            String string5 = scanner.next();
            int n2 = string5.indexOf(d);
            if (n2 != -1) {
                string3 = org.apache.a.c.f.l.a(string5.substring(0, n2).trim(), string2);
                string4 = org.apache.a.c.f.l.a(string5.substring(n2 + 1).trim(), string2);
            } else {
                string3 = org.apache.a.c.f.l.a(string5.trim(), string2);
            }
            list.add(new org.apache.a.k.n(string3, string4));
        }
    }

    public static List a(String string, Charset charset) {
        return org.apache.a.c.f.l.a(string, charset, e);
    }

    public static List a(String string, Charset charset, char ... arrc) {
        if (string == null) {
            return Collections.emptyList();
        }
        org.apache.a.k.g g2 = org.apache.a.k.g.b;
        d d2 = new d(string.length());
        d2.a(string);
        x x2 = new x(0, d2.e());
        ArrayList<org.apache.a.k.n> arrayList = new ArrayList<org.apache.a.k.n>();
        while (!x2.d()) {
            ag ag2 = g2.a(d2, x2, arrc);
            if (ag2.a().length() <= 0) continue;
            arrayList.add(new org.apache.a.k.n(org.apache.a.c.f.l.e(ag2.a(), charset), org.apache.a.c.f.l.e(ag2.b(), charset)));
        }
        return arrayList;
    }

    public static String a(List list, String string) {
        return org.apache.a.c.f.l.a(list, '&', string);
    }

    public static String a(List list, char c2, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (ag ag2 : list) {
            String string2 = org.apache.a.c.f.l.b(ag2.a(), string);
            String string3 = org.apache.a.c.f.l.b(ag2.b(), string);
            if (stringBuilder.length() > 0) {
                stringBuilder.append(c2);
            }
            stringBuilder.append(string2);
            if (string3 == null) continue;
            stringBuilder.append(d);
            stringBuilder.append(string3);
        }
        return stringBuilder.toString();
    }

    public static String a(Iterable iterable, Charset charset) {
        return org.apache.a.c.f.l.a(iterable, '&', charset);
    }

    public static String a(Iterable iterable, char c2, Charset charset) {
        StringBuilder stringBuilder = new StringBuilder();
        for (ag ag2 : iterable) {
            String string = org.apache.a.c.f.l.f(ag2.a(), charset);
            String string2 = org.apache.a.c.f.l.f(ag2.b(), charset);
            if (stringBuilder.length() > 0) {
                stringBuilder.append(c2);
            }
            stringBuilder.append(string);
            if (string2 == null) continue;
            stringBuilder.append(d);
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    private static String a(String string, Charset charset, BitSet bitSet, boolean bl2) {
        if (string == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        ByteBuffer byteBuffer = charset.encode(string);
        while (byteBuffer.hasRemaining()) {
            int n2 = byteBuffer.get() & 0xFF;
            if (bitSet.get(n2)) {
                stringBuilder.append((char)n2);
                continue;
            }
            if (bl2 && n2 == 32) {
                stringBuilder.append('+');
                continue;
            }
            stringBuilder.append("%");
            char c2 = Character.toUpperCase(Character.forDigit(n2 >> 4 & 0xF, 16));
            char c3 = Character.toUpperCase(Character.forDigit(n2 & 0xF, 16));
            stringBuilder.append(c2);
            stringBuilder.append(c3);
        }
        return stringBuilder.toString();
    }

    private static String a(String string, Charset charset, boolean bl2) {
        if (string == null) {
            return null;
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(string.length());
        CharBuffer charBuffer = CharBuffer.wrap(string);
        while (charBuffer.hasRemaining()) {
            char c2 = charBuffer.get();
            if (c2 == '%' && charBuffer.remaining() >= 2) {
                char c3 = charBuffer.get();
                char c4 = charBuffer.get();
                int n2 = Character.digit(c3, 16);
                int n3 = Character.digit(c4, 16);
                if (n2 != -1 && n3 != -1) {
                    byteBuffer.put((byte)((n2 << 4) + n3));
                    continue;
                }
                byteBuffer.put((byte)37);
                byteBuffer.put((byte)c3);
                byteBuffer.put((byte)c4);
                continue;
            }
            if (bl2 && c2 == '+') {
                byteBuffer.put((byte)32);
                continue;
            }
            byteBuffer.put((byte)c2);
        }
        byteBuffer.flip();
        return charset.decode(byteBuffer).toString();
    }

    private static String a(String string, String string2) {
        if (string == null) {
            return null;
        }
        return org.apache.a.c.f.l.a(string, string2 != null ? Charset.forName(string2) : org.apache.a.c.e, true);
    }

    private static String e(String string, Charset charset) {
        if (string == null) {
            return null;
        }
        return org.apache.a.c.f.l.a(string, charset != null ? charset : org.apache.a.c.e, true);
    }

    private static String b(String string, String string2) {
        if (string == null) {
            return null;
        }
        return org.apache.a.c.f.l.a(string, string2 != null ? Charset.forName(string2) : org.apache.a.c.e, m, true);
    }

    private static String f(String string, Charset charset) {
        if (string == null) {
            return null;
        }
        return org.apache.a.c.f.l.a(string, charset != null ? charset : org.apache.a.c.e, m, true);
    }

    static String b(String string, Charset charset) {
        return org.apache.a.c.f.l.a(string, charset, i, false);
    }

    static String c(String string, Charset charset) {
        return org.apache.a.c.f.l.a(string, charset, k, false);
    }

    static String d(String string, Charset charset) {
        return org.apache.a.c.f.l.a(string, charset, j, false);
    }

    static {
        int n2;
        e = new char[]{'&', ';'};
        f = "[" + new String(e) + "]";
        g = new BitSet(256);
        h = new BitSet(256);
        i = new BitSet(256);
        j = new BitSet(256);
        k = new BitSet(256);
        l = new BitSet(256);
        m = new BitSet(256);
        for (n2 = 97; n2 <= 122; ++n2) {
            g.set(n2);
        }
        for (n2 = 65; n2 <= 90; ++n2) {
            g.set(n2);
        }
        for (n2 = 48; n2 <= 57; ++n2) {
            g.set(n2);
        }
        g.set(95);
        g.set(45);
        g.set(46);
        g.set(42);
        m.or(g);
        g.set(33);
        g.set(126);
        g.set(39);
        g.set(40);
        g.set(41);
        h.set(44);
        h.set(59);
        h.set(58);
        h.set(36);
        h.set(38);
        h.set(43);
        h.set(61);
        i.or(g);
        i.or(h);
        j.or(g);
        j.set(47);
        j.set(59);
        j.set(58);
        j.set(64);
        j.set(38);
        j.set(61);
        j.set(43);
        j.set(36);
        j.set(44);
        l.set(59);
        l.set(47);
        l.set(63);
        l.set(58);
        l.set(64);
        l.set(38);
        l.set(61);
        l.set(43);
        l.set(36);
        l.set(44);
        l.set(91);
        l.set(93);
        k.or(l);
        k.or(g);
    }
}

