/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.apache.commons.c.am;
import org.apache.commons.c.c;
import org.apache.commons.c.h.e;
import org.apache.commons.c.h.k;

public class r
implements Cloneable,
ListIterator {
    private static final r a = new r();
    private static final r b;
    private char[] c;
    private String[] d;
    private int e;
    private k f = org.apache.commons.c.h.k.d();
    private k g = org.apache.commons.c.h.k.i();
    private k h = org.apache.commons.c.h.k.i();
    private k i = org.apache.commons.c.h.k.i();
    private boolean j = false;
    private boolean k = true;

    private static r s() {
        return (r)a.clone();
    }

    public static r b() {
        return r.s();
    }

    public static r a(String string) {
        r r2 = r.s();
        r2.c(string);
        return r2;
    }

    public static r a(char[] arrc) {
        r r2 = r.s();
        r2.c(arrc);
        return r2;
    }

    private static r t() {
        return (r)b.clone();
    }

    public static r c() {
        return r.t();
    }

    public static r b(String string) {
        r r2 = r.t();
        r2.c(string);
        return r2;
    }

    public static r b(char[] arrc) {
        r r2 = r.t();
        r2.c(arrc);
        return r2;
    }

    public r() {
        this.c = null;
    }

    public r(String string) {
        this.c = (char[])(string != null ? string.toCharArray() : null);
    }

    public r(String string, char c2) {
        this(string);
        this.a(c2);
    }

    public r(String string, String string2) {
        this(string);
        this.f(string2);
    }

    public r(String string, k k2) {
        this(string);
        this.a(k2);
    }

    public r(String string, char c2, char c3) {
        this(string, c2);
        this.b(c3);
    }

    public r(String string, k k2, k k3) {
        this(string, k2);
        this.b(k3);
    }

    public r(char[] arrc) {
        this.c = org.apache.commons.c.c.a(arrc);
    }

    public r(char[] arrc, char c2) {
        this(arrc);
        this.a(c2);
    }

    public r(char[] arrc, String string) {
        this(arrc);
        this.f(string);
    }

    public r(char[] arrc, k k2) {
        this(arrc);
        this.a(k2);
    }

    public r(char[] arrc, char c2, char c3) {
        this(arrc, c2);
        this.b(c3);
    }

    public r(char[] arrc, k k2, k k3) {
        this(arrc, k2);
        this.b(k3);
    }

    public int d() {
        this.u();
        return this.d.length;
    }

    public String e() {
        if (this.hasNext()) {
            return this.d[this.e++];
        }
        return null;
    }

    public String f() {
        if (this.hasPrevious()) {
            return this.d[--this.e];
        }
        return null;
    }

    public String[] g() {
        this.u();
        return (String[])this.d.clone();
    }

    public List h() {
        this.u();
        ArrayList<String> arrayList = new ArrayList<String>(this.d.length);
        for (String string : this.d) {
            arrayList.add(string);
        }
        return arrayList;
    }

    public r i() {
        this.e = 0;
        this.d = null;
        return this;
    }

    public r c(String string) {
        this.i();
        this.c = (char[])(string != null ? string.toCharArray() : null);
        return this;
    }

    public r c(char[] arrc) {
        this.i();
        this.c = org.apache.commons.c.c.a(arrc);
        return this;
    }

    @Override
    public boolean hasNext() {
        this.u();
        return this.e < this.d.length;
    }

    public String j() {
        if (this.hasNext()) {
            return this.d[this.e++];
        }
        throw new NoSuchElementException();
    }

    @Override
    public int nextIndex() {
        return this.e;
    }

    @Override
    public boolean hasPrevious() {
        this.u();
        return this.e > 0;
    }

    public String k() {
        if (this.hasPrevious()) {
            return this.d[--this.e];
        }
        throw new NoSuchElementException();
    }

    @Override
    public int previousIndex() {
        return this.e - 1;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove() is unsupported");
    }

    public void d(String string) {
        throw new UnsupportedOperationException("set() is unsupported");
    }

    public void e(String string) {
        throw new UnsupportedOperationException("add() is unsupported");
    }

    private void u() {
        if (this.d == null) {
            if (this.c == null) {
                List list = this.a(null, 0, 0);
                this.d = list.toArray(new String[list.size()]);
            } else {
                List list = this.a(this.c, 0, this.c.length);
                this.d = list.toArray(new String[list.size()]);
            }
        }
    }

    protected List a(char[] arrc, int n2, int n3) {
        if (arrc == null || n3 == 0) {
            return Collections.emptyList();
        }
        e e2 = new e();
        ArrayList arrayList = new ArrayList();
        int n4 = n2;
        while (n4 >= 0 && n4 < n3) {
            if ((n4 = this.a(arrc, n4, n3, e2, arrayList)) < n3) continue;
            this.a(arrayList, "");
        }
        return arrayList;
    }

    private void a(List list, String string) {
        if (am.a((CharSequence)string)) {
            if (this.q()) {
                return;
            }
            if (this.p()) {
                string = null;
            }
        }
        list.add(string);
    }

    private int a(char[] arrc, int n2, int n3, e e2, List list) {
        int n4;
        while (n2 < n3 && (n4 = Math.max(this.n().a(arrc, n2, n2, n3), this.o().a(arrc, n2, n2, n3))) != 0 && this.l().a(arrc, n2, n2, n3) <= 0 && this.m().a(arrc, n2, n2, n3) <= 0) {
            n2 += n4;
        }
        if (n2 >= n3) {
            this.a(list, "");
            return -1;
        }
        n4 = this.l().a(arrc, n2, n2, n3);
        if (n4 > 0) {
            this.a(list, "");
            return n2 + n4;
        }
        int n5 = this.m().a(arrc, n2, n2, n3);
        if (n5 > 0) {
            return this.a(arrc, n2 + n5, n3, e2, list, n2, n5);
        }
        return this.a(arrc, n2, n3, e2, list, 0, 0);
    }

    private int a(char[] arrc, int n2, int n3, e e2, List list, int n4, int n5) {
        e2.h();
        int n6 = n2;
        boolean bl2 = n5 > 0;
        int n7 = 0;
        while (n6 < n3) {
            if (bl2) {
                if (this.a(arrc, n6, n3, n4, n5)) {
                    if (this.a(arrc, n6 + n5, n3, n4, n5)) {
                        e2.a(arrc, n6, n5);
                        n6 += n5 * 2;
                        n7 = e2.f();
                        continue;
                    }
                    bl2 = false;
                    n6 += n5;
                    continue;
                }
                e2.a(arrc[n6++]);
                n7 = e2.f();
                continue;
            }
            int n8 = this.l().a(arrc, n6, n2, n3);
            if (n8 > 0) {
                this.a(list, e2.d(0, n7));
                return n6 + n8;
            }
            if (n5 > 0 && this.a(arrc, n6, n3, n4, n5)) {
                bl2 = true;
                n6 += n5;
                continue;
            }
            int n9 = this.n().a(arrc, n6, n2, n3);
            if (n9 > 0) {
                n6 += n9;
                continue;
            }
            int n10 = this.o().a(arrc, n6, n2, n3);
            if (n10 > 0) {
                e2.a(arrc, n6, n10);
                n6 += n10;
                continue;
            }
            e2.a(arrc[n6++]);
            n7 = e2.f();
        }
        this.a(list, e2.d(0, n7));
        return -1;
    }

    private boolean a(char[] arrc, int n2, int n3, int n4, int n5) {
        for (int i2 = 0; i2 < n5; ++i2) {
            if (n2 + i2 < n3 && arrc[n2 + i2] == arrc[n4 + i2]) continue;
            return false;
        }
        return true;
    }

    public k l() {
        return this.f;
    }

    public r a(k k2) {
        this.f = k2 == null ? org.apache.commons.c.h.k.i() : k2;
        return this;
    }

    public r a(char c2) {
        return this.a(org.apache.commons.c.h.k.a(c2));
    }

    public r f(String string) {
        return this.a(org.apache.commons.c.h.k.b(string));
    }

    public k m() {
        return this.g;
    }

    public r b(k k2) {
        if (k2 != null) {
            this.g = k2;
        }
        return this;
    }

    public r b(char c2) {
        return this.b(org.apache.commons.c.h.k.a(c2));
    }

    public k n() {
        return this.h;
    }

    public r c(k k2) {
        if (k2 != null) {
            this.h = k2;
        }
        return this;
    }

    public r c(char c2) {
        return this.c(org.apache.commons.c.h.k.a(c2));
    }

    public k o() {
        return this.i;
    }

    public r d(k k2) {
        if (k2 != null) {
            this.i = k2;
        }
        return this;
    }

    public boolean p() {
        return this.j;
    }

    public r a(boolean bl2) {
        this.j = bl2;
        return this;
    }

    public boolean q() {
        return this.k;
    }

    public r b(boolean bl2) {
        this.k = bl2;
        return this;
    }

    public String a() {
        if (this.c == null) {
            return null;
        }
        return new String(this.c);
    }

    public Object clone() {
        try {
            return this.r();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return null;
        }
    }

    Object r() {
        r r2 = (r)super.clone();
        if (r2.c != null) {
            r2.c = (char[])r2.c.clone();
        }
        r2.i();
        return r2;
    }

    public String toString() {
        if (this.d == null) {
            return "StrTokenizer[not tokenized yet]";
        }
        return "StrTokenizer" + this.h();
    }

    public /* synthetic */ void add(Object object) {
        this.e((String)object);
    }

    public /* synthetic */ void set(Object object) {
        this.d((String)object);
    }

    public /* synthetic */ Object previous() {
        return this.k();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.j();
    }

    static {
        a.a(org.apache.commons.c.h.k.a());
        a.b(org.apache.commons.c.h.k.g());
        a.c(org.apache.commons.c.h.k.i());
        a.d(org.apache.commons.c.h.k.e());
        a.a(false);
        a.b(false);
        b = new r();
        b.a(org.apache.commons.c.h.k.b());
        b.b(org.apache.commons.c.h.k.g());
        b.c(org.apache.commons.c.h.k.i());
        b.d(org.apache.commons.c.h.k.e());
        b.a(false);
        b.b(false);
    }
}

