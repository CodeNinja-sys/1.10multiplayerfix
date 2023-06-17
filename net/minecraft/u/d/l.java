/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.d;

import com.a.a.d.nj;
import com.a.a.d.ov;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.u.d.a;
import net.minecraft.u.d.c;
import net.minecraft.u.d.f;
import net.minecraft.u.d.k;
import net.minecraft.u.d.m;

public class l
extends f {
    private final String d;
    private final Object[] e;
    private final Object f = new Object();
    private long g = -1L;
    List b = ov.a();
    public static final Pattern c = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");

    public l(String string, Object ... arrobject) {
        this.d = string;
        this.e = arrobject;
        Object[] arrobject2 = arrobject;
        int n2 = arrobject.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = arrobject2[i2];
            if (!(object instanceof a)) continue;
            ((a)object).a().a(this.a());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    synchronized void g() {
        Object object = this.f;
        synchronized (object) {
            long l2 = net.minecraft.u.d.b.a.a();
            if (l2 == this.g) {
                return;
            }
            this.g = l2;
            this.b.clear();
        }
        try {
            this.b(net.minecraft.u.d.b.a.a(this.d));
        }
        catch (m m2) {
            this.b.clear();
            try {
                this.b(net.minecraft.u.d.b.a.b(this.d));
            }
            catch (m m3) {
                throw m2;
            }
        }
    }

    protected void b(String string) {
        boolean bl2 = false;
        Matcher matcher = c.matcher(string);
        int n2 = 0;
        int n3 = 0;
        try {
            while (matcher.find(n3)) {
                Object object;
                Object object2;
                int n4 = matcher.start();
                int n5 = matcher.end();
                if (n4 > n3) {
                    object2 = new k(String.format(string.substring(n3, n4), new Object[0]));
                    ((f)object2).a().a(this.a());
                    this.b.add(object2);
                }
                object2 = matcher.group(2);
                String string2 = string.substring(n4, n5);
                if ("%".equals(object2) && "%%".equals(string2)) {
                    object = new k("%");
                    ((f)object).a().a(this.a());
                    this.b.add(object);
                } else {
                    int n6;
                    if (!"s".equals(object2)) {
                        throw new m(this, "Unsupported format: '" + string2 + "'");
                    }
                    object = matcher.group(1);
                    int n7 = n6 = object != null ? Integer.parseInt((String)object) - 1 : n2++;
                    if (n6 < this.e.length) {
                        this.b.add(this.a(n6));
                    }
                }
                n3 = n5;
            }
            if (n3 < string.length()) {
                k k2 = new k(String.format(string.substring(n3), new Object[0]));
                k2.a().a(this.a());
                this.b.add(k2);
            }
        }
        catch (IllegalFormatException illegalFormatException) {
            throw new m(this, (Throwable)illegalFormatException);
        }
    }

    private a a(int n2) {
        a a2;
        if (n2 >= this.e.length) {
            throw new m(this, n2);
        }
        Object object = this.e[n2];
        if (object instanceof a) {
            a2 = (a)object;
        } else {
            a2 = new k(object == null ? "null" : object.toString());
            a2.a().a(this.a());
        }
        return a2;
    }

    @Override
    public a a(c c2) {
        super.a(c2);
        Object[] arrobject = this.e;
        int n2 = this.e.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = arrobject[i2];
            if (!(object instanceof a)) continue;
            ((a)object).a().a(this.a());
        }
        if (this.g > -1L) {
            for (Object object : this.b) {
                object.a().a(c2);
            }
        }
        return this;
    }

    @Override
    public Iterator iterator() {
        this.g();
        return nj.b(l.a(this.b), l.a(this.a));
    }

    @Override
    public String b() {
        this.g();
        StringBuilder stringBuilder = new StringBuilder();
        for (a a2 : this.b) {
            stringBuilder.append(a2.b());
        }
        return stringBuilder.toString();
    }

    public l h() {
        Object[] arrobject = new Object[this.e.length];
        for (int i2 = 0; i2 < this.e.length; ++i2) {
            arrobject[i2] = this.e[i2] instanceof a ? ((a)this.e[i2]).f() : this.e[i2];
        }
        l l2 = new l(this.d, arrobject);
        l2.a(this.a().l());
        for (a a2 : this.e()) {
            l2.a(a2.f());
        }
        return l2;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof l)) {
            return false;
        }
        l l2 = (l)object;
        return Arrays.equals(this.e, l2.e) && this.d.equals(l2.d) && super.equals(object);
    }

    @Override
    public int hashCode() {
        int n2 = super.hashCode();
        n2 = 31 * n2 + this.d.hashCode();
        n2 = 31 * n2 + Arrays.hashCode(this.e);
        return n2;
    }

    @Override
    public String toString() {
        return "TranslatableComponent{key='" + this.d + '\'' + ", args=" + Arrays.toString(this.e) + ", siblings=" + this.a + ", style=" + this.a() + '}';
    }

    public String i() {
        return this.d;
    }

    public Object[] j() {
        return this.e;
    }

    @Override
    public /* synthetic */ a f() {
        return this.h();
    }
}

