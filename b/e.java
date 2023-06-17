/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.a.b;
import b.a.j;
import b.a.k;
import b.aa;
import b.f;
import b.g;
import b.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class e
implements g {
    private final j a;
    private final j b;

    e() {
        this(80, 2);
    }

    public e(int n2, int n3) {
        this.a = new j(n2 * 2, 0);
        this.b = new j(n2, n3);
    }

    public String a(Map map) {
        f f2 = new f(this);
        TreeSet treeSet = new TreeSet(f2);
        treeSet.addAll(map.values());
        this.a(treeSet);
        return this.a();
    }

    private String a() {
        StringBuilder stringBuilder = new StringBuilder();
        String string = this.a.b();
        if (!k.a(string)) {
            stringBuilder.append(string).append(k.c);
        }
        stringBuilder.append(this.b.b());
        return stringBuilder.toString();
    }

    private void a(Collection collection) {
        this.b(collection);
        if (collection.isEmpty()) {
            this.b.a("No options specified", "");
        } else {
            this.d(collection);
            this.f(collection);
        }
        this.b();
    }

    private void b(Collection collection) {
        o o2 = this.c(collection);
        if (this.a(o2)) {
            this.a.a("Non-option arguments:", "");
            this.a.a(this.b(o2), "");
        }
    }

    private boolean a(o o2) {
        return !k.a(o2.b()) || !k.a(o2.l()) || !k.a(o2.k());
    }

    private String b(o o2) {
        StringBuilder stringBuilder = new StringBuilder();
        this.b(stringBuilder, o2);
        this.a(stringBuilder, o2);
        return stringBuilder.toString();
    }

    private void a(StringBuilder stringBuilder, o o2) {
        stringBuilder.append(stringBuilder.length() > 0 && !k.a(o2.b()) ? " -- " : "").append(o2.b());
    }

    private o c(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            o o2 = (o)iterator.next();
            if (!o2.e()) continue;
            iterator.remove();
            return o2;
        }
        throw new AssertionError((Object)"no non-options argument spec");
    }

    private void d(Collection collection) {
        if (this.e(collection)) {
            this.b.a("Option (* = required)", "Description");
            this.b.a("---------------------", "-----------");
        } else {
            this.b.a("Option", "Description");
            this.b.a("------", "-----------");
        }
    }

    private boolean e(Collection collection) {
        for (o o2 : collection) {
            if (!o2.g()) continue;
            return true;
        }
        return false;
    }

    private void f(Collection collection) {
        for (o o2 : collection) {
            if (o2.e()) continue;
            this.b.a(this.c(o2), this.e(o2));
        }
    }

    private String c(o o2) {
        StringBuilder stringBuilder = new StringBuilder(o2.g() ? "* " : "");
        Iterator iterator = o2.a().iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            stringBuilder.append(string.length() > 1 ? "--" : aa.b);
            stringBuilder.append(string);
            if (!iterator.hasNext()) continue;
            stringBuilder.append(", ");
        }
        this.b(stringBuilder, o2);
        return stringBuilder.toString();
    }

    private void b(StringBuilder stringBuilder, o o2) {
        String string = this.d(o2);
        String string2 = o2.k();
        if (string != null || !k.a(string2)) {
            this.a(stringBuilder, string, string2, o2.j());
        }
    }

    private String d(o o2) {
        String string = o2.l();
        if (!k.a(string) && !String.class.getName().equals(string)) {
            return b.a.b.a(string);
        }
        return null;
    }

    private void a(StringBuilder stringBuilder, String string, String string2, boolean bl2) {
        if (bl2) {
            this.a(stringBuilder, string, string2, '<', '>');
        } else {
            this.a(stringBuilder, string, string2, '[', ']');
        }
    }

    private void a(StringBuilder stringBuilder, String string, String string2, char c2, char c3) {
        stringBuilder.append(' ').append(c2);
        if (string != null) {
            stringBuilder.append(string);
        }
        if (!k.a(string2)) {
            if (string != null) {
                stringBuilder.append(": ");
            }
            stringBuilder.append(string2);
        }
        stringBuilder.append(c3);
    }

    private String e(o o2) {
        List list = o2.m();
        if (list.isEmpty()) {
            return o2.b();
        }
        String string = this.a(list);
        return (o2.b() + ' ' + k.a("default: " + string, '(', ')')).trim();
    }

    private String a(List list) {
        return list.size() == 1 ? list.get(0).toString() : list.toString();
    }

    private void b() {
        this.a.a();
        this.b.a();
    }
}

