/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.a;
import io.netty.channel.an;
import io.netty.channel.av;
import io.netty.channel.ba;
import io.netty.channel.bc;
import io.netty.channel.bd;
import io.netty.channel.br;
import io.netty.channel.bs;
import io.netty.channel.bw;
import io.netty.channel.ce;
import io.netty.channel.cg;
import io.netty.channel.ch;
import io.netty.channel.ci;
import io.netty.channel.cj;
import io.netty.channel.ck;
import io.netty.channel.cl;
import io.netty.channel.k;
import io.netty.util.b.ab;
import io.netty.util.b.x;
import io.netty.util.c.ad;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import io.netty.util.c.u;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

final class cf
implements br {
    static final g a = io.netty.util.c.b.h.a(cf.class);
    private static final WeakHashMap[] g = new WeakHashMap[Runtime.getRuntime().availableProcessors()];
    final a b;
    final k c;
    final k d;
    private final Map h = new HashMap(4);
    final Map e = new IdentityHashMap();

    public cf(a a2) {
        if (a2 == null) {
            throw new NullPointerException("channel");
        }
        this.b = a2;
        this.d = new cl(this);
        this.c = new ck(this);
        this.c.a = this.d;
        this.d.b = this.c;
    }

    @Override
    public an g() {
        return this.b;
    }

    @Override
    public br a(String string, ba ba2) {
        return this.a((x)null, string, ba2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public br a(x x2, String string, ba ba2) {
        cf cf2 = this;
        synchronized (cf2) {
            this.d(string);
            ce ce2 = new ce(this, x2, string, ba2);
            this.a(string, ce2);
        }
        return this;
    }

    private void a(String string, k k2) {
        cf.a(k2);
        k k3 = this.c.a;
        k2.b = this.c;
        k2.a = k3;
        this.c.a = k2;
        k3.b = k2;
        this.h.put(string, k2);
        this.b((bd)k2);
    }

    @Override
    public br b(String string, ba ba2) {
        return this.b((x)null, string, ba2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public br b(x x2, String string, ba ba2) {
        cf cf2 = this;
        synchronized (cf2) {
            this.d(string);
            ce ce2 = new ce(this, x2, string, ba2);
            this.b(string, ce2);
        }
        return this;
    }

    private void b(String string, k k2) {
        k k3;
        cf.a(k2);
        k2.b = k3 = this.d.b;
        k2.a = this.d;
        k3.a = k2;
        this.d.b = k2;
        this.h.put(string, k2);
        this.b((bd)k2);
    }

    @Override
    public br a(String string, String string2, ba ba2) {
        return this.a(null, string, string2, ba2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public br a(x x2, String string, String string2, ba ba2) {
        cf cf2 = this;
        synchronized (cf2) {
            k k2 = this.e(string);
            this.d(string2);
            ce ce2 = new ce(this, x2, string2, ba2);
            this.a(string2, k2, (k)ce2);
        }
        return this;
    }

    private void a(String string, k k2, k k3) {
        cf.a(k3);
        k3.b = k2.b;
        k3.a = k2;
        k2.b.a = k3;
        k2.b = k3;
        this.h.put(string, k3);
        this.b((bd)k3);
    }

    @Override
    public br b(String string, String string2, ba ba2) {
        return this.b(null, string, string2, ba2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public br b(x x2, String string, String string2, ba ba2) {
        cf cf2 = this;
        synchronized (cf2) {
            k k2 = this.e(string);
            this.d(string2);
            ce ce2 = new ce(this, x2, string2, ba2);
            this.b(string2, k2, ce2);
        }
        return this;
    }

    private void b(String string, k k2, k k3) {
        this.d(string);
        cf.a(k3);
        k3.b = k2;
        k3.a = k2.a;
        k2.a.b = k3;
        k2.a = k3;
        this.h.put(string, k3);
        this.b((bd)k3);
    }

    @Override
    public br a(ba ... arrba) {
        return this.a((x)null, arrba);
    }

    @Override
    public br a(x x2, ba ... arrba) {
        if (arrba == null) {
            throw new NullPointerException("handlers");
        }
        if (arrba.length == 0 || arrba[0] == null) {
            return this;
        }
        for (int i2 = 1; i2 < arrba.length && arrba[i2] != null; ++i2) {
        }
        for (int i3 = i2 - 1; i3 >= 0; --i3) {
            ba ba2 = arrba[i3];
            this.a(x2, this.c(ba2), ba2);
        }
        return this;
    }

    @Override
    public br b(ba ... arrba) {
        return this.b((x)null, arrba);
    }

    @Override
    public br b(x x2, ba ... arrba) {
        if (arrba == null) {
            throw new NullPointerException("handlers");
        }
        for (ba ba2 : arrba) {
            if (ba2 == null) break;
            this.b(x2, this.c(ba2), ba2);
        }
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private String c(ba ba2) {
        String string;
        WeakHashMap weakHashMap = g[(int)(Thread.currentThread().getId() % (long)g.length)];
        Class<?> class_ = ba2.getClass();
        Object object = weakHashMap;
        synchronized (object) {
            string = (String)weakHashMap.get(class_);
            if (string == null) {
                string = cf.e(class_);
                weakHashMap.put(class_, string);
            }
        }
        object = this;
        synchronized (object) {
            if (this.h.containsKey(string)) {
                String string2 = string.substring(0, string.length() - 1);
                int n2 = 1;
                while (true) {
                    String string3;
                    if (!this.h.containsKey(string3 = string2 + n2)) {
                        string = string3;
                        break;
                    }
                    ++n2;
                }
            }
        }
        return string;
    }

    private static String e(Class class_) {
        return ad.a(class_) + "#0";
    }

    @Override
    public br a(ba ba2) {
        this.b(this.d(ba2));
        return this;
    }

    @Override
    public ba a(String string) {
        return this.b(this.e(string)).x();
    }

    @Override
    public ba a(Class class_) {
        return this.b(this.f(class_)).x();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private k b(k k2) {
        k k3;
        ab ab2;
        assert (k2 != this.c && k2 != this.d);
        cf cf2 = this;
        synchronized (cf2) {
            if (!k2.b().j() || k2.e().bt_()) {
                this.a(k2);
                return k2;
            }
            ab2 = k2.e().b(new cg(this, k2));
            k3 = k2;
        }
        cf.a(ab2);
        return k3;
    }

    void a(k k2) {
        k k3;
        k k4 = k2.b;
        k4.a = k3 = k2.a;
        k3.b = k4;
        this.h.remove(k2.f());
        this.c(k2);
    }

    @Override
    public ba a() {
        if (this.c.a == this.d) {
            throw new NoSuchElementException();
        }
        return this.b(this.c.a).x();
    }

    @Override
    public ba b() {
        if (this.c.a == this.d) {
            throw new NoSuchElementException();
        }
        return this.b(this.d.b).x();
    }

    @Override
    public br a(ba ba2, String string, ba ba3) {
        this.a(this.d(ba2), string, ba3);
        return this;
    }

    @Override
    public ba c(String string, String string2, ba ba2) {
        return this.a(this.e(string), string2, ba2);
    }

    @Override
    public ba a(Class class_, String string, ba ba2) {
        return this.a(this.f(class_), string, ba2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private ba a(k k2, String string, ba ba2) {
        ab ab2;
        assert (k2 != this.c && k2 != this.d);
        cf cf2 = this;
        synchronized (cf2) {
            ce ce2;
            boolean bl2 = k2.f().equals(string);
            if (!bl2) {
                this.d(string);
            }
            if (!(ce2 = new ce(this, k2.c, string, ba2)).b().j() || ce2.e().bt_()) {
                this.a(k2, string, (k)ce2);
                return k2.x();
            }
            ab2 = ce2.e().b(new ch(this, k2, string, ce2));
        }
        cf.a(ab2);
        return k2.x();
    }

    private void a(k k2, String string, k k3) {
        cf.a(k3);
        k k4 = k2.b;
        k k5 = k2.a;
        k3.b = k4;
        k3.a = k5;
        k4.a = k3;
        k5.b = k3;
        if (!k2.f().equals(string)) {
            this.h.remove(k2.f());
        }
        this.h.put(string, k3);
        k2.b = k3;
        k2.a = k3;
        this.b((bd)k3);
        this.c(k2);
    }

    private static void a(bd bd2) {
        ba ba2 = bd2.x();
        if (ba2 instanceof bc) {
            bc bc2 = (bc)ba2;
            if (!bc2.k() && bc2.g) {
                throw new bs(bc2.getClass().getName() + " is not a @Sharable handler, so can't be added or removed multiple times.");
            }
            bc2.g = true;
        }
    }

    private void b(bd bd2) {
        if (bd2.b().j() && !bd2.e().bt_()) {
            bd2.e().execute(new ci(this, bd2));
            return;
        }
        this.c(bd2);
    }

    private void c(bd bd2) {
        try {
            bd2.x().e(bd2);
        }
        catch (Throwable throwable) {
            boolean bl2;
            block5: {
                bl2 = false;
                try {
                    this.b((k)bd2);
                    bl2 = true;
                }
                catch (Throwable throwable2) {
                    if (!a.f()) break block5;
                    a.d("Failed to remove a handler: " + bd2.f(), throwable2);
                }
            }
            if (bl2) {
                this.a(new bs(bd2.x().getClass().getName() + ".handlerAdded() has thrown an exception; removed.", throwable));
            }
            this.a(new bs(bd2.x().getClass().getName() + ".handlerAdded() has thrown an exception; also failed to remove.", throwable));
        }
    }

    private void c(k k2) {
        if (k2.b().j() && !k2.e().bt_()) {
            k2.e().execute(new cj(this, k2));
            return;
        }
        this.d(k2);
    }

    private void d(k k2) {
        try {
            k2.x().f(k2);
            k2.v();
        }
        catch (Throwable throwable) {
            this.a(new bs(k2.x().getClass().getName() + ".handlerRemoved() has thrown an exception.", throwable));
        }
    }

    private static void a(Future future) {
        try {
            future.get();
        }
        catch (ExecutionException executionException) {
            u.a(executionException.getCause());
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public ba c() {
        bd bd2 = this.d();
        if (bd2 == null) {
            return null;
        }
        return bd2.x();
    }

    @Override
    public bd d() {
        k k2 = this.c.a;
        if (k2 == this.d) {
            return null;
        }
        return this.c.a;
    }

    @Override
    public ba e() {
        k k2 = this.d.b;
        if (k2 == this.c) {
            return null;
        }
        return k2.x();
    }

    @Override
    public bd f() {
        k k2 = this.d.b;
        if (k2 == this.c) {
            return null;
        }
        return k2;
    }

    @Override
    public ba b(String string) {
        bd bd2 = this.c(string);
        if (bd2 == null) {
            return null;
        }
        return bd2.x();
    }

    @Override
    public ba b(Class class_) {
        bd bd2 = this.c(class_);
        if (bd2 == null) {
            return null;
        }
        return bd2.x();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public bd c(String string) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        cf cf2 = this;
        synchronized (cf2) {
            return (bd)this.h.get(string);
        }
    }

    @Override
    public bd b(ba ba2) {
        if (ba2 == null) {
            throw new NullPointerException("handler");
        }
        k k2 = this.c.a;
        while (k2 != null) {
            if (k2.x() == ba2) {
                return k2;
            }
            k2 = k2.a;
        }
        return null;
    }

    @Override
    public bd c(Class class_) {
        if (class_ == null) {
            throw new NullPointerException("handlerType");
        }
        k k2 = this.c.a;
        while (k2 != null) {
            if (class_.isAssignableFrom(k2.x().getClass())) {
                return k2;
            }
            k2 = k2.a;
        }
        return null;
    }

    @Override
    public List h() {
        ArrayList<String> arrayList = new ArrayList<String>();
        k k2 = this.c.a;
        while (k2 != null) {
            arrayList.add(k2.f());
            k2 = k2.a;
        }
        return arrayList;
    }

    @Override
    public Map i() {
        LinkedHashMap<String, ba> linkedHashMap = new LinkedHashMap<String, ba>();
        k k2 = this.c.a;
        while (k2 != this.d) {
            linkedHashMap.put(k2.f(), k2.x());
            k2 = k2.a;
        }
        return linkedHashMap;
    }

    public Iterator iterator() {
        return this.i().entrySet().iterator();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ad.a(this));
        stringBuilder.append('{');
        k k2 = this.c.a;
        while (k2 != this.d) {
            stringBuilder.append('(');
            stringBuilder.append(k2.f());
            stringBuilder.append(" = ");
            stringBuilder.append(k2.x().getClass().getName());
            stringBuilder.append(')');
            k2 = k2.a;
            if (k2 == this.d) break;
            stringBuilder.append(", ");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    @Override
    public br j() {
        this.c.g();
        return this;
    }

    @Override
    public br k() {
        this.c.h();
        if (!this.b.H()) {
            this.u();
        }
        return this;
    }

    private void u() {
        this.d.b.a();
    }

    @Override
    public br l() {
        this.c.i();
        if (this.b.G().g()) {
            this.b.o();
        }
        return this;
    }

    @Override
    public br m() {
        this.c.j();
        return this;
    }

    @Override
    public br a(Throwable throwable) {
        this.c.a(throwable);
        return this;
    }

    @Override
    public br a(Object object) {
        this.c.a(object);
        return this;
    }

    @Override
    public br b(Object object) {
        this.c.b(object);
        return this;
    }

    @Override
    public br n() {
        this.c.k();
        if (this.b.G().g()) {
            this.s();
        }
        return this;
    }

    @Override
    public br o() {
        this.c.l();
        return this;
    }

    @Override
    public av a(SocketAddress socketAddress) {
        return this.d.a(socketAddress);
    }

    @Override
    public av b(SocketAddress socketAddress) {
        return this.d.b(socketAddress);
    }

    @Override
    public av a(SocketAddress socketAddress, SocketAddress socketAddress2) {
        return this.d.a(socketAddress, socketAddress2);
    }

    @Override
    public av p() {
        return this.d.m();
    }

    @Override
    public av q() {
        return this.d.n();
    }

    @Override
    public av r() {
        return this.d.o();
    }

    @Override
    public br t() {
        this.d.q();
        return this;
    }

    @Override
    public av a(SocketAddress socketAddress, bw bw2) {
        return this.d.a(socketAddress, bw2);
    }

    @Override
    public av b(SocketAddress socketAddress, bw bw2) {
        return this.d.b(socketAddress, bw2);
    }

    @Override
    public av a(SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        return this.d.a(socketAddress, socketAddress2, bw2);
    }

    @Override
    public av a(bw bw2) {
        return this.d.a(bw2);
    }

    @Override
    public av b(bw bw2) {
        return this.d.b(bw2);
    }

    @Override
    public av c(bw bw2) {
        return this.d.c(bw2);
    }

    @Override
    public br s() {
        this.d.p();
        return this;
    }

    @Override
    public av c(Object object) {
        return this.d.c(object);
    }

    @Override
    public av a(Object object, bw bw2) {
        return this.d.a(object, bw2);
    }

    @Override
    public av b(Object object, bw bw2) {
        return this.d.b(object, bw2);
    }

    @Override
    public av d(Object object) {
        return this.d.d(object);
    }

    private void d(String string) {
        if (this.h.containsKey(string)) {
            throw new IllegalArgumentException("Duplicate handler name: " + string);
        }
    }

    private k e(String string) {
        k k2 = (k)this.c(string);
        if (k2 == null) {
            throw new NoSuchElementException(string);
        }
        return k2;
    }

    private k d(ba ba2) {
        k k2 = (k)this.b(ba2);
        if (k2 == null) {
            throw new NoSuchElementException(ba2.getClass().getName());
        }
        return k2;
    }

    private k f(Class class_) {
        k k2 = (k)this.c(class_);
        if (k2 == null) {
            throw new NoSuchElementException(class_.getName());
        }
        return k2;
    }

    static /* synthetic */ void a(cf cf2, k k2, String string, k k3) {
        cf2.a(k2, string, k3);
    }

    static /* synthetic */ void a(cf cf2, bd bd2) {
        cf2.c(bd2);
    }

    static /* synthetic */ void a(cf cf2, k k2) {
        cf2.d(k2);
    }

    static /* synthetic */ String d(Class class_) {
        return cf.e(class_);
    }

    static {
        for (int i2 = 0; i2 < g.length; ++i2) {
            cf.g[i2] = new WeakHashMap();
        }
    }
}

