/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h;

import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Iterator;
import org.apache.commons.c.a.a;
import org.apache.commons.c.aa;
import org.apache.commons.c.an;
import org.apache.commons.c.c;
import org.apache.commons.c.h.f;
import org.apache.commons.c.h.g;
import org.apache.commons.c.h.h;
import org.apache.commons.c.h.k;
import org.apache.commons.c.h.r;

public class e
implements Serializable,
Appendable,
CharSequence,
a {
    static final int a = 32;
    private static final long d = 7628716375283629643L;
    protected char[] b;
    protected int c;
    private String e;
    private String f;

    public e() {
        this(32);
    }

    public e(int n2) {
        if (n2 <= 0) {
            n2 = 32;
        }
        this.b = new char[n2];
    }

    public e(String string) {
        if (string == null) {
            this.b = new char[32];
        } else {
            this.b = new char[string.length() + 32];
            this.c(string);
        }
    }

    public String b() {
        return this.e;
    }

    public e a(String string) {
        this.e = string;
        return this;
    }

    public String c() {
        return this.f;
    }

    public e b(String string) {
        if (string != null && string.isEmpty()) {
            string = null;
        }
        this.f = string;
        return this;
    }

    @Override
    public int length() {
        return this.c;
    }

    public e a(int n2) {
        if (n2 < 0) {
            throw new StringIndexOutOfBoundsException(n2);
        }
        if (n2 < this.c) {
            this.c = n2;
        } else if (n2 > this.c) {
            this.b(n2);
            int n3 = this.c;
            int n4 = n2;
            this.c = n2;
            for (int i2 = n3; i2 < n4; ++i2) {
                this.b[i2] = '\u0000';
            }
        }
        return this;
    }

    public int d() {
        return this.b.length;
    }

    public e b(int n2) {
        if (n2 > this.b.length) {
            char[] arrc = this.b;
            this.b = new char[n2 * 2];
            System.arraycopy(arrc, 0, this.b, 0, this.c);
        }
        return this;
    }

    public e e() {
        if (this.b.length > this.length()) {
            char[] arrc = this.b;
            this.b = new char[this.length()];
            System.arraycopy(arrc, 0, this.b, 0, this.c);
        }
        return this;
    }

    public int f() {
        return this.c;
    }

    public boolean g() {
        return this.c == 0;
    }

    public e h() {
        this.c = 0;
        return this;
    }

    @Override
    public char charAt(int n2) {
        if (n2 < 0 || n2 >= this.length()) {
            throw new StringIndexOutOfBoundsException(n2);
        }
        return this.b[n2];
    }

    public e a(int n2, char c2) {
        if (n2 < 0 || n2 >= this.length()) {
            throw new StringIndexOutOfBoundsException(n2);
        }
        this.b[n2] = c2;
        return this;
    }

    public e c(int n2) {
        if (n2 < 0 || n2 >= this.c) {
            throw new StringIndexOutOfBoundsException(n2);
        }
        this.a(n2, n2 + 1, 1);
        return this;
    }

    public char[] i() {
        if (this.c == 0) {
            return org.apache.commons.c.c.r;
        }
        char[] arrc = new char[this.c];
        System.arraycopy(this.b, 0, arrc, 0, this.c);
        return arrc;
    }

    public char[] a(int n2, int n3) {
        int n4 = (n3 = this.f(n2, n3)) - n2;
        if (n4 == 0) {
            return org.apache.commons.c.c.r;
        }
        char[] arrc = new char[n4];
        System.arraycopy(this.b, n2, arrc, 0, n4);
        return arrc;
    }

    public char[] a(char[] arrc) {
        int n2 = this.length();
        if (arrc == null || arrc.length < n2) {
            arrc = new char[n2];
        }
        System.arraycopy(this.b, 0, arrc, 0, n2);
        return arrc;
    }

    public void a(int n2, int n3, char[] arrc, int n4) {
        if (n2 < 0) {
            throw new StringIndexOutOfBoundsException(n2);
        }
        if (n3 < 0 || n3 > this.length()) {
            throw new StringIndexOutOfBoundsException(n3);
        }
        if (n2 > n3) {
            throw new StringIndexOutOfBoundsException("end < start");
        }
        System.arraycopy(this.b, n2, arrc, n4, n3 - n2);
    }

    public e j() {
        if (this.e == null) {
            this.c(an.F);
            return this;
        }
        return this.c(this.e);
    }

    public e k() {
        if (this.f == null) {
            return this;
        }
        return this.c(this.f);
    }

    public e a(Object object) {
        if (object == null) {
            return this.k();
        }
        return this.c(object.toString());
    }

    public e a(CharSequence charSequence) {
        if (charSequence == null) {
            return this.k();
        }
        return this.c(charSequence.toString());
    }

    public e a(CharSequence charSequence, int n2, int n3) {
        if (charSequence == null) {
            return this.k();
        }
        return this.a(charSequence.toString(), n2, n3);
    }

    public e c(String string) {
        if (string == null) {
            return this.k();
        }
        int n2 = string.length();
        if (n2 > 0) {
            int n3 = this.length();
            this.b(n3 + n2);
            string.getChars(0, n2, this.b, n3);
            this.c += n2;
        }
        return this;
    }

    public e a(String string, int n2, int n3) {
        if (string == null) {
            return this.k();
        }
        if (n2 < 0 || n2 > string.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (n3 < 0 || n2 + n3 > string.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (n3 > 0) {
            int n4 = this.length();
            this.b(n4 + n3);
            string.getChars(n2, n2 + n3, this.b, n4);
            this.c += n3;
        }
        return this;
    }

    public e a(String string, Object ... arrobject) {
        return this.c(String.format(string, arrobject));
    }

    public e a(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return this.k();
        }
        int n2 = stringBuffer.length();
        if (n2 > 0) {
            int n3 = this.length();
            this.b(n3 + n2);
            stringBuffer.getChars(0, n2, this.b, n3);
            this.c += n2;
        }
        return this;
    }

    public e a(StringBuffer stringBuffer, int n2, int n3) {
        if (stringBuffer == null) {
            return this.k();
        }
        if (n2 < 0 || n2 > stringBuffer.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (n3 < 0 || n2 + n3 > stringBuffer.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (n3 > 0) {
            int n4 = this.length();
            this.b(n4 + n3);
            stringBuffer.getChars(n2, n2 + n3, this.b, n4);
            this.c += n3;
        }
        return this;
    }

    public e a(StringBuilder stringBuilder) {
        if (stringBuilder == null) {
            return this.k();
        }
        int n2 = stringBuilder.length();
        if (n2 > 0) {
            int n3 = this.length();
            this.b(n3 + n2);
            stringBuilder.getChars(0, n2, this.b, n3);
            this.c += n2;
        }
        return this;
    }

    public e a(StringBuilder stringBuilder, int n2, int n3) {
        if (stringBuilder == null) {
            return this.k();
        }
        if (n2 < 0 || n2 > stringBuilder.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (n3 < 0 || n2 + n3 > stringBuilder.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (n3 > 0) {
            int n4 = this.length();
            this.b(n4 + n3);
            stringBuilder.getChars(n2, n2 + n3, this.b, n4);
            this.c += n3;
        }
        return this;
    }

    public e a(e e2) {
        if (e2 == null) {
            return this.k();
        }
        int n2 = e2.length();
        if (n2 > 0) {
            int n3 = this.length();
            this.b(n3 + n2);
            System.arraycopy(e2.b, 0, this.b, n3, n2);
            this.c += n2;
        }
        return this;
    }

    public e a(e e2, int n2, int n3) {
        if (e2 == null) {
            return this.k();
        }
        if (n2 < 0 || n2 > e2.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (n3 < 0 || n2 + n3 > e2.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (n3 > 0) {
            int n4 = this.length();
            this.b(n4 + n3);
            e2.a(n2, n2 + n3, this.b, n4);
            this.c += n3;
        }
        return this;
    }

    public e b(char[] arrc) {
        if (arrc == null) {
            return this.k();
        }
        int n2 = arrc.length;
        if (n2 > 0) {
            int n3 = this.length();
            this.b(n3 + n2);
            System.arraycopy(arrc, 0, this.b, n3, n2);
            this.c += n2;
        }
        return this;
    }

    public e a(char[] arrc, int n2, int n3) {
        if (arrc == null) {
            return this.k();
        }
        if (n2 < 0 || n2 > arrc.length) {
            throw new StringIndexOutOfBoundsException("Invalid startIndex: " + n3);
        }
        if (n3 < 0 || n2 + n3 > arrc.length) {
            throw new StringIndexOutOfBoundsException("Invalid length: " + n3);
        }
        if (n3 > 0) {
            int n4 = this.length();
            this.b(n4 + n3);
            System.arraycopy(arrc, n2, this.b, n4, n3);
            this.c += n3;
        }
        return this;
    }

    public e a(boolean bl2) {
        if (bl2) {
            this.b(this.c + 4);
            this.b[this.c++] = 116;
            this.b[this.c++] = 114;
            this.b[this.c++] = 117;
            this.b[this.c++] = 101;
        } else {
            this.b(this.c + 5);
            this.b[this.c++] = 102;
            this.b[this.c++] = 97;
            this.b[this.c++] = 108;
            this.b[this.c++] = 115;
            this.b[this.c++] = 101;
        }
        return this;
    }

    public e a(char c2) {
        int n2 = this.length();
        this.b(n2 + 1);
        this.b[this.c++] = c2;
        return this;
    }

    public e d(int n2) {
        return this.c(String.valueOf(n2));
    }

    public e a(long l2) {
        return this.c(String.valueOf(l2));
    }

    public e a(float f2) {
        return this.c(String.valueOf(f2));
    }

    public e a(double d2) {
        return this.c(String.valueOf(d2));
    }

    public e b(Object object) {
        return this.a(object).j();
    }

    public e d(String string) {
        return this.c(string).j();
    }

    public e b(String string, int n2, int n3) {
        return this.a(string, n2, n3).j();
    }

    public e b(String string, Object ... arrobject) {
        return this.a(string, arrobject).j();
    }

    public e b(StringBuffer stringBuffer) {
        return this.a(stringBuffer).j();
    }

    public e b(StringBuilder stringBuilder) {
        return this.a(stringBuilder).j();
    }

    public e b(StringBuilder stringBuilder, int n2, int n3) {
        return this.a(stringBuilder, n2, n3).j();
    }

    public e b(StringBuffer stringBuffer, int n2, int n3) {
        return this.a(stringBuffer, n2, n3).j();
    }

    public e b(e e2) {
        return this.a(e2).j();
    }

    public e b(e e2, int n2, int n3) {
        return this.a(e2, n2, n3).j();
    }

    public e c(char[] arrc) {
        return this.b(arrc).j();
    }

    public e b(char[] arrc, int n2, int n3) {
        return this.a(arrc, n2, n3).j();
    }

    public e b(boolean bl2) {
        return this.a(bl2).j();
    }

    public e b(char c2) {
        return this.a(c2).j();
    }

    public e e(int n2) {
        return this.d(n2).j();
    }

    public e b(long l2) {
        return this.a(l2).j();
    }

    public e b(float f2) {
        return this.a(f2).j();
    }

    public e b(double d2) {
        return this.a(d2).j();
    }

    public e a(Object ... arrobject) {
        if (arrobject != null && arrobject.length > 0) {
            for (Object object : arrobject) {
                this.a(object);
            }
        }
        return this;
    }

    public e a(Iterable iterable) {
        if (iterable != null) {
            for (Object t2 : iterable) {
                this.a(t2);
            }
        }
        return this;
    }

    public e a(Iterator iterator) {
        if (iterator != null) {
            while (iterator.hasNext()) {
                this.a(iterator.next());
            }
        }
        return this;
    }

    public e a(Object[] arrobject, String string) {
        if (arrobject != null && arrobject.length > 0) {
            String string2 = aa.c((Object)string);
            this.a(arrobject[0]);
            for (int i2 = 1; i2 < arrobject.length; ++i2) {
                this.c(string2);
                this.a(arrobject[i2]);
            }
        }
        return this;
    }

    public e a(Iterable iterable, String string) {
        if (iterable != null) {
            String string2 = aa.c((Object)string);
            Iterator iterator = iterable.iterator();
            while (iterator.hasNext()) {
                this.a(iterator.next());
                if (!iterator.hasNext()) continue;
                this.c(string2);
            }
        }
        return this;
    }

    public e a(Iterator iterator, String string) {
        if (iterator != null) {
            String string2 = aa.c((Object)string);
            while (iterator.hasNext()) {
                this.a(iterator.next());
                if (!iterator.hasNext()) continue;
                this.c(string2);
            }
        }
        return this;
    }

    public e e(String string) {
        return this.a(string, null);
    }

    public e a(String string, String string2) {
        String string3;
        String string4 = string3 = this.g() ? string2 : string;
        if (string3 != null) {
            this.c(string3);
        }
        return this;
    }

    public e c(char c2) {
        if (this.f() > 0) {
            this.a(c2);
        }
        return this;
    }

    public e a(char c2, char c3) {
        if (this.f() > 0) {
            this.a(c2);
        } else {
            this.a(c3);
        }
        return this;
    }

    public e a(String string, int n2) {
        if (string != null && n2 > 0) {
            this.c(string);
        }
        return this;
    }

    public e a(char c2, int n2) {
        if (n2 > 0) {
            this.a(c2);
        }
        return this;
    }

    public e b(int n2, char c2) {
        if (n2 >= 0) {
            this.b(this.c + n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                this.b[this.c++] = c2;
            }
        }
        return this;
    }

    public e a(Object object, int n2, char c2) {
        if (n2 > 0) {
            int n3;
            String string;
            this.b(this.c + n2);
            String string2 = string = object == null ? this.c() : object.toString();
            if (string == null) {
                string = "";
            }
            if ((n3 = string.length()) >= n2) {
                string.getChars(n3 - n2, n3, this.b, this.c);
            } else {
                int n4 = n2 - n3;
                for (int i2 = 0; i2 < n4; ++i2) {
                    this.b[this.c + i2] = c2;
                }
                string.getChars(0, n3, this.b, this.c + n4);
            }
            this.c += n2;
        }
        return this;
    }

    public e a(int n2, int n3, char c2) {
        return this.a((Object)String.valueOf(n2), n3, c2);
    }

    public e b(Object object, int n2, char c2) {
        if (n2 > 0) {
            int n3;
            String string;
            this.b(this.c + n2);
            String string2 = string = object == null ? this.c() : object.toString();
            if (string == null) {
                string = "";
            }
            if ((n3 = string.length()) >= n2) {
                string.getChars(0, n2, this.b, this.c);
            } else {
                int n4 = n2 - n3;
                string.getChars(0, n3, this.b, this.c);
                for (int i2 = 0; i2 < n4; ++i2) {
                    this.b[this.c + n3 + i2] = c2;
                }
            }
            this.c += n2;
        }
        return this;
    }

    public e b(int n2, int n3, char c2) {
        return this.b((Object)String.valueOf(n2), n3, c2);
    }

    public e a(int n2, Object object) {
        if (object == null) {
            return this.a(n2, this.f);
        }
        return this.a(n2, object.toString());
    }

    public e a(int n2, String string) {
        int n3;
        this.i(n2);
        if (string == null) {
            string = this.f;
        }
        if (string != null && (n3 = string.length()) > 0) {
            int n4 = this.c + n3;
            this.b(n4);
            System.arraycopy(this.b, n2, this.b, n2 + n3, this.c - n2);
            this.c = n4;
            string.getChars(0, n3, this.b, n2);
        }
        return this;
    }

    public e a(int n2, char[] arrc) {
        this.i(n2);
        if (arrc == null) {
            return this.a(n2, this.f);
        }
        int n3 = arrc.length;
        if (n3 > 0) {
            this.b(this.c + n3);
            System.arraycopy(this.b, n2, this.b, n2 + n3, this.c - n2);
            System.arraycopy(arrc, 0, this.b, n2, n3);
            this.c += n3;
        }
        return this;
    }

    public e a(int n2, char[] arrc, int n3, int n4) {
        this.i(n2);
        if (arrc == null) {
            return this.a(n2, this.f);
        }
        if (n3 < 0 || n3 > arrc.length) {
            throw new StringIndexOutOfBoundsException("Invalid offset: " + n3);
        }
        if (n4 < 0 || n3 + n4 > arrc.length) {
            throw new StringIndexOutOfBoundsException("Invalid length: " + n4);
        }
        if (n4 > 0) {
            this.b(this.c + n4);
            System.arraycopy(this.b, n2, this.b, n2 + n4, this.c - n2);
            System.arraycopy(arrc, n3, this.b, n2, n4);
            this.c += n4;
        }
        return this;
    }

    public e a(int n2, boolean bl2) {
        this.i(n2);
        if (bl2) {
            this.b(this.c + 4);
            System.arraycopy(this.b, n2, this.b, n2 + 4, this.c - n2);
            this.b[n2++] = 116;
            this.b[n2++] = 114;
            this.b[n2++] = 117;
            this.b[n2] = 101;
            this.c += 4;
        } else {
            this.b(this.c + 5);
            System.arraycopy(this.b, n2, this.b, n2 + 5, this.c - n2);
            this.b[n2++] = 102;
            this.b[n2++] = 97;
            this.b[n2++] = 108;
            this.b[n2++] = 115;
            this.b[n2] = 101;
            this.c += 5;
        }
        return this;
    }

    public e c(int n2, char c2) {
        this.i(n2);
        this.b(this.c + 1);
        System.arraycopy(this.b, n2, this.b, n2 + 1, this.c - n2);
        this.b[n2] = c2;
        ++this.c;
        return this;
    }

    public e b(int n2, int n3) {
        return this.a(n2, String.valueOf(n3));
    }

    public e a(int n2, long l2) {
        return this.a(n2, String.valueOf(l2));
    }

    public e a(int n2, float f2) {
        return this.a(n2, String.valueOf(f2));
    }

    public e a(int n2, double d2) {
        return this.a(n2, String.valueOf(d2));
    }

    private void a(int n2, int n3, int n4) {
        System.arraycopy(this.b, n3, this.b, n2, this.c - n3);
        this.c -= n4;
    }

    public e c(int n2, int n3) {
        int n4 = (n3 = this.f(n2, n3)) - n2;
        if (n4 > 0) {
            this.a(n2, n3, n4);
        }
        return this;
    }

    public e d(char c2) {
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (this.b[i2] != c2) continue;
            int n2 = i2;
            while (++i2 < this.c && this.b[i2] == c2) {
            }
            int n3 = i2 - n2;
            this.a(n2, i2, n3);
            i2 -= n3;
        }
        return this;
    }

    public e e(char c2) {
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (this.b[i2] != c2) continue;
            this.a(i2, i2 + 1, 1);
            break;
        }
        return this;
    }

    public e f(String string) {
        int n2;
        int n3 = n2 = string == null ? 0 : string.length();
        if (n2 > 0) {
            int n4 = this.b(string, 0);
            while (n4 >= 0) {
                this.a(n4, n4 + n2, n2);
                n4 = this.b(string, n4);
            }
        }
        return this;
    }

    public e g(String string) {
        int n2;
        int n3;
        int n4 = n3 = string == null ? 0 : string.length();
        if (n3 > 0 && (n2 = this.b(string, 0)) >= 0) {
            this.a(n2, n2 + n3, n3);
        }
        return this;
    }

    public e a(k k2) {
        return this.a(k2, null, 0, this.c, -1);
    }

    public e b(k k2) {
        return this.a(k2, null, 0, this.c, 1);
    }

    private void a(int n2, int n3, int n4, String string, int n5) {
        int n6 = this.c - n4 + n5;
        if (n5 != n4) {
            this.b(n6);
            System.arraycopy(this.b, n3, this.b, n2 + n5, this.c - n3);
            this.c = n6;
        }
        if (n5 > 0) {
            string.getChars(0, n5, this.b, n2);
        }
    }

    public e a(int n2, int n3, String string) {
        n3 = this.f(n2, n3);
        int n4 = string == null ? 0 : string.length();
        this.a(n2, n3, n3 - n2, string, n4);
        return this;
    }

    public e b(char c2, char c3) {
        if (c2 != c3) {
            for (int i2 = 0; i2 < this.c; ++i2) {
                if (this.b[i2] != c2) continue;
                this.b[i2] = c3;
            }
        }
        return this;
    }

    public e c(char c2, char c3) {
        if (c2 != c3) {
            for (int i2 = 0; i2 < this.c; ++i2) {
                if (this.b[i2] != c2) continue;
                this.b[i2] = c3;
                break;
            }
        }
        return this;
    }

    public e b(String string, String string2) {
        int n2;
        int n3 = n2 = string == null ? 0 : string.length();
        if (n2 > 0) {
            int n4 = string2 == null ? 0 : string2.length();
            int n5 = this.b(string, 0);
            while (n5 >= 0) {
                this.a(n5, n5 + n2, n2, string2, n4);
                n5 = this.b(string, n5 + n4);
            }
        }
        return this;
    }

    public e c(String string, String string2) {
        int n2;
        int n3;
        int n4 = n3 = string == null ? 0 : string.length();
        if (n3 > 0 && (n2 = this.b(string, 0)) >= 0) {
            int n5 = string2 == null ? 0 : string2.length();
            this.a(n2, n2 + n3, n3, string2, n5);
        }
        return this;
    }

    public e a(k k2, String string) {
        return this.a(k2, string, 0, this.c, -1);
    }

    public e b(k k2, String string) {
        return this.a(k2, string, 0, this.c, 1);
    }

    public e a(k k2, String string, int n2, int n3, int n4) {
        n3 = this.f(n2, n3);
        return this.b(k2, string, n2, n3, n4);
    }

    private e b(k k2, String string, int n2, int n3, int n4) {
        if (k2 == null || this.c == 0) {
            return this;
        }
        int n5 = string == null ? 0 : string.length();
        char[] arrc = this.b;
        for (int i2 = n2; i2 < n3 && n4 != 0; ++i2) {
            int n6 = k2.a(arrc, i2, n2, n3);
            if (n6 <= 0) continue;
            this.a(i2, i2 + n6, n6, string, n5);
            n3 = n3 - n6 + n5;
            i2 = i2 + n5 - 1;
            if (n4 <= 0) continue;
            --n4;
        }
        return this;
    }

    public e l() {
        if (this.c == 0) {
            return this;
        }
        int n2 = this.c / 2;
        char[] arrc = this.b;
        int n3 = 0;
        int n4 = this.c - 1;
        while (n3 < n2) {
            char c2 = arrc[n3];
            arrc[n3] = arrc[n4];
            arrc[n4] = c2;
            ++n3;
            --n4;
        }
        return this;
    }

    public e m() {
        int n2;
        if (this.c == 0) {
            return this;
        }
        int n3 = this.c;
        char[] arrc = this.b;
        for (n2 = 0; n2 < n3 && arrc[n2] <= ' '; ++n2) {
        }
        while (n2 < n3 && arrc[n3 - 1] <= ' ') {
            --n3;
        }
        if (n3 < this.c) {
            this.c(n3, this.c);
        }
        if (n2 > 0) {
            this.c(0, n2);
        }
        return this;
    }

    public boolean h(String string) {
        if (string == null) {
            return false;
        }
        int n2 = string.length();
        if (n2 == 0) {
            return true;
        }
        if (n2 > this.c) {
            return false;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.b[i2] == string.charAt(i2)) continue;
            return false;
        }
        return true;
    }

    public boolean i(String string) {
        if (string == null) {
            return false;
        }
        int n2 = string.length();
        if (n2 == 0) {
            return true;
        }
        if (n2 > this.c) {
            return false;
        }
        int n3 = this.c - n2;
        int n4 = 0;
        while (n4 < n2) {
            if (this.b[n3] != string.charAt(n4)) {
                return false;
            }
            ++n4;
            ++n3;
        }
        return true;
    }

    @Override
    public CharSequence subSequence(int n2, int n3) {
        if (n2 < 0) {
            throw new StringIndexOutOfBoundsException(n2);
        }
        if (n3 > this.c) {
            throw new StringIndexOutOfBoundsException(n3);
        }
        if (n2 > n3) {
            throw new StringIndexOutOfBoundsException(n3 - n2);
        }
        return this.d(n2, n3);
    }

    public String f(int n2) {
        return this.d(n2, this.c);
    }

    public String d(int n2, int n3) {
        n3 = this.f(n2, n3);
        return new String(this.b, n2, n3 - n2);
    }

    public String g(int n2) {
        if (n2 <= 0) {
            return "";
        }
        if (n2 >= this.c) {
            return new String(this.b, 0, this.c);
        }
        return new String(this.b, 0, n2);
    }

    public String h(int n2) {
        if (n2 <= 0) {
            return "";
        }
        if (n2 >= this.c) {
            return new String(this.b, 0, this.c);
        }
        return new String(this.b, this.c - n2, n2);
    }

    public String e(int n2, int n3) {
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 <= 0 || n2 >= this.c) {
            return "";
        }
        if (this.c <= n2 + n3) {
            return new String(this.b, n2, this.c - n2);
        }
        return new String(this.b, n2, n3);
    }

    public boolean f(char c2) {
        char[] arrc = this.b;
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (arrc[i2] != c2) continue;
            return true;
        }
        return false;
    }

    public boolean j(String string) {
        return this.b(string, 0) >= 0;
    }

    public boolean c(k k2) {
        return this.a(k2, 0) >= 0;
    }

    public int g(char c2) {
        return this.b(c2, 0);
    }

    public int b(char c2, int n2) {
        int n3 = n2 = n2 < 0 ? 0 : n2;
        if (n2 >= this.c) {
            return -1;
        }
        char[] arrc = this.b;
        for (int i2 = n2; i2 < this.c; ++i2) {
            if (arrc[i2] != c2) continue;
            return i2;
        }
        return -1;
    }

    public int k(String string) {
        return this.b(string, 0);
    }

    public int b(String string, int n2) {
        int n3 = n2 = n2 < 0 ? 0 : n2;
        if (string == null || n2 >= this.c) {
            return -1;
        }
        int n4 = string.length();
        if (n4 == 1) {
            return this.b(string.charAt(0), n2);
        }
        if (n4 == 0) {
            return n2;
        }
        if (n4 > this.c) {
            return -1;
        }
        char[] arrc = this.b;
        int n5 = this.c - n4 + 1;
        block0: for (int i2 = n2; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                if (string.charAt(i3) != arrc[i2 + i3]) continue block0;
            }
            return i2;
        }
        return -1;
    }

    public int d(k k2) {
        return this.a(k2, 0);
    }

    public int a(k k2, int n2) {
        int n3 = n2 = n2 < 0 ? 0 : n2;
        if (k2 == null || n2 >= this.c) {
            return -1;
        }
        int n4 = this.c;
        char[] arrc = this.b;
        for (int i2 = n2; i2 < n4; ++i2) {
            if (k2.a(arrc, i2, n2, n4) <= 0) continue;
            return i2;
        }
        return -1;
    }

    public int h(char c2) {
        return this.c(c2, this.c - 1);
    }

    public int c(char c2, int n2) {
        int n3 = n2 = n2 >= this.c ? this.c - 1 : n2;
        if (n2 < 0) {
            return -1;
        }
        for (int i2 = n2; i2 >= 0; --i2) {
            if (this.b[i2] != c2) continue;
            return i2;
        }
        return -1;
    }

    public int l(String string) {
        return this.c(string, this.c - 1);
    }

    public int c(String string, int n2) {
        int n3 = n2 = n2 >= this.c ? this.c - 1 : n2;
        if (string == null || n2 < 0) {
            return -1;
        }
        int n4 = string.length();
        if (n4 > 0 && n4 <= this.c) {
            if (n4 == 1) {
                return this.c(string.charAt(0), n2);
            }
            block0: for (int i2 = n2 - n4 + 1; i2 >= 0; --i2) {
                for (int i3 = 0; i3 < n4; ++i3) {
                    if (string.charAt(i3) != this.b[i2 + i3]) continue block0;
                }
                return i2;
            }
        } else if (n4 == 0) {
            return n2;
        }
        return -1;
    }

    public int e(k k2) {
        return this.b(k2, this.c);
    }

    public int b(k k2, int n2) {
        int n3 = n2 = n2 >= this.c ? this.c - 1 : n2;
        if (k2 == null || n2 < 0) {
            return -1;
        }
        char[] arrc = this.b;
        int n4 = n2 + 1;
        for (int i2 = n2; i2 >= 0; --i2) {
            if (k2.a(arrc, i2, 0, n4) <= 0) continue;
            return i2;
        }
        return -1;
    }

    public r n() {
        return new g(this);
    }

    public Reader o() {
        return new f(this);
    }

    public Writer p() {
        return new h(this);
    }

    public boolean c(e e2) {
        if (this == e2) {
            return true;
        }
        if (this.c != e2.c) {
            return false;
        }
        char[] arrc = this.b;
        char[] arrc2 = e2.b;
        for (int i2 = this.c - 1; i2 >= 0; --i2) {
            char c2 = arrc[i2];
            char c3 = arrc2[i2];
            if (c2 == c3 || Character.toUpperCase(c2) == Character.toUpperCase(c3)) continue;
            return false;
        }
        return true;
    }

    public boolean d(e e2) {
        if (this == e2) {
            return true;
        }
        if (this.c != e2.c) {
            return false;
        }
        char[] arrc = this.b;
        char[] arrc2 = e2.b;
        for (int i2 = this.c - 1; i2 >= 0; --i2) {
            if (arrc[i2] == arrc2[i2]) continue;
            return false;
        }
        return true;
    }

    public boolean equals(Object object) {
        if (object instanceof e) {
            return this.d((e)object);
        }
        return false;
    }

    public int hashCode() {
        char[] arrc = this.b;
        int n2 = 0;
        for (int i2 = this.c - 1; i2 >= 0; --i2) {
            n2 = 31 * n2 + arrc[i2];
        }
        return n2;
    }

    @Override
    public String toString() {
        return new String(this.b, 0, this.c);
    }

    public StringBuffer q() {
        return new StringBuffer(this.c).append(this.b, 0, this.c);
    }

    public StringBuilder r() {
        return new StringBuilder(this.c).append(this.b, 0, this.c);
    }

    public String s() {
        return this.toString();
    }

    protected int f(int n2, int n3) {
        if (n2 < 0) {
            throw new StringIndexOutOfBoundsException(n2);
        }
        if (n3 > this.c) {
            n3 = this.c;
        }
        if (n2 > n3) {
            throw new StringIndexOutOfBoundsException("end < start");
        }
        return n3;
    }

    protected void i(int n2) {
        if (n2 < 0 || n2 > this.c) {
            throw new StringIndexOutOfBoundsException(n2);
        }
    }

    @Override
    public /* synthetic */ Appendable append(char c2) {
        return this.a(c2);
    }

    @Override
    public /* synthetic */ Appendable append(CharSequence charSequence, int n2, int n3) {
        return this.a(charSequence, n2, n3);
    }

    @Override
    public /* synthetic */ Appendable append(CharSequence charSequence) {
        return this.a(charSequence);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.s();
    }
}

