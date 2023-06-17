/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.d.a;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.h.aq;
import net.minecraft.h.e;
import net.minecraft.q.al;
import net.minecraft.q.an;
import net.minecraft.w.a.b;

public class a
extends e
implements al {
    private final String a;
    private final Map b = sz.c();

    public a(String string, net.minecraft.u.d.a a2, int n2) {
        super(a2, n2);
        this.a = string;
    }

    @Override
    public int c(int n2) {
        return this.b.containsKey(n2) ? (Integer)this.b.get(n2) : 0;
    }

    @Override
    public void b(int n2, int n3) {
        this.b.put(n2, n3);
    }

    @Override
    public int i() {
        return this.b.size();
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    public void a(an an2) {
    }

    @Override
    public an r() {
        return an.a;
    }

    @Override
    public String h() {
        return this.a;
    }

    @Override
    public aq a(net.minecraft.w.a.a a2, b b2) {
        throw new UnsupportedOperationException();
    }
}

