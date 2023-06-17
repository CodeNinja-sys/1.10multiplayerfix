/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import com.a.a.d.aad;
import com.a.a.d.sz;
import com.a.b.k;
import com.a.b.r;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.g.b.a.a;
import net.minecraft.client.g.b.a.a.c;
import net.minecraft.client.g.b.a.a.d;
import net.minecraft.client.g.b.a.a.i;
import net.minecraft.client.g.b.a.a.j;
import net.minecraft.client.g.b.a.ae;
import net.minecraft.client.g.b.a.al;
import net.minecraft.client.g.b.a.am;
import net.minecraft.client.g.b.a.o;
import net.minecraft.client.g.b.a.s;

public class ai {
    static final k a = new r().a((Type)((Object)ai.class), (Object)new s()).a((Type)((Object)am.class), (Object)new ae()).a((Type)((Object)al.class), (Object)new o()).a((Type)((Object)i.class), (Object)new d()).a((Type)((Object)j.class), (Object)new c()).i();
    private final Map b = sz.c();
    private i c;

    public static ai a(Reader reader) {
        return (ai)a.a(reader, ai.class);
    }

    public ai(Map map, i i2) {
        this.c = i2;
        this.b.putAll(map);
    }

    public ai(List list) {
        ai ai2 = null;
        for (ai ai3 : list) {
            if (ai3.b()) {
                this.b.clear();
                ai2 = ai3;
            }
            this.b.putAll(ai3.b);
        }
        if (ai2 != null) {
            this.c = ai2.c;
        }
    }

    public boolean a(String string) {
        return this.b.get(string) != null;
    }

    public al b(String string) {
        al al2 = (al)this.b.get(string);
        if (al2 == null) {
            throw new a(this);
        }
        return al2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof ai) {
            ai ai2 = (ai)object;
            if (this.b.equals(ai2.b)) {
                return this.b() ? this.c.equals(ai2.c) : !ai2.b();
            }
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.b.hashCode() + (this.b() ? this.c.hashCode() : 0);
    }

    public Set a() {
        HashSet hashSet = aad.b(this.b.values());
        if (this.b()) {
            hashSet.addAll(this.c.b());
        }
        return hashSet;
    }

    public boolean b() {
        return this.c != null;
    }

    public i c() {
        return this.c;
    }
}

