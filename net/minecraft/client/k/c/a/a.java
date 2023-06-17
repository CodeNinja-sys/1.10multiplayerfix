/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.c.a;

import com.a.a.b.cc;
import java.util.List;
import net.minecraft.client.k.c.f;
import net.minecraft.client.k.c.h;
import net.minecraft.client.k.c.j;

public class a {
    private final h a;
    private final List b;
    private final int c;

    public a(h h2, List list, int n2) {
        this.a = h2;
        this.b = list;
        this.c = n2;
    }

    public f a(int n2) {
        return n2 >= 0 && n2 < this.b.size() ? (f)cc.b((f)this.b.get(n2), j.a) : j.a;
    }

    public int a() {
        return this.c;
    }
}

