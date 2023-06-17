/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.g;
import io.netty.c.a.d.am;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.m;
import io.netty.c.a.d.n;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class k
extends ar {
    private static final int c = 17;
    private final m[] d = new m[17];
    private final m e = new m(this);
    protected final boolean a;

    private static int a(int n2) {
        return n2 % 17;
    }

    public k() {
        this(true);
    }

    public k(boolean bl2) {
        this.a = bl2;
        this.e.e = this.e.f = this.e;
    }

    void a(CharSequence charSequence) {
        k.f(charSequence);
    }

    @Override
    public ar a(ar ar2) {
        if (ar2 instanceof k) {
            k k2 = (k)ar2;
            m m2 = k2.e.f;
            while (m2 != k2.e) {
                this.a(m2.b, (Object)m2.c);
                m2 = m2.f;
            }
            return this;
        }
        return super.a(ar2);
    }

    @Override
    public ar b(ar ar2) {
        if (ar2 instanceof k) {
            this.a();
            k k2 = (k)ar2;
            m m2 = k2.e.f;
            while (m2 != k2.e) {
                this.a(m2.b, (Object)m2.c);
                m2 = m2.f;
            }
            return this;
        }
        return super.b(ar2);
    }

    @Override
    public ar a(String string, Object object) {
        return this.a((CharSequence)string, object);
    }

    @Override
    public ar a(CharSequence charSequence, Object object) {
        CharSequence charSequence2;
        if (this.a) {
            this.a(charSequence);
            charSequence2 = k.a(object);
            k.g(charSequence2);
        } else {
            charSequence2 = k.a(object);
        }
        int n2 = k.h(charSequence);
        int n3 = k.a(n2);
        this.a(n2, n3, charSequence, charSequence2);
        return this;
    }

    @Override
    public ar a(String string, Iterable iterable) {
        return this.a((CharSequence)string, iterable);
    }

    @Override
    public ar a(CharSequence charSequence, Iterable iterable) {
        if (this.a) {
            this.a(charSequence);
        }
        int n2 = k.h(charSequence);
        int n3 = k.a(n2);
        for (Object t2 : iterable) {
            CharSequence charSequence2 = k.a(t2);
            if (this.a) {
                k.g(charSequence2);
            }
            this.a(n2, n3, charSequence, charSequence2);
        }
        return this;
    }

    private void a(int n2, int n3, CharSequence charSequence, CharSequence charSequence2) {
        m m2;
        m m3 = this.d[n3];
        this.d[n3] = m2 = new m(this, n2, charSequence, charSequence2);
        m2.d = m3;
        m2.a(this.e);
    }

    @Override
    public ar a(String string) {
        return this.b((CharSequence)string);
    }

    @Override
    public ar b(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("name");
        }
        int n2 = k.h(charSequence);
        int n3 = k.a(n2);
        this.a(n2, n3, charSequence);
        return this;
    }

    private void a(int n2, int n3, CharSequence charSequence) {
        m m2;
        m m3 = this.d[n3];
        if (m3 == null) {
            return;
        }
        while (m3.a == n2 && k.a(charSequence, m3.b)) {
            m3.a();
            m2 = m3.d;
            if (m2 != null) {
                this.d[n3] = m2;
                m3 = m2;
                continue;
            }
            this.d[n3] = null;
            return;
        }
        while ((m2 = m3.d) != null) {
            if (m2.a == n2 && k.a(charSequence, m2.b)) {
                m3.d = m2.d;
                m2.a();
                continue;
            }
            m3 = m2;
        }
    }

    @Override
    public ar b(String string, Object object) {
        return this.b((CharSequence)string, object);
    }

    @Override
    public ar b(CharSequence charSequence, Object object) {
        CharSequence charSequence2;
        if (this.a) {
            this.a(charSequence);
            charSequence2 = k.a(object);
            k.g(charSequence2);
        } else {
            charSequence2 = k.a(object);
        }
        int n2 = k.h(charSequence);
        int n3 = k.a(n2);
        this.a(n2, n3, charSequence);
        this.a(n2, n3, charSequence, charSequence2);
        return this;
    }

    @Override
    public ar b(String string, Iterable iterable) {
        return this.b((CharSequence)string, iterable);
    }

    @Override
    public ar b(CharSequence charSequence, Iterable iterable) {
        if (iterable == null) {
            throw new NullPointerException("values");
        }
        if (this.a) {
            this.a(charSequence);
        }
        int n2 = k.h(charSequence);
        int n3 = k.a(n2);
        this.a(n2, n3, charSequence);
        for (Object t2 : iterable) {
            if (t2 == null) break;
            CharSequence charSequence2 = k.a(t2);
            if (this.a) {
                k.g(charSequence2);
            }
            this.a(n2, n3, charSequence, charSequence2);
        }
        return this;
    }

    @Override
    public ar a() {
        Arrays.fill(this.d, null);
        this.e.e = this.e.f = this.e;
        return this;
    }

    @Override
    public String b(String string) {
        return this.c((CharSequence)string);
    }

    @Override
    public String c(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("name");
        }
        int n2 = k.h(charSequence);
        int n3 = k.a(n2);
        m m2 = this.d[n3];
        CharSequence charSequence2 = null;
        while (m2 != null) {
            if (m2.a == n2 && k.a(charSequence, m2.b)) {
                charSequence2 = m2.c;
            }
            m2 = m2.d;
        }
        if (charSequence2 == null) {
            return null;
        }
        return charSequence2.toString();
    }

    @Override
    public List c(String string) {
        return this.d((CharSequence)string);
    }

    @Override
    public List d(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("name");
        }
        LinkedList<String> linkedList = new LinkedList<String>();
        int n2 = k.h(charSequence);
        int n3 = k.a(n2);
        m m2 = this.d[n3];
        while (m2 != null) {
            if (m2.a == n2 && k.a(charSequence, m2.b)) {
                linkedList.addFirst(m2.c());
            }
            m2 = m2.d;
        }
        return linkedList;
    }

    @Override
    public List b() {
        LinkedList<m> linkedList = new LinkedList<m>();
        m m2 = this.e.f;
        while (m2 != this.e) {
            linkedList.add(m2);
            m2 = m2.f;
        }
        return linkedList;
    }

    public Iterator iterator() {
        return new n(this, null);
    }

    @Override
    public boolean d(String string) {
        return this.b(string) != null;
    }

    @Override
    public boolean e(CharSequence charSequence) {
        return this.c(charSequence) != null;
    }

    @Override
    public boolean c() {
        return this.e == this.e.f;
    }

    @Override
    public boolean a(String string, String string2, boolean bl2) {
        return this.a((CharSequence)string, (CharSequence)string2, bl2);
    }

    @Override
    public boolean a(CharSequence charSequence, CharSequence charSequence2, boolean bl2) {
        if (charSequence == null) {
            throw new NullPointerException("name");
        }
        int n2 = k.h(charSequence);
        int n3 = k.a(n2);
        m m2 = this.d[n3];
        while (m2 != null) {
            if (m2.a == n2 && k.a(charSequence, m2.b) && (bl2 ? k.a(m2.c, charSequence2) : m2.c.equals(charSequence2))) {
                return true;
            }
            m2 = m2.d;
        }
        return false;
    }

    @Override
    public Set d() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        m m2 = this.e.f;
        while (m2 != this.e) {
            linkedHashSet.add(m2.b());
            m2 = m2.f;
        }
        return linkedHashSet;
    }

    private static CharSequence a(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof CharSequence) {
            return (CharSequence)object;
        }
        if (object instanceof Number) {
            return object.toString();
        }
        if (object instanceof Date) {
            return am.a().format((Date)object);
        }
        if (object instanceof Calendar) {
            return am.a().format(((Calendar)object).getTime());
        }
        return object.toString();
    }

    void a(g g2) {
        m m2 = this.e.f;
        while (m2 != this.e) {
            m2.a(g2);
            m2 = m2.f;
        }
    }

    static /* synthetic */ m a(k k2) {
        return k2.e;
    }
}

