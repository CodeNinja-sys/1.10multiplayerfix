/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import com.a.a.d.sz;
import com.a.b.ab;
import com.a.b.z;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;
import net.minecraft.client.f.a.a;
import net.minecraft.client.f.a.d;
import net.minecraft.client.f.an;
import net.minecraft.u.bp;
import org.apache.commons.b.t;

public class c
implements Closeable,
an {
    private final Map a = sz.c();
    private final String b;
    private final bp c;
    private final InputStream d;
    private final InputStream e;
    private final d f;
    private boolean g;
    private z h;

    public c(String string, bp bp2, InputStream inputStream, InputStream inputStream2, d d2) {
        this.b = string;
        this.c = bp2;
        this.d = inputStream;
        this.e = inputStream2;
        this.f = d2;
    }

    @Override
    public bp a() {
        return this.c;
    }

    @Override
    public InputStream b() {
        return this.d;
    }

    @Override
    public boolean c() {
        return this.e != null;
    }

    @Override
    public a a(String string) {
        Object object;
        if (!this.c()) {
            return null;
        }
        if (this.h == null && !this.g) {
            this.g = true;
            object = null;
            try {
                object = new BufferedReader(new InputStreamReader(this.e));
                this.h = new ab().a((Reader)object).t();
            }
            finally {
                t.a((Reader)object);
            }
        }
        if ((object = (a)this.a.get(string)) == null) {
            object = this.f.a(string, this.h);
        }
        return object;
    }

    @Override
    public String d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        c c2 = (c)object;
        if (this.c != null ? !this.c.equals(c2.c) : c2.c != null) {
            return false;
        }
        return !(this.b != null ? !this.b.equals(c2.b) : c2.b != null);
    }

    public int hashCode() {
        int n2 = this.b != null ? this.b.hashCode() : 0;
        n2 = 31 * n2 + (this.c != null ? this.c.hashCode() : 0);
        return n2;
    }

    @Override
    public void close() {
        this.d.close();
        if (this.e != null) {
            this.e.close();
        }
    }
}

