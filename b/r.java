/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.a.a;
import b.aa;
import b.ad;
import b.b;
import b.b.c;
import b.d;
import b.e;
import b.g;
import b.i;
import b.l;
import b.n;
import b.p;
import b.s;
import b.v;
import b.w;
import b.x;
import b.y;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class r
implements n {
    private final a a;
    private final Map b;
    private final Map c;
    private s d;
    private boolean e;
    private boolean f;
    private g g = new e();

    public r() {
        this.a = new a();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = s.a(false);
        this.a(new l());
    }

    public r(String string) {
        this();
        new y(string).a(this);
    }

    public x a(String string) {
        return this.a(Collections.singletonList(string));
    }

    public x a(String string, String string2) {
        return this.a(Collections.singletonList(string), string2);
    }

    public x a(Collection collection) {
        return this.a(collection, "");
    }

    public x a(Collection collection, String string) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("need at least one option");
        }
        aa.a(collection);
        return new x(this, collection, string);
    }

    public l a() {
        l l2 = new l();
        this.a(l2);
        return l2;
    }

    public l b(String string) {
        l l2 = new l(string);
        this.a(l2);
        return l2;
    }

    public void a(boolean bl2) {
        this.e = bl2;
        this.d = s.a(bl2);
    }

    boolean c() {
        return this.e;
    }

    public void b() {
        this.f = true;
    }

    boolean d() {
        return this.f;
    }

    public void b(boolean bl2) {
        if (bl2) {
            this.a(new b());
        } else {
            this.a.c(String.valueOf("W"));
        }
    }

    void a(b.a a2) {
        this.a.a(a2.a(), (Object)a2);
    }

    public void a(OutputStream outputStream) {
        this.a(new OutputStreamWriter(outputStream));
    }

    public void a(Writer writer) {
        writer.write(this.g.a(this.a.a()));
        writer.flush();
    }

    public void a(g g2) {
        if (g2 == null) {
            throw new NullPointerException();
        }
        this.g = g2;
    }

    public Map e() {
        return new HashMap(this.a.a());
    }

    public v a(String ... arrstring) {
        d d2 = new d(arrstring);
        v v2 = new v(this.a.a());
        v2.a((b.a)this.a.b("[arguments]"));
        while (d2.a()) {
            this.d.a(this, d2, v2);
        }
        this.g();
        this.a(v2);
        return v2;
    }

    private void a(v v2) {
        Collection collection = this.b(v2);
        boolean bl2 = this.c(v2);
        if (!collection.isEmpty() && !bl2) {
            throw new i(collection);
        }
    }

    private Collection b(v v2) {
        b.a a2;
        HashSet hashSet = new HashSet();
        for (b.a object : this.a.a().values()) {
            if (!object.g() || v2.a((w)object)) continue;
            hashSet.addAll(object.a());
        }
        for (Map.Entry entry : this.b.entrySet()) {
            a2 = this.e((String)((Collection)entry.getKey()).iterator().next());
            if (!this.a(v2, (Collection)entry.getValue()) || v2.a((w)a2)) continue;
            hashSet.addAll(a2.a());
        }
        for (Map.Entry entry : this.c.entrySet()) {
            a2 = this.e((String)((Collection)entry.getKey()).iterator().next());
            if (this.a(v2, (Collection)entry.getValue()) || v2.a((w)a2)) continue;
            hashSet.addAll(a2.a());
        }
        return hashSet;
    }

    private boolean a(v v2, Collection collection) {
        for (w w2 : collection) {
            if (!v2.a(w2)) continue;
            return true;
        }
        return false;
    }

    private boolean c(v v2) {
        boolean bl2 = false;
        for (b.a a2 : this.a.a().values()) {
            if (!a2.d() || !v2.a((w)a2)) continue;
            bl2 = true;
            break;
        }
        return bl2;
    }

    void a(String string, d d2, v v2) {
        c c2 = r.g(string);
        if (!this.d(c2.a)) {
            throw p.b(c2.a);
        }
        b.a a2 = this.e(c2.a);
        a2.a(this, d2, v2, c2.b);
    }

    void b(String string, d d2, v v2) {
        c c2 = r.h(string);
        if (this.d(c2.a)) {
            this.e(c2.a).a(this, d2, v2, c2.b);
        } else {
            this.d(string, d2, v2);
        }
    }

    private void d(String string, d d2, v v2) {
        char[] arrc = r.f(string);
        this.a(arrc);
        for (int i2 = 0; i2 < arrc.length; ++i2) {
            b.a a2 = this.a(arrc[i2]);
            if (a2.i() && arrc.length > i2 + 1) {
                String string2 = String.valueOf(arrc, i2 + 1, arrc.length - 1 - i2);
                a2.a(this, d2, v2, string2);
                break;
            }
            a2.a(this, d2, v2, null);
        }
    }

    void c(String string, d d2, v v2) {
        this.e("[arguments]").a(this, d2, v2, string);
    }

    void f() {
        this.d = s.a();
    }

    boolean c(String string) {
        return aa.a(string) || aa.b(string);
    }

    boolean d(String string) {
        return this.a.a(string);
    }

    void b(Collection collection, String string) {
        this.a(collection, this.e(string));
    }

    void a(Collection collection, w w2) {
        this.a(collection, w2, this.b);
    }

    void c(Collection collection, String string) {
        this.b(collection, this.e(string));
    }

    void b(Collection collection, w w2) {
        this.a(collection, w2, this.c);
    }

    private void a(Collection collection, w w2, Map map) {
        for (String string : collection) {
            b.a a2 = this.e(string);
            if (a2 != null) continue;
            throw new ad(collection);
        }
        Set<w> set = (Set)map.get(collection);
        if (set == null) {
            set = new HashSet<w>();
            map.put(collection, set);
        }
        set.add(w2);
    }

    private b.a a(char c2) {
        return this.e(String.valueOf(c2));
    }

    private b.a e(String string) {
        return (b.a)this.a.b(string);
    }

    private void g() {
        this.d = s.a(this.e);
    }

    private static char[] f(String string) {
        char[] arrc = new char[string.length() - 1];
        string.getChars(1, string.length(), arrc, 0);
        return arrc;
    }

    private void a(char[] arrc) {
        for (char c2 : arrc) {
            String string = String.valueOf(c2);
            if (!this.d(string)) {
                throw p.b(string);
            }
            if (!this.e(string).i()) continue;
            return;
        }
    }

    private static c g(String string) {
        return b.b.c.a(string.substring(2));
    }

    private static c h(String string) {
        return b.b.c.a(string.substring(1));
    }
}

