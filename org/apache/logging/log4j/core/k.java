/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.net.URI;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.logging.log4j.a.n;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.c.f;
import org.apache.logging.log4j.core.config.ac;
import org.apache.logging.log4j.core.config.o;
import org.apache.logging.log4j.core.config.z;
import org.apache.logging.log4j.core.d.a;
import org.apache.logging.log4j.core.d.s;
import org.apache.logging.log4j.core.g;
import org.apache.logging.log4j.core.i;
import org.apache.logging.log4j.core.l;
import org.apache.logging.log4j.core.m;
import org.apache.logging.log4j.d;

public class k
implements f,
org.apache.logging.log4j.core.config.k,
g {
    public static final String a = "config";
    private static final org.apache.logging.log4j.d.d b = org.apache.logging.log4j.d.d.k();
    private final ConcurrentMap c = new ConcurrentHashMap();
    private final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    private volatile org.apache.logging.log4j.core.config.d e = new o();
    private Object f;
    private final String g;
    private URI h;
    private l i = null;
    private volatile m j = m.a;
    private final Lock k = new ReentrantLock();

    public k(String string) {
        this(string, null, (URI)null);
    }

    public k(String string, Object object) {
        this(string, object, (URI)null);
    }

    public k(String string, Object object, URI uRI) {
        this.g = string;
        this.f = object;
        this.h = uRI;
    }

    public k(String string, Object object, String string2) {
        this.g = string;
        this.f = object;
        if (string2 != null) {
            URI uRI;
            try {
                uRI = new File(string2).toURI();
            }
            catch (Exception exception) {
                uRI = null;
            }
            this.h = uRI;
        } else {
            this.h = null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void e() {
        block8: {
            if (this.k.tryLock()) {
                try {
                    if (this.j != m.a && this.j != m.e) break block8;
                    this.j = m.b;
                    this.i();
                    if (this.e.f()) {
                        this.i = new l(this, this);
                        try {
                            Runtime.getRuntime().addShutdownHook(this.i);
                        }
                        catch (IllegalStateException illegalStateException) {
                            b.f("Unable to register shutdown hook due to JVM state");
                            this.i = null;
                        }
                        catch (SecurityException securityException) {
                            b.f("Unable to register shutdown hook due to security restrictions");
                            this.i = null;
                        }
                    }
                    this.j = m.c;
                }
                finally {
                    this.k.unlock();
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(org.apache.logging.log4j.core.config.d d2) {
        block7: {
            if (this.k.tryLock()) {
                try {
                    if (this.j != m.a && this.j != m.e || !d2.f()) break block7;
                    this.i = new l(this, this);
                    try {
                        Runtime.getRuntime().addShutdownHook(this.i);
                    }
                    catch (IllegalStateException illegalStateException) {
                        b.f("Unable to register shutdown hook due to JVM state");
                        this.i = null;
                    }
                    catch (SecurityException securityException) {
                        b.f("Unable to register shutdown hook due to security restrictions");
                        this.i = null;
                    }
                    this.j = m.c;
                }
                finally {
                    this.k.unlock();
                }
            }
        }
        this.c(d2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void f() {
        this.k.lock();
        try {
            if (this.j == m.e) {
                return;
            }
            this.j = m.d;
            if (this.i != null) {
                Runtime.getRuntime().removeShutdownHook(this.i);
                this.i = null;
            }
            org.apache.logging.log4j.core.config.d d2 = this.e;
            this.e = new z();
            this.j();
            d2.e();
            this.f = null;
            org.apache.logging.log4j.c.b().a(this);
            this.j = m.e;
        }
        finally {
            this.k.unlock();
        }
    }

    public String a() {
        return this.g;
    }

    public m b() {
        return this.j;
    }

    @Override
    public boolean g() {
        return this.j == m.c;
    }

    public void a(Object object) {
        this.f = object;
    }

    @Override
    public Object c() {
        return this.f;
    }

    public i a(String string) {
        return this.a(string, null);
    }

    public i a(String string, n n2) {
        i i2 = (i)this.c.get(string);
        if (i2 != null) {
            org.apache.logging.log4j.c.a.a(i2, n2);
            return i2;
        }
        i2 = this.a(this, string, n2);
        i i3 = this.c.putIfAbsent(string, i2);
        return i3 == null ? i2 : i3;
    }

    @Override
    public boolean b(String string) {
        return this.c.containsKey(string);
    }

    public org.apache.logging.log4j.core.config.d d() {
        return this.e;
    }

    public void a(org.apache.logging.log4j.core.d d2) {
        this.e.a(d2);
    }

    public void b(org.apache.logging.log4j.core.d d2) {
        this.e.b(d2);
    }

    private synchronized org.apache.logging.log4j.core.config.d c(org.apache.logging.log4j.core.config.d d2) {
        if (d2 == null) {
            throw new NullPointerException("No Configuration was provided");
        }
        org.apache.logging.log4j.core.config.d d3 = this.e;
        d2.a(this);
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("hostName", s.a());
        hashMap.put("contextName", this.g);
        d2.a("ContextProperties", hashMap);
        d2.d();
        this.e = d2;
        this.j();
        if (d3 != null) {
            d3.b(this);
            d3.e();
        }
        PropertyChangeEvent propertyChangeEvent = new PropertyChangeEvent(this, a, d3, d2);
        for (PropertyChangeListener propertyChangeListener : this.d) {
            propertyChangeListener.propertyChange(propertyChangeEvent);
        }
        return d3;
    }

    public void a(PropertyChangeListener propertyChangeListener) {
        this.d.add(org.apache.logging.log4j.core.d.a.a(propertyChangeListener, "listener"));
    }

    public void b(PropertyChangeListener propertyChangeListener) {
        this.d.remove(propertyChangeListener);
    }

    public synchronized URI h() {
        return this.h;
    }

    public synchronized void a(URI uRI) {
        this.h = uRI;
        this.i();
    }

    public synchronized void i() {
        b.a("Reconfiguration started for context " + this.g);
        org.apache.logging.log4j.core.config.d d2 = org.apache.logging.log4j.core.config.f.a().a(this.g, this.h);
        this.c(d2);
        b.a("Reconfiguration completed");
    }

    public void j() {
        this.b(this.e);
    }

    public void b(org.apache.logging.log4j.core.config.d d2) {
        for (i i2 : this.c.values()) {
            i2.a(d2);
        }
    }

    @Override
    public synchronized void a(ac ac2) {
        b.a("Reconfiguration started for context " + this.g);
        org.apache.logging.log4j.core.config.d d2 = ac2.q();
        if (d2 != null) {
            this.c(d2);
            b.a("Reconfiguration completed");
        } else {
            b.a("Reconfiguration failed");
        }
    }

    protected i a(k k2, String string, n n2) {
        return new i(k2, string, n2);
    }

    @Override
    public /* synthetic */ d b(String string, n n2) {
        return this.a(string, n2);
    }

    @Override
    public /* synthetic */ d c(String string) {
        return this.a(string);
    }

    static /* synthetic */ l a(k k2, l l2) {
        k2.i = l2;
        return k2.i;
    }
}

