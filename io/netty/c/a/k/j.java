/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.k.bk;
import io.netty.c.a.k.k;
import io.netty.util.c.ad;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class j
implements bk {
    private boolean j;
    private final Map k = new TreeMap();

    @Override
    public Set a() {
        return this.k.keySet();
    }

    @Override
    public boolean a(int n2) {
        Integer n3 = n2;
        return this.k.containsKey(n3);
    }

    @Override
    public int b(int n2) {
        Integer n3 = n2;
        if (this.k.containsKey(n3)) {
            return ((k)this.k.get(n3)).a();
        }
        return -1;
    }

    @Override
    public bk a(int n2, int n3) {
        return this.a(n2, n3, false, false);
    }

    @Override
    public bk a(int n2, int n3, boolean bl2, boolean bl3) {
        if (n2 < 0 || n2 > 0xFFFFFF) {
            throw new IllegalArgumentException("Setting ID is not valid: " + n2);
        }
        Integer n4 = n2;
        if (this.k.containsKey(n4)) {
            k k2 = (k)this.k.get(n4);
            k2.a(n3);
            k2.a(bl2);
            k2.b(bl3);
        } else {
            this.k.put(n4, new k(n3, bl2, bl3));
        }
        return this;
    }

    @Override
    public bk c(int n2) {
        Integer n3 = n2;
        if (this.k.containsKey(n3)) {
            this.k.remove(n3);
        }
        return this;
    }

    @Override
    public boolean d(int n2) {
        Integer n3 = n2;
        if (this.k.containsKey(n3)) {
            return ((k)this.k.get(n3)).b();
        }
        return false;
    }

    @Override
    public bk a(int n2, boolean bl2) {
        Integer n3 = n2;
        if (this.k.containsKey(n3)) {
            ((k)this.k.get(n3)).a(bl2);
        }
        return this;
    }

    @Override
    public boolean e(int n2) {
        Integer n3 = n2;
        if (this.k.containsKey(n3)) {
            return ((k)this.k.get(n3)).c();
        }
        return false;
    }

    @Override
    public bk b(int n2, boolean bl2) {
        Integer n3 = n2;
        if (this.k.containsKey(n3)) {
            ((k)this.k.get(n3)).b(bl2);
        }
        return this;
    }

    @Override
    public boolean b() {
        return this.j;
    }

    @Override
    public bk a(boolean bl2) {
        this.j = bl2;
        return this;
    }

    private Set c() {
        return this.k.entrySet();
    }

    private void a(StringBuilder stringBuilder) {
        for (Map.Entry entry : this.c()) {
            k k2 = (k)entry.getValue();
            stringBuilder.append("--> ");
            stringBuilder.append(entry.getKey());
            stringBuilder.append(':');
            stringBuilder.append(k2.a());
            stringBuilder.append(" (persist value: ");
            stringBuilder.append(k2.b());
            stringBuilder.append("; persisted: ");
            stringBuilder.append(k2.c());
            stringBuilder.append(')');
            stringBuilder.append(ad.a);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ad.a(this));
        stringBuilder.append(ad.a);
        this.a(stringBuilder);
        stringBuilder.setLength(stringBuilder.length() - ad.a.length());
        return stringBuilder.toString();
    }
}

