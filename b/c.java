/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.a;
import b.a.f;
import b.a.g;
import b.a.k;
import b.ag;
import b.d;
import b.p;
import b.r;
import b.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public abstract class c
extends a {
    private static final char a = '\u0000';
    private boolean b;
    private final boolean c;
    private ag d;
    private String e = "";
    private String f = String.valueOf('\u0000');
    private final List g = new ArrayList();

    c(String string, boolean bl2) {
        super(string);
        this.c = bl2;
    }

    c(Collection collection, boolean bl2, String string) {
        super(collection, string);
        this.c = bl2;
    }

    public final c a(Class class_) {
        return this.b(b.a.g.a(class_));
    }

    public final c b(ag ag2) {
        if (ag2 == null) {
            throw new NullPointerException("illegal null converter");
        }
        this.d = ag2;
        return this;
    }

    public final c b(String string) {
        this.e = string;
        return this;
    }

    public final c a(char c2) {
        if (c2 == '\u0000') {
            throw new IllegalArgumentException("cannot use U+0000 as separator");
        }
        this.f = String.valueOf(c2);
        return this;
    }

    public final c c(String string) {
        if (string.indexOf(0) != -1) {
            throw new IllegalArgumentException("cannot use U+0000 in separator");
        }
        this.f = string;
        return this;
    }

    public c a(Object object, Object ... arrobject) {
        this.a(object);
        this.a(arrobject);
        return this;
    }

    public c a(Object[] arrobject) {
        for (Object object : arrobject) {
            this.a(object);
        }
        return this;
    }

    public c f() {
        this.b = true;
        return this;
    }

    public boolean g() {
        return this.b;
    }

    private void a(Object object) {
        b.a.f.a(object);
        this.g.add(object);
    }

    final void a(r r2, d d2, v v2, String string) {
        if (k.a(string)) {
            this.a(r2, d2, v2);
        } else {
            this.a(v2, string);
        }
    }

    protected void a(v v2, String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, this.f);
        if (!stringTokenizer.hasMoreTokens()) {
            v2.a(this, string);
        } else {
            while (stringTokenizer.hasMoreTokens()) {
                v2.a(this, stringTokenizer.nextToken());
            }
        }
    }

    protected abstract void a(r var1, d var2, v var3);

    protected final Object a(String string) {
        return this.a(this.d, string);
    }

    protected boolean d(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, this.f);
        try {
            while (stringTokenizer.hasMoreTokens()) {
                this.a(stringTokenizer.nextToken());
            }
            return true;
        }
        catch (p p2) {
            return false;
        }
    }

    protected boolean h() {
        return this.d != null && Number.class.isAssignableFrom(this.d.a());
    }

    public boolean i() {
        return true;
    }

    public boolean j() {
        return this.c;
    }

    public String k() {
        return this.e;
    }

    public String l() {
        return this.a(this.d);
    }

    public List m() {
        return Collections.unmodifiableList(this.g);
    }

    public boolean equals(Object object) {
        if (!super.equals(object)) {
            return false;
        }
        c c2 = (c)object;
        return this.j() == c2.j();
    }

    public int hashCode() {
        return super.hashCode() ^ (this.c ? 0 : 1);
    }
}

