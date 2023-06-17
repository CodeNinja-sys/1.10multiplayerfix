/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.c.a.d.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class g
implements c {
    private final String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private boolean g;
    private Set h = Collections.emptySet();
    private Set i = this.h;
    private long j = Long.MIN_VALUE;
    private int k;
    private boolean l;
    private boolean m;

    public g(String string, String string2) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        if ((string = string.trim()).isEmpty()) {
            throw new IllegalArgumentException("empty name");
        }
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 > '\u007f') {
                throw new IllegalArgumentException("name contains non-ascii character: " + string);
            }
            switch (c2) {
                case '\t': 
                case '\n': 
                case '\u000b': 
                case '\f': 
                case '\r': 
                case ' ': 
                case ',': 
                case ';': 
                case '=': {
                    throw new IllegalArgumentException("name contains one of the following prohibited characters: =,; \\t\\r\\n\\v\\f: " + string);
                }
            }
        }
        if (string.charAt(0) == '$') {
            throw new IllegalArgumentException("name starting with '$' not allowed: " + string);
        }
        this.a = string;
        this.a(string2);
    }

    @Override
    public String a() {
        return this.a;
    }

    @Override
    public String b() {
        return this.b;
    }

    @Override
    public void a(String string) {
        if (string == null) {
            throw new NullPointerException("value");
        }
        this.b = string;
    }

    @Override
    public String c() {
        return this.c;
    }

    @Override
    public void b(String string) {
        this.c = io.netty.c.a.d.g.a("domain", string);
    }

    @Override
    public String d() {
        return this.d;
    }

    @Override
    public void c(String string) {
        this.d = io.netty.c.a.d.g.a("path", string);
    }

    @Override
    public String e() {
        return this.e;
    }

    @Override
    public void d(String string) {
        this.e = io.netty.c.a.d.g.a("comment", string);
    }

    @Override
    public String j() {
        return this.f;
    }

    @Override
    public void e(String string) {
        this.f = io.netty.c.a.d.g.a("commentUrl", string);
    }

    @Override
    public boolean k() {
        return this.g;
    }

    @Override
    public void c(boolean bl2) {
        this.g = bl2;
    }

    @Override
    public Set l() {
        if (this.i == null) {
            this.i = Collections.unmodifiableSet(this.h);
        }
        return this.i;
    }

    @Override
    public void a(int ... arrn) {
        if (arrn == null) {
            throw new NullPointerException("ports");
        }
        int[] arrn2 = (int[])arrn.clone();
        if (arrn2.length == 0) {
            this.i = this.h = Collections.emptySet();
        } else {
            TreeSet<Integer> treeSet = new TreeSet<Integer>();
            for (int n2 : arrn2) {
                if (n2 <= 0 || n2 > 65535) {
                    throw new IllegalArgumentException("port out of range: " + n2);
                }
                treeSet.add(n2);
            }
            this.h = treeSet;
            this.i = null;
        }
    }

    @Override
    public void a(Iterable iterable) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            int n2 = (Integer)iterator.next();
            if (n2 <= 0 || n2 > 65535) {
                throw new IllegalArgumentException("port out of range: " + n2);
            }
            treeSet.add(n2);
        }
        if (treeSet.isEmpty()) {
            this.i = this.h = Collections.emptySet();
        } else {
            this.h = treeSet;
            this.i = null;
        }
    }

    @Override
    public long f() {
        return this.j;
    }

    @Override
    public void a(long l2) {
        this.j = l2;
    }

    @Override
    public int g() {
        return this.k;
    }

    @Override
    public void a(int n2) {
        this.k = n2;
    }

    @Override
    public boolean h() {
        return this.l;
    }

    @Override
    public void a(boolean bl2) {
        this.l = bl2;
    }

    @Override
    public boolean i() {
        return this.m;
    }

    @Override
    public void b(boolean bl2) {
        this.m = bl2;
    }

    public int hashCode() {
        return this.a().hashCode();
    }

    public boolean equals(Object object) {
        if (!(object instanceof c)) {
            return false;
        }
        c c2 = (c)object;
        if (!this.a().equalsIgnoreCase(c2.a())) {
            return false;
        }
        if (this.d() == null) {
            if (c2.d() != null) {
                return false;
            }
        } else {
            if (c2.d() == null) {
                return false;
            }
            if (!this.d().equals(c2.d())) {
                return false;
            }
        }
        if (this.c() == null) {
            return c2.c() == null;
        }
        if (c2.c() == null) {
            return false;
        }
        return this.c().equalsIgnoreCase(c2.c());
    }

    public int a(c c2) {
        int n2 = this.a().compareToIgnoreCase(c2.a());
        if (n2 != 0) {
            return n2;
        }
        if (this.d() == null) {
            if (c2.d() != null) {
                return -1;
            }
        } else {
            if (c2.d() == null) {
                return 1;
            }
            n2 = this.d().compareTo(c2.d());
            if (n2 != 0) {
                return n2;
            }
        }
        if (this.c() == null) {
            if (c2.c() != null) {
                return -1;
            }
        } else {
            if (c2.c() == null) {
                return 1;
            }
            n2 = this.c().compareToIgnoreCase(c2.c());
            return n2;
        }
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a());
        stringBuilder.append('=');
        stringBuilder.append(this.b());
        if (this.c() != null) {
            stringBuilder.append(", domain=");
            stringBuilder.append(this.c());
        }
        if (this.d() != null) {
            stringBuilder.append(", path=");
            stringBuilder.append(this.d());
        }
        if (this.e() != null) {
            stringBuilder.append(", comment=");
            stringBuilder.append(this.e());
        }
        if (this.f() >= 0L) {
            stringBuilder.append(", maxAge=");
            stringBuilder.append(this.f());
            stringBuilder.append('s');
        }
        if (this.h()) {
            stringBuilder.append(", secure");
        }
        if (this.i()) {
            stringBuilder.append(", HTTPOnly");
        }
        return stringBuilder.toString();
    }

    private static String a(String string, String string2) {
        if (string2 == null) {
            return null;
        }
        if ((string2 = string2.trim()).isEmpty()) {
            return null;
        }
        for (int i2 = 0; i2 < string2.length(); ++i2) {
            char c2 = string2.charAt(i2);
            switch (c2) {
                case '\n': 
                case '\u000b': 
                case '\f': 
                case '\r': 
                case ';': {
                    throw new IllegalArgumentException(string + " contains one of the following prohibited characters: " + ";\\r\\n\\f\\v (" + string2 + ')');
                }
            }
        }
        return string2;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((c)object);
    }
}

