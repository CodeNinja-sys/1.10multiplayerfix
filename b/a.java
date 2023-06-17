/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.a.g;
import b.a.h;
import b.af;
import b.ag;
import b.d;
import b.m;
import b.o;
import b.r;
import b.v;
import b.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

abstract class a
implements o,
w {
    private final List a = new ArrayList();
    private final String b;
    private boolean c;

    protected a(String string) {
        this(Collections.singletonList(string), "");
    }

    protected a(Collection collection, String string) {
        this.a(collection);
        this.b = string;
    }

    public final Collection a() {
        return Collections.unmodifiableList(this.a);
    }

    public final List a(v v2) {
        return v2.d(this);
    }

    public final Object b(v v2) {
        return v2.c(this);
    }

    public String b() {
        return this.b;
    }

    public final a c() {
        this.c = true;
        return this;
    }

    public final boolean d() {
        return this.c;
    }

    public boolean e() {
        return false;
    }

    protected abstract Object a(String var1);

    protected Object a(ag ag2, String string) {
        try {
            return g.a(ag2, string);
        }
        catch (h h2) {
            throw new m(this.a(), string, h2);
        }
        catch (af af2) {
            throw new m(this.a(), string, af2);
        }
    }

    protected String a(ag ag2) {
        if (ag2 == null) {
            return null;
        }
        String string = ag2.b();
        return string == null ? ag2.a().getName() : string;
    }

    abstract void a(r var1, d var2, v var3, String var4);

    private void a(Collection collection) {
        if (collection.size() == 1) {
            this.a.addAll(collection);
            return;
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        for (String string : collection) {
            if (string.length() == 1) {
                arrayList.add(string);
                continue;
            }
            arrayList2.add(string);
        }
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        this.a.addAll(arrayList);
        this.a.addAll(arrayList2);
    }

    public boolean equals(Object object) {
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        return ((Object)this.a).equals(a2.a);
    }

    public int hashCode() {
        return ((Object)this.a).hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}

