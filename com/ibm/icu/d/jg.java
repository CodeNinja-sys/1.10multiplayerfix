/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.jd;
import com.ibm.icu.d.jh;
import com.ibm.icu.d.jj;
import com.ibm.icu.d.jk;
import com.ibm.icu.d.jp;
import com.ibm.icu.d.jr;
import com.ibm.icu.d.lf;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Reader;
import java.text.ParseException;
import java.util.Hashtable;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class jg {
    private jp b;
    private ByteArrayOutputStream c;
    private DataOutputStream d;
    private Hashtable e;
    private Hashtable f;
    private Hashtable g;
    private Hashtable h;
    private lf i;
    private StringBuffer j;
    private Vector k;
    private Vector l;
    private Vector m;
    private jj n;
    private Pattern o;
    private Pattern p;
    private int q;
    static final /* synthetic */ boolean a;

    jg(jp jp2, ByteArrayOutputStream byteArrayOutputStream) {
        this.c = byteArrayOutputStream;
        this.d = new DataOutputStream(byteArrayOutputStream);
        this.b = jp2;
        this.e = new Hashtable();
        this.f = new Hashtable();
        this.g = new Hashtable();
        this.h = new Hashtable();
        this.i = new lf();
        this.k = new Vector();
        this.l = new Vector();
        this.n = new jj();
    }

    void a(Reader reader) {
        int n2;
        Object object;
        int n3;
        StringBuffer stringBuffer = new StringBuffer();
        jk.a(reader, stringBuffer);
        this.o = Pattern.compile("(?m)^[ \\t]*([0-9A-Fa-f]+)[ \\t]+;[ \\t]*([0-9A-Fa-f]+(?:[ \\t]+[0-9A-Fa-f]+)*)[ \\t]*;\\s*(?:(SL)|(SA)|(ML)|(MA))[ \\t]*(?:#.*?)?$|^([ \\t]*(?:#.*?)?)$|^(.*?)$");
        this.p = Pattern.compile("\\s*([0-9A-F]+)");
        if (stringBuffer.charAt(0) == '\ufeff') {
            stringBuffer.setCharAt(0, ' ');
        }
        Matcher matcher = this.o.matcher(stringBuffer);
        while (matcher.find()) {
            ++this.q;
            if (matcher.start(7) >= 0) continue;
            if (matcher.start(8) >= 0) {
                throw new ParseException("Confusables, line " + this.q + ": Unrecognized Line: " + matcher.group(8), matcher.start(8));
            }
            n3 = Integer.parseInt(matcher.group(1), 16);
            if (n3 > 0x10FFFF) {
                throw new ParseException("Confusables, line " + this.q + ": Bad code point: " + matcher.group(1), matcher.start(1));
            }
            Matcher matcher2 = this.p.matcher(matcher.group(2));
            StringBuilder stringBuilder = new StringBuilder();
            while (matcher2.find()) {
                int n4 = Integer.parseInt(matcher2.group(1), 16);
                if (n3 > 0x10FFFF) {
                    throw new ParseException("Confusables, line " + this.q + ": Bad code point: " + Integer.toString(n4, 16), matcher.start(2));
                }
                stringBuilder.appendCodePoint(n4);
            }
            if (!a && stringBuilder.length() < 1) {
                throw new AssertionError();
            }
            jh jh2 = this.n.a(stringBuilder.toString());
            Object object2 = matcher.start(3) >= 0 ? this.e : (matcher.start(4) >= 0 ? this.f : (matcher.start(5) >= 0 ? this.g : (object = matcher.start(6) >= 0 ? this.h : null)));
            if (!a && object == null) {
                throw new AssertionError();
            }
            ((Hashtable)object).put(n3, jh2);
            this.i.e(n3);
        }
        this.n.b();
        this.j = new StringBuffer();
        this.m = new Vector();
        n3 = 0;
        int n5 = 0;
        int n6 = this.n.a();
        for (int i2 = 0; i2 < n6; ++i2) {
            object = this.n.a(i2);
            n2 = ((jh)object).a.length();
            int n7 = this.j.length();
            if (!a && n2 < n3) {
                throw new AssertionError();
            }
            if (n2 == 1) {
                ((jh)object).b = ((jh)object).a.charAt(0);
            } else {
                if (n2 > n3 && n3 >= 4) {
                    this.m.addElement(n5);
                    this.m.addElement(n3);
                }
                ((jh)object).b = n7;
                this.j.append(((jh)object).a);
            }
            n3 = n2;
            n5 = n7;
        }
        if (n3 >= 4) {
            this.m.addElement(n5);
            this.m.addElement(n3);
        }
        for (int i3 = 0; i3 < this.i.h(); ++i3) {
            for (n2 = this.i.i(i3); n2 <= this.i.j(i3); ++n2) {
                this.a(n2, this.e, 0x1000000);
                this.a(n2, this.f, 0x2000000);
                this.a(n2, this.g, 0x4000000);
                this.a(n2, this.h, 0x8000000);
            }
        }
        this.a();
    }

    void a(int n2, Hashtable hashtable, int n3) {
        int n4;
        int n5;
        jh jh2 = (jh)hashtable.get(n2);
        if (jh2 == null) {
            return;
        }
        boolean bl2 = false;
        for (int i2 = this.k.size() - 1; i2 >= 0 && ((n5 = ((Integer)this.k.elementAt(i2)).intValue()) & 0xFFFFFF) == n2; --i2) {
            String string = this.a(i2);
            if (string.equals(jh2.a)) {
                this.k.setElementAt(n5 |= n3, i2);
                return;
            }
            bl2 = true;
        }
        n5 = n2 | n3;
        if (bl2) {
            n5 |= 0x10000000;
        }
        if ((n4 = jh2.a.length() - 1) > 3) {
            n4 = 3;
        }
        int n6 = jh2.b;
        this.k.addElement(n5 |= n4 << 29);
        this.l.addElement(n6);
        if (bl2) {
            int n7 = this.k.size() - 2;
            int n8 = (Integer)this.k.elementAt(n7);
            this.k.setElementAt(n8 |= 0x10000000, n7);
        }
    }

    String a(int n2) {
        int n3 = (Integer)this.k.elementAt(n2);
        int n4 = (Integer)this.l.elementAt(n2);
        int n5 = jd.a(n3);
        switch (n5) {
            case 0: {
                char[] arrc = new char[]{(char)n4};
                return new String(arrc);
            }
            case 1: 
            case 2: {
                return this.j.substring(n4, n4 + n5 + 1);
            }
            case 3: {
                n5 = 0;
                for (int i2 = 0; i2 < this.m.size(); i2 += 2) {
                    int n6 = (Integer)this.m.elementAt(i2);
                    if (n4 > n6) continue;
                    n5 = (Integer)this.m.elementAt(i2 + 1);
                    break;
                }
                if (!a && n5 < 3) {
                    throw new AssertionError();
                }
                return this.j.substring(n4, n4 + n5);
            }
        }
        if (!a) {
            throw new AssertionError();
        }
        return "";
    }

    void a() {
        int n2;
        int n3;
        int n4;
        jr jr2 = this.b.a;
        int n5 = this.k.size();
        int n6 = 0;
        jr2.a(this.d);
        jr2.d = this.d.size();
        if (!a && jr2.d != 128) {
            throw new AssertionError();
        }
        jr2.e = n5;
        for (n4 = 0; n4 < n5; ++n4) {
            n3 = (Integer)this.k.elementAt(n4);
            if (!a && (n3 & 0xFFFFFF) < (n6 & 0xFFFFFF)) {
                throw new AssertionError();
            }
            if (!a && (n3 & 0xFF000000) == 0) {
                throw new AssertionError();
            }
            this.d.writeInt(n3);
            n6 = n3;
        }
        n3 = this.l.size();
        if (!a && n5 != n3) {
            throw new AssertionError();
        }
        jr2.f = this.d.size();
        jr2.g = n3;
        for (n4 = 0; n4 < n3; ++n4) {
            n2 = (Integer)this.l.elementAt(n4);
            if (!a && n2 >= 65535) {
                throw new AssertionError();
            }
            this.d.writeShort((short)n2);
        }
        n2 = this.j.length();
        String string = this.j.toString();
        jr2.h = this.d.size();
        jr2.i = n2;
        for (n4 = 0; n4 < n2; ++n4) {
            this.d.writeChar(string.charAt(n4));
        }
        int n7 = this.m.size();
        int n8 = 0;
        jr2.k = n7 / 2;
        jr2.j = this.d.size();
        for (n4 = 0; n4 < n7; n4 += 2) {
            int n9 = (Integer)this.m.elementAt(n4);
            int n10 = (Integer)this.m.elementAt(n4 + 1);
            if (!a && n9 >= n2) {
                throw new AssertionError();
            }
            if (!a && n10 >= 40) {
                throw new AssertionError();
            }
            if (!a && n10 <= n8) {
                throw new AssertionError();
            }
            this.d.writeShort((short)n9);
            this.d.writeShort((short)n10);
            n8 = n10;
        }
        this.d.flush();
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.c.toByteArray()));
        dataInputStream.mark(Integer.MAX_VALUE);
        this.b.a(dataInputStream);
    }

    public static void a(jp jp2, Reader reader) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        jg jg2 = new jg(jp2, byteArrayOutputStream);
        jg2.a(reader);
    }

    static {
        a = !jd.class.desiredAssertionStatus();
    }
}

