/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.gq;
import com.ibm.icu.b.aa;
import com.ibm.icu.b.b;
import com.ibm.icu.d.jd;
import com.ibm.icu.d.jl;
import com.ibm.icu.d.jo;
import com.ibm.icu.d.jp;
import com.ibm.icu.d.lf;
import java.io.DataOutputStream;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.Reader;
import java.text.ParseException;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class jk {
    static String a;
    static final /* synthetic */ boolean b;

    private jk() {
    }

    static void a(Reader reader, StringBuffer stringBuffer) {
        String string;
        LineNumberReader lineNumberReader = new LineNumberReader(reader);
        while ((string = lineNumberReader.readLine()) != null) {
            stringBuffer.append(string);
            stringBuffer.append('\n');
        }
    }

    static void a(jp jp2, DataOutputStream dataOutputStream, Reader reader) {
        int n2;
        Object object;
        int n3;
        Pattern pattern = null;
        StringBuffer stringBuffer = new StringBuffer();
        int n4 = 0;
        Vector<jl> vector = null;
        int n5 = 2;
        gq gq2 = new gq(0, 0);
        gq gq3 = new gq(0, 0);
        vector = new Vector<jl>();
        vector.addElement(null);
        vector.addElement(null);
        jk.a(reader, stringBuffer);
        pattern = Pattern.compile(a);
        if (stringBuffer.charAt(0) == '\ufeff') {
            stringBuffer.setCharAt(0, ' ');
        }
        Matcher matcher = pattern.matcher(stringBuffer);
        while (matcher.find()) {
            ++n4;
            if (matcher.start(1) >= 0) continue;
            if (matcher.start(8) >= 0) {
                throw new ParseException("ConfusablesWholeScript, line " + n4 + ": Unrecognized input: " + matcher.group(), matcher.start());
            }
            n3 = Integer.parseInt(matcher.group(2), 16);
            if (n3 > 0x10FFFF) {
                throw new ParseException("ConfusablesWholeScript, line " + n4 + ": out of range code point: " + matcher.group(2), matcher.start(2));
            }
            int n6 = n3;
            if (matcher.start(3) >= 0) {
                n6 = Integer.parseInt(matcher.group(3), 16);
            }
            if (n6 > 0x10FFFF) {
                throw new ParseException("ConfusablesWholeScript, line " + n4 + ": out of range code point: " + matcher.group(3), matcher.start(3));
            }
            String string = matcher.group(4);
            object = matcher.group(5);
            n2 = com.ibm.icu.b.b.a(4106, (CharSequence)string);
            int n7 = com.ibm.icu.b.b.a(4106, (CharSequence)object);
            if (n2 == -1) {
                throw new ParseException("ConfusablesWholeScript, line " + n4 + ": Invalid script code t: " + matcher.group(4), matcher.start(4));
            }
            if (n7 == -1) {
                throw new ParseException("ConfusablesWholeScript, line " + n4 + ": Invalid script code t: " + matcher.group(5), matcher.start(5));
            }
            gq gq4 = gq2;
            if (matcher.start(7) >= 0) {
                gq4 = gq3;
            }
            for (int i2 = n3; i2 <= n6; ++i2) {
                int n8 = gq4.a(i2);
                jl jl2 = null;
                if (n8 > 0) {
                    if (!b && n8 >= vector.size()) {
                        throw new AssertionError();
                    }
                    jl2 = (jl)vector.elementAt(n8);
                } else {
                    jl2 = new jl();
                    jl2.a = i2;
                    jl2.b = gq4;
                    jl2.c = new jo();
                    jl2.d = n8 = vector.size();
                    jl2.e = 0;
                    vector.addElement(jl2);
                    gq4.d(i2, n8);
                }
                jl2.c.a(n7);
                jl2.c.a(n2);
                int n9 = aa.a(i2);
                if (n9 == n2) continue;
                throw new ParseException("ConfusablesWholeScript, line " + n4 + ": Mismatch between source script and code point " + Integer.toString(i2, 16), matcher.start(5));
            }
        }
        n5 = 2;
        for (n3 = 2; n3 < vector.size(); ++n3) {
            jl jl3 = (jl)vector.elementAt(n3);
            if (jl3.d != n3) continue;
            jl3.e = n5++;
            for (int i3 = n3 + 1; i3 < vector.size(); ++i3) {
                object = (jl)vector.elementAt(i3);
                if (!jl3.c.a(((jl)object).c) || jl3.c == ((jl)object).c) continue;
                ((jl)object).c = jl3.c;
                ((jl)object).d = n3;
                ((jl)object).e = jl3.e;
            }
        }
        for (n3 = 2; n3 < vector.size(); ++n3) {
            jl jl4 = (jl)vector.elementAt(n3);
            if (jl4.e == n3) continue;
            jl4.b.d(jl4.a, jl4.e);
        }
        lf lf2 = new lf();
        lf2.j(4106, 0);
        lf lf3 = new lf();
        lf3.j(4106, 1);
        lf2.f(lf3);
        for (int i4 = 0; i4 < lf2.h(); ++i4) {
            int n10 = lf2.i(i4);
            n2 = lf2.j(i4);
            gq2.a(n10, n2, 1, true);
            gq3.a(n10, n2, 1, true);
        }
        gq2.b().a((OutputStream)dataOutputStream);
        gq3.b().a((OutputStream)dataOutputStream);
        jp2.a.q = n5;
        int n11 = 2;
        for (int i5 = 2; i5 < vector.size(); ++i5) {
            jl jl5 = (jl)vector.elementAt(i5);
            if (jl5.e < n11) continue;
            if (!b && n11 != jl5.e) {
                throw new AssertionError();
            }
            jl5.c.a(dataOutputStream);
            ++n11;
        }
    }

    static {
        b = !jd.class.desiredAssertionStatus();
        a = "(?m)^([ \\t]*(?:#.*?)?)$|^(?:\\s*([0-9A-F]{4,})(?:..([0-9A-F]{4,}))?\\s*;\\s*([A-Za-z]+)\\s*;\\s*([A-Za-z]+)\\s*;\\s*(?:(A)|(L))[ \\t]*(?:#.*?)?)$|^(.*?)$";
    }
}

