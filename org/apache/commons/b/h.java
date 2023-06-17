/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b;

import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.apache.commons.b.i;
import org.apache.commons.b.j;
import org.apache.commons.b.k;

public class h {
    ReferenceQueue a = new ReferenceQueue();
    final Collection b = Collections.synchronizedSet(new HashSet());
    final List c = Collections.synchronizedList(new ArrayList());
    volatile boolean d = false;
    Thread e;

    public void a(File file, Object object) {
        this.a(file, object, (k)null);
    }

    public void a(File file, Object object, k k2) {
        if (file == null) {
            throw new NullPointerException("The file must not be null");
        }
        this.b(file.getPath(), object, k2);
    }

    public void a(String string, Object object) {
        this.a(string, object, (k)null);
    }

    public void a(String string, Object object, k k2) {
        if (string == null) {
            throw new NullPointerException("The path must not be null");
        }
        this.b(string, object, k2);
    }

    private synchronized void b(String string, Object object, k k2) {
        if (this.d) {
            throw new IllegalStateException("No new trackers can be added once exitWhenFinished() is called");
        }
        if (this.e == null) {
            this.e = new i(this);
            this.e.start();
        }
        this.b.add(new j(string, k2, object, this.a));
    }

    public int a() {
        return this.b.size();
    }

    public List b() {
        return this.c;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized void c() {
        this.d = true;
        if (this.e != null) {
            Thread thread = this.e;
            synchronized (thread) {
                this.e.interrupt();
            }
        }
    }
}

